#Entradas - input
tempMin = 1 
tempMax = 1
#Salidas -
conteoDias = 0 #Conteo de dias que duro la salida de campo
conteoDiasError = 0 #conteo de dias error actualizar en uno
conteoDiasOk = 0 #conteo de dias sin error

sumaTempMax = 0
sumaTempMin = 0

tempAmbosError = 0 #conteo de dias error ambos actualizar en uno
tempMinError = 0 #conteo de cuantos dias errores minima < 5
tempMaxError = 0 #conteo de cuantos dias errores maxima > 35

tempMinOk = 0
tempMaxOk = 0

mediaMinOk = 0 #temp media minima sin errores (0, -) < 5 and >35 
mediaMaxOk = 0 #temp media maxima sin errores (-, 0) < 5 and >35

totalPorcentaje = 0

#totalPorcentaje = (tempErrorAmbos / conteoDias)*100

#


while (True):
    tempMax = int(input("Temperatura máxima del día: "))
    tempMin = int(input("Temperatura minima del día: "))
    
    if (tempMin==0 and tempMax==0):
        break
    
    #contador dias
    
    conteoDias = conteoDias + 1
    
    #conteo minimas y maximas buenas
    
    if (tempMin >= 5 and tempMax <= 35):
        conteoDiasOk += 1
        sumaTempMin = sumaTempMin + tempMin
        sumaTempMax = sumaTempMax + tempMax
        
    #conteo min ok y max error
    
    if (tempMin >= 5 and tempMax > 35):
        tempMaxError += 1
        tempMinOk += 1
        conteoDiasError += 1
        
    #conteo min error y max ok
    
    if (tempMin < 5 and tempMax <= 35):
        tempMinError += 1
        tempMaxOk += 1
        conteoDiasError += 1
    
    #conteo minimas y maximas error
        
    if (tempMin < 5 and tempMax > 35):
        tempAmbosError += 1
        conteoDiasError += 1

        
#Calculo media

mediaMinOk = sumaTempMin / conteoDiasOk
mediaMaxOk = sumaTempMax / conteoDiasOk

#total porcentaje

totalPorcentaje = (conteoDiasError / conteoDias)*100
    
#Salidas
print (conteoDias)      
print (conteoDiasError) 
print (tempMinError)    
print (tempMaxError)    
print (tempAmbosError)  
print (mediaMaxOk)      
print (mediaMinOk)      
print (totalPorcentaje) 



     

