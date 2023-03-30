
tempMin = 1 
tempMax = 1

conteoDias = 0 
conteoDiasError = 0 
conteoDiasOk = 0 

sumaTempMax = 0
sumaTempMin = 0

tempAmbosError = 0 
tempMinError = 0 
tempMaxError = 0 

tempMinOk = 0
tempMaxOk = 0

mediaMinOk = 0 
mediaMaxOk = 0 

totalPorcentaje = 0

while (True):
    tempMax = int(input())
    tempMin = int(input())
    
    if (tempMin==0 and tempMax==0):
        break
    
    conteoDias = conteoDias + 1
    
    # OK
    if (tempMin >= 5 and tempMax < 35):
        conteoDiasOk += 1
        sumaTempMin = sumaTempMin + tempMin
        sumaTempMax = sumaTempMax + tempMax
        

    # Max
    if (tempMin >= 5 and tempMax >= 35):
        tempMaxError += 1
        tempMinOk += 1
        conteoDiasError += 1
        

    # Min
    if (tempMin <= 5 and tempMax <= 35):
        tempMinError += 1
        tempMaxOk += 1
        conteoDiasError += 1
    

    
    if (tempMin < 5 and tempMax > 35):
        tempAmbosError += 1
        conteoDiasError += 1

        


mediaMinOk = sumaTempMin / conteoDiasOk
mediaMaxOk = sumaTempMax / conteoDiasOk



totalPorcentaje = (conteoDiasError / conteoDias)*100

print (conteoDias)      
print (conteoDiasError) 
print (tempMinError)    
print (tempMaxError)    
print (tempAmbosError)  
print (mediaMaxOk)      
print (mediaMinOk)      
print (totalPorcentaje) 



