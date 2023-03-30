edad = int (input ("Ingrese su Edad "))
puntaje_prueba = int (input ("Ingrese Puntaje de Prueba "))
salario =  int (input ("Ingrese Salario "))

descuento_total = 0
descuento_edad = 0
descuento_prueba = 0
descuento_salario = 0

if (edad >= 15 and edad <= 18):
    descuento_edad = 25
    descuento_total = descuento_total+descuento_edad
elif (edad >= 19 and edad <= 21):
    descuento_edad = 15
    descuento_total = descuento_total+descuento_edad
elif (edad >= 22 and  edad <= 25):
    descuento_edad = 10
    descuento_total = descuento_total+descuento_edad
elif (edad >= 25):
    descuento_edad = 0
    descuento_total = descuento_total+descuento_edad
    
if (salario <= 1):
    descuento_salario = 30
    descuento_total = descuento_total+descuento_salario
elif (salario >= 1 and salario <= 2):
    descuento_salario = 20
    descuento_total = descuento_total+descuento_salario
elif (salario >= 2 and salario <= 3):
    descuento_salario = 10
    descuento_total = descuento_total+descuento_salario
elif (salario >= 3 and salario <= 4):
    descuento_salario = 5
    descuento_total = descuento_total+descuento_salario
elif (salario > 4):
    descuento_salario = 0
    descuento_total = descuento_total+descuento_salario

if (puntaje_prueba >= 80 and puntaje_prueba < 86):
    descuento_prueba = 30
    descuento_total = descuento_total+descuento_prueba
elif (puntaje_prueba >= 86 and puntaje_prueba < 91):
    descuento_prueba = 35
    descuento_total = descuento_total+descuento_prueba
elif (puntaje_prueba >= 91 and puntaje_prueba < 96):
    descuento_prueba = 40
    descuento_total = descuento_total+descuento_prueba
elif (puntaje_prueba >= 96):
    descuento_prueba = 45
    descuento_total = descuento_total+descuento_prueba
elif (puntaje_prueba < 80):
    descuento_prueba = 0
    descuento_total = descuento_total+descuento_prueba


print (descuento_edad)
print (descuento_prueba)
print (descuento_salario)
print (descuento_total)