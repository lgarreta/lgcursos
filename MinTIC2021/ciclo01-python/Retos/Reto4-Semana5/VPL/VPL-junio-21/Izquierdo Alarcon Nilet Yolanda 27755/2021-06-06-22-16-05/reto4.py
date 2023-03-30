Horas_trabajadas = int(input())
Valor_hora = int(input())

def Sueldo_basico ():
    if Horas_trabajadas <= 40:
        salariobasico = Horas_trabajadas * Valor_hora
    else:
        salariobasico = 40 * Valor_hora
    return salariobasico

def Sueldo_extra ():
    if Horas_trabajadas > 40:
        salarioextra = (Horas_trabajadas - 40)*(1.5 * Valor_hora)
    else:
        salarioextra = 0
    return salarioextra
        
def Sueldoconextras ():
    salarioconextras = Sueldo_basico() + Sueldo_extra()
    return salarioconextras

def Des_parafiscales ():
    Descuentoparafiscales = Sueldoconextras() * 0.09
    return Descuentoparafiscales

def Des_salud ():
    Descuentosalud = Sueldoconextras() * 0.04
    return Descuentosalud

def Des_pension ():
    Descuentopension = Sueldoconextras() * 0.04
    return Descuentopension

def Descuentos ():
    SumaDescuentos = Des_parafiscales () + Des_salud () + Des_pension () 
    return SumaDescuentos

def SueldoNeto ():
    SueldoNeto = Sueldoconextras () - Descuentos ()
    return SueldoNeto

def Prima ():
    Provisionesprima = Sueldoconextras () * 0.0833
    return Provisionesprima 

def Cesantias ():
    Provisionescesantia = Sueldoconextras () * 0.0833
    return Provisionescesantia 

def InteresCesantia ():
    ProvisionesInteresCesantia = Sueldoconextras () * 0.01
    return ProvisionesInteresCesantia

def Vacaciones ():
    ProvicionesVacaciones = Sueldoconextras () * 0.0417
    return ProvicionesVacaciones

print(Sueldo_basico ())
print(Sueldo_extra ())
print(Sueldoconextras())
print(Des_parafiscales ())
print(Des_salud ())
print(Des_pension ())
print(Descuentos ())
print(SueldoNeto ())
print(Prima ())
print(Cesantias ())
print(InteresCesantia ())
print(Vacaciones ())
