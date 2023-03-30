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
    print ("Temperaturas del día", conteo_dias)
    tem_max = int (input ("Temperatura máxima: "))
    tem_min = int (input ("Temperatura mínima: "))
    
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
        
    
print ("La salida de campo duró:", conteo_dias ,"días")
print ("Días en total que se tuvieron errores en captura de datos:" ,total_dias_error)
print ("Días con temperatura mínima con error:" ,tem_min_error)
print ("Días con temperatura máxima con error:" ,tem_max_error)
print ("Días con ambos errores", tem_dos_error)
print ("Temperatura máxima promedio", pro_tem_max)
print ("Temperatura minima promedio:", pro_tem_min)
print ("El", por_dias_error,"% de los días tuvo errores")




