#!/usr/bin/Rscript
"Toma todas las calificaciones de los retos y
las organiza con las columnas basicas y nuevos nombres"

library (dplyr)

addLabel <- function (retosFile, label, newExt=NULL)  {
	nameext = strsplit (retosFile, split="[.]")
	name    = nameext [[1]][1] 
	if (is.null (newExt))
		ext     = nameext [[1]][2] 
	else
		ext     = newExt
	newName = paste0 (nameext [[1]][1], "-", label, ".", ext )
	return (newName)
}

args = commandArgs(trailingOnly = TRUE)
retosFile = args [1]
asistenciaFile = args [2]

asistenciaData = read.csv (asistenciaFile)

retosData = read.csv (retosFile)

Estudiante= paste(retosData$Nombre, retosData$Apellido)
Reto1     = retosData[3]
Reto2     = retosData[3]
Reto3     = retosData[4]
Reto4     = retosData[5]
Reto5     = retosData[6]
Reto6     = retosData[7]

dataRetosOrganizado = data.frame (Estudiante, Reto1, Reto2, Reto3, Reto4, Reto5, Reto6)
colnames (dataRetosOrganizado) = c("Estudiante", "Reto1", "Reto2", "Reto3", "Reto4", "Reto5", "Reto6")

# Join assitence
dataRetosAsistencia = left_join (dataRetosOrganizado, asistenciaData, by=c("Estudiante"="NOMBRE"))

newFilename = addLabel (retosFile, "Organizado-Asistencia")

write.csv (dataRetosAsistencia, newFilename, row.names=F)
