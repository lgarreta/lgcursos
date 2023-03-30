
## Definicion de funciones

def anadir (agendaBeneficiados):
    
    encontro= False
    
    print ("Digite la información del beneficiario a agregar:")
    
    nombre = input ()
    cedula = int(input ())
    telefono = int(input ())    
         
    N = len (agendaBeneficiados)
    i = 0
    
    while (i < N):
        
        cedula1= agendaBeneficiados [i][1]
        if (cedula==cedula1):
            encontro=True
            break            
        i+=1
        
    if (encontro== True):
        print ("La cedula del usuario ya esta en la lista")
    
    if (encontro==False):
        beneficiado=[]    
        beneficiado = [nombre, cedula, telefono]
        agendaBeneficiados.append (beneficiado)
        print ("El beneficiario ha sido agregado")
    
def borrar (agendaBeneficiados):
    
    print ("Digite la cedula del beneficiario a borrar:")
    beneficiadoaborrar= int (input ())
    N = len (agendaBeneficiados)
    i = 0
    encontro= False 
    while (i < N):
        beneficiado= agendaBeneficiados [i]
        cedula= beneficiado  [1]
        if (cedula==beneficiadoaborrar):
            encontro=True
            agendaBeneficiados.pop (i)
            break
        i+=1
    if (encontro==True):
        print ("El usuario ha sido eliminado del listado")
    else:
        print ("El usuario no estaba en el listado")
    
def buscar (agendaBeneficiados):
                   
    i = 0
    N = len (agendaBeneficiados)
    c = input ("Digite el nombre y apellido del beneficiario a buscar:")
    
    while (i < N):
        beneficiado = agendaBeneficiados [i][0]
              
        if (beneficiado == c):
            print (agendaBeneficiados [i][0])
            print (agendaBeneficiados [i][1])
            print (agendaBeneficiados [i][2])
        i+=1
    

def buscarFiltrado (agendaBeneficiados):
        
    i = 0
    N = len (agendaBeneficiados)
    c = input ("Digite la letra por la que empiezan los beneficiarios:")
    print ("Listado filtrado de beneficiarios:")
   
    while (i < N):
        beneficiado = agendaBeneficiados [i][0]
                
        if (beneficiado [0]== c):
            print (agendaBeneficiados [i][0])
            print (agendaBeneficiados [i][1])
            print (agendaBeneficiados [i][2])
        i+=1
    
    
def veragenda (agendaBeneficiados):
    
    print ("Listado de beneficiarios")
    
    N = len (agendaBeneficiados)
    i = 0
    while (i < N):
        beneficiado = agendaBeneficiados [i]
        nombre = beneficiado [0]
        cedula = beneficiado [1]
        telefono = beneficiado [2]
        print (nombre)           
        print (cedula)           
        print (telefono)        
        i+=1  

## Programa

agendaBeneficiados = []
sel=0

while (True):
    print ("Menu Principal")
    print ("1. Ver listado")
    print ("2. Ver listado filtrado")
    print ("3. Agregar beneficiario")
    print ("4. Buscar beneficiario")
    print ("5. Borrar beneficiario")
    print ("6. Salir")
    sel=int(input ())
    if (sel==1):
        veragenda (agendaBeneficiados)
    if (sel==2):
        buscarFiltrado (agendaBeneficiados)
    if (sel==3):
        anadir (agendaBeneficiados)
    if (sel==4):
        buscar (agendaBeneficiados)
    if (sel==5):
        borrar (agendaBeneficiados)
    if (sel==6):
        break
    if (sel!=1 and sel!=2 and sel!=3 and sel!=4 and sel!=5 and sel!=6):
        print ("Seleccion no valida")
    
print ("Hasta pronto")




    










