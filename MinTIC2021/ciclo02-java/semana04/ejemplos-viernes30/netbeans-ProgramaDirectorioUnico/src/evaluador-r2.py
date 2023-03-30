#!/usr/bin/python
# encoding: utf-8

import os, sys
from io import StringIO

#listaCasos = [[['1', 'Luis Ernesto', 'Poveda Garcés', '1980-05-29', 'lpovedag@lafloresta.edu.co', 'luispov@hotmail.com', '3167556688', '2916565', 'Contaduría', '1', 'Mariana', 'Casas Paz', '1984-02-12', 'mcasasp@lafloresta.edu.co', 'mariana12@hotmail.com', '3125674455', '7124432', 'Medicina', '2', 'lpovedag@lafloresta.edu.co', '3', 'lpovedag@lafloresta.edu.co', 'luispov@hotmail.com', '3125674451', '7124432', 'Derecho', '4', 'lpovedag@lafloresta.edu.co', '5', '6'], ['', 'INSTITUTO LA FLORESTA', 'Seleccione tarea a realizar:', '1. Ingresar estudiante', '2. Buscar estudiante', '3. Modificar estudiante', '4. Eliminar Estudiante', '5. Ver directorio de estudiantes', '6. Salir', 'Opción:', 'Ingresar estudiante', 'Ingresar nombres:', 'Ingresar apellidos:', 'Ingresar fecha de nacimiento (YYYY-MM-DD):', 'Ingresar correo institucional:', 'Ingresar correo personal:', 'Ingresar número de celular:', 'Ingresar número fijo:', 'Ingresar programa:', 'Se agregó el estudiante', '', 'INSTITUTO LA FLORESTA', 'Seleccione tarea a realizar:', '1. Ingresar estudiante', '2. Buscar estudiante', '3. Modificar estudiante', '4. Eliminar Estudiante', '5. Ver directorio de estudiantes', '6. Salir', 'Opción:', 'Ingresar estudiante', 'Ingresar nombres:', 'Ingresar apellidos:', 'Ingresar fecha de nacimiento (YYYY-MM-DD):', 'Ingresar correo institucional:', 'Ingresar correo personal:', 'Ingresar número de celular:', 'Ingresar número fijo:', 'Ingresar programa:', 'Se agregó el estudiante', '', 'INSTITUTO LA FLORESTA', 'Seleccione tarea a realizar:', '1. Ingresar estudiante', '2. Buscar estudiante', '3. Modificar estudiante', '4. Eliminar Estudiante', '5. Ver directorio de estudiantes', '6. Salir', 'Opción:', 'Buscar estudiante', 'Ingresar correo institucional:', 'Información del estudiante', 'Nombres: Luis Ernesto', 'Apellidos: Poveda Garcés', 'Fecha nacimiento: 1980-05-29', 'Correo institucional: lpovedag@lafloresta.edu.co', 'Correo personal: luispov@hotmail.com', 'Número de teléfono celular: 3167556688', 'Número de teléfono fijo: 2916565', 'Programa académico: Contaduría', '', 'INSTITUTO LA FLORESTA', 'Seleccione tarea a realizar:', '1. Ingresar estudiante', '2. Buscar estudiante', '3. Modificar estudiante', '4. Eliminar Estudiante', '5. Ver directorio de estudiantes', '6. Salir', 'Opción:', 'Modificar estudiante', 'Ingresar correo institucional:', 'Ingresar correo personal:', 'Ingresar número de celular:', 'Ingresar número fijo:', 'Ingresar programa:', 'Se modificó el estudiante', '', 'INSTITUTO LA FLORESTA', 'Seleccione tarea a realizar:', '1. Ingresar estudiante', '2. Buscar estudiante', '3. Modificar estudiante', '4. Eliminar Estudiante', '5. Ver directorio de estudiantes', '6. Salir', 'Opción:', 'Eliminar estudiante', 'Ingresar correo institucional:', 'Se eliminó el estudiante', '', 'INSTITUTO LA FLORESTA', 'Seleccione tarea a realizar:', '1. Ingresar estudiante', '2. Buscar estudiante', '3. Modificar estudiante', '4. Eliminar Estudiante', '5. Ver directorio de estudiantes', '6. Salir', 'Opción:', 'El directorio de los estudiantes', 'Nombres: Mariana', 'Apellidos: Casas Paz', 'Fecha nacimiento: 1984-02-12', 'Correo institucional: mcasasp@lafloresta.edu.co', 'Correo personal: mariana12@hotmail.com', 'Número de teléfono celular: 3125674455', 'Número de teléfono fijo: 7124432', 'Programa académico: Medicina', '', 'INSTITUTO LA FLORESTA', 'Seleccione tarea a realizar:', '1. Ingresar estudiante', '2. Buscar estudiante', '3. Modificar estudiante', '4. Eliminar Estudiante', '5. Ver directorio de estudiantes', '6. Salir', 'Opción:', 'Hasta pronto']]]
listaCasos = [['1', 'Luis Ernesto', 'Poveda Garcés', '1980-05-29', 'lpovedag@lafloresta.edu.co', 'luispov@hotmail.com', '3167556688', '2916565', 'Contaduría', '1', 'Mariana', 'Casas Paz', '1984-02-12', 'mcasasp@lafloresta.edu.co', 'mariana12@hotmail.com', '3125674455', '7124432', 'Medicina', '2', 'lpovedag@lafloresta.edu.co', '3', 'lpovedag@lafloresta.edu.co', 'luispov@hotmail.com', '3125674451', '7124432', 'Derecho', '4', 'lpovedag@lafloresta.edu.co', '5', '6'], ['', 'INSTITUTO LA FLORESTA', 'Seleccione tarea a realizar:', '1. Ingresar estudiante', '2. Buscar estudiante', '3. Modificar estudiante', '4. Eliminar Estudiante', '5. Ver directorio de estudiantes', '6. Salir', 'Opción:', 'Ingresar estudiante', 'Ingresar nombres:', 'Ingresar apellidos:', 'Ingresar fecha de nacimiento (YYYY-MM-DD):', 'Ingresar correo institucional:', 'Ingresar correo personal:', 'Ingresar número de celular:', 'Ingresar número fijo:', 'Ingresar programa:', 'Se agregó el estudiante', '', 'INSTITUTO LA FLORESTA', 'Seleccione tarea a realizar:', '1. Ingresar estudiante', '2. Buscar estudiante', '3. Modificar estudiante', '4. Eliminar Estudiante', '5. Ver directorio de estudiantes', '6. Salir', 'Opción:', 'Ingresar estudiante', 'Ingresar nombres:', 'Ingresar apellidos:', 'Ingresar fecha de nacimiento (YYYY-MM-DD):', 'Ingresar correo institucional:', 'Ingresar correo personal:', 'Ingresar número de celular:', 'Ingresar número fijo:', 'Ingresar programa:', 'Se agregó el estudiante', '', 'INSTITUTO LA FLORESTA', 'Seleccione tarea a realizar:', '1. Ingresar estudiante', '2. Buscar estudiante', '3. Modificar estudiante', '4. Eliminar Estudiante', '5. Ver directorio de estudiantes', '6. Salir', 'Opción:', 'Buscar estudiante', 'Ingresar correo institucional:', 'Información del estudiante', 'Nombres: Luis Ernesto', 'Apellidos: Poveda Garcés', 'Fecha nacimiento: 1980-05-29', 'Correo institucional: lpovedag@lafloresta.edu.co', 'Correo personal: luispov@hotmail.com', 'Número de teléfono celular: 3167556688', 'Número de teléfono fijo: 2916565', 'Programa académico: Contaduría', '', 'INSTITUTO LA FLORESTA', 'Seleccione tarea a realizar:', '1. Ingresar estudiante', '2. Buscar estudiante', '3. Modificar estudiante', '4. Eliminar Estudiante', '5. Ver directorio de estudiantes', '6. Salir', 'Opción:', 'Modificar estudiante', 'Ingresar correo institucional:', 'Ingresar correo personal:', 'Ingresar número de celular:', 'Ingresar número fijo:', 'Ingresar programa:', 'Se modificó el estudiante', '', 'INSTITUTO LA FLORESTA', 'Seleccione tarea a realizar:', '1. Ingresar estudiante', '2. Buscar estudiante', '3. Modificar estudiante', '4. Eliminar Estudiante', '5. Ver directorio de estudiantes', '6. Salir', 'Opción:', 'Eliminar estudiante', 'Ingresar correo institucional:', 'Se eliminó el estudiante', '', 'INSTITUTO LA FLORESTA', 'Seleccione tarea a realizar:', '1. Ingresar estudiante', '2. Buscar estudiante', '3. Modificar estudiante', '4. Eliminar Estudiante',\
        '5. Ver directorio de estudiantes', '6. Salir', 'Opción:', 'El directorio de los estudiantes', 'Nombres: Mariana', 'Apellidos: Casas Paz', 'Fecha nacimiento: 1984-02-12', 'Correo institucional: mcasasp@lafloresta.edu.co', 'Correo personal: mariana12@hotmail.com', 'Número de teléfono celular: 3125674455', 'Número de teléfono fijo: 7124432', 'Programa académico: Medicina', '', 'INSTITUTO LA FLORESTA', 'Seleccione tarea a realizar:', '1. Ingresar estudiante', '2. Buscar estudiante', '3. Modificar estudiante', '4. Eliminar Estudiante', '5. Ver directorio de estudiantes', '6. Salir', 'Opción:', 'Hasta pronto']]

#   
#--------------------------------------------------------------------
#--------------------------------------------------------------------
def createCmmForOS (programName, inputsFile, resultsFile):
    from sys import platform
    if platform == "linux" or platform == "linux2":
        cmm = "java -cp .:../build/classes %s < %s > %s " % (programName, inputsFile, resultsFile)
        # linux
    elif platform == "darwin":
        cmm = "java -cp .:../build/classes %s < %s > %s " % (programName, inputsFile, resultsFile)
        # OS X
    elif platform == "win32":
        cmm = "java -cp .;..\build\classes %s < %s > %s " % (programName, inputsFile, resultsFile)
        # Windows...
    return (cmm)


#--------------------------------------------------------------------
# Test the program using command line pipes "<" and ">"
#--------------------------------------------------------------------
def probarCmdCases (programName):
    resultsFile = "results.txt"
    
    inputsCases, outputsCases = listaCasos [0], listaCasos [1]
    k = 1
    for inputs, outputs in zip ([inputsCases], [outputsCases]):
        print("")
        print (">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> CASO: %s <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<" % k)
        inputsFile, outputsFile = createInputsOupts (inputs, outputs)
        cmm = createCmmForOS (programName, inputsFile, resultsFile)
        os.system (cmm)


        lineasPrograma = open (outputsFile).readlines ()
        lineasCaso     = open (resultsFile).readlines ()
        compareOutputsWithResults (lineasPrograma, lineasCaso)
        k+=1
        os.remove (inputsFile)
        os.remove (outputsFile)
        os.remove (resultsFile)
    
#--------------------------------------------------------------------
#--------------------------------------------------------------------
def compareOutputsWithResults (lineasPrograma, lineasCaso):

    nLineasCaso     = len (lineasCaso)
    nLineasPrograma = len (lineasPrograma)
    nRespuestas     = min (nLineasCaso, nLineasPrograma)
    
    contadorBuenas = 0
    print ("%s:%s : %s" % (">>>>>".ljust(20), "EVALUADOR".ljust(55), "PROGRAMA"))
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
    print (">>>>> %s buenas de %s. Calificacion: %s" % (contadorBuenas, nRespuestas , calificacionCaso),"%")
    return (calificacionCaso)

#

#--------------------------------------------------------------------
#--------------------------------------------------------------------
def createInputsOupts (inputs, outputs):
    inputsStr  = "\n".join (map (str, inputs))
    outputsStr = "\n".join (map (str, outputs))

    inf  = open ("in.txt", "w")
    inf.write (inputsStr)
    inf.write ("\n")
    inf.close()

    outf = open ("out.txt", "w")
    outf.write (outputsStr)
    outf.close()

    return ("in.txt", "out.txt")

#--------------------------------------------------------------------
# Call main with input parameter-
#--------------------------------------------------------------------

if __name__ == "__main__":
    programFile = sys.argv[1]

    probarCmdCases (programFile)

