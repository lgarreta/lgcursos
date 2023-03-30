

#Solicitud de información base para calculo de descuento#

#nombre=input("Por favor ingrese su nombre: ")
#apellido=input( "Por favor ingrese su apellido: ")
edad=int(input("Edad: "))
exapuntaje=int(input("Puntaje: "))
ingresos=float(input("Ingresos:")) 

#Inicializacion
descuentoEdad=0
descuentoIngresos=0
descuentoExamen=0
totalDescuento=0

#Solucion
#Selección de el rango de descuento por edad#   
if (edad>=15 and edad<=18):
    descuentoEdad=25
elif (edad>=19 and edad<=21):
    descuentoEdad=15
elif (edad>=22 and edad<=25):
    descuentoEdad=10
else:
    descuentoxedad=0
#Selección de rango de descuento por ingresos en numero de smlv)#    
if (ingresos<=1.0):
    descuentoIngresos=30
elif (ingresos>1.0 and ingresos <=2.0):
    descuentoIngresos=20
elif (ingresos>2.0 and ingresos<=3.0):
    descuentoIngresos=10
elif (ingresos>3.0 and ingresos <=4.0):
    descuentoIngresos=5
else:
    descuentoIngresos=0
#Selección de rango de descuento por puntaje en examen )#     
    
if (exapuntaje <80):
    descuentoExamen=0
elif (exapuntaje >=80 and exapuntaje<86):
    descuentoExamen=30
elif (exapuntaje >=86 and exapuntaje<91):
    descuentoExamen=35
elif (exapuntaje >=91 and exapuntaje<96):
    descuentoExamen=40
elif (exapuntaje>=96):
    descuentoExamen=45
else:
    descuentoExamen=0


totalDescuento= descuentoEdad + descuentoIngresos + descuentoExamen

print(descuentoEdad)
print(descuentoExamen)
print(descuentoIngresos)
print(totalDescuento)



