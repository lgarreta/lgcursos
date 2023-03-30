#RETO 5
#Reto Final
#Crear agenda

#FUNCIONES
#Funciones de las opciones del menú

def verListado (listadoBeneficiarios):
    #Abrir el archivo
    N=len(listadoBeneficiarios)
    i=0
    while (i<N):
        beneficiario=listadoBeneficiarios[i]
        nombreApellido=beneficiario[0]
        cedula=beneficiario[1]
        celular=beneficiario[2]
        
        print (nombreApellido)
        print (cedula)
        print (celular)
        
        i+=1
    #
#

    
def verListadoFiltrado (listadoBeneficiarios):
    
    letraInicial= input("Digite la letra por la que empiezan los beneficiarios:")
    
    N=len(listadoBeneficiarios)
    i=0
    listadoFiltrado=[]
    while (i<N):
        beneficiario=listadoBeneficiarios[i]
        nombreApellido=beneficiario[0]
        cedula=beneficiario[1]
        celular=beneficiario[2]
        if(nombreApellido[0]==letraInicial):
            listadoFiltrado.append (nombreApellido)
            listadoFiltrado.append (cedula)
            listadoFiltrado.append (celular)
                       
        #
        i+=1
    #
#
    print("Listado filtrado de beneficiarios:")    
    for item in listadoFiltrado:
        print (item, end='\n')

    
def agregarBeneficiario (listadoBeneficiarios):
    print("Digite la información del beneficiario a agregar: ")
    nombreApellido=(input ())
    cedula=(input ())
    celular=(input ())
    
    beneficiario=[nombreApellido, cedula, celular]
    
    listadoBeneficiarios.append (beneficiario)
    

    print("El beneficiario ha sido agregado")
    
def buscarBeneficiario (listadoBeneficiarios):
    buscarNombre= input ("Digite el nombre y apellido del beneficiario a buscar:")

    
    N=len(listadoBeneficiarios)
    i=0
    listadoFiltrado=[]
    while (i<N):
        beneficiario=listadoBeneficiarios[i]
        nombreApellido=beneficiario[0]
        cedula=beneficiario[1]
        celular=beneficiario[2]
        if (nombreApellido==buscarNombre):
            listadoFiltrado.append (nombreApellido)
            listadoFiltrado.append (cedula)
            listadoFiltrado.append (celular)
        #        
        i+=1
    #
    if (listadoFiltrado==[]):
        print("No se encuentra el beneficiario en la agenda")
    else:
        for item in listadoFiltrado:
            print (item, end='\n')
        
            
def borrarBeneficiario (listadoBeneficiarios):
    cedulaBorrar=input("Digite la cedula del beneficiario a borrar:")
   
    
    N=len(listadoBeneficiarios)
    i=0
    while (i<N):
        beneficiario=listadoBeneficiarios[i]
        nombreApellido=beneficiario[0]
        cedula=beneficiario[1]
        celular=beneficiario[2]
        if (cedula==cedulaBorrar):
            listadoBeneficiarios.pop (i)
            break
        #
        i+=1
    #
   
    print ("El usuario ha sido eliminado del listado")
    
def guardarBeneficiario(listadoBeneficiarios):
    #Abrir archivo
    archivo=open ("agenda.txt", "w")
    
    N=len(listadoBeneficiarios)
    i=0
    while(i<N):
        beneficiario=listadoBeneficiarios[i]
        nombreApellido=beneficiario[0]
        cedula=beneficiario[1]
        celular=beneficiario[2]
        archivo.write(nombreApellido)
        archivo.write("\n")
        archivo.write(cedula)
        archivo.write("\n")
        archivo.write(celular)
        archivo.write("\n")
        i+=1
    #
    #Cerrar el archivo
    archivo.close()
#
    
#VARIABLES
    
listadoBeneficiarios=[]

while (True):
    print ("Menu principal")
    print ("1. Ver listado")
    print ("2. Ver listado filtrado")
    print ("3. Agregar beneficiario")
    print ("4. Buscar beneficiario")
    print ("5. Borrar beneficiario")
    print ("6. Salir")
    opcionMenu = int (input ())
        
    if (opcionMenu==1):
        print ("Listado de beneficiarios")
        verListado(listadoBeneficiarios) 
    elif (opcionMenu==2):
        verListadoFiltrado(listadoBeneficiarios)
    elif (opcionMenu==3):
        agregarBeneficiario(listadoBeneficiarios)
    elif (opcionMenu==4):
        buscarBeneficiario(listadoBeneficiarios)
    elif (opcionMenu==5):
        borrarBeneficiario(listadoBeneficiarios)
    elif (opcionMenu==6):
        print ("Hasta pronto")
        break

