# Reto:
# Ingresa nombre:
# Ingresa apellidos:
# Ingresa edad:
# Ingresa ingresos:
# Ingresa nota:
# (como porcentaje 30%: 0.25, 100%: 1.0, 0%:0.0)
# AyudaAge >= 4.0:0.5, >= 3.0:0.2, < 3.0:-0.5
# 

# ENTRADAS: Nombre (string), edad, ingresos, nota examen. 
# SALIDAS: Nombre, bonificacion por nota, bonificacion por participacion, notaFinal

# PASO0: Inicializacion de variables
nombre    = ""
apellido = ""
age = ""
ingreso = ""
nota = ""
ayudaAge = ""
ayudaIng = ""
ayudaNota = ""
sm = 1
ayudaTotal = ""

# PASO1: Entradas
#nombre        = input ("Ingrese su nombre: ")
#apellido       = input ("Ingrese su apellido: ")

age      = int (input ("Ingrese su edad: "))
nota     = int (input ("Ingrese su nota de examen: "))
ingreso  = float (input ("Ingrese sus ingresos mensuales: "))



# PASO2: Calculamos porcentaje de ayuda por edad
if (age >= 15 and age <= 18):
    
    ayudaAge = 0.25

elif (age >= 19 and age <= 21):
    
    ayudaAge = 0.15

elif (age >= 22 and age <= 25):
    
    ayudaAge = 0.10
    #ayudaAge = 0.25
else:
    ayudaAge = 0
    
# PASO3: Calculamos porcentaje de ayuda por edad

if (nota >= 80 and nota <= 85):
    
    ayudaNota = 0.30
elif (nota >= 86 and nota <= 90):
    
    ayudaNota = 0.35
elif (nota >= 91 and nota <= 96):
    
    ayudaNota = 0.40
elif (nota >= 97 ):
    
    ayudaNota = 0.45

    
# PASO4: Calculo porcentaje ayudas por ingresos    
if (ingreso <= sm):
    ayudaIng = 0.30
elif (ingreso >= sm*2 and ingreso <= sm):
    ayudaIng = 0.20
elif (ingreso >= sm*3 and ingreso <= sm*2):
    ayudaIng =  0.10
elif (ingreso >= sm*4 and ingreso <= sm*3):
    ayudaIng = 0.05
else:
    ayudaIng = 0
#Calculo final de toda la ayuda
ayudaAge = int (float(ayudaAge)*100)
ayudaNota = int (float(ayudaNota)*100)
ayudaIng = int (float(ayudaIng)*100)

ayudaTotal = ayudaAge + ayudaNota + ayudaIng

#print ("Apreciado estudiante: ", nombre, apellido, "de acuerdo a su edad: ", age, "usted recibe un descuento de: ", ayudaAge, "De acuerdo a sus ingresos mensuales recibe un descuento de: ", ayudaIng, "y de acuerdo a su nota en el examen, usted recibe un descuento de: ", ayudaNota, "para un total de descuento de: ", ayudaTotal)
    
print (ayudaAge)
print (ayudaNota)
print (ayudaIng)
print (ayudaTotal)


