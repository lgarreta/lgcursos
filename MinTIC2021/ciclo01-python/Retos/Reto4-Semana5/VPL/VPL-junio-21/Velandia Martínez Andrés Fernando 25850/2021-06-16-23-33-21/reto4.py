#ENTRADAS
htrabajadas       = 0
valor_hora        = 0

#SALIDAS
valor_hnormales   = 0
valor_hextras     = 0
sueldo_bruto      = 0
desc_parafiscales = 0
desc_salud        = 0
desc_pension      = 0
todo_descuentos   = 0
sueldo_neto       = 0
prov_prima        = 0
prov_cesantias    = 0
prov_icesantias   = 0
prov_vacaciones   = 0

htrabajadas = int (input (""))
valor_hora  = int (input (""))

#DESARROLLO

def fvalor_hnormales (htrabajadas, valor_hora):
    if (htrabajadas >= 40):
        htrabajadas = 40
        valor_hnormales = htrabajadas * valor_hora
        return (valor_hnormales)
    
    elif (htrabajadas < 40):
        valor_hnormales = htrabajadas * valor_hora
        return (valor_hnormales)
    
def fvalor_hextras (htrabajadas,valor_hora):
    if (htrabajadas >= 40):
        valor_hextras = (htrabajadas - 40) * 1.5 * valor_hora
        return (int (valor_hextras))
    
    elif (htrabajadas < 40):
        valor_hextras = 0
        return (valor_hextras)

def fsueldo_bruto (valor_hnormales, valor_hextras):
    sueldo_bruto = valor_hnormales + valor_hextras
    return (sueldo_bruto)

def fdesc_parafiscales (sueldo_bruto):
    desc_parafiscales = sueldo_bruto * 0.09
    return (desc_parafiscales)

def fdesc_salud (sueldo_bruto):
    desc_salud = sueldo_bruto * 0.04
    return (desc_salud)

def fdesc_pension (sueldo_bruto):
    desc_pension = sueldo_bruto * 0.04
    return (desc_pension)

def ftodo_descuentos (desc_parafiscales, desc_salud, desc_pension):
    todo_descuentos = desc_parafiscales + desc_salud + desc_pension
    return (todo_descuentos)

def fsueldo_neto (sueldo_bruto, desc_parafiscales, desc_salud, desc_pension):
    sueldo_neto = sueldo_bruto - (desc_parafiscales + desc_salud + desc_pension)
    return (sueldo_neto)

def fprov_prima (sueldo_bruto):
    prov_prima = sueldo_bruto * 0.0833
    return (prov_prima)

def fprov_cesantias (sueldo_bruto):
    prov_cesantias = sueldo_bruto * 0.0833
    return (prov_cesantias)

def fprov_icesantias (sueldo_bruto):
    prov_icesantias = sueldo_bruto * 0.01
    return (prov_icesantias)

def fprov_vacaciones (sueldo_bruto):
    prov_vacaciones = sueldo_bruto * 0.0417
    return (prov_vacaciones)

valor_hnormales   = fvalor_hnormales (htrabajadas, valor_hora)
valor_hextras     = fvalor_hextras (htrabajadas,valor_hora)
sueldo_bruto      = fsueldo_bruto (valor_hnormales, valor_hextras)
desc_parafiscales = fdesc_parafiscales (sueldo_bruto)
desc_salud        = fdesc_salud (sueldo_bruto)
desc_pension      = fdesc_pension (sueldo_bruto)
todo_descuentos   = ftodo_descuentos (desc_parafiscales, desc_salud, desc_pension)
sueldo_neto       = fsueldo_neto (sueldo_bruto, desc_parafiscales, desc_salud, desc_pension)
prov_prima        = fprov_prima (sueldo_bruto)
prov_cesantias    = fprov_cesantias (sueldo_bruto)
prov_icesantias   = fprov_icesantias (sueldo_bruto)
prov_vacaciones   = fprov_vacaciones (sueldo_bruto)


print (valor_hnormales)
print (valor_hextras)
print (sueldo_bruto)
print (desc_parafiscales)
print (desc_salud)
print (desc_pension)
print (todo_descuentos)
print (sueldo_neto)
print (prov_prima)
print (prov_cesantias)
print (prov_icesantias)
print (prov_vacaciones)