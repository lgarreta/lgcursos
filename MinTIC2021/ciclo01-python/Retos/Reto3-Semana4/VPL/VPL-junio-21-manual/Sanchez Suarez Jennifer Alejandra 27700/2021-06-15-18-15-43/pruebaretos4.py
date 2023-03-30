# Entradas
temperatura_Max = 0
temperatura_Min = 0
#Contadores
Contador_Dias = 0
Dias_Error = 0
cont_Error_Ambas = 0
cont_Error_Min = 0
cont_Error_Max = 0
cont_Ambas = 0
media_Max = 0
media_Min = 0
Acumulador_Tmax_Buenas = 0
Acumulador_Tmin_Buenas = 0
Contador_Min = 0
Contador_Max = 0
Contador_Ambos = 0


while (True):
    temperatura_Max =  int (input ("Ingrese temperatura Máxima"))
    temperatura_Min =  int (input ("Ingrese temperatura Mínima"))
    if (temperatura_Min == 0 and temperatura_Max == 0):
        break   
    Contador_Dias += 1
    
    if (temperatura_Min < 5 and temperatura_Max > 35):
        cont_Error_Ambas += 1
        Dias_Error += 1
    elif (temperatura_Min < 5):
          cont_Error_Min += 1
    elif (temperatura_Max > 35):
          cont_Error_Max += 1
    
    else:
        cont_Ambas += 1
        Acumulador_Tmax_Buenas = temperatura_Max + Acumulador_Tmax_Buenas
        Acumulador_Tmin_Buenas = temperatura_Min + Acumulador_Tmin_Buenas
        
    #
#

#Calculo Medias
media_Max = Acumulador_Tmax_Buenas/cont_Ambas 
media_Min = Acumulador_Tmin_Buenas/cont_Ambas

#Calculo Porcentaje
Porcentaje_Dias_Error = 100 * (Dias_Error/Contador_Dias)

print (Contador_Dias)
print (Dias_Error)
print (Contador_Min)
print (Contador_Max)
print (Contador_Ambos)
print (media_Max)
print (media_Min)
print (Porcentaje_Dias_Error)


