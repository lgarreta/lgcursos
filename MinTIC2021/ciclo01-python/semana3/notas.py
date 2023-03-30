# Programa notas
## 1. Entrada datos
nota1 = input ("Ingrese nota1: ")
nota2 = input ("Ingrese nota2: ")

## 2. Convertirlos
nota1f = float (nota1)
nota2f = float (nota2)

notaFinal = (nota1f + nota2f) / 2

if (notaFinal > 4.0):
    print ("Tiene bonificacion de 0.5")
    notaFinal = notaFinal + 0.5
else:
    if (notaFinal >= 3.0):
        print ("Tiene bonificacion de 0.2")
        notaFinal = notaFinal + 0.2
    else:
        notaFinal = notaFinal - 0.5
    #
#

print ("Su nota fue: ", notaFinal)
print ("Adios")

