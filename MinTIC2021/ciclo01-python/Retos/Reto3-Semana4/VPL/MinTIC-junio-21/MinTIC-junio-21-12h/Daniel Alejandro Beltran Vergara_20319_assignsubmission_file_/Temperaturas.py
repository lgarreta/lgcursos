
cont_dias = 0
dias_error = 0
cont_max = 0
cont_min = 0
cont_maxmin = 0
media_max = 0
suma_temp_max = 0
media_min = 0
suma_temp_min = 0
porcentaje_error = 0 
num_promedio_min = 0
num_promedio_max = 0

repetir_bucle = True
while (repetir_bucle):
    temp_max = 0
    temp_min = 0
    temp_max = int(input("Ingrese temperatura Maxima "))    
    temp_min = int(input("Ingrese temperatura Minima "))
    
    if (temp_max == 0 and temp_min == 0):
        repetir_bucle = False
    elif (temp_max >= 0 or temp_min >= 0):
        cont_dias += 1
        #Temperaturas en error
        if (temp_max > 35 or temp_min < 5):
            dias_error += 1
            #Conteo de ambos x error
            if (temp_max > 35 and temp_min < 5):
                cont_maxmin += 1
            #Conteo error maxima
            elif (temp_max > 35 and temp_min >= 5):
                cont_max += 1
            #Conteo error minima
            elif (temp_max <= 35 and temp_min < 5):
                cont_min += 1
        #Temperaturas dentro del rango
        if (temp_max <= 35 and temp_min >= 5):
            suma_temp_max += temp_max
            num_promedio_max += 1
            suma_temp_min += temp_min
            num_promedio_min += 1
      
#               
media_max = suma_temp_max/num_promedio_max
media_min = suma_temp_min/num_promedio_min
#Porcentaje de dias con error
porcentaje_error = (dias_error*100)/cont_dias

print (cont_dias)
print (dias_error)
print (cont_min)
print (cont_max)
print (cont_maxmin)
print (media_max)
print (media_min)
print (porcentaje_error)
        
        
    #        
        
            
        
        