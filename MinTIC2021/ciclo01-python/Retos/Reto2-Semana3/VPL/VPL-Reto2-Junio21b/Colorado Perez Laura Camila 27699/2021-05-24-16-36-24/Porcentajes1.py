#Porcentaje descuento matricula
#nombre = input (" Ingrese nombre del candidato: ")
#apellido = input (" Apellidos: ")
edad = int(input (" Edad : "))
puntaje_examen = int(input  (" Calificacion examen: "))
ingreso_familiar = int(input(" Valor ingresos familiares: "))


#convertir

porcentaje_descuento = 0
descuento= 0
descuento_examen= 0



if (edad >= 15 and edad <=18):
    porcentaje_descuento= 25
    
    

elif (edad >=19 and edad <= 21):
    porcentaje_descuento= 15
    
    
elif (edad >=22 and edad <= 25):
    porcentaje_descuento= 10
    
    

else:
    print( " No tiene descuento por edad")
    
    
if (puntaje_examen >=80 and puntaje_examen <86):
    descuento_examen= 30
    
    
elif(puntaje_examen >=86 and puntaje_examen <91):
    descuento_examen= 35
    
    
elif(puntaje_examen >=91 and puntaje_examen <96):
    descuento_examen= 40
    
    
elif(puntaje_examen >=96 and puntaje_examen == 100):
    descuento_examen= 45
    

else:
    print(0)

if (ingreso_familiar <=1):
    descuento+= 30
    
    
elif(ingreso_familiar >=1 and ingreso_familiar <=2):
    descuento=20
    
    
elif (ingreso_familiar >= 2 and ingreso_familiar <= 3):
    descuento= 10
    
    
elif (ingreso_familiar >=3  and ingreso_familiar <= 4):
    descuento= 5
    

else:
    ()
    
    

    
    
descuentototal= porcentaje_descuento + descuento + descuento_examen
print (porcentaje_descuento)
print (descuento_examen)
print (descuento)

print (descuentototal)




    
            
            
    
        
    

    
    
    
    
    
    





