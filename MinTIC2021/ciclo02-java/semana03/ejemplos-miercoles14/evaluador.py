#!/usr/bin/python3

import os, sys
from io import StringIO

listaCasos = [['1', '2', '20', '2', '4', '45', '3', '6', '20', '4'], ['PAGO DE SERVICIOS PUBLICOS', 'Seleccione el servicio publico:', '1. Energia', '2. Acueducto', '3. Gas Natural', '4. Salir', 'Opción:', 'Estrato del inmueble:', 'Consumo del inmueble:', 'El consumo fue: 20', 'Valor unidad: 6200', 'Estrato el inmueble: 2', 'Costo total: 124000.0', 'Descuento o sobrecosto: -62000.0', 'Impuesto por infraestructura: 1240.0', 'TOTAL A PAGAR: 63240.0', 'PAGO DE SERVICIOS PUBLICOS', 'Seleccione el servicio publico:', '1. Energia', '2. Acueducto', '3. Gas Natural', '4. Salir', 'Opción:', 'Estrato del inmueble:', 'Consumo del inmueble:', 'El consumo fue: 45', 'Valor unidad: 9256', 'Estrato el inmueble: 4', 'Costo total: 416520.0', 'Descuento o sobrecosto: -41652.0', 'Impuesto por infraestructura: 4165.2', 'TOTAL A PAGAR: 379033.2', 'PAGO DE SERVICIOS PUBLICOS', 'Seleccione el servicio publico:', '1. Energia', '2. Acueducto', '3. Gas Natural', '4. Salir', 'Opción:', 'Estrato del inmueble:', 'Consumo del inmueble:', 'El consumo fue: 20', 'Valor unidad: 5234', 'Estrato el inmueble: 6', 'Costo total: 104680.0', 'Descuento o sobrecosto: -26170.0', 'Impuesto por infraestructura: 1046.8', 'TOTAL A PAGAR: 79556.8', 'PAGO DE SERVICIOS PUBLICOS', 'Seleccione el servicio publico:', '1. Energia', '2. Acueducto', '3. Gas Natural', '4. Salir', 'Opción:']]
N = len (listaCasos[0][1])
listaNombres = []
for i in range (N):
    listaNombres.append ("Salida "+ str (i+1))

#--------------------------------------------------------------------
# Avaluar caso
#--------------------------------------------------------------------
def correctLinesCaso (outFileCaso):
    linesCaso     = [x.strip() for x in open (outFileCaso).readlines()]
    correctedLines = []
    for line in linesCaso:
        #print (">>>", line)
        #print (line.find (":"))
        #print (len (line))
        if (line.find (":") != -1 and line.find (":") != len (line)-1 ):
            lines = line.split (":")
            if (line.count(":") > 1):
                lines = [x+":" for x in lines]
            else:
                lines [0] = lines [0] + ":"
            correctedLines.append (lines[0])
            correctedLines.append (lines[1])

        else:
            correctedLines.append (line)

    return (correctedLines)

#--------------------------------------------------------------------
#--------------------------------------------------------------------
def evaluarCaso (outFilePrograma, outFileCaso):
    lineasCaso      = correctLinesCaso (outFileCaso)
    #lineasCaso     = open (outFileCaso).readlines()
    lineasPrograma = open (outFilePrograma).readlines()

    nLineasCaso     = len (lineasCaso)
    nLineasPrograma = len (lineasPrograma)

    nRespuestas = min (nLineasCaso, nLineasPrograma)
    
    contadorBuenas = 0
    print ("%s: %s : %s" % (">>>>>".ljust(20), "EVALUADOR".ljust(55), "PROGRAMA"))
    for i in range (nRespuestas):
        strPrograma  = lineasPrograma [i].strip()
        strCaso  = lineasCaso [i].strip()

        flagCorrect = "X"
        if (strPrograma == strCaso):
            flagCorrect = "/"

        #if (not strPrograma.isalnum()):
        #    strCaso = round (float (strCaso), 2)
        #    strPrograma = round (float (strPrograma), 2)

        print ("%s: %s %s : %s" % (listaNombres[i], flagCorrect.ljust(20), str(strPrograma).ljust(55), strCaso)) 

        if (strPrograma==strCaso):
            contadorBuenas +=1
    #

    calificacionCaso = 100*contadorBuenas / nLineasPrograma
    print (">>>>> %s buenas de %s. Calificacion: %s " % (contadorBuenas, nRespuestas , calificacionCaso),"%")
    return (calificacionCaso)


#--------------------------------------------------------------------
# Test the program using command line pipes "<" and ">"
#--------------------------------------------------------------------
def probarCmd (programName):
    #inputs, outputs = leerEntradasSalidas (caseFile)
    resultsFile = "results.txt"
    
    inputs, outputs = listaCasos [0], listaCasos [1]
    inputsFile, outputsFile = createInputsOupts (inputs, outputs)
    cmm = "java %s < %s > %s " % (programName, inputsFile, resultsFile)
    os.system (cmm)

    compareOutputsWithResults (outputsFile, resultsFile)
    
#--------------------------------------------------------------------
#--------------------------------------------------------------------
def compareOutputsWithResults (outputsFile, resultsFile):
    lineasPrograma = open (outputsFile).readlines ()
    lineasCaso     = open (resultsFile).readlines ()

    nLineasCaso     = len (lineasCaso)
    nLineasPrograma = len (lineasPrograma)
    nRespuestas     = min (nLineasCaso, nLineasPrograma)
    
    contadorBuenas = 0
    print ("%s: %s : %s" % (">>>>>".ljust(20), "EVALUADOR".ljust(55), "PROGRAMA"))
    for i in range (nRespuestas):
        strPrograma  = lineasPrograma [i].strip()
        strCaso  = lineasCaso [i].strip()

        flagCorrect = "X"
        if (strPrograma == strCaso):
            flagCorrect = "/"

        print ("%s %s : %s" % (flagCorrect.ljust(20), str(strPrograma).ljust(55), strCaso)) 

        if (strPrograma==strCaso):
            contadorBuenas +=1
    #

    calificacionCaso = 100*contadorBuenas / nLineasPrograma
    print (">>>>> %s buenas de %s. Calificacion: %s " % (contadorBuenas, nRespuestas , calificacionCaso),"%")
    return (calificacionCaso)

#

#--------------------------------------------------------------------
#--------------------------------------------------------------------
def createInputsOupts (inputs, outputs):
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

    inputsFile  = "in-%s" % caseFile
    outputsFile = "out-%s" % caseFile
    inf  = open (inputsFile, "w")
    inf.write (inputsStr)
    inf.close()

    outf = open (outputsFile, "w")
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

if __name__ == "__main__":
    programFile = sys.argv[1]
    #caseFile    = sys.argv[2]

    outputCaso = listaCasos [0][1]
    #probarCmd (programFile, outputCaso)
    probarCmd (programFile)

