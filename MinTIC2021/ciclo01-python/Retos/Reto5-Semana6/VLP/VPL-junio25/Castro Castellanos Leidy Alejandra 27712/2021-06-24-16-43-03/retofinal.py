#Variables
listaestudiantes = []

#Definicion de funciones
def verlistado (listaestudiantes):
    n = len (listaestudiantes)
    i = 0
    print ('Listado de beneficiarios')
    while (i < n):
        estudiante = listaestudiantes [i]
        nombre = estudiante [0]
        cedula = estudiante [1]
        telefono = estudiante [2]
        i+=1
        print (nombre)         
        print (cedula)          
        print (telefono)
        
def verlistadofiltrado (listaestudiantes):
    letra = input ('Digite la letra por la que empiezan los beneficiarios: ' + '\n')
    n = len (listaestudiantes)
    indice = 0
    listadofiltrado = []
    while (indice < n):
        estudiante = listaestudiantes [indice]
        nombre = estudiante [0]
        cedula = estudiante [1]
        telefono = estudiante [2]
        if (nombre [0] == letra):
            listadofiltrado.append (estudiante)
            
        indice += 1
   
    print ('Listado filtrado de beneficiarios: ')
    n = len (listadofiltrado)
    indice = 0
    while (indice < n):
        estudiante = listadofiltrado [indice]
        nombre = estudiante [0]
        cedula = estudiante [1]
        telefono = estudiante [2]
        print (nombre)
        print (cedula)
        print (telefono)
        
        indice +=1
     
def agregarbeneficiario (listaestudiantes):
    print ('Digite la información del beneficiario a agregar: ')
    nombre = input ()
    cedula = int (input ())
    telefono = int (input ())
    
    estudiante = [nombre, cedula, telefono]
    
    listaestudiantes.append (estudiante)
    print ('El beneficiario ha sido agregado')
    
def buscarbeneficiario (listaestudiantes):
    nombrecompleto = input ('Digite el nombre y apellido del beneficiario a buscar: ' + '\n')
    n = len (listaestudiantes)
    i = 0
    listadofiltrado = []
    while (i < n):
        estudiante = listaestudiantes [i]
        nombre = estudiante [0]
        if (nombre == nombrecompleto):
            listadofiltrado.append (estudiante)
        i += 1
    if (listadofiltrado == []):
        print ("No se encuentra el beneficiario en la agenda")
    else:
        estudiante = listadofiltrado [0]
        nombre = estudiante [0]
        cedula = estudiante [1]
        telefono = estudiante [2]
        print (nombre)
        print (cedula)
        print (telefono)
        
def borrarbeneficiario (listaestudiantes):
    cedulaestudiante = int (input ('Digite la cedula del beneficiario a borrar: ' + '\n'))
    n = len (listaestudiantes)
    i = 0
    while (i < n):
        estudiante = listaestudiantes [i]
        cedula = estudiante [1]
        if (cedula == cedulaestudiante):
            listaestudiantes.pop (i)
            break
        i += 1
    print ('El usuario ha sido eliminado del listado')
    
while (True):
    print ('Menu Principal')
    print ('1. Ver listado')
    print ('2. Ver listado filtrado')
    print ('3. Agregar beneficiario')
    print ('4. Buscar beneficiario')
    print ('5. Borrar beneficiario')
    print ('6. Salir')
    opcion = int (input ())
    
    if (opcion == 1):
        verlistado (listaestudiantes)
    elif (opcion == 2):
        verlistadofiltrado (listaestudiantes)
    elif (opcion == 3):
        agregarbeneficiario (listaestudiantes)
    elif (opcion == 4):
        buscarbeneficiario (listaestudiantes)
    elif (opcion == 5):
        borrarbeneficiario (listaestudiantes)
    elif (opcion == 6):
        print ('Hasta pronto')
        break
    

    
    
              
    
    