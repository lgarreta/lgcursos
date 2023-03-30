#!/usr/bin/python3

# VARIABLES
horasNormal = 0
horasExtra  = 0
valorHorasExtra = 0

horasTrabajadas = int (input ("Horas: "))
valorHoraNormal = int (input ("Valor: "))

def calcularPagoHorasNormal (horasTrabajadas, valorHoraNormal):
    pago = 0
    if (horasTrabajadas > 40):
        pago = 40 * valorHoraNormal
    else:
        pago = horasTrabajadas * valorHoraNormal
    #
    return (pago)
#

def calcularPagoHorasExtra (horasTrabajadas, valorHoraNormal):
    if (horasTrabajadas > 40):
        horasExtra = horasTrabajadas - 40
        valorHoraExtra = 1.5 * valorHoraNormal
        pago = horasExtra * valorHoraExtra
    else:
        pago = 0
    #
    return (pago)
#

def calcularSueldoBruto (pagoNormal, pagoExtra):
    sueldoBruto = pagoNormal + pagoExtra
    return (sueldoBruto)
#
#

pagoHorasNormal = calcularPagoHorasNormal (horasTrabajadas, valorHoraNormal)
pagoHorasExtra  = calcularPagoHorasExtra (horasTrabajadas, valorHoraNormal)
sueldoBruto     = calcularSueldoBruto (pagoHorasNormal, pagoHorasExtra)

descParafiscal = 0.09*sueldoBruto
descSalud      = 0.04*sueldoBruto
descPension    = 0.04*sueldoBruto
descTotal      = descParafiscal + descSalud + descPension 

sueldoNeto          = sueldoBruto - descParafiscal - descSalud - descPension

provPrima      = 0.0833*sueldoBruto
provCesantias  = 0.0833*sueldoBruto
provIntereses  = 0.01*sueldoBruto
provVacaciones = 0.0417*sueldoBruto

#

print (pagoHorasNormal)
print (pagoHorasExtra)
print (sueldoBruto)
print (descParafiscal)
print (descSalud)
print (descPension)
print (descTotal)
print (sueldoNeto)
print (provPrima)
print (provCesantias)
print (provIntereses)
print (provVacaciones)



