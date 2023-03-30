#!/usr/bin/python3

outputsNames = ["HoraNormal", "HoraExtra", "SueldoBruto", \
           "DescParafiscal", "DescSalud", "DescPension", "DescTotal", \
           "SueldoNeto", "ProvPrima", "ProvCesantias", "ProvIntereses", "ProvVacaciones"]

lines = open ("casosVPL-Reto5.txt").readlines()
lines = [x.strip() for x in lines]

inputsOutputsList = []

# Read inputs
inputs = []

i=0
caseName = lines [i]
inputs.append (lines [i+1].split("=")[1])
i+=2
while (i < 19):
    inputs.append (lines [i])
    i+=1
#

# Read outputs
outputs=[]
outputs.append (lines [i].split("=")[1])
i+=1
while (i < len (lines)):
    outputs.append (lines [i])
    i += 1
#
#print()
print (caseName)

print ("\nINPUTS:")
#for i in inputs:
#    print (i)
#print (">>>>>")

#print ("\nOUTPUTS:")
#for o in outputs:
#    print (o)

inoutList = [inputs, outputs]
print (inoutList)
