# variable
#Beneficiario: [Nombre, Cedula, Celular]
listaBeneficiario = []

def verListado (listaBeneficiario):
    N = len (listaBeneficiario)
    i = 0
    while (i < N):
        Beneficiario = listaBeneficiario [i]
        nombre  = Beneficiario [0]
        cedula  = Beneficiario [1]
        celular = Beneficiario [2]
        print (nombre)           
        print (cedula)           
        print (celular)
        
        i+=1
        
# Funcion listado filtrado
print ("Listado Filtrado Beneficiario:")
def Verlistadofiltrado (listaBeneficiario):
    Beneficiario = listaBeneficiario
    nombre  = Beneficiario [0]
    cedula  = Beneficiario [1]
    celular = Beneficiario [2]
    print (nombre)
    print ("Digite la letra por la que empiezan los beneficiarios:")
    
# Funcion agregar beneficiario
def agregarBeneficiario (listaBeneficiario):
    print ("Digite la información del beneficiario a agregar:")
    nombre = input ("NOMBRE: ")
    cedula = input ("CEDULA: ")
    celular  = int (input ("CELULAR: "))    
    
    Beneficiario = [nombre, cedula, celular]
    
    listaBeneficiario.append (Beneficiario)
    print ("El Beneficiario ha sido agregado")
    
# Funcion buscar beneficiario   
def BuscarBeneficiario (listaBeneficiario):
    NombreCompleto = input ("Digite el nombre y apellido del beneficiario a buscar: " + "\n")
    n = len (listaBeneficiario)
    i = 0
    ListadoFiltrado = []
    while (i < n):
        Beneficiario = listaBeneficiario [i]
        nombre = Beneficiario [0]
        if (nombre == NombreCompleto):
             ListadoFiltrado.append(Beneficiario)   
        i += 1
        if (ListadoFiltrado == []):
            print ("Beneficiario no se encuentra en agenda")
        else:
            Beneficiario = listaBeneficiario [0]
            nombre  = Beneficiario [0]
            cedula  = Beneficiario [1]
            celular = Beneficiario [2]
            print (nombre)           
            print (cedula)           
            print (celular)
        
    
    
# Funcion borrar Beneficiario
def BorrarBeneficiario (listaBeneficiario):
    cedulaBeneficiario = input ("Digite la cedula del beneficiario a borrar:" + "\n")
    n = len (listaBeneficiario)
    i = 0
    while (i < n):
        Beneficiario = listaBeneficiario [i]
        cedula = Beneficiario [1]
        if (cedula == cedulaBeneficiario):
            listaBeneficiario.pop (i)
        break
        i += 1
    print ("El beneficiario ha sido borrado")
  
  #
  
#

while (True):
    print ("MENU PRINCIPAL")
    print ("1. Ver listado:")
    print ("2. Ver listado filtrado")
    print ("3. Agregar beneficiario")
    print ("4. Buscar beneficiario")
    print ("5. Borrar beneficiario")
    print ("6. Salir")
    opcion= int (input ("Ingrese la opción:"))
    
    if (opcion==1):
        verListado (listaBeneficiario)
    elif (opcion==2):
        Verlistadofiltrado (listaBeneficiario)
    elif (opcion==3):
        agregarBeneficiario (listaBeneficiario)
    elif (opcion==4):
        BuscarBeneficiario (listaBeneficiario)
    elif (opcion==5):
        BorrarBeneficiario (listaBeneficiario)
    elif (opcion==6):
        print ("Hasta pronto")
        break
