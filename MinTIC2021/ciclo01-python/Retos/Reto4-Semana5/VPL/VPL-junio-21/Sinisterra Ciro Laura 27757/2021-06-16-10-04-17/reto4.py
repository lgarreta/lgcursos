#Entradas

horasTrabajadas = 0
valorHora = 0

#Salidas
sueldo = 0
sueldoExtra = 0
sueldoBruto = 0
descParaf = 0
descSalud = 0
descPension = 0
sumaDescuentos = 0
sueldoNeto = 0
provPrima = 0
provCesantias = 0
provIntereses = 0
provVacaciones = 0

horasTrabajadas = int(input(""))
valorHora = int(input(""))


def calcularSueldo (horasTrabajadas, valorHora):
    if (horasTrabajadas < 40):
        sueldo = horasTrabajadas * valorHora
    else:
        sueldo = 40 * valorHora
    return (sueldo)

def calcularHorasExtras (horasTrabajadas, valorHora):
    sueldoExtra = 0
    if (horasTrabajadas > 40):
        horasExtra = horasTrabajadas - 40
        sueldoExtra = horasExtra * (valorHora*1.5) 
    return (sueldoExtra)

def calcularSueldoBruto (sueldo, sueldoExtra):
    sueldoBruto = sueldo + sueldoExtra
    return (sueldoBruto)

def calcularDescParaf (sueldoBruto):
    descParaf = sueldoBruto * 0.09
    return (descParaf)

def calcularDescSalud (sueldoBruto):
    descSalud= sueldoBruto * 0.04
    return (descSalud)

def calcularDescPension (sueldoBruto):
    descPension= sueldoBruto * 0.04
    return (descPension)

def calcularSumaDescuentos (descParaf, descSalud, descPension):
    sumaDescuentos =  descParaf + descSalud + descPension
    return (sumaDescuentos)

def calcularSueldoNeto (sueldoBruto, sumaDescuentos):
    sueldoNeto = sueldoBruto - sumaDescuentos
    return (sueldoNeto)

def calcularProvPrima (sueldoBruto):
    provPrima = sueldoBruto * 0.0833
    return (provPrima)

def calcularProvCesantias (sueldoBruto):
    provCesantias = sueldoBruto * 0.0833
    return (provCesantias)

def calcularProvIntereses (sueldoBruto):
    provIntereses = sueldoBruto * 0.01
    return (provIntereses)

def calcularProvVacaciones (sueldoBruto):
    provVacaciones = sueldoBruto * 0.0417
    return (provVacaciones)

    

sueldo = calcularSueldo(horasTrabajadas, valorHora)
sueldoExtra =  calcularHorasExtras(horasTrabajadas, valorHora)
sueldoBruto = calcularSueldoBruto(sueldo, sueldoExtra)
descParaf = calcularDescParaf(sueldoBruto)
descSalud = calcularDescSalud(sueldoBruto)
descPension = calcularDescPension(sueldoBruto)
sumaDescuentos = calcularSumaDescuentos(descParaf, descSalud, descPension)
sueldoNeto = calcularSueldoNeto(sueldoBruto, sumaDescuentos)
provPrima = calcularProvPrima(sueldoBruto)
provCesantias = calcularProvCesantias(sueldoBruto)
provIntereses = calcularProvIntereses(sueldoBruto)
provVacaciones = calcularProvVacaciones(sueldoBruto)



print (sueldo)
print (sueldoExtra)
print (sueldoBruto)
print (descParaf)
print (descSalud)
print (descPension)
print (sumaDescuentos)
print (sueldoNeto)
print (provPrima)
print (provCesantias)
print (provIntereses)
print (provVacaciones)


