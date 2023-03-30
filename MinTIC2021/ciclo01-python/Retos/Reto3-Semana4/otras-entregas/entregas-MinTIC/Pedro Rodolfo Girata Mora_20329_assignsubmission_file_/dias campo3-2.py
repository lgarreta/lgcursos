respuesta          = "Si"

acumuladortempMax  =  0
contempMax         =  0

acumuladortempMin  =  0
contempMin         =  0

acumuladorMinMax   =  0
contadorMinMax     =  0

contadorDias       =  0

conteoErrorMinMax  =  0

contadorDiaserror  =  0

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
  
                  

    contadorDias   += 1
#


mediaMaximas         = tempMax       
mediaMinimas         = tempMin 


mediaMinima          = contempMin  
mediaMaxima          = contempMax  
acumuladortempMax    = contadorMinMax
porcentDiasError     = 100* conteoErrorMinMax / contadorDias

print   ("Contador Dias                           :  ", contadorDias,)
print   ("Dias     Error                          :  ", conteoErrorMinMax)
print   ("Contador Mínimas                        :  ", mediaMinima)
print   ("Contador Máximas                        :  ", mediaMaxima)
print   ("Contador Ambos                          :  ", contadorMinMax)
print   ("Media Máximas                           :  ", mediaMaximas)
print   ("Media Mínimas                           :  ", mediaMinimas )
print   ("porcentaje Dias Error                   :  ", porcentDiasError)


