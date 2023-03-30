#!/usr/bin/python3

import os, sys
from io import StringIO

#os.system ("python3 reto2.py < caso1-input.txt")
def probar (programName, caseFile):
    inputs, outputs = leerEntradasSalidas (caseFile)
    print (inputs)
    print (outputs)
    sys.exit (0)
    inputs  = "\n".join (map (str, list (inputs.values())))
    outputs = "\n".join (map (str, list (outputs.values())))
    
    cmm = "python3 " + programName + " < inputs.txt " + " > resultados.txt"
    
    resultados = open ("resultados.txt").readlines()
    print (resultados)

#--------------------------------------------------------------------
#--------------------------------------------------------------------
def leerEntradasSalidas (caseFile):
    lines = open (caseFile).readlines()
    inputs = lines[0].split(":")[1].split()
    lines = open (caseFile).readlines()
    outputs = lines[1].split(":")[1].split()
    for i in inputs:
        print (i)

    return ((inputs, outputs))

#--------------------------------------------------------------------
# Call main with input parameter
#--------------------------------------------------------------------
if __name__ == "__main__":
    programFile = sys.argv[1]
    caseFile    = sys.argv[2]

    probar (programFile, caseFile)

