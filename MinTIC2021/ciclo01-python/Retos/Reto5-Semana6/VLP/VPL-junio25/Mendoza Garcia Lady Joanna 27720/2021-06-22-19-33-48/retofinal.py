#Reto 5 Menú, listas y archivos

# funcion para ver el listado
def imprimirListado (listaBeneficiarios):
    i=0
    N=len(listaBeneficiarios)
    print("Listado de beneficiarios")
    while i<N:
        beneficiario= listaBeneficiarios[i]
        nombre= beneficiario [0]
        cedula= beneficiario [1]
        celular=beneficiario [2]
        print(nombre)
        print(cedula)
        print(celular)
        i+=1
        

#funcion para filtrar listado por letra
def filtrarListado(listaBeneficiarios):
    i=0
    N=len(listaBeneficiarios)
    letra=input("Digite la letra por la que empiezan los beneficiarios:")
    while(i<N):
        beneficiario=listaBeneficiarios [i]
        nombre=beneficiario[0]
        cedula= beneficiario [1]
        celular=beneficiario [2]
        nombreMayus=str.upper(nombre)
        letraMayus=str.upper(letra)
        
        if (nombreMayus[0] == letraMayus):
            print("Listado filtrado de beneficiarios:")
            print (nombre)
            print (cedula)
            print (celular)
        
        i+=1
        

            
    
 #Función para adicionar beneneficiarios  
def agregarBeneficiario(listaBeneficiarios):
    print("Digite la información del beneficiario a agregar:")
    nombre=input("")
    cedula=input ("")
    celular=input("")
    beneficiario=[nombre,cedula,celular]
    listaBeneficiarios.append(beneficiario)
    print("El beneficiario ha sido agregado")


#Funcion para buscar beneficiario
def buscarBeneficiario(listaBeneficiarios):
    nombreCompleto=input("Digite el nombre y apellido del beneficiario a buscar:")
    i=0
    N=len(listaBeneficiarios)
    listaEncontrados=[]
    while(i<N):
        beneficiario=listaBeneficiarios [i]
        nombre=beneficiario[0]
        nombreMayus=str.upper(nombre)
        nombreCompletoMayus=str.upper(nombreCompleto)
        
        if (nombreMayus == nombreCompletoMayus):
            listaEncontrados.append(beneficiario)
        i+=1     
            
    if (listaEncontrados==[]):
        print ("No se encuentra beneficiario en la agenda")
    else:
        i=0
        N=len(listaEncontrados)
        while i<N:
            beneficiarioEncontrado= listaEncontrados[i]
            nombre= beneficiarioEncontrado [0]
            cedula= beneficiarioEncontrado [1]
            celular=beneficiarioEncontrado [2]
            print(nombre)
            print(cedula)
            print(celular)
            i+=1
        
           
def borrarBeneficiario(listaBeneficiarios):
    busquedaCedula=input("Digite la cedula del beneficiario a borrar:")
    i=0
    N=len(listaBeneficiarios)
    while(i<N):
        beneficiario=listaBeneficiarios [i]
        cedula= beneficiario [1]
                
        if (cedula==busquedaCedula):
            listaBeneficiarios.pop(i)
            print("El usuario ha sido eliminado del listado")
            break
        i+=1
            
    
    
def guardarArchivo (listaBeneficiarios):
    archivo=open("agenda.txt", "w")
    i=0
    N=len(listaBeneficiarios)
    while i<N:
        beneficiario= listaBeneficiarios[i]
        nombre= beneficiario [0]
        cedula= beneficiario [1]
        celular=beneficiario [2]
        archivo.write (nombre +"\n")
        archivo.write (cedula + "\n")
        archivo.write (celular+ "\n")
        i+=1
    archivo.close() 

#beneficiario=[nombre, cedula, celular]
listaBeneficiarios= []

while (True):
    print("Menu Principal")
    print("1. Ver listado")
    print("2. Ver listado filtrado")
    print("3. Agregar beneficiario")
    print("4. Buscar beneficiario")
    print("5. Borrar beneficiario")
    print("6. Salir")
    
    
    opcion=int(input(""))
    
    
    if (opcion==6):
        break
    elif(opcion==1):
        imprimirListado(listaBeneficiarios)
    elif(opcion==2):
        filtrarListado(listaBeneficiarios)
    elif(opcion==3):
        agregarBeneficiario(listaBeneficiarios)
    elif(opcion==4):
        buscarBeneficiario(listaBeneficiarios)
    elif(opcion==5):
        borrarBeneficiario(listaBeneficiarios)
        
    else:
        print("Opción Invalida")
        
        
print("Hasta pronto")
        