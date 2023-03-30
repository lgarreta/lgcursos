#Abriebaturas: acumu=acumulador / cont=contador / temp=temperatura / min=minima / max=maxima /
acumu_temp_max = 0
cont_temp_max = 0
acumu_temp_min = 0
cont_temp_min = 0
cont_min_max = 0
cont_error_min_max = 0
med_max = 0
med_min = 0
cont_dias = 0
cont_dias_error = 0
#Ingresar datos de la temperatura en el ciclo
while (True):
    temp_max =float(input())
    temp_min =float(input())
    if (temp_min == 0 and temp_max == 0 ):
        break
    cont_dias = cont_dias + 1
#conteo min y max
    if (temp_min < 5 and temp_max > 35):
        cont_error_min_max += 1
    elif (temp_min < 5):
        cont_temp_min += 1
    elif (temp_max > 35):
        cont_temp_max += 1
    else:
        cont_min_max += 1
        acumu_temp_max = temp_max + acumu_temp_max
        acumu_temp_min = temp_min + acumu_temp_min
#Formulas medias y porcentaje días error
med_max = float(acumu_temp_max / cont_min_max)
med_min = float(acumu_temp_min / cont_min_max)
cont_dias_error = cont_temp_max + cont_temp_min + cont_error_min_max
porcen_dias_error = 100 * cont_dias_error / cont_dias
#Salida
print(cont_dias)
print(cont_dias_error)
print(cont_temp_min)
print(cont_temp_max)
print(cont_error_min_max)
print(med_max)
print(med_min)
print(porcen_dias_error)