listaEstudiantes = []

def nuevousuario (listaEstudiantes):
    print ( "Digite la información del beneficiario a agregar:")
    nombre  = input()
    cedula  = int(input())
    celular = int(input())
    
    usuario = [nombre, cedula, celular]
    listaEstudiantes.append (usuario)
    
    print ("El beneficiario ha sido agregado")
    
def listadocompleto (listaEstudiantes):
    print (" Listado de beneficiarios")
    N = len (listaEstudiantes)
    i = 0
    while (i < N):
        usuario = listaEstudiantes [i]
        nombre  = usuario [0]
        cedula  = usuario [1]
        celular = usuario [2]
        
        print (nombre)
        print (cedula)
        print (celular)
        
        i += 1
    
def buscarporletra (listaEstudiantes):
    l = input("Digite la letra por la que empiezan los beneficiarios:" )
    i     = 0
    N     = len (listaEstudiantes)
    listafiltrados = []
    while (i < N):
        usuario  = listaEstudiantes [i]
        nombre   = usuario [0]
        cedula   = usuario [1]
        celular  = usuario [2]
        if ( nombre [0] == l):
            listafiltrados.append (usuario)
            
        i += 1
        
    print ( "Listado filtrado de beneficiarios:")
    n  = len (listafiltrados)
    indice = 0
    while ( indice < n):
        usuario = listafiltrados [indice]
        nombre  = usuario [0]
        cedula   = usuario [1]
        celular = usuario [2]
        print (nombre)
        print (cedula)
        print (celular)
            
            
        indice += 1
                            
        
        
def buscarusuario (listaEstudiantes):
    buscarnombre = input("Digite el nombre y apellido del beneficiario a buscar:")
    i            = 0
    N            = len (listaEstudiantes)
    Lencontrados = []
    while (i < N):
        usuario = listaEstudiantes [i]
        nombre  = usuario [0]
        if (nombre == buscarnombre):
            Lencontrados.append (usuario)
        
        i += 1
         
    if (Lencontrados ==[ ]):
        print ("No se encuentra el beneficiario en la agenda")
    else:
        usuario = Lencontrados [0]
        nombre  = usuario [0]
        cedula = usuario [1]
        celular= usuario [2]
        print (nombre)
        print (cedula)
        print (celular)
        

        
def cedulaaborrar (listaEstudiantes):
    i              = 0
    N              = len(listaEstudiantes)
    eliminarcedula = int(input("Digite la cedula del beneficiario a borrar:"))
    
    while ( i < N):
        usuario = listaEstudiantes [i]
        cedula  = usuario [1]
        if (cedula == eliminarcedula):
            listaEstudiantes.pop (i)
            break
        
        i += 1
    print ("El usuario ha sido eliminado del listado")
        
                
    

while (True):
    print (" Menu Principal")
    print (" 1. Ver listado ")
    print (" 2. Ver listado filtrado ")
    print (" 3. Agregar beneficiario " )
    print (" 4. Buscar beneficiario ")
    print (" 5. Borrar beneficiario ")
    print (" 6. Salir")
    
    
    opcion = int(input())
    
    if (opcion == 1):
        listadocompleto(listaEstudiantes)
    elif (opcion ==2):
        buscarporletra (listaEstudiantes)
    elif (opcion == 3):
        nuevousuario(listaEstudiantes)
    elif (opcion == 4):
        buscarusuario (listaEstudiantes)
    elif (opcion == 5):
        cedulaaborrar(listaEstudiantes)
    elif (opcion == 6):
        print ("Hasta pronto")
        break
    
        
        