# ENTRADAS
tempMax = 0
tempMin = 0

# SALIDAS
totalDias = 0
totalDiasError = 0
diasErrorBajas = 0
diasErrorAltas = 0
diasErrorAmbas = 0
tempBajas = 0
tempAltas = 0
tempBajasAltas = 0
totalTempMediaMinima = 0
totalTempMediaMaxima = 0 
contadorTempMediaMinima = 0
tempMediaMaxima = 0
contadorTempMediaMaxima = 0

while (True):
    tempMax = int (input ("temp Maxima: "))
    tempMin = int (input ("temp Minima: "))
    #tempMax = int (input ())
    #tempMin = int (input ())
    if (tempMin==0 and tempMax==0):
        break
    totalDias = 1 + totalDias
    
    if (tempMin < 5 and tempMax > 35):
        tempBajas      += 1 
        tempAltas      += 1 
        #diasErrorBajas += 1 
        #diasErrorAltas += 1 
        diasErrorAmbas += 1 
        totalDiasError +=1
    elif (tempMin < 5):
        tempBajas      += 1 
        diasErrorBajas += 1 
        totalDiasError +=1
    elif (tempMax > 35):
        tempAltas      += 1 
        diasErrorAltas += 1 
        totalDiasError +=1
    else:
        totalTempMediaMinima    = tempMin + totalTempMediaMinima
        contadorTempMediaMinima = 1 + contadorTempMediaMinima
        totalTempMediaMaxima    = tempMax + totalTempMediaMaxima
        contadorTempMediaMaxima = 1 + contadorTempMediaMaxima
#
print (totalDias)
print (totalDiasError)
print (diasErrorBajas)
print (diasErrorAltas)
print (diasErrorAmbas)

tempMediaMinima = totalTempMediaMinima / contadorTempMediaMinima
tempMediaMaxima = totalTempMediaMaxima / contadorTempMediaMinima
print (tempMediaMaxima)
porcentajeDiasErrores = totalDiasError/totalDias * 100
print (tempMediaMinima)
tempMediaMaxima = totalTempMediaMaxima / contadorTempMediaMaxima
print (porcentajeDiasErrores)

#print("")
#print ("Total dias: ", totalDias)
#print ("Total dias error: ", totalDiasError)
#print ("Total dias error bajas temp: ", diasErrorBajas)
#print ("Total dias error altas temp: ", diasErrorAltas)
#print ("Total dias error ambas: ", diasErrorAmbas)
#
#tempMediaMinima = totalTempMediaMinima / contadorTempMediaMinima
#tempMediaMaxima = totalTempMediaMaxima / contadorTempMediaMinima
#print ("Temp media maxima: ", tempMediaMaxima)
#porcentajeDiasErrores = totalDiasError/totalDias * 100
#print ("Temp media minima: ", tempMediaMinima)
#tempMediaMaxima = totalTempMediaMaxima / contadorTempMediaMaxima


        
        
        
    
    

