#!/usr/bin/python3

outputsNames = ["HoraNormal", "HoraExtra", "SueldoBruto", \
           "DescParafiscal", "DescSalud", "DescPension", "DescTotal", \
           "SueldoNeto", "ProvPrima", "ProvCesantias", "ProvIntereses", "ProvVacaciones"]

lines = open ("casosVPL-Reto3.txt").readlines()
lines = [x.strip() for x in lines]

inputsOutputsList = []

i=0
while (i < (len (lines))):
    print (i)
    caseName = lines [i]
    inputs   = []
    inputs.append (lines [i+2].split("=")[1])
    inputs.append (lines [i+3])

    outputs = [lines [i+5].split ("=")[1]]
    for j in range (11):
        outputs.append (lines [i+6+j])

    print (caseName)
    print (inputs)
    print (outputs)

    i = i + 18
    inputsOutputsList.append ([inputs, outputs])
#
print()
print (outputsNames)
print (inputsOutputsList)






