#!/usr/bin/python3

import os, sys
from io import StringIO

#listaNombres = ['HoraNormal', 'HoraExtra', 'SueldoBruto', 'DescParafiscal', 'DescSalud', 'DescPension', 'DescTotal', 'SueldoNeto', 'ProvPrima', 'ProvCesantias', 'ProvIntereses', 'ProvVacaciones']
#listaCasos   = [[['45', '10000'], ['400000', '75000.0', '475000.0', '42750.0', '19000.0', '19000.0', '80750.0', '394250.0', '39567.5', '39567.5', '4750.0', '19807.5']], [['40', '10000'], ['400000', '0', '400000', '36000.0', '16000.0', '16000.0', '68000.0', '332000.0', '33320.0', '33320.0', '4000.0', '16680.0']], [['38', '10000'], ['380000', '0', '380000', '34200.0', '15200.0', '15200.0', '64600.0', '315400.0', '31654.0', '31654.0', '3800.0', '15846.0']], [['20', '10000'], ['200000', '0', '200000', '18000.0', '8000.0', '8000.0', '34000.0', '166000.0', '16660.0', '16660.0', '2000.0', '8340.0']], [['50', '10000'], ['400000', '150000.0', '550000.0', '49500.0', '22000.0', '22000.0', '93500.0', '456500.0', '45815.0', '45815.0', '5500.0', '22935.0']]]
listaCasos = [[['3', 'Marina Torres', '1088345678', '3101234567', '3', 'Antonio Cortes', '1044678123', '3150987654', '1', '2', 'M', '4', 'Antonio Cortes', '5', '1044678123', '1', '6', ''], ['Menu Principal', '1. Ver listado', '2. Ver listado filtrado', '3. Agregar beneficiario', '4. Buscar beneficiario', '5. Borrar beneficiario', '6. Salir', 'Digite la información del beneficiario a agregar:', 'El beneficiario ha sido agregado', 'Menu Principal', '1. Ver listado', '2. Ver listado filtrado', '3. Agregar beneficiario', '4. Buscar beneficiario', '5. Borrar beneficiario', '6. Salir', 'Digite la información del beneficiario a agregar:', 'El beneficiario ha sido agregado', 'Menu Principal', '1. Ver listado', '2. Ver listado filtrado', '3. Agregar beneficiario', '4. Buscar beneficiario', '5. Borrar beneficiario', '6. Salir', 'Listado de beneficiarios', 'Marina Torres', '1088345678', '3101234567', 'Antonio Cortes', '1044678123', '3150987654', 'Menu Principal', '1. Ver listado', '2. Ver listado filtrado', '3. Agregar beneficiario', '4. Buscar beneficiario', '5. Borrar beneficiario', '6. Salir', 'Digite la letra por la que empiezan los beneficiarios:', 'Listado filtrado de beneficiarios:', 'Marina Torres', '1088345678', '3101234567', 'Menu Principal', '1. Ver listado', '2. Ver listado filtrado', '3. Agregar beneficiario', '4. Buscar beneficiario', '5. Borrar beneficiario', '6. Salir', 'Digite el nombre y apellido del beneficiario a buscar:', 'Antonio Cortes', '1044678123', '3150987654', 'Menu Principal', '1. Ver listado', '2. Ver listado filtrado', '3. Agregar beneficiario', '4. Buscar beneficiario', '5. Borrar beneficiario', '6. Salir', 'Digite la cedula del beneficiario a borrar:', 'El usuario ha sido eliminado del listado', 'Menu Principal', '1. Ver listado', '2. Ver listado filtrado', '3. Agregar beneficiario', '4. Buscar beneficiario', '5. Borrar beneficiario', '6. Salir', 'Listado de beneficiarios', 'Marina Torres', '1088345678', '3101234567', 'Menu Principal', '1. Ver listado', '2. Ver listado filtrado', '3. Agregar beneficiario', '4. Buscar beneficiario', '5. Borrar beneficiario', '6. Salir', 'Hasta pronto']]]
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
def probarRedirect (programFile, caso=None):
    global listaCasos
    if (caso!=None):
        listaCasos = listaCasos [caso:caso+1]
        i = caso
    else:
        i = 0

    calificaciones = []
    nCasos = 0
    for caso in listaCasos:
        nCasos +=1
        print ("\nCaso ", i)
        entradas, salidas = caso [0], caso [1]
        inFile, outFile = crearEntradasSalidas (entradas, salidas)

        #outResultsFile = probarCmd (programFile, inFile)
        #sys.exit(1)

        fdIn = open (inFile)
        sys.stdin = fdIn
        fdOut = open ("out-res.txt", "w")
        orgStdOut  = sys.stdout
        sys.stdout = fdOut

        #execfile (programFile)
        #exec (open (programFile).read())

        with open(programFile, "rb") as source_file:
            code = compile(source_file.read(), programFile, "exec")
        exec(code, {})

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
def probarCmd (programName, inFile):
    #inputs, outputs = leerEntradasSalidas (caseFile)
    outResultsFile = "out-res.txt"
    
    cmm = "python3 %s < %s > %s " % (programName, inFile, outResultsFile)
    os.system (cmm)
    
    resultados = open (outResultsFile).readlines()
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

    outputCaso = listaCasos [0][1]
    #probarCmd (programFile, outputCaso)
    probar (programFile)

