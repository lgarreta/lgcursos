#                     0       1       2        3        4
listaEstudiantes = ["ana", "juan", "maria", "pedro", "lady"]

## Ciclo for accedienda directamente a la lista
#for estudiante in listaEstudiantes:
#    print ("Hola ", estudiante)

indices = [0,1,2,3,4]

## Ciclo for a travéz de una lista de indices "manual" 
#for i in indices:
#    estudiante = listaEstudiantes [i]
#    print ("Hola ", estudiante)

## Ciclo for a traves de una lista automática "range"
for i in range (0,5):
    estudiante = listaEstudiantes [i]
    print ("Hola ", estudiante)
