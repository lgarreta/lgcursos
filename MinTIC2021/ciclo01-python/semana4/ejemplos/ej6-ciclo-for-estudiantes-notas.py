
listaEstudiantes = ["ana", "maria", "pedro", "juan", "lady"]    # N=5 elementos: cadenas
# Posiciones          0        1       2        3       4       # indice inicia desde 0.....N-1
listaNotas       = [0,0,0,0,0]
# Posiciones         0        1        2        3       4       # indice inicia desde 0.....N-1


#for estudiante in listaEstudiantes:
#    print ("hola ", estudiante)

for indice in range (0,5):
    listaNotas [indice] = 5.0

print (listaNotas)

for indice in range (0,5):
    estudiante = listaEstudiantes [indice]
    nota       = listaNotas  [indice]
    
    print ("Hola ", estudiante, " su nota es: ", nota)
#

print ("")
print ("Adios estudiantes")

    