#PagoDeNomina

numeroHoras = int (input ("Numero de Horas: "))
valorHora = int (input ("Valor de Horas: "))

def horasBasicas (numeroHoras, valorHora): 

    if (numeroHoras <= 40):
        horasLaborales = valorHora * numeroHoras
        return horasLaborales
    else:
        horasLaborales = 40 * valorHora
        return horasLaborales
        
def horasExtras (numeroHoras, valorHora):    
        
    if (numeroHoras > 40):
        horas_Extras = (numeroHoras - 40)
        pagoExtras = (horas_Extras) * 1.5 * valorHora
        return pagoExtras 

    else:
        horas_Extras = 0
        return horas_Extras
    
def salarioBruto (horas_Ex, horasLaborales):
    salario_Bruto = horas_Ex + horasLaborales
    return salario_Bruto


def descuentos (salario_Bruto):
    descuentoPara = salario_Bruto * 0.09
    des_Salud = salario_Bruto * 0.04 
    des_Pension = salario_Bruto * 0.04
    sueldo_Neto = salario_Bruto - (descuentoPara + des_Salud + des_Pension)
    sumaTodosDes = des_Pension + des_Salud + descuentoPara
    return (descuentoPara, des_Salud, des_Pension, sueldo_Neto, sumaTodosDes)

def provisiones (salario_Bruto):
    prov_Prima = salario_Bruto * 0.0833
    prov_Cesantias = salario_Bruto * 0.0833
    prov_interesCesantias = salario_Bruto * 0.01
    prov_Vacaciones = salario_Bruto * 0.0417
    return (prov_Prima, prov_Cesantias, prov_interesCesantias, prov_Vacaciones)

total_Salario_Normal = horasBasicas (numeroHoras, valorHora)
total_Horas_Extras = horasExtras (numeroHoras, valorHora)
salario_Bruto_Final = salarioBruto (total_Salario_Normal, total_Horas_Extras)
desPara, desSalud, desPension, sueldoNetoFinal, sumaDeTodosDescuentos  = descuentos (salario_Bruto_Final)
provisiones_Pri, provisiones_Cesan, provisiones_int_Cesan, provisiones_vaca = provisiones (salario_Bruto_Final)

print (total_Salario_Normal) 
print (total_Horas_Extras) 
print (salario_Bruto_Final) 
print (desPara)
print (desSalud)
print (desPension)
print (sumaDeTodosDescuentos)
print (sueldoNetoFinal)
print (provisiones_Pri)
print (provisiones_Cesan)
print (provisiones_int_Cesan)
print (provisiones_vaca)