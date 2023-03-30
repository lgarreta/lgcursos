#FUNCIONES:
# DEFINIENDO FUNCION VER LISTADO
def verListado (listaUsuario):
    print ("Listado de beneficiarios ")
    N = len (listaUsuario)
    i = 0
    while (i < N):
        usuario = listaUsuario [i]
        nombre  = usuario [0]
        cedula  = usuario [1]
        celular = usuario [2]     
        print (nombre)
        print (cedula)
        print (celular)

        i+=1

# DEFINIENDO FUNCION VER LISTADO FILTRADO 2
def verListadoFiltrado (listaUsuario):
    letra = input ("Digite la letra por la que empiezan los beneficiarios: " + " \n")
    print ("Listado filtrado de beneficiarios: ")
    N = len (listaUsuario)
    i = 0
    listaEncontrados = []
    while (i < N):
        usuario = listaUsuario [i]
        nombre = usuario [0]
        cedula = usuario [1]
        celular = usuario [2]
        if (nombre [0]==letra):
            listaEncontrados.append (usuario)
        i += 1
        
    n = len (listaEncontrados)
    i = 0
    while (i<n):
        usuario = listaEncontrados [i]
        nombre = usuario [0]
        cedula = usuario [1]
        celular = usuario [2]
        print (nombre)
        print (cedula)
        print (celular)
            
        i += 1
    
# DEFINIENDOO FUNCION AGREGAR USUARIO
def AgregarUsuario (listaUsuario):
    print ("Digite la información del beneficiario a agregar: ")
    nombre = input()
    cedula  = int(input())
    celular = int(input())
    usuario = [nombre,cedula, celular]
    listaUsuario.append (usuario)
    print("El beneficiario ha sido agregado")
    #
# DEFINIENDO FUNCION BUSCAR BENEFICIARIO
def buscarUsuario (listaUsuario):
    nombreApellido = input("Digite el nombre y apellido del beneficiario a buscar: " + " \n") 
    N = len (listaUsuario)
    i = 0
    listaEncontrados = []
    while (i < N):
        usuario = listaUsuario [i]
        nombre = usuario [0]
        if (nombre == nombreApellido):
            listaEncontrados.append (usuario)
    #
        i += 1
#
    if (listaEncontrados==[]):
        print ("No se encuentra el beneficiario en la agenda")
    else:
        n = len (listaEncontrados)
        i = 0
        while (i<n):
            usuario = listaEncontrados [i]
            nombre = usuario [0]
            cedula = usuario [1]
            celular = usuario [2]
            print (nombre)
            print (cedula)
            print (celular)
            
            i += 1
            
    #
# DEFINIENDO FUNCION BORRAR BENEFICIARIO
def borrarUsuario (listaUsuario):
   cedulaEliminar = int(input("Digite la cedula del beneficiario a borrar: "))
   print ("El usuario ha sido eliminado del listado")
   N = len (listaUsuario)
   i = 0
   while (i < N):
       usuario = listaUsuario [i]
       cedula = usuario [1]
       if (cedulaEliminar==cedula):
           listaUsuario.pop (i)
           break
        
       i+=1
       


# VARIABLES:
# USUARIO : [nombre y apellido, apellido, cedula, celular]
listaUsuario = []
#
# PRINCIPAL
while (True):
    print ("Menu Principal")
    print ("1. Ver listado")
    print ("2. Ver listado filtrado")
    print ("3. Agregar beneficiario")
    print ("4. Buscar beneficiario")
    print ("5. Borrar beneficiario")
    print ("6. Salir")
    opcion = int (input ())

# PROCESO:
    if (opcion==1) :
        verListado (listaUsuario)       
    elif (opcion==2) :
        verListadoFiltrado (listaUsuario)
    elif (opcion==3) :
        AgregarUsuario (listaUsuario)
    elif (opcion==4) :
        buscarUsuario (listaUsuario)
    elif (opcion==5) :
        borrarUsuario (listaUsuario)
    elif (opcion==6):
        print("Hasta pronto")
        break
