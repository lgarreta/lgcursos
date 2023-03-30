horasTrabajadas = int(input('Ingrese las horas trabajadas: '));
valorHora = float(input('Ingrese el valor de la hora: '));

def valorHorasNormales(ht,vh):
    if(ht > 40):
        ht = 40
    return int(ht * vh)

def valorHorasExtras(ht,vh):
    if(ht > 40):
        horasExtras = (ht - 40)
        valorHorasExtras = 1.5 * vh
        return horasExtras * valorHorasExtras
    else:
        return 0

def sueldoBruto(HorasNormales,HorasExtras):
    return HorasNormales + HorasExtras

def descuentoParafiscales(sueldoBruto):
    return sueldoBruto * 0.09

def descuentoSalud(sueldoBruto):
    return sueldoBruto * 0.04

def descuentoPension(sueldoBruto):
    return sueldoBruto * 0.04

def descuentosTotales(descuentoParafiscales,descuentoSalud,descuentoPension):
    return descuentoParafiscales + descuentoSalud + descuentoPension

def sueldoNeto(sueldoBruto,descuentosTotales):
    return sueldoBruto - descuentosTotales

def provisionesPrima(sueldoBruto):
    return sueldoBruto * 0.0833

def provisionesCesantias(sueldoBruto):
    return sueldoBruto * 0.0833

def provisionesInteresesCesantias(sueldoBruto):
    return sueldoBruto * 0.01

def provisionesVacaciones(sueldoBruto):
    return sueldoBruto * 0.0417

valorHorasNormales = valorHorasNormales(horasTrabajadas,valorHora)
valorHorasExtras = valorHorasExtras(horasTrabajadas,valorHora)
sueldoBruto = sueldoBruto(valorHorasNormales,valorHorasExtras);
descuentoParafiscales = descuentoParafiscales(sueldoBruto);
descuentoSalud = descuentoSalud(sueldoBruto);
descuentoPension = descuentoPension(sueldoBruto);
descuentosTotales = descuentosTotales(descuentoParafiscales,descuentoSalud,descuentoPension);
sueldoNeto = sueldoNeto(sueldoBruto,descuentosTotales);
provisionesPrima = provisionesPrima(sueldoBruto);
provisionesCesantias = provisionesCesantias(sueldoBruto);
provisionesInteresesCesantias = provisionesInteresesCesantias(sueldoBruto);
provisionesVacaciones = provisionesVacaciones(sueldoBruto);

print(valorHorasNormales);
print(valorHorasExtras);
print(sueldoBruto);
print(descuentoParafiscales);
print(descuentoSalud);
print(descuentoPension);
print(descuentosTotales);
print(sueldoNeto);
print(provisionesPrima);
print(provisionesCesantias);
print(provisionesInteresesCesantias);
print(provisionesVacaciones);