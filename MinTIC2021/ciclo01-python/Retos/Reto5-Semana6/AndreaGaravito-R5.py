



#import libreria as lib 

#listadeBeneficiarios=["Jose Castro", "18145321","3091234567", "Sofia Vergara", "52120318" "3109876543"]

listas=[]

archivo=open("directorio.txt","w")

for l in "lista":



#   archivo.write(l)

   archivo.close()    



def adicionar(nom,id,cel):

    archivo=open("directorio.txt","w")

    archivo.write(nom)

    archivo.write(id)

    archivo.write(cel)

    archivo.close()

def busqueda(nom):

    x=0

    for persona in list:

        if persona==nom:"Listado de beneficiarios:"

        print("nombre: ",nom,"id:","Cel:")

        x=x+1

3

def busquedacc(id):

    archivo=open("directorio.txt","r")

    datos=readli1nes()

    c=0

    for linea in datos:

        if linea.startswith(id):

            c=1

            archivo.close()

            break

    archivo.close()

    return c

def mostrar(lista):

    x=0

    for persona in lista:

            archivo=open("directorio.txt","r")

    datos=archivo.readlines()

    for linea in datos:

        print (linea)

    archivo.close()

'''def eliminar(id):

    x=0

    for persona in lista:

        if persona==id:

            lista.pop(x)

            lista.pop(x

'''

def eliminar(id):

    x=0

    for persona in list:

        if persona==id:

            list.pop(x)

            list.pop(x-1)

            break

        x=x+1

#tit=""

op=0

while op!=6:

   # lib.titulo(tit)

    print ("1. ver listado")

    print ("2. ver listado filtrado")

    print ("3. agregar beneficiario")

    print ("4. buscar beneficiario")

    print ("5. borrar beneficiario")

    print ("6. salir")

    op=int(input("que opcion desea "))

    if op==1:

        mostrar("lista")

    elif op==2:

        nombre=input ("nombre:")

        id=input("id,cel:")

        adicionar (nombre,id,cel)

    elif op==3:

        id=input("id,cel: ")

        if busquedacc(id)==1:

            print ("usuario ya existe")    

    elif op==4:

        buscar=input("nombre a buscar")

        busqueda(buscar)

    elif op==5:

        id=input("id: ")

        eliminar(id)

    elif op==6:

        id=input("salir")

    else:

        nombre=input("nombre: ")

        cel=input ()

        adicionar(nombre,id,cel)

    

    








