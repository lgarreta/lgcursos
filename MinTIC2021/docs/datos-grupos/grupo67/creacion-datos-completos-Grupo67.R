#!/usr/bin/Rscript

# Create full data for Grupo67

#data = read.csv ("grupo67-FundamientosProgramacion-Prof-LuisGarreta.csv")
data = read.csv ("Grupo70-Datos-ListadoParticipantes-Ago08.csv", check.names=F)
head (data)

nombreApellido = paste (data$Nombre, data$Apellido)
apellidoNombre = paste (data$Apellido, data$Nombre)
dataFull = data.frame (data, NombreApellido=nombreApellido, ApellidoNombre=apellidoNombre)
head (dataFull)


write.csv (dataFull,"Grupo70-DatosCompletos.csv", row.names=F, quote=F)
