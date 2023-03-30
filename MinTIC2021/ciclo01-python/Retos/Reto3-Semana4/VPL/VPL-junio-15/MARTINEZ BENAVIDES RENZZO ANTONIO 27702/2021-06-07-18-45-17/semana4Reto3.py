# Parámetros de entrada (Se deben respetar en este  orden):
temMax = 0
temMin = 0

#Inicializacion
contadorDias           = 0
diasError              = 0
contaMinError          = 0
contaMaxError          = 0
contaAmbosError        = 0
porcenDiasError        = 0
contaTempMediaMinCorr  = 0
contaTempMediaMaxCorr  = 0
totalTempMediasMinCorr = 0
totalTempMediasMaxCorr = 0
mediaMin               = 0
mediaMax               = 0

while (True):
    temMax = int(input("Temp Maxi: "))
    temMin = int(input("Temp Mini: "))
    if ((temMax == 0) and (temMin == 0)):
        break
    contadorDias = contadorDias + 1
    
    if ((temMax > 35) and (temMin < 5)):
        contaAmbosError +=1
        diasError       +=1
        
    elif(temMax > 35):
        contaMaxError +=1
        diasError     +=1
    
    elif(temMin < 5):
        contaMinError +=1
        diasError     +=1
    
    else:
        totalTempMediasMinCorr = temMin + totalTempMediasMinCorr
        contaTempMediaMinCorr  = 1 + contaTempMediaMinCorr
        totalTempMediasMaxCorr = temMax + totalTempMediasMaxCorr
        contaTempMediaMaxCorr  = 1 + contaTempMediaMaxCorr
        
        
        
       
porcenDiasError = (diasError * 100) / contadorDias    
mediaMin        = totalTempMediasMinCorr / contaTempMediaMinCorr
mediaMax        = totalTempMediasMaxCorr / contaTempMediaMaxCorr

# Parámetros de Salida  (Este Orden)

print(contadorDias)
print(diasError)
print(contaMinError)
print(contaMaxError)
print(contaAmbosError)
print(mediaMax)
print(mediaMin)
print(porcenDiasError)

