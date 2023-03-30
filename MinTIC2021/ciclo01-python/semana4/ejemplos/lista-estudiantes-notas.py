
listaEstudiantes = ["ana", "maria", "pedro", "juan", "lady"]    # N=5 elementos: cadenas
# Posiciones          0        1       2        3       4       # indice inicia desde 0.....N-1
listaNotas       = [4.0,     3.0,     2.5,     5.0,    3.0]
# Posiciones         0        1        2        3       4       # indice inicia desde 0.....N-1

indice = 0
limite = 5

while (indice < limite):
    estudiante = listaEstudiantes [indice]
    nota       = listaNotas [indice]
    
    print ("Hola ", estudiante, "su nota es: ", nota)
    
    indice = indice + 1
#

print ("Adios estudiantes...")