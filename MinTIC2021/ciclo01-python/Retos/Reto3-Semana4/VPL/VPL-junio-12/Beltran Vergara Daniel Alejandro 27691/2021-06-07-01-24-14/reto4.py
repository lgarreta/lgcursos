#Salario Bruto
def sueldo_bruto_funcion (vhn, vhe):
    sueldo_bruto_funcion=vhn+vhe
    return (sueldo_bruto_funcion)

#Vacaiones
def provisiones_vacaciones_f (sueldo_bruto):
    prov_vaca=sueldo_bruto*0.0417
    return (prov_vaca)

#Cesantias
def provisiones_cesantias_f (sueldo_bruto):
    prov_cesa=sueldo_bruto*0.0833
    return (prov_cesa)

#Intereses Cesantias
def provisiones_intcesantias_f (sueldo_bruto):
    prov_int_cesa=sueldo_bruto*0.01
    return (prov_int_cesa)

#PrimaServicio
def provisiones_prima_f (sueldo_bruto):
    prov_prima=sueldo_bruto*0.0833
    return (prov_prima)

#Salud
def descuento_salud_f (sueldo_bruto):
    desc_salud=sueldo_bruto*0.04
    return (desc_salud)

#Pension
def descuento_pension_f (sueldo_bruto):
    desc_pension=sueldo_bruto*0.04
    return (desc_pension)

#Parafiscales
def descuento_parafiscales_f (sueldo_bruto):
    desc_parafiscales=sueldo_bruto*0.09
    return (desc_parafiscales)

#Sueldo Neto
def sueldo_neto_f (sueldo_bruto, desc_pension, desc_salud, desc_parafiscales):
    sueldo_neto = sueldo_bruto -(desc_pension+desc_salud+desc_parafiscales)
    return (sueldo_neto)


horas_extras=0
horas_normales=0
salario_bruto=0

#entradas
horas_trabajadas = int(input("Ingrese horas trabajadas "))
valor_hora = int (input("Digite valor por hora "))

#horas extras / horas normales
if (horas_trabajadas > 40):
    horas_extras += horas_trabajadas-40
    valor_h_extras = horas_extras*(1.5*valor_hora)
    
    horas_normales = 40
    valor_h_normales = horas_normales*valor_hora

elif (horas_trabajadas <= 40):
    valor_h_extras= 0
    horas_normales += horas_trabajadas
    valor_h_normales = horas_normales*valor_hora

#salario bruto
salario_bruto= sueldo_bruto_funcion (valor_h_normales, valor_h_extras)

#provisiones
vacaciones = provisiones_vacaciones_f (salario_bruto)
cesantias = provisiones_cesantias_f (salario_bruto)
intereses_cesantias = provisiones_intcesantias_f (salario_bruto)
prima = provisiones_prima_f (salario_bruto)

#descuentos
descuento_salud = descuento_salud_f(salario_bruto)
descuento_pension = descuento_pension_f(salario_bruto)
descuento_parafiscales = descuento_parafiscales_f(salario_bruto)

#suma_descuentos
suma_descuentos = descuento_salud+descuento_pension+descuento_parafiscales

#salario_neto
salario_neto = sueldo_neto_f (salario_bruto, descuento_pension, descuento_salud, descuento_parafiscales)

#salidas
print (valor_h_normales)
print (valor_h_extras)
print (salario_bruto)
print (descuento_parafiscales)
print (descuento_salud)
print (descuento_pension)
print (suma_descuentos)
print (salario_neto)
print (prima)
print (cesantias)
print (intereses_cesantias)
print (vacaciones)