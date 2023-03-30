# Entradas

tempMin = 0
tempMax = 0

# Variables

numDias = 0
numDiaError5 = 0
numDError35 = 0
numDiasCor = 0
numdiaserrortot = 0
totalMinCor = 0
totalMaxCor = 0
mediaTempMinCor = 0
mediaTempMaxCor = 0
Porcentaje_Dias_Error = 0
conteoMinMax = 0

while (True):
    tempMax = float (input("Ingrese temperatura maxima: "))
    tempMin = float (input("Ingrese temperatura minima: "))
    if ((tempMin == 0) and (tempMax == 0)):
        break
    #
    if ((tempMin >= 5 and tempMin <= 35) and (tempMax <= 35)):
        numDiasCor += 1
    #    
    if (tempMin < 5 and tempMax > 35):
        conteoMinMax +=1
        numDiaError5 -= 1
        numDError35 -= 1
        numdiaserrortot += 1
    #
    if (tempMax > 35):
        numDError35 += 1
    #
    if ((tempMin < 5) and (tempMin != 0)):
        numDiaError5 += 1
    #elif (tempMin > 35 ):
     #   numDiaError5 -= 1
    
    numDias += 1        
    
    if ((tempMin >= 5 and tempMin <= 35) and (tempMax <= 35)):
        totalMinCor = totalMinCor + tempMin
        totalMaxCor = totalMaxCor + tempMax
                
numdiaserrortot = numdiaserrortot + numDiaError5 + numDError35 ## obtiene el numero total de dias de error de ambas temperaturas.
#
if (numDias != 0):
    Porcentaje_Dias_Error  = (numdiaserrortot * 100)/(numDias)
#
if (numDiasCor != 0):
    mediaTempMinCor = ((totalMinCor)/(numDiasCor ))
    mediaTempMaxCor = ((totalMaxCor)/(numDiasCor ))
#
print (numDias)
print (numdiaserrortot)
print (numDiaError5)
print (numDError35)
print (conteoMinMax)
print (mediaTempMaxCor)
print (mediaTempMinCor)
print (Porcentaje_Dias_Error)
 
    