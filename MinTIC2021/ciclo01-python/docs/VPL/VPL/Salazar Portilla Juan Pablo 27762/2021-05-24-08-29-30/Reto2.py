#Mision TIC 2020 - Universidad El Bosque
#Juan Pablo Salazar Portilla
#Reto 2

#Variables
descuentoEdad = 0
descuentoSalarios = 0
descuentoExamen = 0
descuentoTotal = 0

#Toma de datos
# nombre = input("Nombres y apellidos del estudiante: ")
# edad = int(input("Edad del estudiante: "))
# salariosMinimos = float(input("Numero de salarios minimos: "))
# puntajeExamen = int(input("Puntaje examen: "))

edad     = int (input ())
puntajeExamen  = int (input ())
salariosMinimos  = int (input ())

#Descuento por edad
if edad >= 15 and edad <= 18:
    print("Edad entre 15 a 18")
    descuentoEdad = 25    
elif edad >= 19 and edad <=21:    
    descuentoEdad = 15    
elif edad >= 22 and edad <=25:
    descuentoEdad = 10
else:
    descuentoEdad = 0

#Descuento por salarios minimos
if salariosMinimos <= 1:    
    descuentoSalarios = 30    
elif salariosMinimos > 1 and salariosMinimos <=2:    
    descuentoSalarios = 20    
elif salariosMinimos > 2 and salariosMinimos <=3:
    descuentoSalarios = 10    
elif salariosMinimos > 3 and salariosMinimos <=4:
    descuentoSalarios = 5
else:
    descuentoSalzarios = 0
    
#Descuento por examen

if(puntajeExamen >= 80 and puntajeExamen < 86):
    descuentoExamen = 30
elif(puntajeExamen >= 86 and puntajeExamen < 91):
    descuentoExamen = 35
elif(puntajeExamen >= 91 and puntajeExamen < 96):
    descuentoExamen = 40
elif(puntajeExamen > 96):
    descuentoExamen = 45
else:
    descuentoExamen = 0
    
#Suma del descuento
    
descuentoTotal = descuentoEdad + descuentoSalarios + descuentoExamen

# print("\nDatos de descuento")
# print("El estudiante",nombre,"resive los siguientes descuentos:")
# print("Descuento por edad:",descuentoEdad)
# print("Descuento por salarios:",descuentoSalarios)
# print("Descuento por puntaje del examen:",descuentoExamen)
# print("El total del descuento es:",descuentoTotal)

print (descuentoEdad)
print (descuentoExamen)
print (descuentoSalarios)
print (descuentoTotal)

