#entradas
cantidad_hora = int(input(" "))
valor_hora = int(input(" "))

def valor_hor_normal (a,b):
    if (a>40):
        a=40
        valor_n= a*b
        return (valor_n)
    else :
        valor_N= a*b
        return (valor_N)
        
        
def valor_hor_extra (a,b):
    if (a > 40):
        valor_e = (a - 40) * (b * 1.5)
        return (valor_e)
    else:
        valor_E = 0
        return (valor_E)
          
#
def valor_sueldo_bruto (a,b):
    if (a > 40):
        horas_n = (a - 40) * (b * 1.5)
        horas_e = b * 40
        sueldo_bruto = horas_n + horas_e 
        return (sueldo_bruto)
    else:
        sueldo_Bruto = a * b
        return (sueldo_Bruto)
    #
#

def des_parafiscales (a):
    d_parafiscal = a * 0.09
    return (d_parafiscal)
#
def des_salud (a):
    d_salud = a * 0.04
    return (d_salud)
#
def des_pension (a):
    d_pension = a * 0.04
    return (d_pension)
#
def des_total (m,o,p):
    d_total = m + o + p
    return (d_total)
#
def sueldo_neto (a,b,c,d):
    total_neto = (a - (b + c + d))
    return (total_neto)
#
def prov_primas (a):
    total_prima = a * 0.0833
    return (total_prima)
#
def prov_cesantias (a):
    total_cesantias = a * 0.0833
    return (total_cesantias)
#
def prov_int_cesantias (a):
    total_int_cesantias = a * 0.01
    return (total_int_cesantias)
#
def prov_vacaciones (a):
    total_vacaciones = a * 0.0417
    return (total_vacaciones)
#
   
# Procesos
valHorasNormales = valor_hor_normal ( cantidad_hora,valor_hora)
valHorasExtras = valor_hor_extra ( cantidad_hora,valor_hora)
sueldoBruto = valor_sueldo_bruto (cantidad_hora,valor_hora) 
parafiscales = des_parafiscales (sueldoBruto)
salud = des_salud (sueldoBruto)
pension = des_pension (sueldoBruto)
totalDescuentos = des_total (parafiscales,salud,pension)
sueldoNeto = sueldo_neto (sueldoBruto, parafiscales,salud,pension)
primas = prov_primas (sueldoBruto) 
cesantias = prov_cesantias (sueldoBruto) 
intCesantias = prov_int_cesantias (sueldoBruto) 
vacaciones = prov_vacaciones (sueldoBruto) 


# Salidas
print (valHorasNormales)
print (valHorasExtras)
print (sueldoBruto)
print (parafiscales)
print (salud)
print (pension)
print (totalDescuentos)
print (sueldoNeto)
print (primas) 
print (cesantias) 
print (intCesantias) 
print (vacaciones) 
        
    
