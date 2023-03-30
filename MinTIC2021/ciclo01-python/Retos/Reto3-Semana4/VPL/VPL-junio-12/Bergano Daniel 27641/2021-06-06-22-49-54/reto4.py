hor_trab =0
hor_ext = 0
tarifa_hor =0
val_hor_ext = 0
val_hor_norm = 0
salud = pension = 0
paraf = 0
prima = 0
ces = 0
int_ces =0
vac = 0
sueldo_bruto = 0
sueldo_neto = 0

hor_trab = int(input())
tarifa_hor = int(input())


def valor_horas_normales(hor_trab,tarifa_hor):
    global val_hor_norm
    if hor_trab >= 40:
        val_hor_norm = 40 * tarifa_hor
        print (val_hor_norm)
    else:
        hor_trab < 40
        val_hor_norm = hor_trab * tarifa_hor
        print (val_hor_norm)
    return (val_hor_norm)

def valor_horas_extras(hor_trab,val_hor_norm):
    global val_hor_ext
    if hor_trab >= 40:
        hor_ext = hor_trab-40
        val_hor_ext = hor_ext * 1.5 * tarifa_hor
    if hor_trab < 40:
        val_hor_ext = 0
    print(int(val_hor_ext))
    return (val_hor_ext)

def sueldo_bruto(hor_trab,tarifa_hor):
    global sueldo_bruto
    sueldo_bruto = val_hor_norm + val_hor_ext
    print(sueldo_bruto)
    return (sueldo_bruto)

def Parafiscales(sueldo_bruto):
    global paraf
    paraf = (sueldo_bruto * 9/100)
    print (paraf)
    return (paraf)

def Salud(sueldo_bruto):
    global salud
    salud = (sueldo_bruto * 4/100)
    print(salud)
    return (salud)

def Pension(sueldo_bruto):
    global pension
    pension = (sueldo_bruto * 4/100)
    print( pension)
    return (pension)

def total_descuentos():
    global Total_descuentos
    Total_descuentos = paraf + salud + pension
    print(Total_descuentos)
    return (Total_descuentos)


def sueldo_neto():
    global sueldo_neto
    sueldo_neto = sueldo_bruto - Total_descuentos
    print (sueldo_neto)


def Provis_prima(sueldo_bruto):
    prima = (sueldo_bruto * 8.33/100)
    print( prima)
    return (prima)

def Provis_cesantias(sueldo_bruto):
    ces = (sueldo_bruto * 8.33/100)
    print(ces)
    return (ces)

def Provis_int_cesantias(sueldo_bruto):
    int_ces = (sueldo_bruto * 1/100)
    print( int_ces)
    return (int_ces)

def Prov_vacaciones(sueldo_bruto):
    vac = (sueldo_bruto * 4.17/100)
    print(vac)
    return (vac)


valor_horas_normales(hor_trab,tarifa_hor)
valor_horas_extras(hor_trab,val_hor_norm)
sueldo_bruto(hor_trab,tarifa_hor)
Parafiscales(sueldo_bruto)
Salud(sueldo_bruto)
Pension(sueldo_bruto)
total_descuentos()
sueldo_neto()
Provis_prima(sueldo_bruto)
Provis_cesantias(sueldo_bruto)
Provis_int_cesantias(sueldo_bruto)
Prov_vacaciones(sueldo_bruto)





















