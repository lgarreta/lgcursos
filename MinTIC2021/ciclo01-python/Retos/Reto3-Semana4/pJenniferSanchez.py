# Entradas
temperatura_Max = 0
temperatura_Min = 0

# Contadores
Contador_Dias = 0
Dias_Error = 0
Contador_Min = 0
Contador_Max = 0

Contador_MinB = 0
Contador_MaxB = 0

Contador_Ambos = 0
Contador_Bueno = 0
Media_Max = 0
Media_Min = 0
Porcentaje_Dias_Error = 0
Acumulador_Tmax_Buenas = 0
Acumulador_Tmin_Buenas = 0

#
while (True):
    temperatura_Max =  int (input ("Ingrese temperatura Máxima"))
    temperatura_Min =  int (input ("Ingrese temperatura Mínima"))

    if (temperatura_Min == 0 and temperatura_Max == 0):
        break   
    Contador_Dias += 1

    if (temperatura_Min < 5 or temperatura_Max > 35):
        Dias_Error += 1

    if (temperatura_Min < 5 and temperatura_Max > 35):
        Contador_Ambos += 1

#    if (temperatura_Min >= 5 and temperatura_Max <= 35):
#        Acumulador_Tmax_Buenas = temperatura_Max + Acumulador_Tmax_Buenas
#        Acumulador_Tmin_Buenas = temperatura_Min + Acumulador_Tmin_Buenas

    if (temperatura_Min < 5):
        Contador_Min += 1

    if (temperatura_Max > 35):
        Contador_Max += 1

    if (temperatura_Min >= 5):
        Acumulador_Tmin_Buenas = temperatura_Min + Acumulador_Tmin_Buenas
        Contador_MinB += 1

    if (temperatura_Max <= 35):
        Acumulador_Tmax_Buenas = temperatura_Max + Acumulador_Tmax_Buenas
        Contador_MaxB += 1


        
    #
#

#Contador_MaxB = Contador_MaxB - Contador_Ambos
#Contador_MinB = Contador_MinB - Contador_Ambos
        
# Cálculo medias
Media_Max = Acumulador_Tmax_Buenas/Contador_MaxB
Media_Min = Acumulador_Tmin_Buenas/Contador_MinB
# Cálculo porcentaje
Porcentaje_Dias_Error = 100 * (Dias_Error/Contador_Dias)
 

print (Contador_Dias)
print (Dias_Error)
print (Contador_Min-Contador_Ambos)
print (Contador_Max-Contador_Ambos)
print (Contador_Ambos)
print (Media_Max)
print (Media_Min)
print (Porcentaje_Dias_Error)
