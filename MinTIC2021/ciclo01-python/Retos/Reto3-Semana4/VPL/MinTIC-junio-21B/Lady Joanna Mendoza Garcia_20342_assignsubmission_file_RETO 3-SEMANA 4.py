#Reto 3 semana 4
temperaturaMax=0
temperaturaMin=0
contadordias=0
totalDias_Error=0
totalDiasValidos=0
contadorBajas=0
contadorAltas=0
contadorAmbos=0
altasValidas=0
bajasValidas=0



while (True):
      
    temperaturaMax=float(input("Temperatura Maxima: "))
    temperaturaMin=float(input(" Temperatura Minima: "))
    
    contadordias=contadordias +1
    
                                 
    if (temperaturaMax >35):
        contadorAltas= contadorAltas +1
    if (temperaturaMin <5):
        contadorBajas= contadorBajas +1
        
    if (temperaturaMax >35 or temperaturaMin<5):
        totalDias_Error=totalDias_Error + 1
        
               
        if (temperaturaMax >35 and temperaturaMin<5):
            contadorAmbos= contadorAmbos +1
            
                
    if(temperaturaMax<=35 and temperaturaMin>=5):
        altasValidas= altasValidas + temperaturaMax
         
    if(temperaturaMin>=5 and temperaturaMax<=35):
        bajasValidas= bajasValidas + temperaturaMin
        
    if(temperaturaMax<=35 and temperaturaMin>=5):
        totalDiasValidos+=1
        
    if (temperaturaMax==0 and temperaturaMin==0):
        contadordias=contadordias-1
        contadorBajas= contadorBajas-1
        totalDias_Error=totalDias_Error-1
        break

contadorAltas=contadorAltas-contadorAmbos
contadorBajas=contadorBajas-contadorAmbos   
mediamax=altasValidas/totalDiasValidos
mediamin=bajasValidas/totalDiasValidos
porcentaje=(totalDias_Error*100)/contadordias
    
  
print (contadordias)
print(totalDias_Error)
print (contadorBajas)
print (contadorAltas)
print (contadorAmbos)
print (mediamax)
print (mediamin)
print (porcentaje)
