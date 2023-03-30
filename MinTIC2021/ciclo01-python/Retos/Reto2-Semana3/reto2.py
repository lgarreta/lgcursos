#!/usr/bin/python3
#edad     = int (input ("Edad: "))
#puntaje  = int (input ("Puntaje: "))
#ingreso  = int (input ("Ingreso: "))

edad     = int (input ())
puntaje  = int (input ())
ingreso  = int (input ())

descEdad    = 0
descIngreso = 0
descPuntaje = 0
descTotal   = 0


if (edad >=15 and edad <= 18):
    descEdad = 25
elif (edad >=19 and edad <= 21):
    descEdad = 15
elif (edad >=22 and edad <= 25):
    descEdad = 10
elif (edad >25):
    descEdad = 0
    
if (puntaje >= 80 and puntaje < 86):
    descPuntaje = 30
elif (puntaje >= 86 and puntaje < 91):
    descPuntaje = 35
elif (puntaje >= 91 and puntaje < 96):
    descPuntaje = 40
elif (puntaje >= 96):
    descPuntaje = 45
elif (puntaje < 80):
    descPuntaje = 0

if (ingreso <= 1.0):
    descIngreso = 30
elif (ingreso > 1.0 and ingreso <= 2.0):
    descIngreso = 20
elif (ingreso > 2.0 and ingreso <= 3.0):
    descIngreso = 10
elif (ingreso > 3.0 and ingreso <= 4.0):
    descIngreso = 5
elif (ingreso > 4):
    descIngreso = 0

descTotal = descEdad + descIngreso + descPuntaje

print (descEdad)
print (descPuntaje)
print (descIngreso)
print (descTotal)


