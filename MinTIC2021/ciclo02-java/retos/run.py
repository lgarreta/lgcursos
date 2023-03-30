#!/usr/bin/python

import os, sys

#----------------------------------------------------------
# Create dir, if it exists the it is renamed old-XXX
#----------------------------------------------------------
def createDir (dir):
	def checkExistingDir (dir):
		if os.path.lexists (dir):
			headDir, tailDir = os.path.split (dir)
			oldDir = os.path.join (headDir, "old-" + tailDir)
			if os.path.lexists (oldDir):
					checkExistingDir (oldDir)

			os.rename (dir, oldDir)
	checkExistingDir (dir)
	os.system ("mkdir -p %s" % dir)
#----------------------------------------------------------

args = sys.argv

zipFile = args [1]

zipDir = zipFile.split (".")[0]

#if (os.path.exists (zipDir)):
#    os.system ("del %s" % zipDir)

#os.system ("mkdir %s " % zipDir)
createDir (zipDir)

cmm = "unzip %s -d %s" % (zipFile, zipDir)
os.system (cmm)

reto  = zipDir.split("Reto")[1].split("-")[0]
grupo = zipDir.split("-")[1].split("Grupo")[1].split(".")[0]

cmm = "calificaciones-obtener-from-VPL.py Reto%s-Grupo%s" % (reto, grupo)
os.system (cmm)
cmm = "calificaciones-adicionar-info-to-VPL.R calificaciones-Reto%s-Grupo%s.csv Grupo%s-DatosCompletos.csv" % (reto, grupo, grupo)
os.system (cmm)

