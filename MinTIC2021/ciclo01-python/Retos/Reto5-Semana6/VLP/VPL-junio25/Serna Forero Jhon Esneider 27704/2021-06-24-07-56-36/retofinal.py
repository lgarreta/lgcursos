ListaBenef= []

def AgregarBenef (ListaBenef):
    
    print ("Digite la información del beneficiario a agregar: ")
    Nombre = input (" ")
    Cedula = input (" ")
    Celular= input (" ")   
    
    Beneficiario = [Nombre, Cedula, Celular]
    
    ListaBenef.append (Beneficiario)
    print ("El beneficiario ha sido agregado")
#    
def VerListado (ListaBenef):
    print ("Listado de beneficiarios")
    NumFilas= len(ListaBenef)
    i= 0
    # Abrir el archivo
    ArchivoTXT = open ("agenda.txt", "w")
    while (i < NumFilas):
        Beneficiario = ListaBenef [i]
        
        Nombre= Beneficiario [0]
        Cedula = Beneficiario [1]
        Celular= Beneficiario [2]
        
        # Escritura al archivo
        ArchivoTXT.write (Nombre + "\n")
        print (Nombre)
        ArchivoTXT.write (str (Cedula) + "\n")
        print (Cedula)
        ArchivoTXT.write (str (Celular) + "\n")
        print (Celular)
        
        i += 1
    
    ArchivoTXT.close ()
#
def VerListadoFiltrado (ListaBenef):
    Letra = input ("Digite la letra por la que empiezan los beneficiarios: ")
    N = len (ListaBenef)
    i = 0
    ListaEncontrados = []
    while (i < N):
        Beneficiario = ListaBenef [i]
        Nombre = Beneficiario [0]
        Cedula = Beneficiario [1]
        Celular = Beneficiario [2]
        if (Nombre [0]==Letra):
            ListaEncontrados.append (Nombre)
            ListaEncontrados.append (Cedula)
            ListaEncontrados.append (Celular)
        #
        i += 1
    #BenefEncontrado=ListaEncontrados[]
    print ("Listado filtrado de beneficiarios: ")
    ###
    NombreBenefEncontrado=ListaEncontrados[0]
    CedulaBenefEncontrado=ListaEncontrados[1]
    CelularBenefEncontrado=ListaEncontrados[2]
    print (NombreBenefEncontrado)
    print (CedulaBenefEncontrado)
    print(CelularBenefEncontrado)
    #print (ListaEncontrados)

def BorrarBenef (ListaBenef):
    NumFilas= len(ListaBenef)
    NumColumnas= 3
    i= 0
    BuscarCC=  input ("Digite la cedula del beneficiario a borrar:")
    while (i < NumFilas):
        Beneficiario = ListaBenef [i]
        CC = Beneficiario [1]
        if (CC==BuscarCC):
            ListaBenef.pop (i)
            print ("El usuario ha sido eliminado del listado")
            break
        i+=1
    

def BuscarBenef (ListaBenef):
    NombreCompleto = input ("Digite el nombre y apellido del beneficiario a buscar: ")
    L = len (ListaBenef)
    i = 0
    ListaEncontrados = []
    while (i < L):
        Beneficiario = ListaBenef [i]
        Nombre = Beneficiario [0]
        if (Nombre == NombreCompleto):
            ListaEncontrados.append (Beneficiario)
        #
        i += 1
    #
    if (ListaEncontrados==[]):
        print ("No se encuentra el beneficiario en la agenda")
    else:
        BeneficiarioEncontrado=ListaEncontrados[0]
        Nombre=BeneficiarioEncontrado[0]
        Cedula=BeneficiarioEncontrado[1]
        Celular=BeneficiarioEncontrado[2]
        #print (ListaEncontrados)
        print (Nombre)
        print (Cedula)
        print (Celular)
#
while (True):
    #print ("♠♣♦♥♠♣♦♥♠♣♦♥♠♣♦♥ OPCIONES ♠♣♦♥♠♣♦♥♠♣♦♥♠♣♦♥")
    print ('Menu Principal')
    print ("1. Ver listado")
    print ("2. Ver listado filtrado")
    print ("3. Agregar beneficiario")
    print ("4. Buscar beneficiario")
    print ("5. Borrar beneficiario")
    print ("6. Salir")
    #print ("♠♣♦♥♠♣♦♥♠♣♦♥♠♣♦♥☺☻☺☻☺☻☺☻☻☺☺♠♣♦♥♠♣♦♥♠♣♦♥♠♣♦♥")
    
    opcion = int (input (" "))
    
    if (opcion==6):
        print ("Hasta pronto")
        break
    elif (opcion==1):
        VerListado(ListaBenef)
    elif (opcion==2):
        VerListadoFiltrado(ListaBenef)
    elif (opcion==3):
        AgregarBenef(ListaBenef)
    elif (opcion==4):
        BuscarBenef(ListaBenef)
    elif (opcion==5):
        BorrarBenef(ListaBenef)
    #else:
        #print ("Opción no valida")
    #
    
#

#
#Proyecto MINTIC