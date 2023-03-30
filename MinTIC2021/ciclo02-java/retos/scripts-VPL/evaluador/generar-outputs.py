!/usr/bin/python3
import os

inputs = open ("inputs-VPL.txt").readlines ();
n = len (inputs)
k = 1
inList = []
outList = []
for i in range (0, 20, 4):
    inputsCase = [x.strip() for x in inputs [i:i+4]]
    inList.append (inputsCase)

    inName = "cases/incase%s.txt" % k
    outCase = open (inName, "w")
    with open(inName, mode='wt', encoding='utf-8') as myfile:
        myfile.write('\n'.join(inputsCase))

    #outCase.writelines (inputsCase)
    #outCase.close ()
    outName = "cases/outcase%s.txt" % str(k)
    cmm = "java UsoFactura < %s > %s" % (inName, outName)
    os.system (cmm)
    outLines = open (outName).readlines ()
    outLines = [x.strip () for x in outLines]
    outList.append (outLines)
    k+=1

inoutList = [inList, outList]
print (inoutList)



