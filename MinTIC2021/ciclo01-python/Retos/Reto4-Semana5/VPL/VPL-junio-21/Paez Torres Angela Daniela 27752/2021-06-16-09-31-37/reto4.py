##Ingresar aquí todo el código respectivo
horasTrabajadas = 0
valorHora = 0

def CalculoHorasNormales(horasTrabajadas, valorHora):
    if horasTrabajadas > 40:
        return 40 * valorHora
    else:
        return horasTrabajadas * valorHora


def CalculoHorasExtras(horasTrabajadas, valorHora):
    if horasTrabajadas > 40:
        return (horasTrabajadas - 40) * 1.5 * valorHora
    else:
        return 0


def CalcularSueldoBruto(valorHorasNormales, valorHorasExtras):
    return valorHorasNormales + valorHorasExtras


def Descuento_Parafiscales(salarioBruto):
    return salarioBruto * 0.09


def Descuento_SaludPension(salarioBruto):
    return salarioBruto * 0.04


def Total_Descuentos(descuentoParafiscal, descuentoSalud, descuentoPension):
    return descuentoParafiscal + descuentoSalud + descuentoPension


def Provisiones_Prima(salarioBruto):
    return salarioBruto * 0.0833


def Provisiones_Cesantias(salarioBruto):
    return salarioBruto * 0.0833


def Provisiones_Intereses_Cesantia(salarioBruto):
    return salarioBruto * 0.01


def Provisiones_Vacaciones(salarioBruto):
    return salarioBruto * 0.0417


def CalcularSueldoNeto(salarioBruto, sumaDescuentos):
    return salarioBruto - sumaDescuentos

horasTrabajadas = int(input())
valorHora = int(input())

valorHorasNormales = CalculoHorasNormales(horasTrabajadas, valorHora)
valorHorasExtras = CalculoHorasExtras(horasTrabajadas, valorHora)
salarioBruto = CalcularSueldoBruto(valorHorasNormales, valorHorasExtras)
descuentoParafiscal = Descuento_Parafiscales(salarioBruto)
descuentoSalud = Descuento_SaludPension(salarioBruto)
descuentoPension = Descuento_SaludPension(salarioBruto)
sumaDescuentos = Total_Descuentos(descuentoParafiscal, descuentoSalud, descuentoPension)

print(valorHorasNormales)
print(valorHorasExtras)
print(salarioBruto)
print(descuentoParafiscal)
print(descuentoSalud)
print(descuentoPension)
print(sumaDescuentos)
print(CalcularSueldoNeto(salarioBruto, sumaDescuentos))
print(Provisiones_Prima(salarioBruto))
print(Provisiones_Cesantias(salarioBruto))
print(Provisiones_Intereses_Cesantia(salarioBruto))
print(Provisiones_Vacaciones(salarioBruto))