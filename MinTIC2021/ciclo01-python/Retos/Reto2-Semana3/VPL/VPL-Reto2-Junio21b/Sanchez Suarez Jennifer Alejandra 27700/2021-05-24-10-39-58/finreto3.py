# Problema calculo total dcto sobre valor matricula
# Ingresa Nombre y Apellido:
# Ingresa Edad en años numeros enteros:
# Ingresa puntaje  examen enteros 0 / 100
# Ingresar numero ingreso familiar en decimales
# Descuento edad = 15 <=18:25%, > 18 <=21:15%, >21 <=25:10%, > 25:0%
# Descuento ingreso <= 1smm:30%, > 1smm <= 2smm:20%, > 2smm <= 3smm:10%, > 3 smm <= 4smm:5%, > 4smm:0
# Descuento puntaje >= 80 < 86:30%, >= 86 < 91:35%, >= 91 < 96: 40%, >= 96:45%, < 80:0%

# ENTRADAS: NombreyApellido (string), Edad (int), Puntaje ingreso (int), salario mensual (float)
# SALIDAS: Nombrey Apellido, dcto edad, dcto ingreso, dcto puntaje, dcto total sobre valor matricula

# PASO0: Inicializacion de variables
nombreApellido = ""
dctoEdad = 0
dctoSalario = 0
dctoPuntaje = 0
dctoTotal = 0

# PASO1: Entradas
#nombreApellido = input ("Ingrese Nombre y apellido:")
edad = int (input ("Ingrese edad:"))
puntaje = int ( input ("Ingrese puntaje:"))
salario = float (input ("Ingrese salario:"))

# PASO2: Calcular descuento edad
if (edad  >=15 and edad <=18):
    dctoEdad = 25
#print ("Su descuento por edad es de 25%")
elif (edad  >=19 and edad <=21):
    dctoEdad = 15
#print ("Su descuento por edad es de 15%")
elif (edad  >=22 and edad <=25):
    dctoEdad = 10
#print ("Su descuento por edad es de 10%")
else:
    dctoedad = 0
#print ("No tiene descuento por Edad ")
    
# PASO3: Calcular descuento ingreso
if (salario <=1):
    dctoSalario = 30
#print ("Su descuento por Ingresos es de 30%")
elif (salario  >1 and salario <=2):
    dctoSalario = 20
#print ("Su descuento por Ingresos es de 20%")
elif (salario  >2 and salario <=3):
    dctoSalario = 10
#print ("Su descuento por Ingresos es de 10%")
elif (salario  >3 and salario <=4):
    dctoSalario = 5
#print ("Su descuento por Ingresos es de 5%")
else:
    dctoSalario = 0
#print ("No tiene descuento por Ingreso")
    
# PASO4: Calcular descuento puntaje
if (puntaje>=80 and puntaje<86):
    dctoPuntaje = 30
#print ("Su descuento por Puntaje es de 30%")
elif (puntaje>=86 and puntaje<91):
    dctoPuntaje = 35
#print ("Su descuento por Puntaje es de 35%")
elif (puntaje>=91 and puntaje<96):
    dctoPuntaje = 40
#print ("Su descuento por Puntaje es de 40%")
elif (puntaje>=96):
    dctoPuntaje = 45
#print ("Su descuento por Puntaje es de 45%")
else:
    dctoPuntaje = 0
#print ("No tiene descuento por Puntaje ")


dctoTotal = dctoEdad + dctoSalario + dctoPuntaje
print (dctoEdad)
print (dctoPuntaje)
print (dctoSalario)
print (dctoTotal)
