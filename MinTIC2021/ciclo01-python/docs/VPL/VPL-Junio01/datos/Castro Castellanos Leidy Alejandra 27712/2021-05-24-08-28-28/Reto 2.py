# Descuento
#nombre = input ('Ingrese su nombre completo: ')
#apellido = input ('Ingrese su apellido completo: ')
edad = int (input ('Ingrese su edad en años: '))
puntaje = int (input ('Ingrese el puntaje obtenido en el examen: '))
salario = int (input ('Ingrese el numero decimal de salarios mínimos recibidos en su familia: '))

descuentoedad = 0
descuentopuntaje = 0
descuentosalario = 0
descuentototal = 0

#Descuento de acuerdo a la edad
if edad >= 15 and edad <= 18:
    descuentoedad = 25
elif edad >=19 and edad <= 21:
    descuentoedad = 15
elif edad >=22 and edad <= 25:
    descuentoedad = 10
else: 
    descuentoedad = 0
#Descuento por puntaje de examen
if puntaje >=80 and puntaje < 86:
    descuentopuntaje = 30
elif puntaje >= 86 and puntaje < 91:
    descuentopuntaje = 35
elif puntaje >= 91 and puntaje < 96:
    descuentopuntaje = 40 
elif puntaje >= 96:
    descuentopuntaje = 45
else:
    descuentopuntaje = 0
#Descuento por salario
if salario <= 1:
    descuentosalario = 30
elif salario >= 1 and salario <= 2:
    descuentosalario = 20
elif salario >= 2 and salario <= 3:
    descuentosalario = 10
elif salario >=3 and salario <= 4:
    descuentosalario = 5
else:
    descuentosalario = 0

# A continuación se muestra el porcentaje total de descuento
descuentototal = descuentoedad + descuentosalario + descuentopuntaje
print (descuentoedad)
print (descuentopuntaje)
print (descuentosalario)
print (descuentototal)
    
