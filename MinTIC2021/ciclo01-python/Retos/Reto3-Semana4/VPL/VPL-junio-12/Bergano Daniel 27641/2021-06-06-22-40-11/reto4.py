
hor_trab = int(input())
valor_hor = int(input())
def valor_horas_normales(hor_trab,valor_hor):
    global val_hor_norm
    if hor_trab >= 40:
        val_hor_norm = 40 * valor_hor
        return(val_hor_norm)
    else hor_trab < 40:
        val_hor_norm = hor_trab * valor_hor
       return (val_hor_norm)

def valor_horas_extras(hor_trab,val_hor_norm):
    global val_hor_ext
    if hor_trab >= 40:
        hor_ext = hor_trab-40
        val_hor_ext = hor_ext * 1.5 * valor_hor
    if hor_trab < 40:
        val_hor_ext = 0
    return (val_hor_ext)

def sueldo_bruto(hor_trab,valor_hor):
    global sueldo_bruto
    sueldo_bruto = val_hor_norm + val_hor_ext
    return (sueldo_bruto)

def Parafiscales(sueldo_bruto):
    global paraf
    paraf = (sueldo_bruto * 9/100)
    return (paraf)

def Salud(sueldo_bruto):
    global salud
    salud = (sueldo_bruto * 4/100)
    return (salud)

def Pension(sueldo_bruto):
    global pension
    pension = (sueldo_bruto * 4/100)
    return (pension)

def total_descuentos():
    global Total_descuentos
    Total_descuentos = paraf + salud + pension
    return (Total_descuentos)


def sueldo_neto():
    global sueldo_neto
    sueldo_neto = sueldo_bruto - Total_descuentos
    return (sueldo_neto)

def Provis_prima(sueldo_bruto):
    prima = (sueldo_bruto * 8.33/100)
    return (prima)

def Provis_cesantias(sueldo_bruto):
    ces = (sueldo_bruto * 8.33/100)
    return (ces)

def Provis_int_cesantias(sueldo_bruto):
    int_ces = (sueldo_bruto * 1/100)
    return (int_ces)

def Prov_vacaciones(sueldo_bruto):
    vac = (sueldo_bruto * 4.17/100)
    return (vac)

valor_horas_normales(hor_trab,valor_hor)
valor_horas_extras(hor_trab,val_hor_norm)
sueldo_bruto(hor_trab,valor_hor)
Parafiscales(sueldo_bruto)
Salud (sueldo_bruto)
Pension(sueldo_bruto)
total_descuentos()
sueldo_neto()
Provis_prima(sueldo_bruto)
Provis_cesantias(sueldo_bruto)
Provis_int_cesantias(sueldo_bruto)
Prov_vacaciones(sueldo_bruto)

print (valor_horas_normales ) 
print (valor_horas_extras)  
print (sueldo_bruto)
print (Parafiscales)
print (salud)
print (pension)
print (total_descuentos)
print (sueldo_neto)
print (Provis_prima)
print (Provis_cesantias)
print (Provis_int_cesantias)
print (Prov_vacaciones)






















