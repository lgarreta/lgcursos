#FUNCIONES

# OPCION 1 - VER LISTA DE BENEFICIARIOS
def verListado (listabeneficiarios):
    N = len(listabeneficiarios)
    i = 0
    print("Listado de beneficiarios")
    while (i < N):
        beneficiarios = listabeneficiarios [i]
        nombres = beneficiarios [0]
        cedula  = beneficiarios [1]
        celular = beneficiarios [2]
       
        print(nombres)
        print(cedula)
        print(celular)
        
        i += 1
        
# OPCION 2 - VER LISTADO FILTRADO - BUSCAR POR LETRA
def verListadoFiltrado (listabeneficiarios):
    N = len (listabeneficiarios)
    i = 0
    letra = input ("Digite la letra por la que empiezan los beneficiarios:" + "\n")
    filtro = []
    while (i < N):
        beneficiarios = listabeneficiarios [i]
        nombres = beneficiarios [0]
        cedula  = beneficiarios [1]
        celular = beneficiarios [2]
        
        if (nombres [0] == letra):
            filtro.append (beneficiarios)
            i = i + 1
            
            beneficiarios = filtro [0]            
            nombres = beneficiarios [0]
            cedula  = beneficiarios [1]
            celular = beneficiarios [2]
            i = i + 1 
        
        print("Listado filtrado de beneficiarios:")
                  
        print(nombres)
        print(cedula)
        print(celular)
        
   
   
# OPCION 4 - BUSCAR BENEFICIARIOS - NOMBRES COMPLETOS
def buscarBeneficiario (listabeneficiarios):
    N = len(listabeneficiarios)
    i = 0
    nombrecompleto = []
    buscar = input ("Digite el nombre y apellido del beneficiario a buscar:" + "\n")
    while (i < N):
        beneficiarios = listabeneficiarios [i]
        nombres = beneficiarios [0]
        cedula  = beneficiarios [1]
        celular = beneficiarios [2]
        i = i + 1
        
        if (nombres == buscar):
            nombrecompleto.append (beneficiarios)
            
            nombres = beneficiarios [0]
            cedula  = beneficiarios [1]
            celular = beneficiarios [2]
            i = i + 1
            print(nombres)
            print(cedula)
            print(celular)
        

# OPCION 3 - AGREGAR BENEFICIARIO
def AgregarBeneficiario (listabeneficiarios):
    print("Digite la información del beneficiario a agregar:")
    nombres = input ()
    cedula = int(input ())
    celular   = int (input ())
    
    beneficiarios = [nombres, cedula, celular ]
    listabeneficiarios.append (beneficiarios)
    print("El beneficiario ha sido agregado")
    
# OPCION 5 - BORRAR BENEFICIARIOS

def borrarBeneficiario (listabeneficiarios):
    cedulaben = int ( input("Digite la cedula del beneficiario a borrar:"))
    n = len (listabeneficiarios)
    i= 0
    while (i < n):
        beneficiarios = listabeneficiarios [i]
        cedula = beneficiarios [1]
        if (cedula == cedulaben):
            listabeneficiarios.pop(i)
            print("El usuario ha sido eliminado del listado")
            break
        i = i + 1
        


#VARIABLE
listabeneficiarios = []

# PRINCIPAL    
while (True):
    print ("Menu Principal")
    print ("1. Ver listado")
    print ("2. Ver listado filtrado")
    print ("3. Agregar beneficiario")
    print ("4. Buscar beneficiario")
    print ("5. Borrar beneficiario")
    print ("6. Salir")
    opcion = int (input ()) #SE INGRESA INFORMACION 
 
    if (opcion==1):
        verListado (listabeneficiarios)
    elif (opcion==2):
        verListadoFiltrado(listabeneficiarios)
    elif (opcion==3):
        AgregarBeneficiario (listabeneficiarios)
    elif (opcion==4):
        buscarBeneficiario (listabeneficiarios)
    elif (opcion==5):
        borrarBeneficiario (listabeneficiarios)
    elif (opcion==6):
        break
    else:
        print ("Opción no valida")
        
# OPCION 6 - SALIR
print ("Hasta pronto")