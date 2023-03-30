# Entradas

tempMin = 0
tempMax = 0


cant_Dias = 0
num_Dia_Error5 = 0
num_DE_error35 = 0
num_Dias_Cor = 0
num_dias_error_tot = 0
total_Min_Cor = 0
total_Max_Cor = 0
media_Temp_MinCor = 0
media_Temp_Max_Cor = 0
Porcentaje_Dias_Error = 0
conteo_Min_Max = 0


while (True):
    tempMax = float (input("Ingrese temperatura maxima: "))
    tempMin = float (input("Ingrese temperatura minima: "))
 
    if ((tempMin == 0) and (tempMax == 0)):
        break

    num_Dias_Cor += 1        

    #
    #    
    if (tempMin < 5 and tempMax > 35):
        conteo_Min_Max +=1
        num_Dia_Error5 -= 1
        num_DE_error35 -= 1
        num_dias_error_tot += 1
    #
    if (tempMax > 35):
        num_DE_error35 += 1
    #
    if ((tempMin < 5) and (tempMin != 0)):
        num_Dia_Error5 += 1
    #
    elif (tempMin > 35 ):
        num_Dia_Error5 -= 1
    #
    
    
    if ((tempMin >= 5 and tempMin <= 35) and (tempMax <= 35)):
        total_Min_Cor = total_Min_Cor + tempMin
        total_Max_Cor = total_Max_Cor + tempMax
                
num_dias_error_tot = num_dias_error_tot + num_Dia_Error5 + num_DE_error35

if (num_Dias_Cor != 0):
    Porcentaje_Dias_Error  = (num_dias_error_tot * 100)/(num_Dias_Cor)
#
if (num_Dias_Cor != 0):
    mediaTempMinCor = ((total_Min_Cor)/(num_Dias_Cor ))
    mediaTempMaxCor = ((total_Max_Cor)/(num_Dias_Cor ))
#
print (num_Dias_Cor)
print (num_dias_error_tot)
print (num_Dia_Error5)
print (num_DE_error35)
print (conteo_Min_Max)
print (mediaTempMaxCor)
print (mediaTempMinCor)
print (Porcentaje_Dias_Error)
 

