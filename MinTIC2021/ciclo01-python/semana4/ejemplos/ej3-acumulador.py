# Contador progresivo

limite = 10
N = 0

sumaMultiplicaciones = 0

while (N < limite):
    print (N)
    multiplicacion = N*N
    print ("Multiplicacion cuadratica: ", N*N)
    sumaMultiplicaciones = multiplicacion + sumaMultiplicaciones
    
    N = N + 1
#
print ("Suma Multiplicaciones es: ", sumaMultiplicaciones)
print ("Adios")