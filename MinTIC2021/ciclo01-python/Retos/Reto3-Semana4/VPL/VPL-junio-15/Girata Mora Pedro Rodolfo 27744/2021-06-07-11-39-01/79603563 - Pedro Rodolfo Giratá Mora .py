respuesta          = "Si"

acumuladortempMax       =  0
contempMax              =  0
acumuladortempMaxbuenas =  0
contadortempMaxbuenas   =  0

acumuladortempMin       =  0
contempMin              =  0
acumuladortempMinbuenas =  0
contadortempMinbuenas   =  0

acumuladorMinMax        =  0
contadorMinMax          =  0

contadorDias            =  0
contadorDiasError       =  0

conteoErrorMinMax       =  0

while (str.upper (respuesta)=="SI"):
    
    tempMax       = int (input("Temperatura Máxima fué:   ", ))
    tempMin       = int (input("Temperatura Mínima fué:   ", ))
    
    if   (tempMin == 0 and tempMax == 0):
          break  
    
    elif (tempMin <5 or tempMax >35):
          conteoErrorMinMax +=1      
          
    if   (tempMin <5 and tempMax >35):
           contadorMinMax +=1
    
    elif  (tempMin  <5):
          acumuladortempMin  = acumuladortempMin + tempMin
          contempMin += 1  
       
    elif (tempMax >35):
          acumuladortempMax  = contempMin + tempMax
          contempMax += 1
    else:
          acumuladortempMaxbuenas =   acumuladortempMaxbuenas + tempMax
          contadortempMaxbuenas   += 1
          acumuladortempMinbuenas =   acumuladortempMinbuenas + tempMin
          contadortempMinbuenas   += 1
   
    contadorDias   += 1
#

mediasMaximas        = acumuladortempMaxbuenas  / contadortempMaxbuenas
mediasMinimas        = acumuladortempMinbuenas / contadortempMinbuenas       
acumuladortempMax    = contadorMinMax
porcentDiasError     = 100* conteoErrorMinMax / contadorDias

print   ("Contador Dias                           :  ", contadorDias,)
print   ("Dias     Error                          :  ", conteoErrorMinMax)
print   ("Contador Mínimas                        :  ", contempMin)
print   ("Contador Máximas                        :  ", contempMax)
print   ("Contador Ambos                          :  ", contadorMinMax)
print   ("Media    Máximas                        :  ", mediasMaximas)
print   ("Media    Mínimas                        :  ", mediasMinimas )
print   ("porcentaje Dias Error                   :  ", porcentDiasError)
