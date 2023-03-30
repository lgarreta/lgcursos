#Nombre = input("Nombre y apellido: ")
Edad = int(input("Edad: "))
Puntaje = int(input("Puntaje obtenido en el examen: "))
SalariosMinimos = int(input("¿cuantos salarios minimos recibe su nucleo familiar: "))

#calculo de % de descuento por edad#
if Edad >=15 and Edad <=18:
    descuentoEdad = 25
    

elif Edad >=19 and Edad <=21:
    descuentoEdad = 15
    

elif Edad >=22 and Edad <=25:
    descuentoEdad = 10
    

else:
    descuentoEdad = 0
    
#calclulo de descuento por puntaje#
if Puntaje >=80 and Puntaje <86:
    descuentoPuntaje = 30
    
    
elif Puntaje >=86 and Puntaje <91:
    descuentoPuntaje = 35
   
    
elif Puntaje >=91 and Puntaje <96:
    descuentoPuntaje = 40
    
    
elif Puntaje >96:
    descuentoPuntaje = 45
    
else: 
    
    descuentoPuntaje = 0
     
     #calclulo de descuento por salario#
if SalariosMinimos <= 1:
    descuentoSalario = 30
    
    
elif SalariosMinimos >= 1 and SalariosMinimos <= 2:
    descuentoSalario = 20
    
    
elif SalariosMinimos > 2 and SalariosMinimos <= 3:
    descuentoSalario = 10
    
    
elif SalariosMinimos > 3 and SalariosMinimos <=4:
    descuentoSalario = 5
    
else:
    
    descuentoSalario = 0
    
descuentoTotal= (descuentoEdad + descuentoSalario + descuentoPuntaje) 

print (descuentoEdad)
print (descuentoPuntaje)
print (descuentoSalario)
print (descuentoTotal)


