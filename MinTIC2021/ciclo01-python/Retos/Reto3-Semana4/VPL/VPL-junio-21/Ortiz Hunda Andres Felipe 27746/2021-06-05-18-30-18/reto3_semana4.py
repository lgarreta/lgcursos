# Entradas

TempMin = 0
TempMax = 0

# Variables

NumDias = 0
NumDiaError5 = 0
NumDError35 = 0
NumDiasCor = 0
Numdiaserrortot = 0
TotalMinCor = 0
TotalMaxCor = 0
MediaTempMinCor = 0
MediaTempMaxCor = 0
Porcentaje_Dias_Error = 0
ConteoMinMax = 0

while (True):
    TempMax = float (input("Ingrese temperatura maxima: "))
    TempMin = float (input("Ingrese temperatura minima: "))
    if ((TempMin == 0) and (TempMax == 0)):
        break
    #
    if ((TempMin >= 5 and TempMin <= 35) and (TempMax <= 35)):
        NumDiasCor += 1
    #    
    if (TempMin < 5 and TempMax > 35):
        ConteoMinMax +=1
        NumDiaError5 -= 1
        NumDError35 -= 1
        Numdiaserrortot += 1
    #
    if (TempMax > 35):
        NumDError35 += 1
    #
    if ((TempMin < 5) and (TempMin != 0)):
        NumDiaError5 += 1
    #elif (tempMin > 35 ):
     #   numDiaError5 -= 1
    
    NumDias += 1        
    
    if ((TempMin >= 5 and TempMin <= 35) and (TempMax <= 35)):
        TotalMinCor = TotalMinCor + TempMin
        TotalMaxCor = TotalMaxCor + TempMax
                
Numdiaserrortot = Numdiaserrortot + NumDiaError5 + NumDError35 ## obtiene el numero total de dias de error de ambas temperaturas.
#
if (NumDias != 0):
    Porcentaje_Dias_Error  = (Numdiaserrortot * 100)/(NumDias)
#
if (NumDiasCor != 0):
    MediaTempMinCor = ((TotalMinCor)/(NumDiasCor ))
    MediaTempMaxCor = ((TotalMaxCor)/(NumDiasCor ))
#
print (NumDias)
print (Numdiaserrortot)
print (NumDiaError5)
print (NumDError35)
print (ConteoMinMax)
print (MediaTempMaxCor)
print (MediaTempMinCor)
print (Porcentaje_Dias_Error)
 
    