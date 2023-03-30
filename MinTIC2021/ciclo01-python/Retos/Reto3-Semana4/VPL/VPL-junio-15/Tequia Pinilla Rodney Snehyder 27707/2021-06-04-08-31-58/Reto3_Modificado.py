conteo_dias=0
tem_min_error = 0
tem_max_error = 0
total_dias_error = 0
pro_tem_min = 0
pro_tem_max = 0
sum_tem_min = 0
sum_tem_max = 0
dias_ok = 0
por_dias_error = 0
tem_dos_error = 0
while (True):
    conteo_dias = conteo_dias + 1
    tem_max = int((input ()))
    tem_min = int((input()))
    
    #Condición para dejar de solicitar datos
    if (tem_min == 0 and tem_max == 0):
        conteo_dias = conteo_dias - 1
        break
    
    #Conteo de días con temperaturas mínimas y máximas con error
    if (tem_min < 5 and tem_max <=35):
        tem_min_error += 1
    elif (tem_max > 35 and tem_min > 4):
        tem_max_error += 1
    elif (tem_min < 5 and tem_max > 35):
        tem_dos_error += 1
        
    #Conteo de días que tuvieron ambos errores
    if ((tem_min < 5) or (tem_max>35)):
        total_dias_error += 1
    
    #Promedio temperatura minima y máxima
    if (tem_min >= 5 and tem_max <= 35):
        dias_ok += 1
        sum_tem_min = sum_tem_min + tem_min
        pro_tem_min = sum_tem_min / dias_ok
        sum_tem_max = sum_tem_max + tem_max
        pro_tem_max = sum_tem_max / dias_ok
        
    #Calculo porcentaje dias con error
    por_dias_error =  (total_dias_error / (conteo_dias))*100
        
    
print (conteo_dias)
print (total_dias_error)
print (tem_min_error)
print (tem_max_error)
print (tem_dos_error)
print (pro_tem_max)
print (pro_tem_min)
print (por_dias_error)

