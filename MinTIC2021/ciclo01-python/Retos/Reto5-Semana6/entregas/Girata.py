def listado (listabeneficiarios):
    print ("---Listado de beneficiarios---")
    print ()
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
#____________________________________________#
def filtrado (listabeneficiarios):
    print ("---Listado filtrado de beneficiario---")
    print ("---Digite la letra por la que empiezan los beneficiarios---")
    print ()
    N = len (listabeneficiarios)
    i = 0
    while (i < N):
        beneficiario = listabeneficiarios [i]
        nombre = beneficiario [0]
        codigo = beneficiario [1]
        nota   = beneficiario [2]
        print (nombre)
        print (codigo)
        print (nota)
        i+=1   
#____________________________________________#
def agregar (listabeneficiarios):
    archivo = open ("agenda.txt", "w")
    N = len (listabeneficiarios)
    i = 0
    while (i < N):
        beneficiario = listabeneficiarios [i]
        nombre  = beneficiario [0]
        cedula  = beneficiario [1]
        celular = str (beneficiario [2])
        archivo.write (nombre)
        archivo.write ("\n")
        archivo.write (cedula)
        archivo.write ("\n")
        archivo.write (celular)
        archivo.write ("\n")
        i+=1

    archivo.close ()
#____________________________________________#

def adicionar (listabeneficiarios):
    print ("---Digite la información del beneficiario a agregar---")
    nombre  = input ("NOMBRE          : ")
    cedula  = input ("CEDULA          : ")
    celular = float (input ("CELULAR         : "))    
    beneficiario = [nombre, cedula, celular]
    listabeneficiarios.append (beneficiario)
    print ("---El beneficiario ha sido agregado---")
#____________________________________________#    
def borrar (listabeneficiarios):
    print ("---Digite la cedula del beneficiario a borrar---")
    
    print ("---El usuario ha sido eliminado del listado---")
#____________________________________________#    
def buscar (listabeneficiarios):
    listabeneficiarios = []
    i = 0
    N = len (listabeneficiarios)
    nombreMayusculas = input ("Digite el nombre y apellido del beneficiario a buscar: ")
    for beneficiario in listabeneficiarios:
        nombre   = beneficiario [0]
        cedula   = beneficiario [1]
        celular  = beneficiario [2]
        print (nombre)
        print (cedula)
        print (celular)
        i+=1
    else:
        print ("---No se encuentra el beneficiario en la agenda---")
#____________________________________________#     

listabeneficiarios = []
###Menu Principal##  
while (True):
    print ("-----Menu Principal------")
    print ("1. Ver listado ")
    print ("2. Ver listado filtrado. ")
    print ("3. Agregar beneficiario. ")
    print ("4. Buscar beneficiario. ")
    print ("5. Borrar beneficiario.  ")
    print ("-------------------------")
    print ("6. Salir")
    print ("-------------------------")
    opcion = int (input ("Ingrese la opción:   "))
    print ("-------------------------")
    print ()  
#____________________________________________#    
    if   (opcion==1):
          listado (listabeneficiarios)
    elif (opcion==2):
          agregar (listabeneficiarios)
    elif (opcion==3):
          adicionar (listabeneficiarios)
    elif (opcion==4):
          buscar (listabeneficiarios)
    elif (opcion==5):
          borrar(listabeneficiarios)
    elif (opcion==6):
          break
    else:
        print ("---Opción no valida---")
#____________________________________________#
print ()
print ("Hasta Pronto")
##Final Retofinal semana 6 y 7##
