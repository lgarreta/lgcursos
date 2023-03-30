# entradas
tempeMax = 0
tempeMin = 0
# variables
sumaminimasbuenas = 0
sumamaximasbuenas = 0

# salidas
totaldias  = 0
totaldiaserror = 0
totaldiasbuenos = 0
conteoMinimas = 0
conteoMaximas = 0
conteoamboserrores = 0
conteoerroresMin = 0
conteoerroresMax = 0
mediamin = 0.0
mediamax = 0.0
porcentajerror = 0.0
# lectura de entradas
while (True):
    tempeMax = int (input("temperatura maxima: "))
    tempeMin = int (input("temperatura minima: "))
    if (tempeMin == 0 and tempeMax == 0):
        break
        
# total de dias    
    totaldias = totaldias + 1
# conteo ambos errores
    if (tempeMin < 5 and tempeMax > 35):
         conteoamboserrores +=1
# conteo errores de la minima temperatura        
    if (tempeMin < 5 and tempeMax <= 35):
        conteoerroresMin +=1
# conteo errores de la maxima temperatura        
    if (tempeMin >= 5 and tempeMax > 35):
        conteoerroresMax +=1
# total de dias con error
    if (tempeMin < 5 or tempeMax > 35):
        totaldiaserror +=1
    if (tempeMin >= 5 and tempeMax <= 35):
        sumaminimasbuenas += tempeMin
        sumamaximasbuenas += tempeMax

totaldiasbuenos = totaldias - totaldiaserror
mediamin = sumaminimasbuenas / totaldiasbuenos
mediamax = sumamaximasbuenas / totaldiasbuenos
porcentajerror = totaldiaserror * 100 / totaldias

#
print ("")
print (totaldias)
print (totaldiaserror)
print (conteoerroresMin)
print (conteoerroresMax)
print (conteoamboserrores)
print (mediamax)
print (mediamin)
print (porcentajerror)



    
