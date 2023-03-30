# Numero mágico
from random import *

nm = randint (1,100)

while (True):
    cadena = input ("n: ")
    n  = int (cadena)
    if (nm < n):
        print ("Numero magico es menor")
    elif (nm > n):
        print ("Numero magico es mayor")
    else:
        print ("Felicitacions. El numero mágico era: ", nm)
        exit(0)
    
    print ("Siga intentando")

