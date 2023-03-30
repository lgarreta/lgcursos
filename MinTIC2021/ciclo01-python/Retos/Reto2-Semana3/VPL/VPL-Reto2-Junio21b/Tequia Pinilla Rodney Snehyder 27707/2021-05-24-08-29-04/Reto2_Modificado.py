#Lectura de datos:
edad = int (input ("Edad: "))
puntaje = int (input ("Puntaje: "))
num_salarios = float (input ("Ingreso: "))

#Calculo descuento por edad
if (edad>25):
    descuento1=0.0
elif (edad>=15 and edad<=18):
    descuento1=0.25
elif (edad>=19 and edad<=21):
    descuento1=0.15
elif (edad>=22 and edad<=25):
    descuento1=0.10
                
#Calculo descuento por ingreso familiar (num_salarios)
if (num_salarios<=1.0):
    descuento2=0.30
elif (num_salarios>1.0 and num_salarios<=2.0):
    descuento2=0.20
elif (num_salarios>2.0 and num_salarios<=3.0):
    descuento2=0.10
elif (num_salarios>3.0 and num_salarios<=4.0):
    descuento2=0.05
elif (num_salarios>4.0):
    descuento2=0.0

#Calculo descuento por puntaje examen
if (puntaje>=80 and puntaje<86):
    descuento3=0.30
elif (puntaje>=86 and puntaje<91):
    descuento3=0.35
elif (puntaje>=91 and puntaje<96):
    descuento3=0.40
elif (puntaje>=96):
    descuento3=0.45
elif (puntaje<80):
    descuento3=0.0

#Suma de los descuentos obtenidos para saber el descuento total
total_descuento=descuento1+descuento2+descuento3

#Operación para pasar descuento a formato entero y mostrar en la pantalla final en porcentajes
por1=int(descuento1*100)
por2=int(descuento2*100)
por3=int(descuento3*100)
por_total=int(total_descuento*100)

print (por1)
print (por3)
print (por2)
print (por_total)