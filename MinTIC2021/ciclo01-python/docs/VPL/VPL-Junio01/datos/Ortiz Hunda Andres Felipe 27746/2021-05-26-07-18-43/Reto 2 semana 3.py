DescuentoEdad=0
DescuentoExamen=0
DescuentoSMLV=0
DescuentoTotal=0



Edad = int (input("Ingrese Edad: "))
ResultadoExamen = int (input("Ingrese Resultado Prueba: "))
SalarioMinimo = int (input("Ingrese Salario en decimal: "))

if (Edad >= 15 and Edad <= 18):
    DescuentoEdad = 25
    
elif(Edad >= 19 and Edad <= 21):
    DescuentoEdad = 15
    
elif(Edad >= 22 and Edad <= 25):
    DescuentoEdad = 10
    
elif (Edad >= 25):
    DescuentoEdad = 0 
    
    
if (ResultadoExamen >= 80 and ResultadoExamen < 86):
    DescuentoExamen = 30

elif(ResultadoExamen >= 86 and ResultadoExamen < 91):
    DescuentoExamen = 35
    
elif(ResultadoExamen >= 91 and ResultadoExamen < 96):
    DescuentoExamen = 40
    
elif(ResultadoExamen >= 96):
    DescuentoExamen = 45
    
elif(ResultadoExamen < 80):
    DescuentoExamen = 0
    
if (SalarioMinimo <= 1):
    DescuentoSMLV = 30
    
elif(SalarioMinimo > 1 and SalarioMinimo <= 2):
    DescuentoSMLV = 20
    
elif(SalarioMinimo > 2 and SalarioMinimo <= 3):
    DescuentoSMLV = 10

elif(SalarioMinimo > 3 and SalarioMinimo <= 4):
    DescuentoSMLV = 5

elif(SalarioMinimo > 4):
    DescuentoSMLV = 0
    
DescuentoTotal = (DescuentoEdad + DescuentoExamen + DescuentoSMLV)


print (DescuentoEdad)
print (DescuentoExamen) 
print (DescuentoSMLV)
print (DescuentoTotal)

    