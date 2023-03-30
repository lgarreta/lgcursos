cantidadDias = 0
cantidadDiasError = 0
cantidadMaximas = 0
cantidadMinimas = 0
maximaErrada = 0
minimaErrada = 0
sumaMaximas = 0
sumaMinimas = 0
errorAmbas = 0
mediaMaxima = 0
mediaMinima = 0
porcentajeError = 0

temperaturaMaxima = float(input())
temperaturaMinima = float(input())

while (temperaturaMaxima != 0 and temperaturaMinima != 0):
    cantidadDias += 1
    
    if temperaturaMaxima < 5 or temperaturaMaxima > 35 or temperaturaMinima < 5 or temperaturaMinima > 35:
        cantidadDiasError = cantidadDiasError + 1
        if (temperaturaMaxima < 5 or temperaturaMaxima > 35) and (temperaturaMinima < 5 or temperaturaMinima > 35):
            errorAmbas += 1
            maximaErrada -= 1
            minimaErrada += 1
        if temperaturaMaxima < 5 or temperaturaMaxima > 35:
            maximaErrada += 1
    else:
        cantidadMinimas += 1
        sumaMinimas += temperaturaMinima
        
    if temperaturaMaxima >= 5 and temperaturaMaxima <= 35:
        cantidadMaximas += 1
        sumaMaximas += temperaturaMaxima
        
    temperaturaMaxima = float(input())
    temperaturaMinima = float(input())

if cantidadMaximas != 0:
    mediaMaxima = sumaMaximas/cantidadMaximas 

if cantidadMinimas != 0: 
    mediaMinima = sumaMinimas/cantidadMinimas
    
if cantidadDias != 0:
    porcentajeError = (cantidadDiasError*100)/cantidadDias 


print(cantidadDias)
print(cantidadDiasError)
print(minimaErrada)
print(maximaErrada)
print(errorAmbas)
print(mediaMaxima)
print(mediaMinima)
print(porcentajeError)