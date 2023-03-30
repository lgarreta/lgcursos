TotalDError_5            = 0
TotalDError_35           = 0
TotalErrorDia_Acumulado  = 0
Numerodias               = 0
SumaMax                  = 0
SumaMin                  = 0
ContadorMaximos          = 0
ContadorMinimos          = 0
Contador_Error_Ambos     = 0
Contador_ambos_diasB     = 0

while (True):
    
    temperaturaMax = int (input("")) #Temperatura maxima
    temperaturaMin = int (input("")) #Temperatura minima
    
    if (temperaturaMax > 35):
        TotalDError_35 += 1        
        
    #   
    if (temperaturaMin < 5 and temperaturaMin > 0):
        TotalDError_5 += 1
           
    #
    if (temperaturaMax != 0 and temperaturaMin != 0):
        Numerodias += 1
        
    #
    if (temperaturaMax > 35 or (5 > temperaturaMin > 0)):
        TotalErrorDia_Acumulado += 1
    
    #
    if (temperaturaMax > 35 and (5 > temperaturaMin > 0)):
        Contador_Error_Ambos += 1
        
    elif (temperaturaMax <= 35 and 5 <= temperaturaMin):
        Contador_ambos_diasB += 1
        ContadorMinimos += 1
        SumaMin += temperaturaMin
        ContadorMaximos += 1
        SumaMax += temperaturaMax
              
    elif (temperaturaMax == 0 and temperaturaMin == 0):
        break
#

print (Numerodias) #Contador días
print (TotalErrorDia_Acumulado)#Dias error
print (TotalDError_5-Contador_Error_Ambos) #Contador mínimos
print (TotalDError_35-Contador_Error_Ambos) #Contador Máximos
print (Contador_Error_Ambos) #Contador ambos
print (SumaMax/ContadorMaximos) #Media máxima
print (SumaMin/ContadorMinimos) #Media mínima
print ((TotalErrorDia_Acumulado/Numerodias)*100) #Porcentaje días error
#
