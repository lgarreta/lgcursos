# Codigo del programa ejecutable, doc, excel, imagen, sonido, video
programa = "addfdf.?.dflkjkj$..dfdfd...dfss¿?$xxyTUzO!=rtrtrt.hghghhh"

# Base de datos:
listaVirus = ["xxyyzz", "xrxryy", "ppeeaa"]
listaVirus.append ("xxyTzz")
listaVirus.append ("xxyTzO")

patron = "xxy?z?"   # Expresion Regular

# Scanear (examinar, revisar)

i = 0
n = len (programa)

while (i < n):
    inicio = i
    final  = i + 6
    
    secuencia = programa [inicio:final]
    
    for virus in listaVirus:
        if (virus==secuencia):
            print ("Su programa contiene un virus.")
            break
        #
    #
    i += 1
#