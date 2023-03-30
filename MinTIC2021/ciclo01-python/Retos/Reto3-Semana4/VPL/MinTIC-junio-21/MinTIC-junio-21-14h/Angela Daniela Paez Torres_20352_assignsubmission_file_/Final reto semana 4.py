# Ejercicio2:  (tem min) y altas (tem max)
# ENTRADAS:
temMin = 0
temMax = 0

# SALIDAS:
conteoDias       = 0 # Acumulador de numero de aviones
conteoMin        = 0   # Conteo de temp minimas (menor a 5 rev)
conteoMax        = 0   # Conteo de temp maximas (mayor a 35 rev)
conteoMinimasMaximas = 0   # Cuando ocurren al mismo tiempo
mediaMax = 0
mediaMin = 0

# VARIABLES
conteoBuenas = 0
 
while (True):
    # Lectura de entradas
    temMax = int (input())
    temMin = int (input())
    if  (temMin==0 and temMax == 0):
        break
    
# print (temMax)
# print (temMin)

    
    conteoDias = conteoDias + 1
    
    # Conteo minimas y maximas
    if (temMin >=5 and temMax <=35): #
        conteoBuenas +=1
        
    if (temMin < 5 and temMax > 35):
        conteoMinimasMaximas +=1
        
    if (temMin >=5 and temMax <=35):
        mediaMax = mediaMax + temMax #acumulador
        
    if (temMin >=5 and temMax <=35):
        mediaMin = mediaMin + temMin
        
    else:        
        if (temMin < 5):
            conteoMin +=1    ## conteoMinimas = conteoMinimas + 1 
        #
        if (temMax > 35):
            conteoMax +=1      ## conteoMaximas = conteoMaximas + 1
        #    
    
conteoMinimas = conteoMin - conteoMinimasMaximas
conteoMaximas = conteoMax - conteoMinimasMaximas
#
print (conteoDias)
diasError = conteoMinimas + conteoMaximas + conteoMinimasMaximas
print (diasError)
print (conteoMinimas)
print (conteoMaximas)
print (conteoMinimasMaximas)
#
print (mediaMax / conteoBuenas) 
print (mediaMin / conteoBuenas)

## Promedios
promedioDiasError = diasError * 100 / conteoDias
print (promedioDiasError)
