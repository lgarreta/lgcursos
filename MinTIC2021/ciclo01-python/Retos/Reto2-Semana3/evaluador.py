#!/usr/bin/python3

import os, sys
from io import StringIO

casosFile = "casos-prueba.txt"

#--------------------------------------------------------------------
# Avaluar caso
#--------------------------------------------------------------------
def evaluarCaso (outFilePrograma, outFileCaso):
    lineasCaso     = open (outFileCaso).readlines()
    lineasPrograma = open (outFilePrograma).readlines()

    nLineasPrograma = len (lineasPrograma)
    nLineasCaso     = len (lineasCaso)

    nRespuestas = min (nLineasCaso, nLineasPrograma)
    
    contadorBuenas = 0
    print ("Obtenido : Esperado")
    for i in range (nRespuestas):
        obtenido  = lineasPrograma [i].strip()
        esperado  = lineasCaso [i].strip()
        xesperado = lineasPrograma [i].strip().split()[-1]

        if (not obtenido.isalnum()):
            esperado = round (float (esperado), 2)
            obtenido = round (float (obtenido), 2)

        print ("%s \t: %s" % (obtenido, esperado, e)) 

        if (obtenido==esperado):
            contadorBuenas +=1
    #

    calificacionCaso = 100*contadorBuenas / nLineasPrograma
    print (">>> %s buenas de %s. Calificacion: %s " % (contadorBuenas, nRespuestas , calificacionCaso),"%")
    return (calificacionCaso)


#--------------------------------------------------------------------
# Test the program using command line pipes "<" and ">"
#--------------------------------------------------------------------
def probarRedirect (programFile, caso=None):
    listaCasos = leerCasosPrueba (casosFile)
    if (caso!=None):
        listaCasos = listaCasos [caso-1:caso]
        i = caso
    else:
        i = 1

    calificaciones = []
    for caso in listaCasos:
        print ("\nCaso ", i)
        entradas, salidas = caso [0], caso [1]
        inFile, outFile = crearEntradasSalidas (entradas, salidas)

        fdIn = open (inFile)
        sys.stdin = fdIn
        fdOut = open ("out-res.txt", "w")
        orgStdOut  = sys.stdout
        sys.stdout = fdOut

        exec (open (programFile).read())
        sys.stdout.close()

        sys.stdout = orgStdOut
        calificacionCaso = evaluarCaso (outFile, "out-res.txt")
        calificaciones.append (calificacionCaso)
        i+=1
    #
    calificacionTotal = sum (calificaciones)
    calificacionFinal = (sum (calificaciones)/4)
    print (">>> CALIFICACION FINAL = %s" % (calificacionFinal), "de 100%\n")


#--------------------------------------------------------------------
# Test the program using command line pipes "<" and ">"
#--------------------------------------------------------------------
def probarCmd (programName, caseFile):
    inputs, outputs = leerEntradasSalidas (caseFile)
    
    cmm = "python3 " + programName + " < inputs.txt " + " > resultados.txt"
    os.system (cmm)
    
    resultados = open ("resultados.txt").readlines()
    print (resultados)

#--------------------------------------------------------------------
#--------------------------------------------------------------------
def crearEntradasSalidas (inputs, outputs):
    inputsStr  = "\n".join (map (str, inputs))
    outputsStr = "\n".join (map (str, outputs))

    inf  = open ("in.txt", "w")
    inf.write (inputsStr)
    inf.close()

    outf = open ("out.txt", "w")
    outf.write (outputsStr)
    outf.close()

    return ("in.txt", "out.txt")


#--------------------------------------------------------------------
#--------------------------------------------------------------------
def leerEntradasSalidas (caseFile):
    lines = open (caseFile).readlines()
    inputs = lines[0].split(":")[1].split()
    lines = open (caseFile).readlines()
    outputs = lines[1].split(":")[1].split()
    inputsStr  = "\n".join (map (str, inputs))
    outputsStr = "\n".join (map (str, outputs))

    inFile  = "in-%s" % caseFile
    outFile = "out-%s" % caseFile
    inf  = open (inFile, "w")
    inf.write (inputsStr)
    inf.close()

    outf = open (outFile, "w")
    outf.write (outputsStr)
    outf.close()

    return ((inputs, outputs))

#--------------------------------------------------------------------
#--------------------------------------------------------------------
def leerCasosPrueba (fileCasosPrueba):
    linesList = open (fileCasosPrueba).readlines()
    n = len (linesList)
    listaCasos = []
    for i in range (n):
        linea = linesList [i]
        if linea.find ("case") != -1:
            caseName = linea.split ("=")[1]
            entradas = linesList [i+1].split("=")[1].split()
            salidas  = linesList [i+2].split("=")[1].split()
            listaCasos.append((entradas, salidas))
            i = i+2
        i+1
    #
    return (listaCasos)
#

#--------------------------------------------------------------------
#--------------------------------------------------------------------
def is_integer(n):
    try:
        float(n)
    except ValueError:
        return False
    else:
        return float(n).is_integer()
#--------------------------------------------------------------------
# Call main with input parameter
#--------------------------------------------------------------------
probar = probarRedirect

if __name__ == "__main__":
    programFile = sys.argv[1]
    #caseFile    = sys.argv[2]

    #probarCmd (programFile, caseFile)
    probar (programFile)

