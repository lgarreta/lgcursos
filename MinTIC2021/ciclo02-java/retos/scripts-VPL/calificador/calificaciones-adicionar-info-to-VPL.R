#!/usr/bin/Rscript

options (width=300)

#-------------------------------------------------------------
# Add label to filename and new extension (optional)
#-------------------------------------------------------------
addLabel <- function (filename, label, newExt=NULL)  {
	nameext = strsplit (filename, split="[.]")
	name    = nameext [[1]][1] 
	if (is.null (newExt))
		ext     = nameext [[1]][2] 
	else
		ext     = newExt
	newName = paste0 (nameext [[1]][1], "-", label, ".", ext )
	return (newName)
}

# Adiciona el correo a las califaciones obtenidas de VPL
USAGE="
Adiciona a las gradesFilename obtenidas del VPL los infoFilename del nombre y correo
script.py <calificaciones.csv> <infoFilename-estudiantes.csv>
"

suppressMessages (library (dplyr))

args = commandArgs(trailingOnly = TRUE)

if (length (args) < 1) {
	message (USAGE)
	quit ()
}

gradesFilename = args [1]
infoFilename   = args [2]
#infoFilename = "Grupo67-DatosCompletos.csv"

gradesWithDataFilename = addLabel (gradesFilename, "con-DATOS")

grades   = read.csv (gradesFilename, quote="'")
students = read.csv (infoFilename)

print (head (grades["NOMBRE"]))
print (head (students["ApellidoNombre"]))


gradesWithData = left_join (grades, students, by=c("NOMBRE"="ApellidoNombre"), keep=T)
head (gradesWithData)
gradesWithData = gradesWithData [,c("NOMBRE", "CALIFICACION", "Correo")]
#gradesWithData$CALIFICACION = gradesWithData$CALIFICACION/10
head (gradesWithData)

write.csv (gradesWithData, gradesWithDataFilename, row.names=F, quote=F)







