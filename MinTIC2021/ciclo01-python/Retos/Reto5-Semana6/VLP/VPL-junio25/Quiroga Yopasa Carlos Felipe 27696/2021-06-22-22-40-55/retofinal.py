listado =[]
listadofiltro = []



def verlistado (listado):
       
    N = len (listado)
    i = 0
    while (i < N):
        usuario = listado [i]
        nombre = usuario [0]
        cedula = usuario [1]
        celular = usuario [2]
        print (nombre)
        print (cedula)
        print (celular)      
       
        i+=1
    
def verlistadofiltro (listado):
    N = len (listado)
    i = 0
    while (i < N):
        usuario = listado [i]
        nombre = usuario[0] 
        if (letra == nombre[0]):
            listadofiltro.append(usuario)
            i=0
            usuario = listadofiltro [i]
            nombre = usuario [0]
            cedula = usuario [1]
            celular = usuario [2]
            print (nombre)
            print (cedula)
            print (celular)
        i+=1
            
    
def adicionar (listado):
    print ("Digite la información del beneficiario a agregar:")
    nombre = input ()
    cedula = input ()
    celular  = input ()
    
    usuario = [nombre, cedula, celular]
    
    listado.append (usuario)
    
    
        
def buscarbeneficiario(listado):    
    N=len (listado)
    i=0
    while (i < N):
        usuario = listado [i]
        nombre  = usuario [0]
        if (nombre ==buscarnombre):
            listadofiltro.append(usuario)
            
            
        i+= 1
        
    else:
        i = 0
        usuario = listadofiltro[i]
        nombre  =usuario [0]
        cedula =usuario [1]
        celular = usuario [2]
        print (nombre)
        print (cedula)
        print (celular)
    
def borrarbeneficiario(listado):
    N=len (listado)
    i=0
    while (i < N ):
        usuario =listado [i]
        cedula  =usuario [1]
        if (cedula == cedulaaeliminar):
            listado.pop (i)
            break
        i+=1
    print ("El usuario ha sido eliminado del listado")
    





while (True):
    
    
    print ("Menu Principal")    
    print ("1. Ver listado")
    print ("2. Ver listado filtrado")
    print ("3. Agregar beneficiario")
    print ("4. Buscar beneficiario")
    print ("5. Borrar beneficiario")
    print ("6. Salir")
    
   
    opcion = int(input())
   
    
    if (opcion == 1):
        print ("Listado de beneficiarios")
        verlistado (listado)
        
    elif (opcion == 2):
        letra = str(input("Digite la letra por la que empiezan los beneficiarios:"))
        print ("Listado filtrado de beneficiarios:")
        verlistadofiltro (listado)
        listadofiltro =[]
            
        
    elif (opcion ==3):
        adicionar (listado)
        print("El beneficiario ha sido agregado")
        
    elif (opcion == 4):
        buscarnombre = str(input("Digite el nombre y apellido del beneficiario a buscar:"))
        buscarbeneficiario (listado)
        listadofiltro =[]
        
    elif (opcion == 5):
        cedulaaeliminar = str(input("Digite la cedula del beneficiario a borrar:"))
        borrarbeneficiario (listado)
        
    elif (opcion ==6):
        print ("Hasta pronto")
        break
    
     
      
          
    
       
        
        
                
   


    
    

        
