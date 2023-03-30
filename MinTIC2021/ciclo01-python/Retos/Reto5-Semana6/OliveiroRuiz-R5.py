#import os
import pickle


def SuSeleccion():
    correcto=False
    num=0
    while(not correcto):
        try:
            num = int(input("Elija un menu: "))
            correcto=True
        except ValueError:
            print('Error, Introduce un numero entre 1 y 6')
     
    return num

def VerListado(lineas):
    for k in range (0,len(lineas)):
      
         Reg= lineas[k][0] + " " + lineas[k][1]
         Reg2 =lineas[k][2]
         Reg3 =lineas[k][3]
         
         print (Reg)
         print (Reg2)
         print (Reg3) 
         print (" ")

    k += 1
    return
    
    #while(True):
        #lineas = lineas.read()
        #print(linea)
        #if not linea: 
            #break
        #Archivo.close()
        #return (linea)

def VerListFiltrado(lineas,letra):
        
     for i in range (0,len(lineas)):
         print (len(lineas))
         #print("lineas",lineas)
         StrLinea = " ".join(lineas[i])
         if((StrLinea[:].find(letra))== -1):
         #print ("R",R)
         #print("i",i)
             
             i += 1
             print("Usuario no encontrado")
         else:
             Filtrado=[]
             #Filtro = Filtrado.append(StrLinea)
             Filtro = Filtrado.append(lineas[i])
             return(Filtrado)
        
def VerListBeneficiario(lineas,palabra):  
    for j in range (0,len(lineas)):
         #print (len(lineas))
         #print("lineas",lineas)
        StrLinea = " ".join(lineas[j])
        if ((StrLinea[:].find(palabra)) ==-1):
         #print ("R",R)
            print("Usuario no encontrado")
            j += 1
        else:
             Usuario=[]
             #Beneficiario = Usuario.append(StrLinea)
             Beneficiario = Usuario.append(lineas[j])
             return (Usuario)
            
def BorrarUsuario(lineas,cedula):            
    #for m in range (0,len(lineas)):
         
         #StrLinea = " ".join(lineas[m])
         #if((StrLinea[:].find(cedula))== -1):
             
          #   m += 1
             
          #   print("Usuario no encontrado")
         #else:
             #Borrado=[]
             #fic=" "
            # Filtro = Borrado.append(StrLinea)
             #Filtro = Borrado.append(lineas[m])
             #lineas.pop(m)
             #ruta = "Agenda.txt"
             #fic = open("Agenda.txt", "w")
             #fic.writelines("\n" % s for s in lineas)
             #fic.close()
             
#-----------------------------------------------------
    lineas=[]
    Usuario=[]
    Filtrado=[]
    Registro=[]
    #Agenda=" "
    StrLinea=""
    m= 0
 
salir = False
opcion = 0

print ("    ")
print ("1. Ver listado")
print ("2. Ver listado filtrado")
print ("3. Agregar beneficiario ")
print ("4. Buscar beneficiario")
print ("5. Borrar beneficiario")
print ("6. Salir")
    
    #print ("Elige una opcion")
 
opcion = SuSeleccion()
 
if opcion == 1:
    print ("Listado de beneficiarios:")
    with open(r'Agenda.txt') as f:
        lineas = [linea.split() for linea in f]
        
        lineas.pop(0)
        x = len(lineas)
        lineas.pop(x-1)
        Listado = VerListado(lineas)
        
    #    print(Mensaje)
    
elif opcion == 2:
    print ("Digite la letra por la que empiezan los beneficiarios:")
    letra = input(str(" "))
    #with open(r'H:\UNIVERSIDAD DEL BOSQUE\SEMANA 6\Agenda.txt') as f:
    #f = open(r'Agenda.txt')
    #lineas = f.readlines()
    #Filtro = VerListFiltrado(lineas,letra)
    with open(r'Agenda.txt') as f:
        lineas = [linea.split() for linea in f]
        
        lineas.pop(0)
        x = len(lineas)
        lineas.pop(x-1)
        Filtrado = VerListFiltrado(lineas,letra)
        Salida= list(Filtrado)
        print (Salida[0][0],Salida[0][1])     #,Filtro[1])
        print (Salida[0][2])
        print (Salida[0][3])
        f.close()
        
elif opcion == 3:
    print("Digite la información del beneficiario a agregar:")
    Nombre_Apellido = input(str(" "))
    Cedula = input(str(" "))
    Celular = input(str(" "))
    #Espacio = "    "
    #with open(r"H\UNIVERSIDAD 3DEL BOSQUE\SEMANA 6\Agenda.txt",'a') as f:
    Agenda =open("Agenda.txt",'a') 
        #lineas = [linea.split() for linea in f]
    
    Agenda.write(Nombre_Apellido + ' ')
    Agenda.write(Cedula+ ' ')
    Agenda.write(Celular + " \n ")
    #Agenda.write(Espacio + "  ")
    #f.close()
    print("El beneficiario ha sido agregado al listado")
    
elif opcion == 4:
    print("Digite el nombre y apellido del beneficiario a buscar:")
    palabra = input(str(" "))
    #with open(r'H:\UNIVERSIDAD DEL BOSQUE\SEMANA 6\Agenda.txt') as f:
    with open(r'Agenda.txt') as f:    
        lineas = [linea.split() for linea in f]
        lineas.pop(0)
        y=len(lineas)
        lineas.pop(y-1)
        Usuario = VerListBeneficiario(lineas,palabra)
        Registro = list(Usuario)
        
        print(Registro[0][0],Registro[0][1])
        print(Registro[0][2])
        print(Registro[0][3])
    #f.close()
        
elif opcion == 5:
    print("Digite la cedula del beneficiario a borrar:")
    cedula=input(str(" "))
    Archivo = open(r'H:\UNIVERSIDAD DEL BOSQUE\SEMANA 6\Agenda.txt')
    with open(r'Agenda.txt') as f:    
        lineas = [linea.split() for linea in f]
        lineas.pop(0)
        y=len(lineas)
        lineas.pop(y-1)
        Borrado = BorrarUsuario(lineas,cedula)
        Borrado = list(Usuario)
        
elif opcion == 6:
    print ("Hasta pronto")
    salir = True
else:
    print ("Error, Introduce un numero entre 1 y 6")
 
print (" ")



