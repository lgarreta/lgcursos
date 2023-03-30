# Juego Numero mágico
from random import randint    # Traigo la funcion randint desde la libreria random

numeroMagico = randint (1,100)  # El computador obtiene un numero aleatorio

numeroIntentos = 10
contadorIntentos = 1

while (True):  # and contadorIntentos > numeroIntento
    
    numeroPersona =  int (  input ("Cual es su número? ") )
    if (numeroPersona > 100 or numeroPersona <= 0):
        continue
    if (numeroMagico < numeroPersona):
        print ("Siga intentando, el numero a adivinar es menor a ", numeroPersona)
    elif (numeroMagico > numeroPersona):
        print ("Siga intentando, el numero a adivinar es mayor a ", numeroPersona)
    else:    
        print ("Felicitaciones")
        print ("Adivinó en ", contadorIntentos, " Intentos")
        break
    
    contadorIntentos = contadorIntentos + 1
    if (contadorIntentos > numeroIntentos):
        print ("Perdió, demasiados intentos")
        break
              
print ("El numero mágico era: ", numeroMagico)
    


