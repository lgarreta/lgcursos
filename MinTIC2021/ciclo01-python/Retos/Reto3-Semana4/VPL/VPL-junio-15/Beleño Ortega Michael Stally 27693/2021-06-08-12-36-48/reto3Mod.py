error_mayor = 35
error_menor = 5

contador_dias = 0
dias_error = 0
contador_min = 0
contador_max = 0
contador_ambos = 0
media_max = 0
media_min = 0
porcentaje_dias_error = 0

def hacerCalculo(min, max):
    global contador_dias, dias_error, contador_max, contador_min, contador_ambos, media_max, media_min
    contador_dias += 1
    if min < error_menor and max > error_mayor:
        contador_ambos += 1
        dias_error += 1
    elif min < error_menor:
        contador_min += 1
        dias_error += 1
    elif max > error_mayor:
        contador_max += 1
        dias_error += 1
    else:
        media_max += max
        media_min += min


while True:
    temperatura_max = int(input("Temperatura maxima: "))
    temperatura_min = int(input("Temperatura minima: "))
    if temperatura_min == 0 and temperatura_max == 0:
        media_max = media_max / (contador_dias - dias_error)
        media_min = media_min / (contador_dias - dias_error)
        porcentaje_dias_error = (dias_error * 100) / contador_dias
        break
    else:
        hacerCalculo(temperatura_min, temperatura_max)


print(contador_dias)
print(dias_error)
print(contador_min)
print(contador_max)
print(contador_ambos)
print(media_max)
print(media_min)
print(porcentaje_dias_error)