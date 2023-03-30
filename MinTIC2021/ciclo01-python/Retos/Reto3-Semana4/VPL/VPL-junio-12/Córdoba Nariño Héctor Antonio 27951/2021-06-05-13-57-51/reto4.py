#Programa para calcular nomina
# Entradas

horasTrab = float (input("Horas trabajadas: "))
Valorhora = float (input("Valor por Hora: "))

# Variables
# Funciones
def calvalHorasNormales (a,b):
    z = a * b
    return (z)
#
def calValHorasExtras (a,b):
    r = (a - 40) * (b * 1.5)
    return (r)
#
def calSueldoBruto (a,b):
    if (a > 40):
        c = (a - 40) * (b * 1.5)
        e = b * 40
        s = c + e 
        return (s)
    else:
        s = a * b
        return (s)
    #
#

def calParafiscales (a):
    p = a * 0.09
    return (p)
#
def calSalud (a):
    c = a * 0.04
    return (c)
#
def calPension (a):
    j = a * 0.04
    return (j)
#
def calTotalDescuentos (w, x, y):
    z = w + x + y
    return (z)
#
def CalSueldoNeto (a,b,c,d):
    n = (a - (b + c + d))
    return (n)
#
def calPrimas (a):
    m = a * 0.0833
    return (m)
#
def calCesantias (a):
    k = a * 0.0833
    return (k)
#
def calIntCesantias (a):
    i = a * 0.01
    return (i)
#
def calVacaciones (a):
    v = a * 0.0417
    return (v)
#
   
# Procesos
valHorasNormales = calvalHorasNormales ( horasTrab,Valorhora)
valHorasExtras = calValHorasExtras ( horasTrab,Valorhora)
sueldoBruto = calSueldoBruto (horasTrab,Valorhora) 
parafiscales = calParafiscales (sueldoBruto)
salud = calSalud (sueldoBruto)
pension = calPension (sueldoBruto)
totalDescuentos = calTotalDescuentos (parafiscales,salud,pension)
sueldoNeto = CalSueldoNeto (sueldoBruto, parafiscales,salud,pension)
primas = calPrimas (sueldoBruto) 
cesantias = calCesantias (sueldoBruto) 
intCesantias = calIntCesantias (sueldoBruto) 
vacaciones = calVacaciones (sueldoBruto) 


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