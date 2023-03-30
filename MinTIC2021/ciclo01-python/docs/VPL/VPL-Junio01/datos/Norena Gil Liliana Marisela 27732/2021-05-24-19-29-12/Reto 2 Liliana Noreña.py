#RETO DE LA SEMANA 3
#Esquema de porcentajes de ayuda (descuento sobre la matrícula)

#Definir variables

#ENTRADAS

#nombre= str (input ("Ingrese nombre(s): "))
#apellido= str (input("Ingrese apellido(s): "))
edad= int (input ("Edad: "))
puntajeIngreso= int (input ("Puntaje: "))
ingresoFliar = int (input ("Ingreso: "))

#Variables correspondientes a los descuentos por edad

descEdad1= 25
descEdad2= 15
descEdad3= 10
descEdad4= 0

#Variables correspondientes a los descuentos por ingreso familiar

descIngreso1= 30
descIngreso2= 20
descIngreso3= 10
descIngreso4= 5
descIngreso5= 0

#Variables correspondientes a los descuentos por puntaje de ingreso

descPuntaje1 = 30
descPuntaje2 = 35
descPuntaje3 = 40
descPuntaje4 = 45
descPuntaje5 = 0

#Caso 1
#Cálculo del porcentaje de ayuda según la edad

if (edad >= 15 and edad<= 18):
    descEdad = descEdad1
    #print ("Descuento por edad: ", descEdad, "%")
elif (edad >= 19 and edad <= 21):
    descEdad = descEdad2
    #print ("Descuento por edad: ", descEdad, "%")
elif (edad >= 22 and edad <= 25):
    descEdad = descEdad3
    #print ("Descuento por edad: ", descEdad, "%")
else:
    (edad >25)
    descEdad = descEdad4
    #print ("Descuento por edad: ", descEdad, "%")
    
#Caso 2
#Cálculo del porcentaje de ayuda según el ingreso familiar

if (ingresoFliar <= 1):
    descIngreso= descIngreso1
    #print ("Descuento por ingreso familiar: ", descIngreso, "%")
elif (ingresoFliar > 1 and ingresoFliar <= 2):
    descIngreso= descIngreso2
    #print ("Descuento por ingreso familiar: ", descIngreso, "%")
elif (ingresoFliar > 2 and ingresoFliar <= 3):
    descIngreso= descIngreso3
    #print ("Descuento por ingreso familiar: ", descIngreso, "%")
elif (ingresoFliar > 3 and ingresoFliar <= 4):
    descIngreso= descIngreso4
    #print ("Descuento por ingreso familiar: ", descIngreso, "%")
else:
    (ingresoFliar > 4)
    descIngreso= descIngreso5
    #print ("Descuento por ingreso familiar: ", descIngreso, "%")
    
#Caso 3
#Cálculo del porcentaje de ayuda según el puntaje de ingreso

if (puntajeIngreso >= 80 and puntajeIngreso < 86):
    descPuntaje= descPuntaje1
    #print ("Descuento por puntaje de ingreso: ", descPuntaje, "%")
elif (puntajeIngreso >= 86 and puntajeIngreso < 91):
    descPuntaje= descPuntaje2
    #print ("Descuento por puntaje de ingreso: ", descPuntaje, "%")
elif (puntajeIngreso >= 91 and puntajeIngreso < 96):
    descPuntaje= descPuntaje3
    #print ("Descuento por puntaje de ingreso: ", descPuntaje, "%")
elif (puntajeIngreso >= 96):
    descPuntaje= descPuntaje4
    #print ("Descuento por puntaje de ingreso: ", descPuntaje, "%")
else:
    (puntajeIngreso < 80)
    descPuntaje= descPuntaje5
    #print ("Descuento por puntaje de ingreso: ", descPuntaje, "%")
    
#Cálculo del porcentaje total de apoyo que recibirá el beneficiario
    #Porcentaje de descuento sobre el valor de la matrícula
    
descTotal = descEdad + descIngreso + descPuntaje

#SALIDAS

print (descEdad)
print (descPuntaje)
print (descIngreso)
print (descTotal)

