opcion = 0

nombre = ""
cedula = 0
celular = 0

listaEstudiantes = []


def VerListado ():
    print("Listado de beneficiarios")    
    i = 0
    while(i < len(listaEstudiantes)):
        print(listaEstudiantes[i][0])
        print(listaEstudiantes[i][1])
        print(listaEstudiantes[i][2])
        i+=1        
    

def VerListadoFiltrado():
    print("Digite la letra por la que empiezan los beneficiarios:")
    print("Listado filtrado de beneficiarios:")
    letra = input()
    letra = str.upper(letra)
    i = 0
    while(i < len(listaEstudiantes)):
        
        nombre = listaEstudiantes[i][0]
        
        
        if(letra == nombre[0]):
            print(listaEstudiantes[i][0])
            print(listaEstudiantes[i][1])
            print(listaEstudiantes[i][2])
        
        i+=1 
    
    
    
def AgregarBeneficiario():    
    print("Digite la información del beneficiario a agregar:")
    nombre = str(input())
    cedula = str(input())
    celular = str(input())    
    listaEstudiantes.append([nombre, cedula, celular])
    print("El beneficiario ha sido agregado")
    
    archivo = open("agenda.txt", "a")
    archivo.write(nombre + "\n")
    archivo.write(cedula + "\n")
    archivo.write(celular + "\n")
    archivo.close()
    
    
    
def BuscarBeneficiario():
    print("Digite el nombre y apellido del beneficiario a buscar:")
    nombreCompleto = input()
    nombreCompleto = str.upper(nombreCompleto)
    encontrado = False    
    i = 0
    while(i < len(listaEstudiantes)):
        
        nombre = listaEstudiantes[i][0]
        nombre = str.upper(nombre)
        
        if(nombreCompleto == nombre):
            print(listaEstudiantes[i][0])
            print(listaEstudiantes[i][1])
            print(listaEstudiantes[i][2])
            encontrado = True
        
        i+=1
    if(encontrado == False):
        print("No se encuentra el beneficiario en la agenda")



def BorrarBeneficiario():
    print("Digite la cedula del beneficiario a borrar:")
    cedulaBorrar = input()
    
    i = 0
    while(i < len(listaEstudiantes)):
        
        cedula = listaEstudiantes[i][1]        
        
        if(cedulaBorrar == cedula):
            listaEstudiantes.pop(i)
            print("El usuario ha sido eliminado del listado")
            break            
        
        i+=1



while(opcion != 6):
    
    print("Menu Principal")
    print("1. Ver listado")
    print("2. Ver listado filtrado")
    print("3. Agregar beneficiario")
    print("4. Buscar beneficiario")
    print("5. Borrar beneficiario")
    print("6. Salir")

    opcion = int(input());
    
    if(opcion == 1):
        VerListado()        
        
    elif(opcion == 2):
        VerListadoFiltrado()
        
    elif(opcion == 3):
        AgregarBeneficiario()
        
    elif(opcion == 4):
        BuscarBeneficiario()
        
    elif(opcion == 5):
        BorrarBeneficiario()
        
    elif(opcion == 6):
        print("Hasta pronto")
        
    else:
        print("Opcion incorrecta")