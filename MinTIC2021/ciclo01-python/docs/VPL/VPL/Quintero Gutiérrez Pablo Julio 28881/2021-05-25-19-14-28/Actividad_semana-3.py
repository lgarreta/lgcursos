# Descuentos sobre la matricula (datos iniciales)

# nombre = input ("Ingrese nombres y apellidos comlpletos del estudiante: ")
edad = int (input ("Ingrese edad del estudiante: "))
puntajePrueba = int (input ("Ingrese el puntaje de la prueba del estudiante: "))
salario = float (input ("Ingrese salarios devengados por familia: " ))

#Salidas

descuentoEdad = 0
descuentoSalario = 0
descuentoPrueba = 0
DescuentoTotal = 0

# Descuento por edad

if (edad <= 18 and edad >= 15):
    descuentoEdad = 25   

elif (edad <= 21 and edad >= 19):
    descuentoEdad = 15
       
elif (edad <= 25 and edad >= 22):
    descuentoEdad = 10

else:
    descuentoEdad = 0
    
    
# Descuento por salario

if (salario <= 1):
    descuentoSalario = 30
    
elif (salario > 1.1 and salario <= 2):
    descuentoSalario = 20
    
elif (salario >= 2.1 and salario <= 3):
    descuentoSalario = 10
    
elif (salario >= 3.1 and salario <= 4):
    descuentoSalario = 5
    
else:
    descuentoSalario = 0
    
    
# Descuento por éxamen del estudiante

if (puntajePrueba >= 80 and puntajePrueba < 86):
    descuentoPrueba = 30

elif (puntajePrueba >= 86 and puntajePrueba < 91):
    descuentoPrueba = 35

elif (puntajePrueba >= 91 and puntajePrueba < 96):
    descuentoPrueba = 40
        
elif (puntajePrueba >= 96 and puntajePrueba <= 100):
    descuentoPrueba = 45
   
else:
    descuentoPrueba = 0
    
    
DescuentoTotal = descuentoEdad + descuentoSalario + descuentoPrueba


print (descuentoEdad)
print (descuentoPrueba)
print (descuentoSalario)
print (DescuentoTotal)


    


    

    

    
    



