# Entradas
#nombre = input ('Nombre completo: ')
horas = int (input ())
valorhora = int (input ())

#Salidas
valortotalhorasnorm = 0
valortotalhorasext = 0
salariobruto = 0
descuentosparafiscales = 0
descuentosalud = 0
descuentopension = 0
totaldescuentos = 0
sueldonetoapagar = 0
provisionesprima = 0
provisionescesantias = 0
provisionesintereses = 0
provisionesvacaciones = 0

maxhoras = 40
porcentaje = 1.5
tasaparafiscal = 0.09
tasasalud = 0.04
tasapension = 0.04
tasaprima = 0.0833
tasacesantias = 0.0833
tasaintereses = 0.01
tasavacaciones = 0.0417
#Definición de funciones
def calcularvalortotalhorasnorm (horas, valorhora):
    if (horas > 40):
        horas = 40
    valortotalhorasnorm = horas * valorhora
    return (valortotalhorasnorm)

def calcularvalortotalhorasext (horas, maxhoras, porcentaje, valorhora):
    if (horas <=40):
        valortotalhorasext = 0
        return (valortotalhorasext)
    elif (horas > 40):
        valortotalhorasext = ((horas - maxhoras )* porcentaje * valorhora)
        return (valortotalhorasext)

def calcularsalariobruto (valortotalhorasnorm, valortotalhorasext):
    salariobruto = valortotalhorasnorm + valortotalhorasext
    return (salariobruto)

def calculardescuentosparafiscales (salariobruto, tasaparafiscal):
    descuentosparafiscales = (salariobruto * tasaparafiscal)
    return (descuentosparafiscales)

def calculardescuentosalud (salariobruto, tasasalud):
    descuentosalud = (salariobruto *tasasalud)
    return (descuentosalud)

def calculardescuentopension (salariobruto, tasapension):
    descuentopension = (salariobruto *tasapension)
    return (descuentopension)

def calculartotaldescuentos (descuentosparafiscales, descuentosalud, descuentopension):
    totaldescuentos = (descuentosparafiscales + descuentosalud + descuentopension)
    return (totaldescuentos)

def calcularsueldoneto (salariobruto, totaldescuentos):
    sueldonetoapagar = (salariobruto - totaldescuentos)
    return (sueldonetoapagar)

def calcularprima (salariobruto, tasaprima):
    prima = (salariobruto * tasaprima)
    return (prima)

def calcularcesantias (salariobruto, tasacesantias):
    cesantias = (salariobruto * tasacesantias)
    return (cesantias)

def calcularintereses (salariobruto, tasaintereses):
    intereses = (salariobruto * tasaintereses)
    return (intereses)
def calcularvacaciones (salariobruto, tasavacaciones):
    vacaciones = (salariobruto * tasavacaciones)
    return (vacaciones)

#Procesos
valortotalhorasnorm = calcularvalortotalhorasnorm (horas, valorhora)
valortotalhorasext = calcularvalortotalhorasext (horas, maxhoras, porcentaje, valorhora)
salariobruto = calcularsalariobruto (valortotalhorasnorm, valortotalhorasext)
descuentosparafiscales = calculardescuentosparafiscales (salariobruto, tasaparafiscal)
descuentosalud = calculardescuentosalud (salariobruto, tasasalud)
descuentopension = calculardescuentopension (salariobruto, tasapension)
totaldescuentos = calculartotaldescuentos (descuentosparafiscales, descuentosalud, descuentopension)
sueldonetoapagar = calcularsueldoneto (salariobruto, totaldescuentos)
provisionesprima = calcularprima (salariobruto, tasaprima)
provisionescesantias = calcularcesantias (salariobruto, tasacesantias)
provisionesintereses = calcularintereses (salariobruto, tasaintereses)
provisionesvacaciones = calcularvacaciones (salariobruto, tasavacaciones)

print (valortotalhorasnorm)
print (valortotalhorasext)
print (salariobruto)
print (descuentosparafiscales)
print (descuentosalud)
print (descuentopension)
print (totaldescuentos)
print (sueldonetoapagar)
print (provisionesprima)
print (provisionescesantias)
print (provisionesintereses)
print (provisionesvacaciones)
