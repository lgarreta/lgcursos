
listBeneficiario = []

def verListado (listBeneficiario):
    N = len (listBeneficiario)
    i = 0
    while (i < N):
        Beneficiario = listBeneficiario [i]
        nombre  = Beneficiario [0]
        cedula  = Beneficiario [1]
        celular = Beneficiario [2]
        print (nombre)           
        print (cedula)           
        print (celular)
        
        i+=1
        

print ("Listado del Beneficiario:")
def Verlistadofiltrado (listBeneficiario):
    Beneficiario = listBeneficiario
    nombre  = Beneficiario [0]
    cedula  = Beneficiario [1]
    celular = Beneficiario [2]
    print (nombre)
    print ("Digite la letra por la que empiezan los beneficiarios:")
    

def agregarBeneficiario (listBeneficiario):
    print ("Digite la información del beneficiario a agregar:")
    nombre = input ("NOMBRE: ")
    cedula = input ("CEDULA: ")
    celular  = int (input ("CELULAR: "))    
    
    Beneficiario = [nombre, cedula, celular]
    
    listBeneficiario.append (Beneficiario)
    print ("El Beneficiario ha sido agregado")
    
# Funcion buscar beneficiario   
def BuscarBeneficiario (listBeneficiario):
    NombreCompleto = input ("Digite el nombre y apellido del beneficiario a buscar: " + "\n")
    n = len (listBeneficiario)
    i = 0
    ListadoFiltrado = []
    while (i < n):
        Beneficiario = listBeneficiario [i]
        nombre = Beneficiario [0]
        if (nombre == NombreCompleto):
            ListadoFiltrado.append(Beneficiario)    
        i += 1
        if (ListadoFiltrado == []):
            print ("Beneficiario no se encuentra en agenda")
        else:
            Beneficiario = listBeneficiario [0]
            nombre  = Beneficiario [0]
            cedula  = Beneficiario [1]
            celular = Beneficiario [2]
            print (nombre)           
            print (cedula)           
            print (celular)
        
    
    
# Funcion borrar Beneficiario
def BorrarBeneficiario (listBeneficiario):
    cedulaBeneficiario = input ("Digite la cedula del beneficiario a borrar:" + "\n")
    n = len (listBeneficiario)
    i = 0
    while (i < n):
        Beneficiario = listBeneficiario [i]
        cedula = Beneficiario [1]
        if (cedula == cedulaBeneficiario):
            listBeneficiario.pop (i)
        break
        i -= 1
    print ("El beneficiario ha sido borrado")
  
  #
  
#

while (True):
    print ("MENU")
    print ("1. Ver listado:")
    print ("2. Ver por filtro")
    print ("3. Añadir beneficiario")
    print ("4. Buscar beneficiario")
    print ("5. Eliminar beneficiario")
    print ("6. Salir")
    opcion= int (input ("Ingrese la opción:"))
    
    if (opcion==1):
        verListado (listBeneficiario)
    elif (opcion==2):
        Verlistadofiltrado (listBeneficiario)
    elif (opcion==3):
        agregarBeneficiario (listBeneficiario)
    elif (opcion==4):
        BuscarBeneficiario (listBeneficiario)
    elif (opcion==5):
        BorrarBeneficiario (listBeneficiario)
    elif (opcion==6):
        print ("Muchas gracias por utilizar nuestro sistema")
        break
    



