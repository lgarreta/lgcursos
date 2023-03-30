#!/usr/bin/python3
import sys

args = sys.argv
inputsFile  = args [1]
outputsFile = args [2]

outputsNames = ["HoraNormal", "HoraExtra", "SueldoBruto", \
           "DescParafiscal", "DescSalud", "DescPension", "DescTotal", \
           "SueldoNeto", "ProvPrima", "ProvCesantias", "ProvIntereses", "ProvVacaciones"]


# Read inputs
lines = open (inputsFile).readlines()
lines = [x.strip() for x in lines]
inputs = []
i=0
N = len (lines)
while (i < N):
    inputs.append (lines [i])
    i+=1
#

# Read outputs
lines = open (outputsFile).readlines()
lines = [x.strip() for x in lines]
outputs=[]
i=0
N = len (lines)
while (i < len (lines)):
    outputs.append (lines [i])
    i += 1
#
#print()
print ("\nINPUTS:")
#for i in inputs:
#    print (i)
#print (">>>>>")

#print ("\nOUTPUTS:")
#for o in outputs:
#    print (o)

inoutList = [inputs, outputs]
print (inoutList)
