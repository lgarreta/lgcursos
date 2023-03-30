aculadorBienMax = 0
aculadorBienMin = 0

contadorDias = 0
contadorMin = 0
#conteoBienMin = 0
contadorMax = 0
#conteo_bien_max = 0
contadorAmbas = 0
conteoBienAmbas = 0
mediaMax = 0
mediaMin = 0
diasError = 0
porcentajeDiasError = 0

while True:
    temperaturaMax = int(input("Temperatura Maxima: "))
    temperaturaMin = int(input("Temperatura Minima: "))
    if (temperaturaMin == 0 and temperaturaMax == 0):
        break

    #contador dias
    contadorDias = contadorDias + 1
    
    #conteos
    #ambas error    
    if(temperaturaMin < 5 and temperaturaMax > 35):
        contadorAmbas += 1
        
        
        #minima error - maxima bien
    elif(temperaturaMin < 5):
        contadorMin += 1
                
        
    #maxima error    
    elif(temperaturaMax > 35):
        contadorMax += 1
        
             
    #ambas bien
    else:
        conteoBienAmbas += 1
        #acumulador maximas y minimas buenas
        aculadorBienMax = temperaturaMax + aculadorBienMax 
        aculadorBienMin = temperaturaMin + aculadorBienMin
        
# calculo medias
mediaMax = aculadorBienMax / conteoBienAmbas
mediaMin = aculadorBienMin / conteoBienAmbas

#calculo porcentaje dias error
diasError = contadorMax + contadorMin + contadorAmbas
porcentajeDiasError = diasError * 100 / contadorDias

print (contadorDias)
print (diasError)
print (contadorMin)
print (contadorMax)
print (contadorAmbas)
print (mediaMax)
print (mediaMin)
print (porcentajeDiasError)

