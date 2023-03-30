#reto_3

#entradas
temp_max = 0.0
temp_min = 0.0

#acumuladores
acu_bien_max   = 0.0
acu_bien_min   = 0.0

#contadores
total_dias            = 0
conteo_error_min      = 0
conteo_error_max      = 0
conteo_error_ambas    = 0
conteo_bien           = 0

#variables
media_max             = 0.0
media_min             = 0.0
dias_error            = 0
porcentaje_dias_error = 0.0


while (True):
    temp_max = float (input ("Temperatura maxima: "))
    temp_min = float (input ("Temperatura minima: "))
    if (temp_min == 0 and temp_max == 0):
        break
    
    #contador dias
    total_dias = total_dias + 1
    
    #conteos
    #ambas error
    if (temp_min < 5 and temp_max > 35):
        conteo_error_ambas += 1
        
    #minima error
    elif (temp_min < 5):
        conteo_error_min += 1
    
    #maxima error
    elif (temp_max > 35):
        conteo_error_max += 1
   
    #ambas bien
    else:
        conteo_bien += 1
        #acumuladores maximas y minimas buenas
        acu_bien_max = temp_max + acu_bien_max
        acu_bien_min = temp_min + acu_bien_min
    
      
# calculo medias
media_max = acu_bien_max / conteo_bien
media_min = acu_bien_min / conteo_bien


#calculo porcentaje dias error
dias_error = conteo_error_max + conteo_error_min + conteo_error_ambas
porcentaje_dias_error =  dias_error * 100 / total_dias


#salidas
print (total_dias)
print (dias_error)
print (conteo_error_min)
print (conteo_error_max)
print (conteo_error_ambas)
print (media_max)
print (media_min)
print (porcentaje_dias_error)