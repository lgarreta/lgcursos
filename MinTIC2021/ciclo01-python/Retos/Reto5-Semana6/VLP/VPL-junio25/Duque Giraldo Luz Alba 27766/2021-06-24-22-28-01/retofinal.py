# Generar una  agenda con  los  datos  de  nombre  y  apellido,  número  de  cédula  y  el  número  celular  de  todos  los beneficiarios del proyecto,
# agenda  deberá  ser  almacenada  en  un  archivo  de  texto  en  el  directorio  activo  con  el nombre  agenda.txt. 
#Cada  beneficiario  ocupará  tres  líneas  en  el  archivo,  una  por  cada  campo (nombre  y  apellido,  cedula,  celular).
# ENTRADAS
# • Crear el  archivo  agenda.txt ingreso de datos  por teclado  (min 10 usarios).
# PROCESO
# • Buscar en el archivo el número celular de un usuario, dados nombre y apellido.
# • Añadir un nuevo usuario en la agenda.txt, al final del archivo. 
    # No debe haber cédulas repetidas.
# • Borrar usuario la agenda.txt dado su número de cédula.
# • Por funciones:
    # Buscar
    # Añadir
    # Borrar  
# SALIDAS
# • Mostrar listado completo de los beneficiarios.
# • Mostrar listado de los beneficiarios con nombre empieza por una letra determinada.
# • Menú con las diferentes opcionessolicitadas para que el usuario pueda decidir qué proceso desea realizar.
# ----- Libs -----
import os
from pathlib import Path
import re
# ----- Funciones -----
# Print Menu
def print_menu():
    opcion = input(
"""\n\n---------------------------------------------------------
                      Menú Principal 
---------------------------------------------------------
        
        1.  Añadir un beneficiario.
        2.  Buscar el Número celular de un beneficiario.
        3.  Borrar un beneficiario dado su número de cédula.
        4.  Mostrar listado completo de beneficiacios.
        5.  Mostrar listado de beneficiarios cuyo nombre empieza por una letra determinada.


        0.  Salir del programa.

---------------------------------------------------------
    Elija una opción: """)
    while True:
        if opcion in ['0','1','2','3','4','5']:
            return opcion
        else:
            print(f"\n{opcion} No es una opción valida, intentelo de nuevo\n")
        opcion = input("Elija una opción[1-5]: ")

def is_number(string):
    if ',' in string:
        string=string.replace(",", ".")
    if '.' in string: 
        try:
            float(string)
            return True
        except ValueError:
            return False
    else:
        try:
            int(string)
            return True
        except ValueError:
            return False

def clear(): 
    os.system('cls')
    
def print_menu_Attempt ():
    
    menuTuple = ("Añadir un beneficiario",
    "Buscar un beneficiario",
    "Borrar un beneficiario",
    "Mostrar listado completo de beneficiacios",
    "Mostrar listado de beneficiarios cuyo nombre empieza por una letra determinada.",
    "Salir del programa.")
    keyWordsDic={'1':4, 'Manzana':0.8, 'Pera':0.85, 'Naranja':0.7}
    print(
    """\n\n---------------------------------------------------------
                              Menú Principal 
    ---------------------------------------------------------\n\n""")
    idx=1
    for option in menuTuple:
        print(f"{idx}.  {option}")
        idx += 1
    print("""---------------------------------------------------------
    Introdusca el número de la operación a realizar.
    
    """)
    ans=input("Número de la operación: ")


def fileExists(myFilePath):
    try:
        if Path(myFilePath).exists():
            return True 
        else:
            return False 
    except Exception as ex:
        print(ex)    

def str_finder(myFilePath,strToFind,print_out_result=0):
    if fileExists(myFilePath):
        try:
            with open(myFilePath) as f:
                for l_num, line in enumerate(f):
                    if strToFind == line.strip():
                        if print_out_result==1:print("Coincidencias encontrada\n")
                        return l_num
                if print_out_result==1:print("No existen Coincidencias\n")
                return None
        except Exception as ex:
            print(ex+" Error en str_finder")

def confirm_f(message):
    while True:
        ans = input(message)
        ans=ans.upper()
        if ans == 'S':
            return True
        elif ans == 'N':
            print("Intententelo de nuevo\n")
            return False
        else:
            print(f"{ans} No es una opción valida.")
            print("Intententelo de nuevo.\n")

def creatFile(myFilePath):
    currentDirList = myFilePath.split('\\')
    currentDir='\\'.join(currentDirList[1:len(currentDirList)-1])
    try:
        if Path(myFilePath).exists(): 
            if confirm_f(f'El archivo {currentDirList[-1]} ya existe.\nEsta sguro que desea sobre escribirlo?[s/n]: '):
                f = open(myFilePath,'w', encoding = 'utf-8')
                print(f"Se ha sobre escrito el archivo {currentDirList[-1]}")
            else:
                f = open(myFilePath,'r', encoding = 'utf-8')
        else:
            f = open(myFilePath,'w', encoding = 'utf-8' )
            print(f"Se creo el archivo '{myFileName}' en {currentDir}.")
    finally:
        f.close()

def addUser(myFilePath):
    userName = input('Por favor ingrese el nombre completo del benecifiario: ')
    while True:
        userCedula = input('Por favor ingrese el No. de cedula del benecifiario (sin puntos o comas): ')
        if is_number(userCedula):
            if str_finder(myFilePath,userCedula) == None:
                break
            else:
                print(f"ERROR: El Numero de cedula {userCedula} ya esta registrado.\n")
                if not(confirm_f("Quiere intentarlo nuevamente? [s/n]:")):
                    return -1            
        else:
            print('El Numero ingresado no es valido.\nIntentelo denuevo.')
    while True:
        userCelular = input('Por favor ingrese el No. de celular del benecifiario (sin espacios o -): ')
        if is_number(userCelular):
            break
        else:
            print('El Numero ingresado no es valido.\nIntentelo denuevo.')
   
    if fileExists(myFilePath): 
        try:
            f = open(myFilePath,'a', encoding = 'utf-8')
            f.write(f"{userName}\n{userCedula}\n{userCelular}\n")
        finally:
            f.close()
    else:
        if confirm_f("El archivo NO existe. Desea crearlo? [s/n]: "):
            creatFile(myFilePath)
            try:
                f = open(myFilePath,'a', encoding = 'utf-8')
                f.write(f"{userName}\n{userCedula}\n{userCelular}\n")
            finally:
                f.close()
        else:
            return -1
    return 0

def serchUserCell(myFilePath):
    userName = input("Por favor ingrese el nombre completo del beneficiario para el cual desea consultar el No. celular: ")
    foundInLine = str_finder(myFilePath,userName,1)

    if foundInLine != None: 
        lines_to_print = foundInLine + 2  
        try:
            with open(myFilePath) as f:
                for index, line in enumerate(f):
                    if index == lines_to_print:
                        print(f"El numero celular del usuario {userName} es: {line}")
                        return 0
        except Exception as ex:
            print(ex)
    return -1
        
def deleteUser(myFilePath):
    userName = input("Por favor ingrese el número de cedula del beneficiario que desea borrar: ")
    foundInLine = str_finder(myFilePath,userName,1)
    if foundInLine != None:  
        overwriteLineStart = foundInLine -1  
        try:
            with open(myFilePath,'r') as f:
                line = f.readline()
                i=0
                data_minus_delitedUser = ""
                while line:
                    if i != overwriteLineStart:
                        data_minus_delitedUser = data_minus_delitedUser + line
                        line = f.readline()
                        i+=1    
                    else:
                        line = f.readline()
                        line = f.readline()
                        line = f.readline()
                        i+=1  
            write_file = open(myFilePath, "w")
            write_file.write(data_minus_delitedUser)
            write_file.close()
            return 0
        except Exception as ex:
                print(ex)
    return -1

def printAllUsers(myFilePath):
    if fileExists(myFilePath):
        try:
            f = open(myFilePath,'r', encoding = 'utf-8')
            num_lines = sum(1 for line in f)
            if num_lines>0:
                print("\n--------------------- AGENDA ---------------------")
                print(f.read())
                print("\n---------------------------------------------------------\n")
            else:
                print("\n--------------------- AGENDA ---------------------")
                print("Agenda esta vacía")
                print("\n---------------------------------------------------------\n")
        finally:
            f.close()
    else:
        if confirm_f("El archivo NO existe. Desea crearlo? [s/n]: "):
            creatFile(myFilePath)
        else:
            return -1
    return 0

def printUsersByLtt(myFilePath):
    serchLtt = input("Por favor ingrese la letra con la cual desea realizar la busqueda: ")
    what2look4 = serchLtt[0]
    what2look4=what2look4.upper()+what2look4.lower() 
    pattern = re.compile('^[{}]'.format(what2look4))
    lineMatches=[]
    with open(myFilePath) as f:
        for n,line in enumerate(f):
            matches=pattern.search(line)
            if matches:
                lineMatches.append(n)
        if len(lineMatches)>0:
            print("---------------------------------------------------------\n")
            print(f"Beneficiarios cuyo nombre comienza por la letra {serchLtt}:\n")
            newLineMtches = list(map(lambda x : [x,x+1,x+2], lineMatches))  
            newLineMtches=sum(newLineMtches, []) 
            f.seek(0,0)
            for i,thisLine in enumerate(f):
                if i in newLineMtches:
                    print(thisLine,end='')
            print("\n---------------------------------------------------------")
            return 0
        else:
            print(f"No se registran beneficiarios cuyos nombres comiencen con la letra {serchLtt}")

clear()
currentDir=os.path.dirname(__file__)
myFileName = 'agenda'
myExtension = '.txt'
myFilePath=currentDir+"\\"+myFileName+myExtension
if not(fileExists(myFilePath)):
    creatFile(myFilePath)
clear()
ans = True
while ans != False:
    ans = print_menu()
    if ans == '1':
        if addUser(myFilePath)==0:
            input("Operacion completada con exito\nPresione enter para continua: ")
    if ans == '2':
        if serchUserCell(myFilePath)==0:
            input("Operacion completada con exito\nPresione enter para continua: ")
    if ans == '3':
        if deleteUser(myFilePath)==0:
            input("Operacion completada con exito\nPresione enter para continua: ")
    if ans == '4':
        if printAllUsers(myFilePath)==0:
            input("Operacion completada con exito\nPresione enter para continua: ")
    if ans == '5':
        if  printUsersByLtt(myFilePath)==0:
            input("Operacion completada con exito\nPresione enter para continua: ")
    if ans == '0':
        if confirm_f('Esta seguro que desea salir? [s/n]: '):
            ans = False
print("""\n\n---------------------------------------------------------
                      Fin del Programa 
---------------------------------------------------------\n\n""")
        









