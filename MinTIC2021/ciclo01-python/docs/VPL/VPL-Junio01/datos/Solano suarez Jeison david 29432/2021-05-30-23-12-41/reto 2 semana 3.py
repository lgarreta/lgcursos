# iniciacion de variables
#nombre = "desconocido"
#apellido = "desconocido"
descuentoxedad = 0 
descuentoxing = 0
descuentoxpunt = 0
descuentotal = 0

# entradas

#nombre   = input ("ingrese el nombre del estudiante: ")
#apellido = input ("ingrese el apellido del estudiante: ")
edad     = int (input (" ingrese la edad: "))
puntaje  = int (input ("ingrese puntaje del examen: "))
salario  = int (input("ingrese el salario minimo mensual: "))

# calculo edad

if (edad >= 15 and edad <= 18):
    descuentoxedad = 25
    
elif (edad >= 19 and edad <= 21):
    descuentoxedad = 15
    
elif (edad >= 22 and edad <= 25):
    descuentoxedad = 10
    
elif (edad > 25):
    descuentoxedad = 0
    

# calculo puntaje examen

if (puntaje < 80):
    descuentoxpunt = 0
    
elif (puntaje >= 80 and puntaje < 86):
    descuentoxpunt = 30
    
elif (puntaje >= 86 and puntaje < 91):
    descuentoxpunt = 35
    
elif (puntaje >= 91 and puntaje < 96):
    descuentoxpunt = 40
    
elif (puntaje >= 96):
    descuentoxpunt = 45
    

# calculo ingreso familiar

if (salario <= 1 ):
   descuentoxing = 30
   
elif (salario > 1 and salario <= 2 ):
    descuentoxing = 20
    
elif (salario > 2 and salario <= 3 ):
    descuentoxing = 10
    
elif (salario > 3 and salario <= 4 ):
    descuentoxing = 5
    
elif (salario > 4 ):
    descuentoxing = 0
    

#calculos
descuentotal = descuentoxedad + descuentoxing + descuentoxpunt
# 
print (descuentoxedad)
print (descuentoxpunt) 
print (descuentoxing)
print (descuentotal)

                

