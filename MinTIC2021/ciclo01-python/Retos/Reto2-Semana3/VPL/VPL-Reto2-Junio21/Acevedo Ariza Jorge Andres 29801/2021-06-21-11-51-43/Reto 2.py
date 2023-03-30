 
edadEstudiante = 0
notaPrueba = 0
ingresoFamiliar = 0
descuentoEdad = 0
descuentoPrueba = 0
decuentoIngreso = 0
totalDescuentos = 0

edadEstudiante = int(input())
notaPrueba = int(input())
ingresoFamiliar = float(input())


if (edadEstudiante >= 15 and edadEstudiante <= 18):
    descuentoEdad = 25
elif (edadEstudiante >= 19 and edadEstudiante <= 21):
    descuentoEdad = 15
elif (edadEstudiante >= 22 and edadEstudiante <= 25):
    descuentoEdad = 10
else:
    descuentoEdad = 0


if (notaPrueba >= 80 and notaPrueba < 86):
    descuentoPrueba = 30
elif (notaPrueba >= 86 and notaPrueba < 91):
    descuentoPrueba = 35
elif (notaPrueba >= 91 and notaPrueba < 96):
    descuentoPrueba = 40
elif (notaPrueba >= 96):
    descuentoPrueba = 45
else:
    descuentoPrueba = 0
    
    
if (ingresoFamiliar <= 1.0):
    decuentoIngreso = 30
elif (ingresoFamiliar > 1.0 and ingresoFamiliar <= 2.0):
    decuentoIngreso = 20
elif (ingresoFamiliar > 2.0 and ingresoFamiliar <= 3.0):
    decuentoIngreso = 10
elif (ingresoFamiliar > 3.0 and ingresoFamiliar <= 4.0):
    decuentoIngreso = 5
else:
    decuentoIngreso = 0
    
    
totalDescuentos = descuentoEdad + descuentoPrueba + decuentoIngreso

print (descuentoEdad) 
print (descuentoPrueba) 
print (decuentoIngreso)
print (totalDescuentos)
