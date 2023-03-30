# Entradas

#Docente = input ("Nombre Completo:")
horasTrab = int (input ("Horas trabajadas: "))
valorHora = int (input ("Valor por hora: "))

# Variables
# Funciones
def calculoValHorasNormales (horasTrab, valorHoras):
    if (horasTrab > 40):
        horasExt = horasTrab - 40
        horasTrab = horasTrab - horasExt
        ValHorasNormales = horasTrab * valorHoras
        return (ValHorasNormales)
    else:
        valorTotalHorasNormales = horasTrab * valorHoras
        return (valorTotalHorasNormales)
#
def calculoValHorasExt (horasTrab, valorHoras):
    if (horasTrab > 40):
        horasExt = (horasTrab - 40) * (valorHoras * 1.5)
        return (horasExt)
    else:
        horasExt = 0
        return (horasExt)
          
#
def calculoSueldoBruto (horasTrab, valorHoras):
    if (horasTrab > 40):
        horasExt = (horasTrab - 40) * (valorHoras * 1.5)
        valorTotalHrs = valorHoras * 40
        SueldoBruto = horasExt + valorTotalHrs 
        return (SueldoBruto)
    else:
        SueldoBruto = horasTrab * valorHoras
        return (SueldoBruto)
    #
#

def calculodctoParafiscales (horasTrab):
    dctoParafiscales = horasTrab * 0.09
    return (dctoParafiscales)
#
def calculodctoSalud (horasTrab):
    dctoSalud = horasTrab* 0.04
    return (dctoSalud)
#
def calculodctoPension (horasTrab):
    dctoPension = horasTrab * 0.04
    return (dctoPension)
#
def calculodctoTotal (dctoParafiscales, dctoSalud, dctoPension):
    dctoTotal = dctoParafiscales + dctoSalud + dctoPension
    return (dctoTotal)
#
def CalculoSueldoNeto (sueldoBruto, dctoParafiscales, dctoSalud, dctoPension):
    SueldoNeto = (sueldoBruto - (dctoParafiscales + dctoSalud + dctoPension))
    return (SueldoNeto)
#
def calculoPrima (horasTrab):
    Prima = horasTrab * 0.0833
    return (Prima)
#
def calculoCesantias (horasTrab):
    Cesantias = horasTrab * 0.0833
    return (Cesantias)
#
def calculoIntCesantias (horasTrab):
    IntCesantias = horasTrab * 0.01
    return (IntCesantias)
#
def calculoVacaciones (horasTrab):
    IntVacaciones = horasTrab * 0.0417
    return (IntVacaciones)
#
   
# Procesos
valHorasNormales = calculoValHorasNormales ( horasTrab,valorHora)
valHorasExtras = calculoValHorasExt ( horasTrab,valorHora)
SueldoBruto = calculoSueldoBruto (horasTrab,valorHora) 
dctoparafiscales = calculodctoParafiscales (SueldoBruto)
dctosalud = calculodctoSalud (SueldoBruto)
dctopension = calculodctoPension (SueldoBruto)
dctoTotal = calculodctoTotal (dctoparafiscales,dctosalud,dctopension)
SueldoNeto = CalculoSueldoNeto (SueldoBruto, dctoparafiscales,dctosalud,dctopension)
primas = calculoPrima (SueldoBruto) 
cesantias = calculoCesantias (SueldoBruto) 
intCesantias = calculoIntCesantias (SueldoBruto) 
vacaciones = calculoVacaciones (SueldoBruto) 


# Salidas
print (valHorasNormales)
print (valHorasExtras)
print (SueldoBruto)
print (dctoparafiscales)
print (dctosalud)
print (dctopension)
print (dctoTotal)
print (SueldoNeto)
print (primas) 
print (cesantias) 
print (intCesantias) 
print (vacaciones) 