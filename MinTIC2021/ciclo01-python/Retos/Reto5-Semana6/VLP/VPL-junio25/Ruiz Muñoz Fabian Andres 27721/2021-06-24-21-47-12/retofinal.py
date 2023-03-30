import os
#FUNCION ADICIONAL PARA VALIDAR LAS LISTAR VACIAS
def Valida_list_vacia(lista):
    if len(lista) == 0:
        # devolviendo verdadero cuando la longitud es 0
        return True
    # Devolver falsa ya que la longitud es mayor que 0
    return False


#FUNCION ADICIONAL PARA LIMPIAR ENTER (\n) DE LA LA LISTA
def limpiar_caracteres(cadena,caracter):
    characters = caracter
    for x in range(len(characters)):
        cadena_sin_saltos = cadena.replace(characters[x],"")
    return cadena_sin_saltos

#FUNCION PARA LISTAR TODOS LOS BENEFICIARIOS
def listar_todos_beneficiarios():
    if os.path.isfile('agenda.txt'):
        archivo_beneficiarios = open ('agenda.txt','r')
        beneficiarios = archivo_beneficiarios.read() 
        print("Listado de beneficiarios","\n")        
        print(beneficiarios)
        archivo_beneficiarios.close()
       
    else:
        print("No tiene ninguna lista de beneficiario")


#FUNCION PARA BUSCAR BENEFICIARIOS POR EL NOMBRE    
def buscar_beneficiario(nombre_apellido):
    if os.path.isfile('agenda.txt'):
        Archivo = open ('agenda.txt','r')
        mi_agenda=[]
        nombre=nombre_apellido
        for linea in Archivo:
            mi_agenda.append(limpiar_caracteres(linea,"\n"))
        if nombre in mi_agenda:
             print(mi_agenda[mi_agenda.index(nombre):mi_agenda.index(nombre)+3])
        else:
             print("No tiene beneficiario en tu agenda con ese nombre")
        Archivo.close()
    else:
         print("No tiene agenda creada")



#FUNCION PARA BUSCAR BENEFICIARIOS POR LETRAS          
def buscar_beneficiario_x_letra(letra):
    if os.path.isfile('agenda.txt'):
        archivo_beneficiarios = open ('agenda.txt','r')
        mi_agenda=[]
        print("Listado filtrado de beneficiarios:","\n")

        for linea in archivo_beneficiarios:
            mi_agenda.append(limpiar_caracteres(linea,"\n"))
        for palabra in mi_agenda:
            if palabra[0].lower() == letra.lower():
                print(mi_agenda[mi_agenda.index(palabra):mi_agenda.index(palabra)+3])
        archivo_beneficiarios.close()
    else:
         print("No tiene agenda creada")


#FUNCION PARA CREAR BENEFICIARIOS
def crear_beneficiario():
    print("Digite la información del beneficiario a agregar:")
    nombre_apellido = (input( ))
    cedula = (input())
    celular = (input())

    #Se crea el archivo .txt
    Archivo = open("agenda.txt", "a")
    with open('agenda.txt') as archivo:
        #print("eee",archivo)
        if cedula in archivo.read():
            mensaje="Ya existe un beneficiario con esa cedula"
        else:                    
            Archivo.write(nombre_apellido+"\n")
            Archivo.write(limpiar_caracteres(cedula+"\n"," "))
            Archivo.write(limpiar_caracteres(celular+"\n"," "))
            #Archivo.write("\n")
            Archivo.close()
            mensaje="El beneficiario ha sido agregado"
    return mensaje

#FUNCION PARA ELIMINAR BENEFICIARIOS  
def eliminar_beneficiario(cedula):
    if os.path.isfile('agenda.txt'):        
        archivo_beneficiarios = open ('agenda.txt','r')
        mi_agenda=[]
        for linea in archivo_beneficiarios:
            mi_agenda.append(limpiar_caracteres(linea,"\n"))
        if cedula in mi_agenda:
            posicion=mi_agenda.index(cedula)
            mi_agenda.pop(posicion)
            mi_agenda.pop(posicion)
            mi_agenda.pop(posicion-1)
            nuevo_archivo = open ('agenda.txt','w')
            for elemento in mi_agenda:
                nuevo_archivo.write(elemento+"\n")
            print("El usuario ha sido eliminado del listado")
            nuevo_archivo.close()
        else:
             print("No tiene beneficiario en tu agenda con esa cedula")
             archivo_beneficiarios.close()          
    else:
         print("No tiene agenda creada")

def menu():
    rta=0


    while True:
        print("\n Menu Principal \n",
        "1. Ver listado \n",
        "2. Ver listado filtrado \n",
        "3. Agregar beneficiario\n",
        "4. Buscar beneficiario \n",
        "5. Borrar beneficiario \n",
        "6. Salir")
        rta =int(input())
        if rta == 1:
           listar_todos_beneficiarios()
        elif rta == 2:
            print("Digite la letra por la que empiezan los beneficiarios:")
            letra = (input())
            buscar_beneficiario_x_letra(letra)
        elif rta == 3:
            print(crear_beneficiario())
        elif rta == 4:
            print("Digite el nombre y apellido del beneficiario a buscar:")
            nombre_apellido = (input())
            buscar_beneficiario(nombre_apellido)
        elif rta == 5:
            print("Digite la cedula del beneficiario a borrar:")
            cedula = (input())
            eliminar_beneficiario(cedula)
        elif rta == 6:
            print("Hasta pronto")
            break
        elif(rta>6 or rta<1):
            print("Seleccione una opcion valida")
            print()



menu()
