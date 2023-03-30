lista= []

def ver_listado ():
    print ("Listado de beneficiarios ")
    for datos_benefisiario in lista:
        print (datos_benefisiario[0])
        print (datos_benefisiario[1])
        print (datos_benefisiario[2])
        
    
def ver_list_filtrado ():
    print ("Digite la letra por la que empiezan los beneficiarios: ")
    busqueda_por_letra= input("")
    print ("Listado filtrado de beneficiarios:")
    for beneficiario in lista:
        if (beneficiario[0][0])==busqueda_por_letra:
            print (beneficiario[0])
            print (beneficiario[1])
            print (beneficiario[2])
    
   
def agregar_beneficiario ():
    beneficiario = []
    print ("Digite la información del beneficiario a agregar: ")
    beneficiario.append(input(""))
    beneficiario.append(input(""))
    beneficiario.append(input(""))
    print ("El beneficiario ha sido agregado")
        
    return beneficiario

def buscar_beneficiario ():
    print ("Digite el nombre y apellido del beneficiario a buscar: ")
    busqueda_nombre_apellido= input("")
    for nombre_buscar in lista:
        if (nombre_buscar[0])==busqueda_nombre_apellido:
            print (nombre_buscar[0])
            print (nombre_buscar[1])
            print (nombre_buscar[2])
    
def borrar_beneficiario ():
    print ("Digite la cedula del beneficiario a borrar: ")
    borrar_b= input("")
    i=0
    
    for borrar_cedula in lista:
        if borrar_cedula[1]==borrar_b:
            lista.pop(i)
            print ("El usuario ha sido eliminado del listado")
            break
            
        i+=1
def guardarArchivo ():
    lista1 = open ("agenda.txt", "w") # Abrir el archivo
    
    for beneficiarios_guardar in lista:
        
        nombre= beneficiarios_guardar[0]
        cedula= beneficiarios_guardar[1]
        telefono= beneficiarios_guardar[2]
        
        lista1.write (nombre) #print (nombre)           # escribir en el archivo
        lista1.write ("\n")
        lista1.write (cedula) #print (codigo)           # 
        lista1.write ("\n")
        lista1.write (telefono)   #print (nota)
        lista1.write ("\n")
        
    #
    lista1.close () # Cierrar el archivo
    
## VARIABLES
# Estudiante : [Nombre, codigo, nota]
      
        
    
    
while (True):
    print ("Menu Principal")
    print ("1. Ver listado")
    print ("2. Ver listado filtrado")
    print ("3. Agregar beneficiario")
    print ("4. Buscar beneficiario")
    print ("5. Borrar beneficiario")
    print ("6. Salir")
    
    opcion= int (input(""))
    if (opcion==1):
        ver_listado ()
        
        
    elif (opcion ==2):
        ver_list_filtrado ()
        
        
    elif (opcion ==3):
        
        lista.append(agregar_beneficiario())
   
    elif (opcion ==4):
        buscar_beneficiario ()
    
    elif (opcion ==5):
        borrar_beneficiario ()
    
    elif (opcion ==6):
        print ("Hasta pronto")
        break
    else:
        print ("opcion  no valida")
   
    guardarArchivo ()
    
