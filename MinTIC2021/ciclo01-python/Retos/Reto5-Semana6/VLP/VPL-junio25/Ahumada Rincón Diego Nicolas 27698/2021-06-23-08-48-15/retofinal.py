listadoBeneficiarios = []
archivoTexto = open('agenda.txt', 'w')

def mostrarListado():
    if(listadoBeneficiarios == []):
        print('No hay ningun beneficiario en la lista')
    else:
        print('Listado de beneficiarios')
        for beneficiario in listadoBeneficiarios:
            nombre = beneficiario[0]
            cedula = beneficiario[1]
            celular = beneficiario[2]
            print(nombre)
            print(cedula)
            print(celular)

def mostrarListadoFiltrado():
    letraFiltrar = input('Digite la letra por la que empiezan los beneficiarios:')
    for beneficiario in listadoBeneficiarios:
        nombre = beneficiario[0]
        inicial = nombre[0]
        cedula = beneficiario[1]
        celular = beneficiario[2]
        if(letraFiltrar == inicial):
            print('Listado filtrado de beneficiarios:')
            print(nombre)
            print(cedula)
            print(celular)

def añadirBeneficiario():
    print('Digite la información del beneficiario a agregar:')
    nombre = input()
    cedula = int(input())
    celular = int(input())
    archivoTexto.write(nombre + '\n')
    archivoTexto.write(str(cedula) + '\n') 
    archivoTexto.write(str(celular) + '\n')
    listadoAux = [nombre, cedula, celular]
    listadoBeneficiarios.append(listadoAux)
    print('El beneficiario ha sido agregado')

def buscarBeneficiario():
    nombreYApellido = input('Digite el nombre y apellido del beneficiario a buscar:')
    for beneficiario in listadoBeneficiarios:
        nombre = beneficiario[0]
        cedula = beneficiario[1]
        celular = beneficiario[2]
        if(nombreYApellido == nombre):
            print(nombre)
            print(cedula)
            print(celular)

def borrarBeneficiario():
    cedulaBeneficiario = int(input('Digite la cedula del beneficiario a borrar:'))
    for contador, beneficiario in enumerate(listadoBeneficiarios):
        cedula = beneficiario[1] 
    if(cedulaBeneficiario == cedula):
        listadoBeneficiarios.pop(contador)
        print('El usuario ha sido eliminado del listado')
    else:
        print('\nLa cedula ingresada no se encuentra en la lista')

while (True):
    eleccionUsuario = int(input('Menu Principal \n1. Ver listado \n2. Ver listado filtrado \n3. Agregar beneficiario  \n4. Buscar beneficiario \n5. Borrar beneficiario \n6. Salir \n' ))
    
    if (eleccionUsuario == 1):
        mostrarListado()

    elif (eleccionUsuario == 2):
        mostrarListadoFiltrado()

    elif(eleccionUsuario == 3):
        añadirBeneficiario()

    elif(eleccionUsuario == 4):
        buscarBeneficiario()

    elif(eleccionUsuario == 5):
        borrarBeneficiario()

    elif (eleccionUsuario == 6):
        archivoTexto.close()
        print('Hasta pronto')
        break

    else:
        print('\nInserte una opción valida por favor.')