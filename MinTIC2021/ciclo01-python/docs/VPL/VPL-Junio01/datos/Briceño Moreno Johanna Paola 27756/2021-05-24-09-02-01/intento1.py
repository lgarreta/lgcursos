 
#nombres = input("Ingrese Nombre y Apellidos: ")
edad    = int(input("Ingrese la edad: "))
puntaje = int(input("Ingrese Puntaje del Examen (numero entero): "))
ingreso = int(input("Introduzca el Ingreso Familiar (n entero): "))

porEdad = 0.0
porPuntaje = 0.0
poIngreso = 0.0

if ( edad >= 15 and edad <= 18):
    porEdad = 25
elif ( edad >= 19 and edad <= 21):
    porEdad = 15
elif ( edad >= 22 and edad <= 25):
    porEdad = 10
else:
    porEdad = 0
    
if ( puntaje >= 80 and puntaje < 86 ):
    porPuntaje = 30    
elif ( puntaje >= 86 and puntaje < 91):
    porPuntaje = 35
elif ( puntaje >= 91 and puntaje < 96):
    porPuntaje = 40
elif ( puntaje >= 96 and puntaje <= 100):
    porPuntaje = 45
else:
    porPuntaje = 0

if ingreso <= 1 :
    porIngreso = 30
elif ( ingreso > 1 and ingreso <= 2):
    porIngreso = 20
elif ( ingreso > 2 and ingreso <= 3):
    porIngreso = 10
elif ( ingreso > 3 and ingreso <= 4):
    porIngreso = 5   
else:
    porIngreso = 0
     
   
totalDescuento = porEdad + porPuntaje + porIngreso

print (porEdad)
print (porPuntaje)
print (porIngreso)
print (totalDescuento)
