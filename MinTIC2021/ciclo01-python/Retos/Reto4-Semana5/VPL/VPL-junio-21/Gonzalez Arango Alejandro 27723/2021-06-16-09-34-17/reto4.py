ValorHNormales = 0.0
ValorHExtras = 0.0
HorasNormales = 0.0
SueldoBruto = 0.0
DescParafiscales = 0.0
DescSalud = 0.0
DescPension = 0.0
SumaDescuentos = 0.0
SueldoNeto = 0.0
ProvisionesPrima = 0.0
ProvisionesParaCesantias = 0.0
ProvisionesInteresCesantias = 0.0
ProvisionesVacaciones = 0.0

HTrabajadas = int(input())
ValorH = int(input())

def HorasNormales (HTrabajadas, ValorH):
    if (HTrabajadas >40):
        j = HTrabajadas - 40
        HTrabajadas = HTrabajadas - j
        HorasNormales = HTrabajadas * ValorH
        return (HorasNormales)
    else:
        j = HTrabajadas * ValorH
        return (j)

def CalcularValorHorasExtras (HTrabajadas, ValorH):
    if (HTrabajadas >40):
        HorasExtras = HTrabajadas - 40
        ValorHExtras = (HorasExtras) * (1.5 * ValorH)
    else:
        ValorHExtras = 0
        
    return (ValorHExtras)

def CalcularSueldoBruto (PagoHorasNormales, PagoHorasExtras):
    SueldoBruto = PagoHorasNormales + PagoHorasExtras
    return (SueldoBruto)

def CalcularDescuentoParafiscales (SueldoBruto):
    DescParafiscales = SueldoBruto * 0.09
    return (DescParafiscales)

def CalcularDescuentoSalud (SueldoBruto):
    DescSalud = SueldoBruto * 0.04
    return (DescSalud) 

def CalcularDescuentoPension (SueldoBruto):
    DescPension = SueldoBruto * 0.04
    return (DescPension)

def CalcularSumaDeDescuentos (DescParafiscales, DescSalud, DescPension):
    SumaDescuentos = DescParafiscales + DescSalud + DescPension
    return (SumaDescuentos)

def CalcularSueldoNeto (DescParafiscales, DescSalud, DescPension, SueldoBruto):
    SueldoNeto = SueldoBruto - (DescParafiscales + DescSalud + DescPension)
    return (SueldoNeto)

def CalcularProvisionesPrima (SueldoBruto):
    ProvisionesPrima = SueldoBruto * 0.0833
    return (ProvisionesPrima)

def CalcularProvisionesParaCesantias (SueldoBruto):
    ProvisionesParaCesantias = SueldoBruto * 0.0833
    return (ProvisionesParaCesantias)
    
def CalcularProvisionesInteresCesantias (SueldoBruto):
    ProvisionesInteresCesantias = SueldoBruto * 0.01
    return (ProvisionesInteresCesantias)

def CalcularProvisionesParaVacaciones (SueldoBruto):
    ProvisionesVacaciones = SueldoBruto * 0.0417
    return (ProvisionesVacaciones)

PagoHorasNormales = HorasNormales (HTrabajadas, ValorH) 
PagoHorasExtras = CalcularValorHorasExtras (HTrabajadas, ValorH)
SueldoBruto = CalcularSueldoBruto (PagoHorasNormales, PagoHorasExtras)
DescParafiscales = CalcularDescuentoParafiscales (SueldoBruto)
DescSalud = CalcularDescuentoSalud (SueldoBruto)
DescPension = CalcularDescuentoPension (SueldoBruto)
SumaDescuentos = CalcularSumaDeDescuentos (DescParafiscales, DescSalud, DescPension)
SueldoNeto = CalcularSueldoNeto (DescParafiscales, DescSalud, DescPension, SueldoBruto)
ProvisionesPrima = CalcularProvisionesPrima (SueldoBruto)
ProvisionesCesantias = CalcularProvisionesParaCesantias (SueldoBruto)
ProvisionesInteresCesantias = CalcularProvisionesInteresCesantias (SueldoBruto)
ProvisionesVacaciones = CalcularProvisionesParaVacaciones (SueldoBruto)

print (PagoHorasNormales)
print (PagoHorasExtras) 
print (SueldoBruto)
print (DescParafiscales)
print (DescSalud)
print (DescPension)
print (SumaDescuentos)
print (SueldoNeto)
print (ProvisionesPrima)
print (ProvisionesCesantias)
print (ProvisionesInteresCesantias)
print (ProvisionesVacaciones)