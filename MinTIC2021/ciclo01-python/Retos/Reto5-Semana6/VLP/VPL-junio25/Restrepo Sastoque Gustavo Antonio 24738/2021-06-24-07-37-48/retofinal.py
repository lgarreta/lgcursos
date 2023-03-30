
def adicionar (listaEstudiantes):
    print("Digite la información del beneficiario a agregar: ")
    nombre = input ()
    cedula = input ()
    celular = input ()
    estudiante = [nombre, cedula, celular]
    listaEstudiantes.append (estudiante)
    print("El beneficiario ha sido agregado")

def imprimir (listaEstudiantes):
    N = len (listaEstudiantes)
    i = 0
    while (i < N):
        estudiante = listaEstudiantes [i]
        nombre = estudiante [0]
        cedula = estudiante [1]
        celular  = estudiante [2]
        print (nombre)        
        print (cedula) 
        print (celular)
        
        i+=1
    #
    
  
def filtrar (listaEstudiantes):
    letra = input ("Digite la letra por la que empiezan los beneficiarios: ")
    listaFiltrados = []
    N = len (listaEstudiantes)
    i = 0
    while (i < N):
        usuario = listaEstudiantes [i]
        nombre = usuario [0]
        cedula = usuario [1]
        celular = usuario [2]

        if (nombre [0]==letra):
            usuario = [nombre, cedula, celular]
            listaFiltrados.append (usuario)
        i+=1
    #
    print("Listado filtrado de beneficiarios: ")
    imprimir(listaFiltrados)
    

def buscar (listaEstudiantes):
    nombreBuscar = input ("Digite el nombre y apellido del beneficiario a buscar: ")
    N = len (listaEstudiantes)
    i = 0
    while (i < N):
        usuario = listaEstudiantes [i]
        nombre = usuario [0]
        cedula = usuario [1]
        celular = usuario [2]

        if (nombre == nombreBuscar):
            nombreBuscar = [nombre, cedula, celular]
        i+=1
        
    print(nombreBuscar[0])
    print(nombreBuscar[1])
    print(nombreBuscar[2])
    
def borrar (listaEstudiantes):
    cedulaBorrar = input ("Digite la cedula del beneficiario a borrar: ")
    N = len (listaEstudiantes)
    i = 0
    while (i < N):
        usuario = listaEstudiantes [i]
        cedula = usuario [1]
        if (cedula == cedulaBorrar):
            listaEstudiantes.pop (i)
            break
        i+=1
        
        #
    print("El usuario ha sido eliminado del listado")
        
   
listaEstudiantes = []
    
while (True):
    print ("Menu Principal")
    print ("1. Ver listado")
    print ("2. Ver listado filtrado")
    print ("3. Agregar beneficiario")
    print ("4. Buscar beneficiario")
    print ("5. Borrar beneficiario")
    print ("6. Salir")
    
    opcion = int(input(""))
    
    if (opcion==6):
        print("Hasta pronto")
        break
    elif (opcion==1):
        print("Listado de beneficiarios")
        imprimir (listaEstudiantes)
    elif (opcion==2):
        filtrar (listaEstudiantes)
    elif (opcion==3):
        adicionar (listaEstudiantes)
    elif (opcion==4):
        buscar (listaEstudiantes)
    elif (opcion==5):
        borrar (listaEstudiantes)

        


    