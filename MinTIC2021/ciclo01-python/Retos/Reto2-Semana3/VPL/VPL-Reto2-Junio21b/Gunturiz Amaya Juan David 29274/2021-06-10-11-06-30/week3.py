#INGRESANDO LOS DATOS PERSONALES
#nombre = input ("Ingrese el nombres y apellidos del estudiante: ")
edad = float (input("Ingrese la edad en años del estudiante: "))
nota = float (input("Ingrese la nota/examen del estudiante: "))
salario = float (input("Ingrese la cantidad de SMLV en decimal de ingresos familiares: "))
#CONDICION DE EDAD
if (edad >= 15) and (edad <= 18):
    d=25
elif (edad >= 19) and (edad <= 21):
    d=15
elif (edad >= 22) and (edad <= 25):
    d=10
elif (edad >25 ):
    d=0
#CONDICION DE INGRESOS
if (salario <= 1):
    d1=30
elif (salario > 1) and (salario <=2):
    d1=20
elif (salario > 2) and (salario <=3):
    d1=10
elif (salario > 3) and (salario <=4):
    d1=5
elif (salario >= 4):
    d1=0
#CONDICION DE NOTA DE EXAMEN
if (nota < 80):
    d2=0
elif (nota >= 80) and (nota < 86):
    d2=30
elif (nota >= 86) and (nota < 91):
    d2=35
elif (nota >= 91) and (nota < 96):
    d2=40
elif (nota >= 96):
    d2=45

#RETORNO EN PANTALLA
#print("El estudiante ",nombre,"tiene los siguientes descuentos en su matricula:") 
print(d)
print(d2)
print(d1)
dt=d+d1+d2
print(dt)
