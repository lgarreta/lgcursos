#reto 2
#recolectar datos del candidato
#nombre=input("Ingrese nombres del candidato: ")
#apellido=input("Ingrese apellidos del candidato: ")
#edad guarda numero entero
edad=int(input("Ingrese edad del candidato: "))
#explica como ingresar salario
#print ("Ingreso familiar ej: 1.0 es 1 salario minimo; 1.5 es un salario minimo y medio, etc... Si no tiene ingresos ponga 0")
#examen guarda numero entero
examen=int(input("Ingrese cuantos puntos obtuvo en el examen: "))
#ingreso familiar guarda decimal
ingresofamiliar=float(input("Ingrese numero decimal de salarios mensuales: "))
#descuento establece el descuento inicial del candidato
descuento=int(0)
#verifica edad para descuento por edad, si aplica, asigna descuento en descuento1
if (edad >= 15 and edad <= 25):
    if (edad >= 15 and edad <=18):
        descuento1=25
    if (edad >= 19 and edad <=21):
        descuento1=15
    if (edad >= 22 and edad <=25):
        descuento1=10
else:
    descuento1=0
#verifica ingresofamiliar para descuento por ingresos, si aplica, asigna descuento en descuento2
if (ingresofamiliar >= 0 and ingresofamiliar <= 4):
    if (ingresofamiliar >= 0 and ingresofamiliar <=1):
        descuento2=30
    if (ingresofamiliar >1 and ingresofamiliar <=2):
        descuento2=20
    if (ingresofamiliar >2 and ingresofamiliar <=3):
        descuento2=10
    if (ingresofamiliar >3 and ingresofamiliar <=4):
        descuento2=5
else:
    descuento2=0
#verifica examen para descuento por puntaje en el examen, si aplica, asigna descuento en descuento3
if (examen >=80 and edad <= 100):
    if (examen >= 80 and examen <86):
        descuento3=30
    if (examen >= 86 and examen <91):
        descuento3=40
    if (examen >= 91 and examen <96):
        descuento3=40
    if (examen >= 96 and examen <=100):
        descuento3=45
else:
    descuento3=0

#calcula el descuento total sumando los descuentos
    
descuentototal=descuento+descuento1+descuento2+descuento3

#muestra en consola nombre de candidato y los descuentos que se le pueden aplicar
#print ("El candidato: ", nombre,"  ", apellido)
#print ("Por su edad tiene un descuento del: ",descuento1, "%")
#print ("Por su ingreso familiar tiene un descuento del: ",descuento2, "%")
#print ("Por su puntaje en el examen tiene un descuento del: ",descuento3, "%")
#print ("El total del descuento a su matricula es: ",descuentototal, "%")
print (descuento1)
print (descuento3)
print (descuento2)
print (descuentototal)

    
                    
                      