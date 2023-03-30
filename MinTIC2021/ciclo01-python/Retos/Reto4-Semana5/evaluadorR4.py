#!/usr/bin/python3

import os, sys
from io import StringIO

listaNombres = ['HoraNormal', 'HoraExtra', 'SueldoBruto', 'DescParafiscal', 'DescSalud', 'DescPension', 'DescTotal', 'SueldoNeto', 'ProvPrima', 'ProvCesantias', 'ProvIntereses', 'ProvVacaciones']
listaCasos   = [[['45', '10000'], ['400000', '75000.0', '475000.0', '42750.0', '19000.0', '19000.0', '80750.0', '394250.0', '39567.5', '39567.5', '4750.0', '19807.5']], [['40', '10000'], ['400000', '0', '400000', '36000.0', '16000.0', '16000.0', '68000.0', '332000.0', '33320.0', '33320.0', '4000.0', '16680.0']], [['38', '10000'], ['380000', '0', '380000', '34200.0', '15200.0', '15200.0', '64600.0', '315400.0', '31654.0', '31654.0', '3800.0', '15846.0']], [['20', '10000'], ['200000', '0', '200000', '18000.0', '8000.0', '8000.0', '34000.0', '166000.0', '16660.0', '16660.0', '2000.0', '8340.0']], [['50', '10000'], ['400000', '150000.0', '550000.0', '49500.0', '22000.0', '22000.0', '93500.0', '456500.0', '45815.0', '45815.0', '5500.0', '22935.0']]]

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
    print ("%s: %s : %s" % (">>>>>".ljust(40), "EVALUADOR".ljust(10), "PROGRAMA"))
    for i in range (nRespuestas):
        obtenido  = lineasPrograma [i].strip()
        esperado  = lineasCaso [i].strip().split()[-1]

        if (not obtenido.isalnum()):
            esperado = round (float (esperado), 2)
            obtenido = round (float (obtenido), 2)


        flagCorrect = "X"
        if (obtenido==esperado):
            contadorBuenas +=1
            flagCorrect = "/"

        print ("%s: %s  %s : %s" % (listaNombres[i].ljust(20), flagCorrect.ljust(20), str(obtenido).ljust(10), esperado)) 
    #

    calificacionCaso = 100*contadorBuenas / nLineasPrograma
    print (">>>>> %s buenas de %s. Calificacion: %s " % (contadorBuenas, nRespuestas , calificacionCaso),"%")
    return (calificacionCaso)


#--------------------------------------------------------------------
# Test the program using command line pipes "<" and ">"
#--------------------------------------------------------------------
def probarRedirect (programFile, caso=None):
    global listaCasos
    if (caso!=None):
        listaCasos = listaCasos [caso-1:caso]
        i = caso
    else:
        i = 1

    calificaciones = []
    nCasos = 0
    for caso in listaCasos:
        nCasos +=1
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
    calificacionFinal = (sum (calificaciones)/nCasos)
    print ("\n>>> CALIFICACION FINAL = %s" % (calificacionFinal), "de 100%\n")


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
    #open ("casos.txt", "w").write (listaCasos)
    print (listaCasos)
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

