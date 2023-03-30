#!/usr/bin/python3

def cargarDatosArchivo ():
    baseDatos = []
    archivo = open ("agenda.txt", "r")
    lineas = archivo.readlines()
    N = len (lineas)
    i = 0
    while (i < N):
       nombre  = lineas [i].strip()
       cedula  = lineas [i+1].strip()
       celular = lineas [i+2].strip()

       dato = [nombre, cedula, celular]
       baseDatos.append (dato)
       i += 3
    #
    archivo.close()
    return (baseDatos)
#

def adicionar (baseDatos):
    nombre= input ("Nombre: ")
    cedula = input ("Cedula: ")
    celular = input ("Celular: ")

    dato = [nombre, cedula, celular]

    baseDatos.append (dato)
    return (baseDatos)
#


        
baseDatos = cargarDatosArchivo ()

while (True):
    print ("\n>>>>>>>>>>>>>>>Opciones<<<<<<<<<<<<<<<<")
    print ("0. Salir")
    print ("1. Adicionar")
    print ("2. Buscar numero celular")
    print ("9. Imprimir Agenda")
    print (">>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<")
    opcion = int (input ("Digite opción: "))
    if (opcion==0):
        break
    elif (opcion==1):
        adicionar (baseDatos)
    elif (opcion==2):
        buscarCelular (baseDatos)
    elif (opcion==9):
        print (baseDatos)
    else:
        print ("Opción no existente")
    #
#


