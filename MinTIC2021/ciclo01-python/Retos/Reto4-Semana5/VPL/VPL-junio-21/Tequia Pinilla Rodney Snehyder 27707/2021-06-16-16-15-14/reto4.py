def horas_extras (horas_trabajadas):
    if (horas_trabajadas > 40):
        horas_extras = horas_trabajadas-40
    else:
        horas_extras= 0.0
    return (horas_extras)

def calculo_extras (horas_trabajadas, valor_hora):
     valor_extras = horas_extras (horas_trabajadas) * (valor_hora * 1.5)
     return (valor_extras)

def calculo_normales (horas_trabajadas, valor_hora):
    horas_normales = horas_trabajadas-horas_extras (horas_trabajadas)
    valor_normales = horas_normales * valor_hora
    return (valor_normales)

def calculo_sueldo_bruto (horas_trabajadas, valor_hora):
    sueldo_bruto = calculo_extras (horas_trabajadas, valor_hora) + calculo_normales (horas_trabajadas, valor_hora)
    return (sueldo_bruto)

#Parafiscales
def calculo_parafiscales (sueldo_bruto):
    parafiscales = calculo_sueldo_bruto (horas_trabajadas, valor_hora) * 0.09
    return (parafiscales)

#Provisiones
def provision_prima (sueldo_bruto):
    prima = calculo_sueldo_bruto (horas_trabajadas, valor_hora) * 0.0833
    return (prima)

def provision_cesantias (sueldo_bruto):
    cesantias = calculo_sueldo_bruto (horas_trabajadas, valor_hora) * 0.0833
    return (cesantias)

def provision_int_cesantias (sueldo_bruto):
    intereses_cesantias = calculo_sueldo_bruto (horas_trabajadas, valor_hora) * 0.01
    return (intereses_cesantias)

def provision_vacaciones (sueldo_bruto):
    vacaciones = calculo_sueldo_bruto (horas_trabajadas, valor_hora) * 0.0417
    return (vacaciones)

#descuentos
def descuento_salud (sueldo_bruto):
    des_salud = calculo_sueldo_bruto (horas_trabajadas, valor_hora) * 0.04
    return (des_salud)

def descuento_pension (sueldo_bruto):
    des_pension = calculo_sueldo_bruto (horas_trabajadas, valor_hora) * 0.04
    return (des_pension)

horas_trabajadas = int (input ())
valor_hora = int (input ())
sueldo_bruto = calculo_sueldo_bruto (horas_trabajadas, valor_hora)

descuentos_aplicados = calculo_parafiscales (sueldo_bruto) + descuento_salud (sueldo_bruto) + descuento_pension (sueldo_bruto)
sueldo_neto = calculo_sueldo_bruto (horas_trabajadas, valor_hora) - descuentos_aplicados

print (int(calculo_normales (horas_trabajadas, valor_hora)))
print (int(calculo_extras (horas_trabajadas, valor_hora)))
print (int(sueldo_bruto))
print (calculo_parafiscales (sueldo_bruto))
print (descuento_salud (sueldo_bruto))
print (descuento_pension (sueldo_bruto))
print (descuentos_aplicados)
print (sueldo_neto)
print (provision_prima (sueldo_bruto))
print (provision_cesantias (sueldo_bruto))
print (provision_int_cesantias (sueldo_bruto))
print (provision_vacaciones (sueldo_bruto))