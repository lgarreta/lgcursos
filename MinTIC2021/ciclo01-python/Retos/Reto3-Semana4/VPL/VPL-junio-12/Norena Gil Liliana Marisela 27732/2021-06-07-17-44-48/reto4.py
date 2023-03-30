##Ingresar aquí todo el código respectivo
#NÓMINA DE DOCENTES CONTRATAD@S POR HORA

#ENTRADAS

horasTrabajadas=int (input("HorasTrabajadas: "))
valorHora=int (input("ValorHora: "))

#DEFINICIÓN DE FUNCIONES

#Cálculo del valor de las horas normales

def calcularVrHorasNormales (ht,vh):
    vhnormal = 0
    cantHrTr = 40
    if (ht>=40):
        vhnormal=(cantHrTr*vh)
    elif (ht<40):
        vhnormal=(ht*vh)
    #        
    return (vhnormal)
#

#Cálculo del valor de las horas extras

def calcularVrHorasExtras (ht, vh):
    vhextra = 0
    if (ht>40):
        vhextra= (ht-40)*(vh*1.5)
    else:
        vhextra=0
    return (vhextra)
#

#Cálculo del salario bruto
#Valor horas normales + valor horas extras

def calcularSalarioBruto (vhnormal, vhextra):
    sb= (vhnormal + vhextra)
    return (sb)
#

#Cálculo de los parafiscales
#9% para los parafiscales

def calcularDctoParafiscales (sb):
    DctoParafiscales = (sb * 0.09)
    return (DctoParafiscales)
#

#Cálculo del descuento de salud (4%)

def calcularDctoSalud (sb):
    DctoSalud = (sb * 0.04)
    return (DctoSalud)
#

#Cálculo del descuento de pension (4%)

def calcularDctoPension (sb):
    DctoPension = (sb * 0.04)
    return (DctoPension)
#

#Cálculo de la suma de los descuentos
#DescuentoParafiscaless + DctoSalud + DctoPensión

def calcularTotalDctos (dParafiscal, dSalud, dPension):
    TotalDctos = (dParafiscal + dSalud + dPension)
    return (TotalDctos)
#

#Cálculo del salario neto a pagar
#Salario bruto - los descuentos totales

def calcularSalarioNeto (sb, dParafiscal, dSalud, dPension):
    SalarioNeto= sb - (dParafiscal + dSalud + dPension)
    return (SalarioNeto)
#
#Cálculo provisiones para prima de servicio (8.33%)

def calcularProvisionesPrima (sb):
    ProvisionesPrima = sb * 0.0833
    return (ProvisionesPrima)
#

#Cálculo provisiones para Cesantías (8.33%)

def calcularProvisionesCesantias (sb):
    ProvisionesCesantias = sb * 0.0833
    return (ProvisionesCesantias)
#

#Cálculo provisiones de intereses cesantías (1%)

def calcularInteresesCesantias (sb):
    ProvisionesIntCesantias= sb * 0.01
    return (ProvisionesIntCesantias)
#

#Cálculo provisiones vacaciones (4.17%)

def calcularProvisionesVacaciones (sb):
    ProvisionesVacaciones = sb * 0.0417
    return (ProvisionesVacaciones)
#

#PROCESO

vrHoraNormal= calcularVrHorasNormales (horasTrabajadas, valorHora)
vrHoraExtra= calcularVrHorasExtras (horasTrabajadas, valorHora)
salarioBruto= calcularSalarioBruto (vrHoraNormal, vrHoraExtra)
dctoParafiscales= calcularDctoParafiscales (salarioBruto)
dctoSalud= calcularDctoSalud (salarioBruto)
dctoPension = calcularDctoPension (salarioBruto)
totalDescuentos = calcularTotalDctos (dctoParafiscales, dctoSalud, dctoPension)
salarioNeto= calcularSalarioNeto (salarioBruto, dctoParafiscales, dctoSalud, dctoPension)
provisionesPrima = calcularProvisionesPrima (salarioBruto)
provisionesCesantias = calcularProvisionesCesantias (salarioBruto)
interesesCesantias = calcularInteresesCesantias (salarioBruto)
provisionesVacaciones = calcularProvisionesVacaciones (salarioBruto)

#SALIDAS

print (vrHoraNormal)
print (vrHoraExtra)
print (salarioBruto)
print (dctoParafiscales)
print (dctoSalud)
print (dctoPension)
print (totalDescuentos)
print (salarioNeto)
print (provisionesPrima)
print (provisionesCesantias)
print (interesesCesantias)
print (provisionesVacaciones)

