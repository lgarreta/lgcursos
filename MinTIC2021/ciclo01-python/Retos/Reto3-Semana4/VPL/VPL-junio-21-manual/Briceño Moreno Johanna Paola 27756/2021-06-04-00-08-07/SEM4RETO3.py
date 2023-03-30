tMin = 0 #Temperatura minima
tMax = 0 #Temperatura maxima

nD      = 0 # total // Numero de dias 
tDtEmin = 0 #Total de dias en temperaturas erroneas temperatura <5 // Contador_Min
tDtEmax = 0 #Total de dias en temperaturas erroneas temperatura >35 // Contador_Max
tDtE    = 0 #Total de dias con temperaturas con error                  //dias error
tDt2e   = 0 #total de dias con ambos errones en temperatura (min y max)// Contador_Ambos
PorDe   = 0 # Porcetaje de dias con errores en los dias reportados
nTtemp  = 0 #numero de total de dias con error (contador)
tMmax   = 0 #Temperatura media maxima //  dias si errores
tMmin   = 0 #Temperatura media minima//  dias si errores

conTMmax   = 0 # Contador Temperatura Media Maxima ( contar los dias buenos)
totalTMmax = 0 #Total de Temperatura Media Maxima ( temperatura de los dias buenos)
conTMmin   = 0 #Contador Temperatura Media Minimo ( contar los dias buenos)
totalTMmin = 0 #Total de Temperatura Media Minimo ( temperatura de los dias buenos)

while (True):
    tMax = int(input("Ingresar Temperatura Maxima:"))
    tMin = int(input("Ingresar Temperatura Minima:"))
    
    if (tMin == 0 and tMax == 0):
        break
    
    if (tMin < 5 and tMax > 35):
        nD = nD + 1;
        tDtE = tDtE + 1;
        tDt2e = tDt2e + 1;
    
    elif (tMin < 5):    
        tDtEmin = tDtEmin + 1;
        nD = nD + 1;
        tDtE = tDtE + 1;
        
      
    elif (tMax > 35):      
        tDtEmax = tDtEmax + 1;
        nD = nD + 1;
        tDtE = tDtE + 1;
        
    else:
        nD = nD + 1;
        tMmax = tMmax + 1
        tMmin = tMmin + 1
        conTMmax = conTMmax +1
        totalTMmax = totalTMmax + tMax
        conTMmin = conTMmin + 1
        totalTMmin = totalTMmin + tMin
#   
tMmax = totalTMmax/conTMmax
tMmin = totalTMmin/conTMmin
PorDe = (100*tDtE)/nD
#
print(nD)
print(tDtE) 
print(tDtEmin)
print(tDtEmax)
print(tDt2e)
print(tMmax)
print(tMmin)
print(PorDe)
