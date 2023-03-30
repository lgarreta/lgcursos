def Verlistado (listaEstudiantes):
    N = len (listaEstudiantes)
    i = 0
    while (i < N):
        estudiante = listaEstudiantes [i]
        nombre   = estudiante [0]
        cedula   = estudiante [1]
        telefono = estudiante [2]
        print (nombre)
        print (cedula)
        print (telefono)
        i+=1
    print ("Listado de beneficiarios", listaEstudiantes)

def VerListadofiltrado (listaEstudiantes):
    archivo = open ("agenda.txt", "w")
    N = len (listaEstudiantes)
    i = 0
    while (i < N):
        estudiante = listaEstudiantes [i]
        nombre   = estudiante [0]
        cedula   = estudiante [1]
        telefono = str (estudiante [2])
        archivo.write (nombre)
        archivo.write ("\n")
        archivo.write (cedula)
        archivo.write ("\n")
        archivo.write (telefono)
        archivo.write ("\n")
        i+=1
    archivo.close ()
    print (VerListadofiltrado)
    
def AgregarBeneficiario (listaEstudiantes):
    print ("Digite la información del beneficiario a agregar:")
    nombre     = input ("")
    cedula     = input ("")
    telefono   = float (input ())    
    estudiante = [nombre, cedula, telefono]
    listaEstudiantes.append (estudiante)
    print ("El beneficiario ha sido agregado")
        
def BuscarBeneficiario (listaEstudiantes):
    buscarNombre = input ("Digite el nombre y apellido del beneficiario a buscar:")
    N = len (listaEstudiantes)
    i = 0
    VerListadofiltrado = []
    while (i < N):
        estudiante = listaEstudiantes [i]
        nombre = estudiante [0]
        cedula = estudiante [1]
        telefono   = estudiante [2]
        if (nombre [0] == buscarNombre):
            listaEstudiantes.append (estudiante)            
    i += 1
    print ("BuscarBeneficiario")
    
def BorrarBeneficiario ():
    cedulaBorrar = input ("Digite la cedula del beneficiario a borrar" + "\n")
    listaEstudiantesNueva = []
    while (i < N):
        cedula = cedulaBorrar
        if (cedulaBorrar == cedula):
            None
        else:
            listaEstudiantesNueva.append (usuario)
    
        listaUsuarios = listaEstudiantesNueva
    print ("El usuario ha sido eliminado del listado")
    
listaEstudiantes = []

while (True):
    print ("0. Ver listado")
    print ("1. Ver Listado filtrado")
    print ("2. Agregar beneficiario")
    print ("3. Buscar beneficiario")
    print ("4. Borrar beneficiario")
    print ("5. Salir")
    print ()
    opcion = int (input ("Ingrese la opción"))
       
    if (opcion==1):
        Verlistado (listaEstudiantes)
    elif (opcion==2):
         VerListadofiltrado (listaEstudiantes)
    elif (opcion==3):
        AgregarBeneficiario (listaEstudiantes)
    elif (opcion==5):
        BuscarBeneficiario (listaEstudiantesNueva)
    elif (opcion==4):
        BorrarBeneficiario (listaEstudiantesNueva)
    elif (opcion==5):
        break
    else:
        print ("Hasta pronto")
    print ()
    
print ("Hasta pronto")
