#Reto semana3. Porcentaje matricula descuentos

# ENTRADAS:
#nombre = int (intput ("Ingrese nombre y apellido: "))
edad = int (input ("Ingrese edad: "))
puntaje = int (input("Ingrese puntaje: "))
salario = int (input ("Ingrese salario: "))

# 
descuentoEdad  = 0
descuentoPuntaje = 0
descuentoSalario = 0

descuentoTotal = 0

# SOLUCION EDAD:
if (edad >= 15 and edad <= 18):
    descuentoEdad = 25
elif (edad >= 19 and edad <= 21):
    descuentoEdad = 15
elif (edad >= 22 and edad <= 25):
    descuentoEdad = 10
else:
    descuentoEdad = 0

# SOLUCION PUNTAJE
if (puntaje >= 80 and puntaje < 86):
    descuentoPuntaje = 30
elif (puntaje <= 80):
    descuentoPuntaje = 0
elif (puntaje >= 86 and puntaje < 91):
    descuentoPuntaje = 35
elif (puntaje >= 91 and puntaje < 96): 
    descuentoPuntaje = 40
elif (puntaje >= 96):
    descuentoPuntaje = 45

# SOLUCION SALARIO
if (salario <= 1 ):
    descuentoSalario = 30
elif (salario > 1 and salario <= 2 ):
    descuentoSalario = 20
elif (salario > 2 and salario <= 3 ):
    descuentoSalario = 10
elif (salario > 3 and salario <= 4 ):
    descuentoSalario = 5
else:
    descuentoSalario = 0


descuentoTotal = descuentoEdad + descuentoPuntaje + descuentoSalario

print (descuentoEdad)
print (descuentoPuntaje)
print (descuentoSalario)

print (descuentoTotal)

