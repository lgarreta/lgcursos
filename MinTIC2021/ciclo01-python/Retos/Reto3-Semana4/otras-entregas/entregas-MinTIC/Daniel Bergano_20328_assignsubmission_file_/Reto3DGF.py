error_dia = 0
error_min = 0
error_max = 0
temp_max = 0
temp_min = 0
dias_excursion = 0
suma_error_dia = 0
media_max = 0
media_min = 0
error_combinado = 0
suma_temp_max = 0
suma_temp_min = 0
total_dias_error = 0
contador_dias_buenos = 0
promedio_temp_max = 0
promedio_temp_min = 0
promedio_dias_error = 0
temp_max = float(input())
temp_min = float(input())
while temp_max > 0 and temp_min > 0:
    dias_excursion = dias_excursion+1
    if (temp_min == 0) and (temp_max == 0):
        break
    if temp_min <5 and temp_max >35:
        error_combinado = error_combinado+1
    elif temp_min <5:
        error_min = error_min+1
    elif temp_max >35:
        error_max = error_max+1
    else:
        suma_temp_max = temp_max+suma_temp_max
        suma_temp_min = temp_min+suma_temp_min
        contador_dias_buenos = contador_dias_buenos+1
    total_dias_error = error_max + error_min + error_combinado
    temp_max = float(input())
    temp_min = float(input())
print (dias_excursion)
print (total_dias_error)
print (error_min)
print (error_max)
print (error_combinado)
promedio_temp_max = suma_temp_max/contador_dias_buenos
promedio_temp_min = suma_temp_min/contador_dias_buenos
promedio_dias_error = total_dias_error*100/dias_excursion
print (promedio_temp_max )
print (promedio_temp_min)
print (promedio_dias_error)