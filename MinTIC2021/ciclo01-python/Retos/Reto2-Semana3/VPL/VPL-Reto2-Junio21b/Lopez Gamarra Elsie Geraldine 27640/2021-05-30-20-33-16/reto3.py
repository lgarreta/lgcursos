nombre = input("DIGITE NOMBRE Y APELLIDO: ")
edad = int(input("DIGITE EDAD: "))
puntaje = int(input("DIGITE PUNTAJE: "))
cantsalario = int(input("DIGITE SALARIO MINIMOS: "))
descuentoedad = 0
descuentocantsalario = 0
descuentopuntaje = 0
descuentoMAX = 0


if edad >= 15 and edad <= 18:
    descuentoedad = 25
elif edad >= 19 and edad <= 21:
    descuentoedad = 15
elif edad >= 22 and edad <= 25:
    descuentoedad = 10


if cantsalario <= 1:
    descuentocantsalario = 30
elif cantsalario > 1 and cantsalario <= 2:
    descuentocantsalario = 20
elif cantsalario > 2 and cantsalario <= 3:
    descuentocantsalario = 10
elif cantsalario > 3 and cantsalario <= 4:
    descuentocantsalario = 5

if puntaje >= 80 and puntaje < 86:
    descuentopuntaje = 30
elif puntaje >= 86 and puntaje < 91:
    descuentopuntaje = 35
elif puntaje >= 91 and puntaje < 96:
    descuentopuntaje = 40
elif puntaje >= 96:
    descuentopuntaje = 45

descuentoMAX = descuentoedad + descuentocantsalario + descuentopuntaje

print("\n")
print("------------------------------")
print("            DATOS             ")
print("------------------------------\n")
print ("NOMBRE DEL USUARIO: ", nombre)
print ("EDAD DEL USUARIO: ", edad)
print ("PUNTAJE DEL USUARIO: ", puntaje)
print ("CANT. DE SALARIO DEL USUARIO: ", cantsalario)
print("\n")
print ("El descuento por edad de", nombre,"es: ",descuentoedad,"%")
print ("El descuento por puntaje de ",nombre," es: ",descuentopuntaje,"%")
print ("El descuento por salario de ",nombre," es: ",descuentocantsalario,"%")
print("\n")
print("-----------------------------")
print (" EL DESCUENTO MÁX ES DE: ",descuentoMAX,"%")
print("-----------------------------\n")