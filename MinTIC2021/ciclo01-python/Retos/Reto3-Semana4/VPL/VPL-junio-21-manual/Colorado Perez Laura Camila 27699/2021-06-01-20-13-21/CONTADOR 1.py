#programa ingenieria ambiental
#ENTRADAS
Temperatura_Max= 0
Temperatura_Min= 0
#acomulador
Cantidad_dias= 0
Dias_error= 0
Conminimas= 0
Conmaximas= 0
Contador_Ambos= 0
mediamaxima= 0
mediaminima= 0
porcentaje_error= 0
conteobuenas= 0
acomuladorminimas= 0
acomuladormaximas= 0

while (True):
    Temperatura_Max= int(input( ))
    Temperatura_Min= int(input( ))
    
    if (Temperatura_Max == 0 and Temperatura_Min== 0):
        break
#temperaturas minimas y maximas
    if ( Temperatura_Min >= 5 and Temperatura_Max <= 35):
        conteobuenas +=1
        acomuladorminimas = acomuladorminimas + Temperatura_Min
        acomuladormaximas = acomuladormaximas + Temperatura_Max
#conteo
    elif( Temperatura_Min < 5 and Temperatura_Max > 35):
        Contador_Ambos += 1
        
    elif (Temperatura_Min <5):
        Conminimas += 1 
     
    elif (Temperatura_Max >35):
        Conmaximas += 1
    
        
    
    
    
    Cantidad_dias= Cantidad_dias+ 1
        

Dias_error = Conmaximas + Conminimas + Contador_Ambos
#porcentajes
porcentaje_error= (100/Cantidad_dias) * Dias_error
mediamaxima = acomuladormaximas/ conteobuenas
mediaminima = acomuladorminimas/ conteobuenas


print (Cantidad_dias)
print (Dias_error)
print (Conminimas)
print (Conmaximas)
print (Contador_Ambos)
print (mediamaxima)
print (mediaminima)
print (porcentaje_error)
