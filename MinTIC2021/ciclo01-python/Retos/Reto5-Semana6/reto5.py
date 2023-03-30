#!/usr/bin/python3
# LIBRERIA DEL SISTEMA OPERATIVO QUE ME PERMITIRÁ VALIDAR SI UN FICHERO YA EXISTE
import os.path as path

file_name = "agenda.txt"
lista_contactos = []


# FUNCION PARA MOSTRAR EL MENÚ
def mostrar_menu():
    print("Menu Principal\n"
          "1. Ver listado\n"
          "2. Ver listado filtrado\n"
          "3. Agregar beneficiario\n"
          "4. Buscar beneficiario\n"
          "5. Borrar beneficiario\n"
          "6. Salir")

    opcion = input()
    if opcion == "1":
        mostrar_todos_contactos()
    elif opcion == "2":
        buscar_letra()
    elif opcion == "3":
        insertar()
    elif opcion == "4":
        buscar_contacto()
    elif opcion == "5":
        borrar()
    else:
        print("Hasta pronto")


# FUNCION PARA MOSTRAR EL LISTA DE LOS CONTACTOS
def mostrar_todos_contactos():
    open_file()
    x = 0
    print("Listado de beneficiarios")
    for i in range(0, len(lista_contactos), 1):
        x += 1
        if x % 3 == 0:
            print(lista_contactos[i - 2] +
                  lista_contactos[i - 1] +
                  str(lista_contactos[i]).rstrip())
    mostrar_menu()


# FUNCION PARA ABRIR O CREAR EL ARCHIVO INCIALMENTE
def open_file():
    global lista_contactos
    if path.exists(file_name):
        mode = "r"
    else:
        mode = "w"

    file = open(file_name, mode)

    if mode != "w":
        lista_contactos = file.readlines()


# FUNCION PARA INSERTAR UN CONTACTO
def insertar():
    open_file()
    exist = False

    print("Digite la información del beneficiario a agregar:")
    nombre = input()
    cedula = input()
    telefono = input()

    for i in range(1, len(lista_contactos), 3):
        if str(cedula) in lista_contactos[i]:
            exist = True
            break
    if not exist:
        file = open(file_name, "a")
        file.writelines(str(nombre) + "\n")
        file.writelines(str(cedula) + "\n")
        file.writelines(str(telefono) + "\n")
        file.close()
        print("El beneficiario ha sido agregado")
    else:
        print("Ya existe un contacto con esa cédula.")
    mostrar_menu()


# FUNCION PARA BUSCAR EL CELULAR DE UN CONTACTO POR SU NOMBRE Y APELLIDO
def buscar_contacto():
    open_file()
    exist = False
    index = -1

    nombre = input("Digite el nombre y apellido del beneficiario a buscar:")

    for i in range(0, len(lista_contactos), 3):
        if nombre.upper() in str(lista_contactos[i]).upper():
            exist = True
            index = i
            break

    if exist:
        print(lista_contactos[index] +
              lista_contactos[index + 1] +
              str(lista_contactos[index + 2]).rstrip())
    else:
        print("No se encuentra el beneficiario en la agenda")
    mostrar_menu()


def buscar_letra():
    open_file()
    array_index = []
    exist = False
    letra = input("Digite la letra por la que empiezan los beneficiarios:")

    if len(letra) > 1:
        letra = letra[0:1]

    for i in range(0, len(lista_contactos), 3):

        if letra.upper() == str(lista_contactos[i])[:1].upper():
            exist = True
            array_index.append(i)
    if not exist:
        print("No existen contactos cuyo nombre contengan la letra inicial", letra)
    else:
        print("Listado filtrado de beneficiarios:")
        for item in array_index:
            print(lista_contactos[item] +
                  lista_contactos[item + 1] +
                  str(lista_contactos[item + 2]).rstrip())
    mostrar_menu()


# FUNCION PARA BORRAR UN CONTACTO POR CEDULA
def borrar():
    open_file()
    exist = False
    index = -1

    cedula = input("Digite la cedula del beneficiario a borrar:")

    for i in range(1, len(lista_contactos), 3):
        if str(cedula) in lista_contactos[i]:
            exist = True
            index = i

    if exist:
        file = open(file_name, "w")
        for i in range(0, len(lista_contactos), 1):
            if i != index - 1 and i != index and i != index + 1:
                file.write(lista_contactos[i])
        file.close()
        print("El usuario ha sido eliminado del listado")
    else:
        print("No existe un contacto con esa cédula")
    mostrar_menu()


# ------------------ PROGRAMA PRINCIPAL ----------------------------
mostrar_menu()

