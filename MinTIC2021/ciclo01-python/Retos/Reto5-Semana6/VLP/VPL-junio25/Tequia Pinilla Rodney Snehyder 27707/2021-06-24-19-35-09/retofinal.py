def ver_listado (lista_estudiantes):
    n = len (lista_estudiantes)
    i = 0
    print ("Listado de beneficiarios")
    while (i<n):
        estudiante = lista_estudiantes [i]
        nombre = estudiante [0]
        cedula = estudiante [1]
        celular = estudiante [2]
        print (nombre)
        print (cedula)
        print (celular)
        i += 1

def ver_listado_filtrado (lista_estudiantes):
    print ("Digite la letra por la que empiezan los beneficiarios:")
    letra = str.upper (input ())
    n = len (lista_estudiantes)
    i = 0
    encontrados = []
    while (i<n):
        estudiante = lista_estudiantes [i]
        nombre = estudiante [0]
        if (nombre[0] == letra):
            encontrados.append (estudiante)
        i += 1
    print ("Listado filtrado de beneficiarios:")
    q = len (encontrados)
    p = 0
    while (p<q):
        estudiante_encontrado = encontrados [p]
        nombre = estudiante_encontrado [0]
        cedula = estudiante_encontrado [1]
        celular = estudiante_encontrado [2]
        print (nombre)
        print (cedula)
        print (celular)
        p += 1  

def agregar_beneficiario (lista_estudiantes):
    print ("Digite la información del beneficiario a agregar:")
    nombre = str (input ())
    cedula = int (input ())
    celular = int (input ())
    nuevo_beneficiario = [nombre, cedula, celular]
    lista_estudiantes.append (nuevo_beneficiario)
    print ("El beneficiario ha sido agregado")
    
def buscar_por_nombre (lista_estudiantes):
    print ("Digite el nombre y apellido del beneficiario a buscar:")
    nombre_buscar = input ()
    n = len (lista_estudiantes)
    i = 0
    encontrado = []
    while (i<n):
        estudiante = lista_estudiantes [i]
        nombre = estudiante [0]
        if (nombre == nombre_buscar):
            encontrado.append (estudiante) 
        i += 1
    q = len (encontrado)
    p = 0
    while (p<q):
        estudiante_encontrado = encontrado [p]
        nombre = estudiante_encontrado [0]
        cedula = estudiante_encontrado [1]
        celular = estudiante_encontrado [2]
        print (nombre)
        print (cedula)
        print (celular)
        p += 1    
    
def eliminar_beneficiario (lista_estudiantes):
    print ("Digite la cedula del beneficiario a borrar:")
    cedula_eliminar = int(input ())
    n = len (lista_estudiantes)
    i = 0
    while (i<n):
        estudiante = lista_estudiantes [i]
        cedula = estudiante [1]
        if (cedula == cedula_eliminar):
            lista_estudiantes.pop (i)
            print ("El usuario ha sido eliminado del listado")
        i += 1

lista_estudiantes = []

while (True):
    print ("Menu Principal")
    print ("1. Ver listado")
    print ("2. Ver listado filtrado")
    print ("3. Agregar beneficiario")
    print ("4. Buscar beneficiario")
    print ("5. Borrar beneficiario")
    print ("6. Salir")
    eleccion = int (input ())
    
    if (eleccion == 1):
        ver_listado (lista_estudiantes)
    elif (eleccion == 2):
        ver_listado_filtrado (lista_estudiantes)
    elif (eleccion == 3):
        agregar_beneficiario (lista_estudiantes)
    elif (eleccion == 4):
        buscar_por_nombre (lista_estudiantes)
    elif (eleccion == 5):
        eliminar_beneficiario (lista_estudiantes)
    elif (eleccion == 6):
        print ("Hasta pronto")
        break

    else:
        print ("No es una opción válida")