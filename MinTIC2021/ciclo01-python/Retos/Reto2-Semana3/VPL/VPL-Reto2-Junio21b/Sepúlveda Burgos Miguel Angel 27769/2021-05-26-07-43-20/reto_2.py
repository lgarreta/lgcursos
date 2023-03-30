# inicialización valores del descuento
edad1 = int
saf1 = int
pun1 = int
# Definir variable de nombre, edad, salario y puntaje
#nombres = input ("Ingrese Nombres: ")
#apellidos = input ("Ingrese Apellidos: ")
edad = int (input ("Edad: "))
puntaje = int(input("Calificación: "))
salarios = int (input ("Salarios: "))
#Si-entonces para obtener por descuento edad
if (edad == 15) or edad <= 18:
    edad1 = 25
else:
    if (edad == 19) or edad <= 21:
        edad1 = 15
    else:
        if (edad == 22) or edad <= 25:
            edad1 = 10
        else:
            if edad > 25:
                edad1 = 0
            else:
                if edad <15:
                    print ('No aplica')
#Si-entonces para obtener descuento por salarios familiares
if salarios <= 1:
    saf1 = 30
else:
    if (salarios > 1) and (salarios <= 2):
        saf1 = 20
    else:
        if (salarios > 2) and (salarios <= 3):
            saf1 = 10
        else:
            if (salarios >3) and (salarios <= 4):
                saf1 = 5
            else:
                if (salarios > 4):
                    saf1 = 0
#Si-entonces para obtener descuento por puntaje
if (puntaje >= 80) and puntaje < 86:
    pun1 = 30
else:
    if (puntaje >= 86) and puntaje < 91:
        pun1 = 35
    else:
        if (puntaje >= 91) and puntaje < 96:
            pun1 = 40
        else:
            if puntaje >= 96:
                pun1 = 45
            else:
                if puntaje < 80:
                    pun1 = 0
# Defiir total del descuento
Tdet = edad1 + saf1 + pun1
# mostrar resultado

print (edad1)
print (pun1)
print (saf1)
print (Tdet)