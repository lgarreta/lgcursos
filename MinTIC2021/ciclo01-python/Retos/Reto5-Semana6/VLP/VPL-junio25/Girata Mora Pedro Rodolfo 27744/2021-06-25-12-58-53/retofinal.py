##Final Retofinal semana 6 y 7## Giratá
import os
def listado (listabeneficiarios):
    print ("Listado de beneficiarios")
    N = len (listabeneficiarios)
    i = 0
    while (i < N):
        beneficiario = listabeneficiarios [i]
        nombre     = beneficiario [0]
        cedula     = beneficiario [1]
        celular    = beneficiario [2]
        print (nombre)
        print (cedula)
        print (celular)
        i+=1
def filtrado (listabeneficiarios):
    print ("Listado filtrado de beneficiarios")
    letra = input ("Digite la letra por la que empiezan los beneficiarios:")
    listabeneficiarios = []
    i = 0
    N = len (listabeneficiarios)
    while (i < N):
        nombre = listabeneficiarios [i]
        nombreMayusculas = str.upper (nombre)
        C = str.upper (c)
        if (nombreMayusculas [0] == C):
            print (nombre)
            print (cedula)
            print (celular)
        else:
            print ("No se encuentra el beneficiario en la agenda")
        i+=1

def guardarArchivo (listabeneficiarios):
    N = len (listabeneficiarios)
    i = 0
    while (i < N):
        beneficiario = listabeneficiarios [i]
        nombre = beneficiario [0]
        cedula = beneficiario [1]
        celular   = str (beneficiario [2])
        archivo.write (nombre)
        archivo.write ("\n")
        archivo.write (codigo) 
        archivo.write ("\n")
        archivo.write (nota) 
        archivo.write ("\n")
        i+=1 
def agregar (listabeneficiarios):

    N = len (listabeneficiarios)
    i = 0
    while (i < N):
        beneficiario = listabeneficiarios [i]
        nombre  = beneficiario [0]
        cedula  = beneficiario [1]
        celular = str (beneficiario [2])

        i+=1
def adicionar (listabeneficiarios):
    print ("Digite la información del beneficiario a agregar")
    nombre  = input ("NOMBRE  : ")
    cedula  = input ("CEDULA  : ")
    celular = int (input ("CELULAR : "))    
    beneficiario = [nombre, cedula, celular]
    listabeneficiarios.append (beneficiario)
    print ("El beneficiario ha sido agregado")  
def borrar (listabeneficiarios):
    borrar = int (input ("Digite la cedula del beneficiario a borrar : "))
    beneficiarios = []
    N = len (listabeneficiarios)
    i = 0
    while (i < N):
        cedula  = listabeneficiarios [i]
        if (cedula  == listabeneficiarios [i]):
            listabeneficiarios.pop (i)
            print ("   El usuario ha sido eliminado del listado   ")
            i+=1   
def buscar (listabeneficiarios):
    buscar = input ("Digite el nombre y apellido del beneficiario a buscar:")
    listabeneficiarios = []
    i = 0
    N = len (listabeneficiarios)
    while (i < N):
        if (nombre [0] in listabeneficiarios [i]):
            nombre  = beneficiario [0]
            cedula  = beneficiario [1]
            celular = beneficiario [2]
            print (nombre)
            print (cedula)
            print (celular)
        else:
            print ("No se encuentra el beneficiario en la agenda")
            i+=1  
listabeneficiarios = [] 
while (True):

    print ("     Menu Principal       ")
    print ("1. Ver listado ")
    print ("2. Ver listado filtrado. ")
    print ("3. Agregar beneficiario. ")
    print ("4. Buscar beneficiario. ")
    print ("5. Borrar beneficiario.  ")
    print ("6. Salir")
    
    opcion = int (input ("   Ingrese la opción:  "))
    if   (opcion==1):
          listado (listabeneficiarios)
    elif (opcion==2):
          agregar (listabeneficiarios)
    elif (opcion==3):
          adicionar (listabeneficiarios)
    elif (opcion==4):
          buscar (listabeneficiarios)
    elif (opcion==5):
          borrar (listabeneficiarios)
    elif (opcion==6):
         
          break

    else:
        print ("Opción no valida")
print ("Hasta Pronto")
