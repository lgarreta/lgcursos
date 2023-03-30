## Leer varios producto hasta que diga "no"

respuesta = "si"

totalGeneral = 0
totalUnidades = 0

while (respuesta=="si" or respuesta=="SI" or respuesta=="Si" or respuesta=="sI"):
#while (str.upper (respuesta)=="SI"):
    precio   = int ( input ("Precio del producto: ") )
    unidades = int ( input ("Cuantas unidades: ") )
    subtotal = precio * unidades
    print ("El subtotal es: ", subtotal)
    
    totalGeneral = totalGeneral + subtotal
    
    totalUnidades = totalUnidades + unidades
    
    respuesta = input ("Deseas continuar (si/no): ")
#

print ("Total de su compra es: ", totalGeneral)

print ("Total unidades es: ", totalUnidades)

print ("Gracias por su compra")