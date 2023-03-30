##Ingresar aquí todo el código respectivo
horasTrabajadas = 0
valorHora = 0

horasTrabajadas = int(input())
valorHora = int(input())
    
valorHorasNormales = horasTrabajadas * valorHora

hx = horasTrabajadas - 40
valorHorasExtras = (hx) * (1.5*valorHora)

sueldoBruto = valorHorasNormales + valorHorasExtras

descuentoParafiscales = sueldoBruto * 0.09

descuentoSalud = sueldoBruto * 0.04

descuentoPension = sueldoBruto * 0.04

totalDescuentos = descuentoParafiscales + descuentoSalud + descuentoPension

sueldoNeto = sueldoBruto - totalDescuentos

provisionesPrima = sueldoBruto * 0.0833

provisionesCesantias = sueldoBruto * 0.0833

provisionesInteresesCesantia = sueldoBruto * 0.01

provisionesVacaciones= sueldoBruto * 0.0417

print(valorHorasNormales)
print(valorHorasExtras)
print(sueldoBruto)
print(descuentoParafiscales)
print(descuentoSalud)
print(descuentoPension)
print(totalDescuentos)
print(sueldoNeto)
print(provisionesPrima)
print(provisionesCesantias)
print(provisionesInteresesCesantia)
print(provisionesVacaciones)
