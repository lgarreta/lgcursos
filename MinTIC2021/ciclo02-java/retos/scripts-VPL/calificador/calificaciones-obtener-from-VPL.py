#!/usr/bin/python3

# Get name and grade from subdirs gotten from VPL evaluator
USAGE="Rscript calificaciones-obtener-from-VPL <directorio calificaciones>"

import os, sys

args = sys.argv
if (len (args) < 2):
    print (USAGE)
    exit()


inDir = args[1]
dirList = [x for x in os.listdir (inDir)]

outName = "calificaciones-%s.csv" % os.path.basename (inDir)
outFile = open (outName, "w")
outFile.write ("'NOMBRE', 'CALIFICACION'\n") 
for dir in dirList:
    print (">>>", dir)
    if ("Garreta" in dir):
        continue
    name = dir.split()[:-1]
    dirStudent = inDir+"/" + dir
    sd = os.listdir (dirStudent)
    
    cegDir = [dirStudent+"/"+x for x in sd if x.find (".ceg")>0][0]

    #compilationFile = cegDir+"/execution.txt"
    #gradeLine = open (compilationFile).readlines()[-1]
    #grade = gradeLine.split (">>")[-1]
    gradeLine = open (cegDir+"/grade.txt").readline()
    grade     = gradeLine
    nameGrade = ("'%s', %s" %(" ".join (name), grade))
    outFile.write (nameGrade+"\n")
#
outFile.close()
    


