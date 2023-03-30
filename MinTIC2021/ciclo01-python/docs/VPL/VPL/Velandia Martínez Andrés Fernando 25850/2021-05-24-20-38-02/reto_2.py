#descuento_sobre_matricula

#entradas
edad     = int (input ("Edad: "))
puntaje  = int (input ("Puntaje: "))
ingreso  = int (input ("Ingreso: "))

#bonoEdad
if (edad >= 15 and edad <= 18):
    descEdad = 25
if (edad >= 19 and edad <= 21):
    descEdad = 15
if (edad >= 22 and edad <= 25):
    descEdad = 10
if (edad > 25):
    descEdad = 0

#bonoPuntaje
if (puntaje >= 80 and puntaje < 86):
    descPuntaje = 30
if (puntaje >= 86 and puntaje < 91):
    descPuntaje = 35
if (puntaje >= 91 and puntaje < 96):
    descPuntaje = 40
if (puntaje >= 96):
    descPuntaje = 45
if (puntaje < 80):
    descPuntaje = 0

#bonoIngreso
if (ingreso <= 1):
    descIngreso = 30
if (ingreso > 1 and ingreso <= 2):
    descIngreso = 20
if (ingreso > 2 and ingreso <= 3):
    descIngreso = 10
if (ingreso > 3 and ingreso <= 4):
    descIngreso = 5
if (ingreso > 4):
    descIngreso = 0
    
#descuentoTotal
descTotal = descEdad + descPuntaje + descIngreso

#salidas
print (descEdad)
print (descPuntaje)
print (descIngreso)
print (descTotal)