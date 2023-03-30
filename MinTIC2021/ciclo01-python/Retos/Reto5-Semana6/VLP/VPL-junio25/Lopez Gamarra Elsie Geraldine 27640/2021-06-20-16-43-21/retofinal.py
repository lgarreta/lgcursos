#DECLARACION VAR. INICIALES:
import os
file = open('agenda.txt', 'w')
archivo=[]

#--------------------------------------- FUNCIONES: ------------------------------------------------
def BuscarBeneficiario(lista):
    cont=0
    NombreApellido = input("Digite el nombre y apellido del beneficiario a buscar: ")
    for y in range(len(lista)):
        if(lista[y]==NombreApellido):
            cont=1
            print(lista[y])
            print(lista[y+1])
            print(lista[y+2])
    if(cont==0):
        print("No se encuentra el beneficiario en la agenda")
        
def AñadirBeneficiario(lista):
    print("Digite la información del beneficiario a agregar: ")
    nombre = input()
    lista.append(nombre)
    cedula = input()
    lista.append(cedula)
    celular = input()
    lista.append(celular)
    with open('agenda.txt', 'a') as fobj:
        fobj.write(nombre + "\n")
        fobj.write(cedula + "\n")
        fobj.write(celular + "\n")
        print("El beneficiario ha sido agregado")
    
def BorrarBeneficiario(lista):
    contador = 0
    val=0
    cedula = input("Digite la cedula del beneficiario a borrar: ")
    for r in range(len(lista)):
        if(lista[r]==cedula):
            val=r
    del lista[val-1]
    del lista[val-1]
    del lista[val-1]
    with open('agenda.txt', 'r') as fobj:
        for i in fobj:
            if cedula in i and len(cedula.strip()) == len(i.strip()):
               borrar(contador)
               borrar(contador)
               borrar(contador-1)
               print("\nEl usuario ha sido eliminado del listado")
            contador = contador + 1
def borrar(value):
    with open('agenda.txt', 'r') as fobj:
        linea = fobj.readlines()
        del linea[value]
        fobj.close()
        with open('agenda.txt', 'w+') as objt:
            for line in linea:
                objt.write(line)

              
#Se añaden los 10 beneficiarios obligatorios:
#for i in range (1, 3, 1):
#   añadir_beneficiario(archivo)

#  MENÚ:            
while(True):
    print("Menu Principal:\n" +
          "1. Ver listado\n" +
          "2. Ver Listado filtrado\n" +
          "3. Agregar beneficiario\n" +
          "4. Buscar beneficiario\n" +
          "5. Borrar beneficiario\n" +
          "6. Salir")
    num=int(input())
    
    if (num==3):
        AñadirBeneficiario(archivo)
    elif(num==5):
        BorrarBeneficiario(archivo)
    elif(num==4):
        BuscarBeneficiario(archivo)
    elif(num==1):
        print("Listado de beneficiarios:")
        for l in range(len(archivo)):
            print(archivo[l])
    elif(num==2):
        dat=input("Digite la letra por la que empiezan los beneficiarios:")
        print("\nListado filtrado de beneficiarios:")
        for i in range(len(archivo)):
            if(archivo[i].startswith(dat)):
                print(archivo[i])
                print(archivo[i+1])
                print(archivo[i+2])
    elif(num==6):
        print("Hasta pronto")
        break
file.close()