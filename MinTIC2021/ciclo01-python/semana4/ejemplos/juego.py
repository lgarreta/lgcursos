# Juego Numero mágico
from random import randint    # Traigo la funcion randint desde la libreria random

numeroMagico = randint (1,100)  # El computador obtiene un numero aleatorio

numeroPersona =  int (  input ("Cual es su número? ") )

numeroIntentos = 10
contadorIntentos = 0

while (numeroMagico!=numeroPersona):  # and contadorIntentos > numeroIntento
    if (numeroMagico < numeroPersona):
        print ("Siga intentando, el numero a adivinar es menor al que introdujo usted")
        numeroPersona =  int (  input ("Cual es su número? ") )
    else:
        print ("Siga intentando, el numero a adivinar es mayor al que introdujo usted")
        numeroPersona =  int (  input ("Cual es su número? ") )
    

print ("Felicitaciones")
print ("El numero mágico era: ", numeroMagico)
    


