def createFile(directory):
    file = open(directory, 'w')

def clearContent(directory):
    lista = getList(directory)
    for item in lista:
        content = item.split('|')
    return content

def getList(directory):
    try:
        with open(directory, 'r') as file:
            lista = file.readlines()
            return lista
    except:
        print ('La lista no existe aún')

def showList(directory):
    content = clearContent(directory)
    print('Listado de beneficiarios')
    for i in content:
            print(i)

def showFilterList(directory):
    lista = clearContent(directory)
    letter = input('Digite la letra por la que empiezan los beneficiarios:\n')
    n = len(lista)
    if letter:
        nPrint = 0
        print('Listado filtrado de beneficiarios:')
        for item in lista:
            if item[0] == letter:
                print(item)
                print(lista[lista.index(item)+1])
                print(lista[lista.index(item)+2])
                nPrint += 1
        if nPrint == 0:
            print('No hay beneficiarios que coincidan con la busqueda: ' + letter)
    else:
        print('No se ha digitado ninguna letra')        

def addStudent(directory):
    try:
        print('Digite la información del beneficiario a agregar:')
        name = input()
        cc = input()
        phone = input()
        if not name or not cc or not phone:
            print('No se ha ingresado ningun beneficiario')
        else:
            full = getList(directory)
            dates = [name, cc, phone]
            with open(directory, 'a') as file:
                for date in dates:
                    if date != dates[-1]:
                        if (full) and (date == dates[0]):
                            file.writelines('|'+date+'|')
                        else:
                            file.writelines(date+'|')
                    else:
                        file.writelines(date)
            print('El beneficiario ha sido agregado')
    except:
        print('No se ha podido ingresar al beneficiario')

def showStudent(directory):
    print('Digite el nombre y apellido del beneficiario a buscar:')
    name = input()
    if name:
        lista = clearContent(directory)
        if name in lista:
            print(lista[lista.index(name)])   #nombre
            print(lista[lista.index(name)+1]) #cédula
            print(lista[lista.index(name)+2]) #teléfono
        else:
            print('No se encuentra el beneficiario en la agenda')
    else:
        print('No se ha digitado ningun dato')        

def updateFile(directory, lista):
    with open(directory, 'w') as file:
        for item in lista:
            if item != lista[-1]:
                item = item+'|'
            file.writelines(item)
    print('El usuario ha sido eliminado del listado')

def deleteStudent(directory):
    print('Digite la cedula del beneficiario a borrar:')
    cc = input()
    if cc:
        lista = clearContent(directory)
        if cc in lista:
            name = lista[lista.index(cc)-1]
            phone = lista[lista.index(cc)+1]
            lista.remove(name)
            lista.remove(cc)
            lista.remove(phone)
            updateFile(directory, lista)
        else:
            print('El estudiante no existe')
    else:
        print('No se ha digitado ninguna cedula')

def menu(directory, response):
    if response == '1':
        showList(directory)
    elif response == '2':
        showFilterList(directory)
    elif response == '3':
        addStudent(directory)
    elif response == '4':
        showStudent(directory)
    elif response == '5':
        deleteStudent(directory)
    else:
        print('Hasta pronto')

def program():
    while True:
        print('Menu Principal')
        print('1. Ver listado')
        print('2. Ver listado filtrado')
        print('3. Agregar beneficiario')
        print('4. Buscar beneficiario')
        print('5. Borrar beneficiario')
        print('6. Salir')

        response = input()
        try:
            resEval = int(response)
            if response:
                if resEval > 0 and resEval < 6:
                    menu(directory, response)
                else:
                    print('Hasta pronto')
                    break
            else:
                continue
        except:
            menu(directory, response)

directory = 'agenda.txt'
createFile(directory)
program()