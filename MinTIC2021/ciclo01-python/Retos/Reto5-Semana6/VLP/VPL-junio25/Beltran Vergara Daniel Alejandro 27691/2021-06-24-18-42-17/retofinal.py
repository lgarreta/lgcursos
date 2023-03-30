def imprimir_agenda (lista_beneficiarios):
    
    print ('Listado de beneficiarios ')
    stop = len(lista_beneficiarios)
    cont = 0
    
    while (cont < stop):
        beneficiarios = lista_beneficiarios [cont]
        
        nombre = beneficiarios [0]
        cedula = beneficiarios [1]
        telefono = beneficiarios [2]
        
        print (nombre, '\n', cedula, '\n', telefono)
        cont += 1

#Funcion Filtro
def filtro_agenda (lista_beneficiarios):
    
    letra_filtro = str.upper (input ('Digite la letra por la que empiezan los beneficiarios: '))
    
    stop = len(lista_beneficiarios)
    cont = 0
    
    print ('Listado filtrado de beneficiarios:')
    
    while (cont < stop):
        beneficiarios = lista_beneficiarios[cont]
        nombre = beneficiarios [0]
        cedula = beneficiarios [1]
        telefono = beneficiarios [2]
        
        if (letra_filtro == nombre [0]):
            print (nombre, '\n', cedula, '\n', telefono)
            
        cont += 1
        
#Funcion Agregar
def agregar_lista (lista_beneficiarios):
    
    print ('Digite la información del beneficiario a agregar: ')
    nombre = str.title(input ())
    cedula = int(input())
    telefono = int (input())
    
    print ('El beneficiario ha sido agregado')
    
    beneficiarios = [nombre, cedula, telefono]
    
    lista_beneficiarios.append (beneficiarios)
    
    
#Funcion Buscar
def buscar_agenda (lista_beneficiarios):
    
    nombre_completo = str.title (input ('Digite el nombre y apellido del beneficiario a buscar:''\n'))
    
    stop =  len (lista_beneficiarios)
    cont = 0
    
    while (cont < stop):
        beneficiario = lista_beneficiarios[cont]
        nombre = beneficiario[0]
        cedula = beneficiario[1]
        telefono = beneficiario[2]
        
        if (nombre_completo == nombre):
            print (nombre, '\n', cedula, '\n', telefono)
        
        cont += 1

#Funcion Borrar
def borrar_beneficiario (lista_beneficiarios):
    
    stop = len (lista_beneficiarios)
    cont = 0
    
    cedula_borrar = int(input ('Digite la cedula del beneficiario a borrar:''\n'))
    
    while (cont < stop):
        beneficiario = lista_beneficiarios [cont]
        cedula = beneficiario [1]
        
        if (cedula == cedula_borrar):
            lista_beneficiarios.pop (cont)
            print ('El usuario ha sido eliminado del listado')
        cont += 1

lista_beneficiarios = []

repetir_menu = True
while (repetir_menu == True):
    print ('Menu Principal')
    print ('1. Ver listado')
    print ('2. Ver listado filtrado')
    print ('3. Agregar beneficiario')
    print ('4. Buscar beneficiario')
    print ('5. Borrar beneficiario')
    print ('6. Salir')
    
    opcion_menu = int(input())
    
    if (opcion_menu == 1):
        imprimir_agenda (lista_beneficiarios)
    elif (opcion_menu == 2):
        filtro_agenda(lista_beneficiarios)
    elif (opcion_menu == 3):
        agregar_lista (lista_beneficiarios)
    elif (opcion_menu == 4):
        buscar_agenda (lista_beneficiarios)
    elif (opcion_menu == 5):
        borrar_beneficiario (lista_beneficiarios)
    elif (opcion_menu == 6):
        print ('Hasta pronto')
        break
    else:
        print ('Opcion no valida')
