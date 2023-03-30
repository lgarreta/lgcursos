# Ingreso de datos al sistema
#Nombre = input("Digite su nombre: ")
#Apellido = input("Digite su apellido: ")
Edad = int(input())
Nota_examen = int(input())
SMMLV = float(input())
#Valor_matricula = float(input("Digite el valor de matrícula sin símbolos: "))
#Respuesta = input("¿Conoce el ingreso del SMMLV familiar en decímal? SI/NO: ")
#Respuesta = Respuesta.lower()

# Conversion a decimal del SMMLV
#if Respuesta == "no":
    #SMMLV = float(input("Digite el SMMLV sin símbolos: "))
    #SMMLV = SMMLV/908526
    #print("Su SMMLV en decímal es: ", round(SMMLV, 1))
#elif Respuesta == "si":
    #SMMLV = float(input("Digite el SMMLV en decímal con punto: "))
    
# Descuento por edad
if Edad >= 15 and Edad <= 18:
    DescuentoEdad = 25
elif Edad >= 19 and Edad <= 21:
    DescuentoEdad = 15
elif Edad >= 22 and Edad <= 25:
    DescuentoEdad = 10
elif Edad > 25:
    DescuentoEdad = 0
else:
    DescuentoEdad = 0
    
#Descuento por ingresos familiares
if SMMLV <= 1:
    DescuentoIngresoFamiliar = 30
elif SMMLV > 2 and SMMLV <= 3:
    DescuentoIngresoFamiliar = 20
elif SMMLV > 3 and SMMLV <= 4:
    DescuentoIngresoFamiliar = 5
elif SMMLV > 4:
    DescuentoIngresoFamiliar = 0
    
#Descuento por nota examen
if Nota_examen >= 80 and Nota_examen < 86:
    DescuentoExamen = 30
elif Nota_examen >= 86 and Nota_examen < 91:
    DescuentoExamen = 35
elif Nota_examen >= 91 and Nota_examen < 96:
    DescuentoExamen = 40
elif Nota_examen >= 96:
    DescuentoExamen = 45
elif Nota_examen < 80:
    DescuentoExamen = 0
    
#Descuentos aplicados
#DescuentoAplicadoEdad = (DescuentoEdad * Valor_matricula) / 100
#DescuentoAplicadoIngresoFamiliar = (DescuentoIngresoFamiliar * Valor_matricula) / 100    
#DescuentoAplicadoExamen = (DescuentoExamen * Valor_matricula) / 100    
#DescuentoTotal = DescuentoAplicadoEdad + DescuentoAplicadoIngresoFamiliar + DescuentoAplicadoExamen
DescuentoPorcentual = DescuentoEdad + DescuentoIngresoFamiliar + DescuentoExamen   

#Valor matrícula con descuento
#ValorMatriculaTotal = Valor_matricula - DescuentoTotal

#Impresión de datos en pantalla
#print("\n<<<<<<<<<<DESCUENTO A LA MATRÍCULA>>>>>>>>>>\n")
#print("Nombre Estudiante: ", Nombre, " ", Apellido)
#print("\nDESCUENTO POR EDAD")
#print("Porcentual: ", DescuentoEdad, "%")
#print("Valor en pesos: $", DescuentoAplicadoEdad)
#print("\nDESCUENTO POR INGRESO FAMILIAR")
#print("Porcentual: ", DescuentoIngresoFamiliar, "%")
#print("Valor en pesos: $", DescuentoAplicadoIngresoFamiliar)
#print("\nDESCUENTO POR EXAMEN")
#print("Porcentual: ", DescuentoExamen, "%")
#print("Valor en pesos: $", DescuentoAplicadoExamen)
#print("\nDESCUENTO TOTAL")
#print("Porcentual: ", DescuentoPorcentual, "%")
#print("Valor en pesos: $", DescuentoTotal)
#print("\nVALOR TOTAL DE LA MATRÍCULA: $", ValorMatriculaTotal)    
print(DescuentoEdad)
print(DescuentoExamen)
print(DescuentoIngresoFamiliar)
print(DescuentoPorcentual)