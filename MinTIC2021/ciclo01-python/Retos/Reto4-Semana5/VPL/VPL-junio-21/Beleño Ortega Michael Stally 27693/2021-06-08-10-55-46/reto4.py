hora_trabajada = int(input("Hora trabajada: "))
valor_normal = int(input("Valor hora normal: "))


valor_extra = valor_normal * 1.5
porc_parafiscales = 9/100
porc_salud = 4/100
porc_pension = 4/100
porc_prima = 8.33/100
porc_cesantias = 8.33/100
porc_int_cesantias = 1/100
porc_vacaciones = 4.17/100
hora_extra = 0

valor_hora_normal = 0
valor_hora_extra = 0
sueldo_bruto = 0
desc_parafiscales = 0
desc_salud = 0
desc_pension = 0
suma_desc = 0
sueldo_neto = 0
prima = 0
cesantias = 0
int_cesantias = 0
vacaciones = 0


def calcular_extras():
    global hora_extra, valor_hora_extra, valor_hora_normal, sueldo_bruto, hora_trabajada
    if hora_trabajada > 40:
        hora_extra = hora_trabajada % 40
        hora_trabajada = hora_trabajada - hora_extra
        valor_hora_extra = hora_extra * valor_extra

    valor_hora_normal = hora_trabajada * valor_normal
    sueldo_bruto = valor_hora_normal + valor_hora_extra


def calcular_parafiscales():
    global desc_parafiscales, desc_pension, desc_salud, suma_desc, sueldo_neto
    desc_parafiscales = sueldo_bruto * porc_parafiscales
    desc_salud = sueldo_bruto * porc_salud
    desc_pension = sueldo_bruto * porc_pension
    suma_desc = desc_salud + desc_pension + desc_parafiscales
    sueldo_neto = sueldo_bruto - suma_desc


def calcular_privisiones():
    global prima, cesantias, int_cesantias, vacaciones
    prima = sueldo_bruto * porc_prima
    cesantias = sueldo_bruto * porc_cesantias
    int_cesantias = sueldo_bruto * porc_int_cesantias
    vacaciones = sueldo_bruto * porc_vacaciones


calcular_extras()
calcular_parafiscales()
calcular_privisiones()
print(valor_hora_normal)
print(valor_hora_extra)
print(sueldo_bruto)
print(desc_parafiscales)
print(desc_salud)
print(desc_pension)
print(suma_desc)
print(sueldo_neto)
print(prima)
print(cesantias)
print(int_cesantias)
print(vacaciones)
