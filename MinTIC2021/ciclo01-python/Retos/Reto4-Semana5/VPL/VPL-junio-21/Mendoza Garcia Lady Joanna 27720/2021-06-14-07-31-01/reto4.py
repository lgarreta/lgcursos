#Reto 4 semana 5

horasTrabajadas=0
valorHora=0
valorHorasNormales=0
valorHorasExtras= 0
sueldoBruto= 0
parafiscales=0
salud=0
pension=0
descuentos=0
sueldoNeto=0
provisionPrima=0
provisionCesantias=0
provisionInteresCesantias=0
provisionVacaciones=0

horasTrabajadas=int(input(" "))
valorHora=int(input(" " ))

    
def calculohorasNormales (horasTrabajadas,valorHora):
    if (horasTrabajadas >40):
        extras=horasTrabajadas-40
        horasNormales=horasTrabajadas-extras
    else:
        horasNormales= horasTrabajadas
        
    valorNormales=horasNormales*valorHora
    return(valorNormales)

def calculoExtras (horasTrabajadas,valorHora):
    if (horasTrabajadas >40):
        extras=horasTrabajadas-40
        valorextras= valorHora *extras*1.5
    else:
        valorextras=0
    return (valorextras)

def calculoBruto(valorHorasNormales,valorHorasExtras):
    bruto=valorHorasNormales+valorHorasExtras
    return(bruto)

def calculoParafiscal(sueldoBruto):
    calculo= sueldoBruto * 0.09
    return (calculo)


def calculoSalud(sueldoBruto):
    calculoSal= sueldoBruto * 0.04
    return (calculoSal)

def calculoPension(sueldoBruto):
    calculoPen= sueldoBruto * 0.04
    return (calculoPen)

def calculoDescuentos (parafiscales,salud,pension):
    calculoDes= parafiscales+salud+pension
    return(calculoDes)

def calculoNeto(sueldoBruto,descuentos):
    neto=sueldoBruto - descuentos
    return(neto)

def calculoProvPrima(sueldoBruto):
    calculo=sueldoBruto *0.0833
    return(calculo)

def calculoProvCesantias(sueldoBruto):
    calculo=sueldoBruto *0.0833
    return(calculo)

def calculoInteresCesantias (sueldoBruto):
    calculointeres=sueldoBruto *0.01
    return (calculointeres)

def calculoVacaciones (sueldoBruto):
    calculoVac=sueldoBruto *0.0417
    return(calculoVac)

valorHorasNormales= calculohorasNormales (horasTrabajadas,valorHora)
valorHorasExtras= calculoExtras( horasTrabajadas,valorHora)
sueldoBruto= calculoBruto (valorHorasNormales,valorHorasExtras)
parafiscales= calculoParafiscal(sueldoBruto)
salud= calculoSalud (sueldoBruto)
pension= calculoPension (sueldoBruto)
descuentos= calculoDescuentos (parafiscales,salud,pension)
sueldoNeto= calculoNeto(sueldoBruto,descuentos)
provisionPrima= calculoProvPrima (sueldoBruto)
provisionCesantias=calculoProvCesantias(sueldoBruto)
provisionInteresCesantias=calculoInteresCesantias(sueldoBruto)
provisionVacaciones=calculoVacaciones(sueldoBruto)


print (valorHorasNormales)
print (valorHorasExtras)
print (sueldoBruto)
print (parafiscales)
print (salud)
print (pension)
print (descuentos)
print (sueldoNeto)
print (provisionPrima)
print (provisionCesantias)
print (provisionInteresCesantias)
print (provisionVacaciones)