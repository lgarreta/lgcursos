#print("Programa Para Calcular Porcentaje de Descuento Matricula")

#SalarioMinimo = 908526                                #Variable SalarioMinimo,Valor de el Salario Minimo Vigente para el año 2021 $908.526
DesEdad=0                                             #Variable DesEdad, Decuento por el rango de edad
DesPrueba=0                                           #Variable DesPrueba, Descuento por el rango optenido en la prueba
DesSMV=0                                              #Variable DesSMV, Descuento por el rngo del salarios minimos optenidos
DesTotal=0                                            #variable DesTotal,guarda el porcentaje total de descuetos aplicables a la matricula

#Entradas desde teclado
#print("Ingrese la información solicitada: ")          #Peticion para ingresar información

#Nombre = str (input("Nombre Aspirante: "))            #Ingresa Nombre
#Apellido = str (input("Apellido Aspirante: "))        #Ingresa apellido
#Cedula = str (input("Numero de documento: "))         #Ingresa No documento
Edad = int (input("Edad: "))                          #ingresa edad
ResPrueba = int(input("Resultado Prueba: "))       #ingresa resultado de la prueba
Salario = int (input("Ingrese su Salario Mensual en ssa: ")) #ingresa el salario mensual del candidato

#condicionales por rangos de edad

if (Edad >= 15 and Edad <= 18): 
    DesEdad = 25
    
elif(Edad >= 19 and Edad <= 21): 
    DesEdad = 15
    
elif(Edad >= 22 and Edad <= 25): 
    DesEdad = 10
        
elif (Edad > 25): 
    DesEdad= 0

#condicionales  obtener % por rango del NoSMV (numero de Salarios minimos vigentes)
#***************************************************************************************************************************************   
#NoSMV = Salario // SalarioMinimo                       #calcula numero de salarios minimos, Salario/SalarioMinimo,toma la parte entera *
#***************************************************************************************************************************************
if (Salario <= 1):
    DesSMV = 30

elif(Salario > 1 and Salario <= 2): 
    DesSMV = 20
    
elif(Salario >= 2 and Salario <= 3):
    DesSMV = 10
    
elif(Salario > 3 and Salario <= 4):
    DesSMV = 5
        
elif(Salario > 4): 
    DesSMV = 0


#condicionales para obtener % Puntaje Prueba

if (ResPrueba >= 80 and ResPrueba < 86):
    DesPrueba = 30

elif(ResPrueba >= 86 and ResPrueba < 91): 
    DesPrueba= 35
    
elif(ResPrueba >= 91 and ResPrueba < 96):
    DesPrueba = 40
    
elif(ResPrueba >= 96):
    DesPrueba= 45
        
elif(ResPrueba < 80): 
    DesPrueba = 0
    
#****************************************************************************************************************
DesTotal = DesEdad + DesSMV + DesPrueba                   #Calculo del porcentaje total aplicable a la matricula*
#****************************************************************************************************************

#Salidas de el resultados obtenidos 
#print('Nombre y Apellido Candidato:', Nombre, Apellido, 'Con Cedula N°:', Cedula)
#print('Descuentos a que tiene derecho:')
#print('Descuento por Edad:',DesEdad,"%,",'Descuento SMV:',DesSMV,"%,",'Descuento por Resultado de la prueba:',DesPrueba,"%.")
#print('Descuento total: ',DesTotal,' % Sobre el valor de la matricula')

print(DesEdad)
print(DesPrueba)
print(DesSMV)
print(DesTotal)

