#
horas = int (input ("Horas: "))
valorHora = int (input ("Valor hora: "))
#
valorTotalHorasNorm = 0
valorTotalHorasExt = 0
salarioBruto = 0
desParafiscales = 0
desSalud = 0
desPension = 0
totalDesc = 0
netoAPagar = 0
proPrima = 0
proCesantias = 0
proInteres = 0
proVacaciones = 0
#
maxHoras = 40
porcentaje = 1.5
tParafiscal = 0.09
tSalud = 0.04
tPension = 0.04
tPrima = 0.0833
tCesantias = 0.0833
tIntereses = 0.01
tVacaciones = 0.0417
#
def calculaHoraNorm (horas,valorHora):
    if (horas > 40):
        horas = 40
    valorTotalHorasNorm = (horas * valorHora)
    return (valorTotalHorasNorm)

def calcularTHoraExt (horas, maxHoras, porcentaje, valorHora):
    if (horas <=40):
        valorTotalHorasExt = 0
        return (valorTotalHorasExt)
    elif (horas > 40):
        valorTotalHorasExt = ((horas - maxHoras) * (porcentaje * valorHora))
        return (valorTotalHorasExt)

def calcularSBruto (valorTotalHorasNorm, valorTotalHorasExt):
    salarioBruto = (valorTotalHorasNorm + valorTotalHorasExt)
    return (salarioBruto)

def calcularDPFiscales (salarioBruto, tParafiscal):
    desParafiscales = (salarioBruto * tParafiscal)
    return (desParafiscales)

def calcularDSalud (salarioBruto, tSalud):
    desSalud = (salarioBruto * tSalud)
    return (desSalud)

def calcularDPension (salarioBruto, tPension):
    desPension = (salarioBruto * tPension)
    return (desPension)

def calcularTDescuentos (desParafiscales, desSalud, desPension):
    totalDesc = (desParafiscales + desSalud + desPension)
    return (totalDesc)

def calcularSNeto (salarioBruto, totalDesc):
    netoAPagar = (salarioBruto - totalDesc)
    return (netoAPagar)

def calcularPrima (salarioBruto, tPrima):
    prima = (salarioBruto * tPrima)
    return (prima)

def calcularCesantias (salarioBruto, tCesantias):
    cesantias = (salarioBruto * tCesantias)
    return (cesantias)

def calcularIntereses (salarioBruto, tIntereses):
    intereses = (salarioBruto * tIntereses)
    return (intereses)

def calcularVacaciones (salarioBruto, tVacaciones):
    vacaciones = (salarioBruto * tVacaciones)
    return (vacaciones)

valorTotalHorasNorm = calculaHoraNorm (horas, valorHora)
valorTotalHorasExt = calcularTHoraExt (horas, maxHoras, porcentaje, valorHora)
salarioBruto = calcularSBruto (valorTotalHorasNorm, valorTotalHorasExt)
desParafiscales = calcularDPFiscales (salarioBruto, tParafiscal)
desSalud = calcularDSalud (salarioBruto, tSalud)
desPension = calcularDPension (salarioBruto, tPension)
totalDesc = calcularTDescuentos (desParafiscales, desSalud, desPension)
netoAPagar = calcularSNeto (salarioBruto, totalDesc)
proPrima = calcularPrima (salarioBruto, tPrima)
proCesantias = calcularCesantias (salarioBruto, tCesantias)
proInteres = calcularIntereses (salarioBruto, tIntereses)
proVacaciones = calcularVacaciones (salarioBruto, tVacaciones)

print (valorTotalHorasNorm)
print (valorTotalHorasExt)
print (salarioBruto)
print (desParafiscales)
print (desSalud)
print (desPension)
print (totalDesc)
print (netoAPagar)
print (proPrima)
print (proCesantias)
print (proInteres)
print (proVacaciones)