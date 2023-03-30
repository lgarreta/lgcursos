#!/usr/bin/python3

import os, sys
from io import StringIO

#os.system ("python3 reto2.py < caso1-input.txt")
def evalCases (programName, caseName):
    caseFile = case + ".txt"
    exec (open ("caso1.txt").read())
    inputs = "\n".join (map (str, list (inputs.values())))
    
    sys.stdin = StringIO('test')

