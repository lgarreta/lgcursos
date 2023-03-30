##RETO FINAL
##FUNCIONES

#muestra la lista
def lista(): 
    archivo = open ("agenda.txt", "r")
    print("Listado de beneficiarios")
    for linea in archivo.readlines():
        print(linea.rstrip("\n"))
        
#filtra los elementos    
def filtro():    
    print("Digite la letra por la que empiezan los beneficiarios:")
    agenda = open("agenda.txt", "r")
    letra = input()
    lineas = agenda.readlines()
    n=0
    print("Listado filtrado de beneficiarios:")
    for i in lineas:
        if i.startswith(letra):
            print(lineas[n].rstrip("\n"))
            print(lineas[n+1].rstrip("\n"))
            print(lineas[n+2].rstrip("\n"))
        n+=1
    agenda.close()
    
#agrega elementos
def agregar (): 
    print ("Digite la información del beneficiario a agregar:")
    nombre = input()
    cedula = input()
    celular = input()
    archivo = open("agenda.txt","a")
    archivo.write(nombre + "\n")
    archivo.write(cedula + "\n")
    archivo.write(celular + "\n")
    archivo.close
    print("El beneficiario ha sido agregado")
    
#busca dentro de la lista
def buscar():
    print("Digite el nombre y apellido del beneficiario a buscar:")
    agenda = open("agenda.txt", "r")
    nombre = input()
    lineas = agenda.readlines()
    n=0
    for i in lineas:
        if i.startswith(nombre):
            print(lineas[n].rstrip("\n"))
            print(lineas[n+1].rstrip("\n"))
            print(lineas[n+2].rstrip("\n"))
        n+=1
    agenda.close()
    
#borrar elementos  
def borrar(): 
    print("Digite la cedula del beneficiario a borrar:")
    contenido = []
    agenda = open("agenda.txt", "r")
    lineas = agenda.readlines()
    for linea in lineas:
        contenido.append(linea.strip("\n"))
    agenda.close
    documento = input()
    indice_documento = contenido.index(documento)
    del contenido[(indice_documento - 1) : (indice_documento + 2)]
    agenda = open("agenda.txt", "w")
    for i in contenido:
        agenda.write(i + "\n")
    agenda.close()
    print("El usuario ha sido eliminado del listado")
    
##PRINCIPAL
while True: 
    print("Menu Principal ")
    print("1. Ver listado")
    print("2. Ver listado filtrado")
    print("3. Agregar beneficiario")
    print("4. Buscar beneficiario")
    print("5. Borrar beneficiario")
    print("6. Salir")
    opcion = int (input())
   
    if (opcion == 1):
       lista()
    elif (opcion == 2):
        filtro()  
    elif (opcion == 3): 
        agregar()
    elif (opcion == 4):
        buscar() 
    elif (opcion == 5):
        borrar()
    elif (opcion == 6):
        break
    else: 
        print("sin definir")
        
print ("Hasta pronto")