#!/usr/bin/python3

# FUNCIONES
def leerTemperaturas ():
    listaMaximas = []
    listaMinimas = []

    while (True):
        tempMax = int (input ("temp Maxima: "))
        tempMin = int (input ("temp Minima: "))

        if (tempMin==0 and tempMax==0):
            break

        listaMaximas.append (tempMax)
        listaMinimas.append (tempMin)
    #
    return (listaMaximas, listaMinimas)
#

def calcularTotalDias (listaMinimas):
    nDias = len (listaMinimas)
    return (nDias)


def calcularTotalDiasError (listaMaximas, listaMinimas):
    contadorDiasError = 0
    n = len (listaMaximas)
    i = 0
    while (i < n):
        tempMax = listaMaximas [i]
        tempMin = listaMinimas [i]

        if (tempMax > 35 or tempMin < 5):
            contadorDiasError += 1
        #
        i += 1
    #
    return (contadorDiasError)


def calcularDiasErrorMaximas (listaMaximas):
    diasErrorMax = 0
    for valor in listaMaximas:
        if (valor > 35):
            diasErrorMax +=1

    return (diasErrorMax)

def calcularDiasErrorMinimas (listaMinimas):
    diasErrorMin = 0
    for valor in listaMinimas:
        if (valor < 5):
            diasErrorMin +=1

    return (diasErrorMin)

def calcularDiasErrorAmbas (listaMaximas, listaMinimas):
    n = len (listaMaximas)
    i = 0
    contadorAmbas = 0
    while (i < n):
        tempMax = listaMaximas [i]
        tempMin = listaMinimas [i]
        if (tempMax > 35 and tempMin <5):
            contadorAmbas += 1
        #
        i += 1
    #

    return (contadorAmbas)

def calcularTempMediaMaximas (listaMaximas):
    sumaMaximas = 0
    contadorMaximas = 0
    media     = 0

    for temp in listaMaximas:
        if (temp <=35):
            sumaMaximas = sumaMaximas + temp
            contadorMaximas += 1
        #
    #
    media = sumaMaximas / contadorMaximas
    return (media)
#

def calcularTempMediaMinimas (listaMinimas):
    sumaMinimas = 0
    contadorMinimas = 0
    media     = 0

    for temp in listaMinimas:
        if (temp >= 5):
            sumaMinimas = sumaMinimas + temp
            contadorMinimas += 1
        #
    #
    media = sumaMinimas / contadorMinimas
    return (media)
#


# SALIDAS
totalDias = 0
totalDiasError = 0
diasErrorMinimas = 0
diasErrorMaximas = 0
diasErrorAmbas = 0
tempMediaMaxima = 0
tempMediaMinima = 0
totalTempMediaMinima = 0
porcentajeDiasErrores = 0

# VARIABLES
totalTempMediaMaxima = 0 
contadorTempMediaMinima = 0
contadorTempMediaMaxima = 0


# PROCESO
listaMaximas, listaMinimas = leerTemperaturas ()

totalDias         = calcularTotalDias (listaMinimas)
totalDiasError    = calcularTotalDiasError (listaMaximas, listaMinimas) 
#
diasErrorMaximas  = calcularDiasErrorMaximas (listaMaximas)
diasErrorMinimas  = calcularDiasErrorMinimas (listaMinimas)
#
diasErrorAmbas    = calcularDiasErrorAmbas (listaMaximas, listaMinimas)
diasErrorMaximas  = diasErrorMaximas - diasErrorAmbas
diasErrorMinimas  = diasErrorMinimas - diasErrorAmbas
#
tempMediaMaxima   = calcularTempMediaMaximas (listaMaximas)
tempMediaMinima   = calcularTempMediaMinimas (listaMinimas)
#
#
#porcentajeErrores = calcularPorcentajeErrores (diasErrorMinimas, diasErrorMaximas, diasErrorAmbas, totalDias)


#while (True):
#    tempMax = int (input ("temp Maxima: "))
#    tempMin = int (input ("temp Minima: "))
#    #tempMax = int (input ())
#    #tempMin = int (input ())
#    if (tempMin==0 and tempMax==0):
#        break
#    totalDias = 1 + totalDias
#    
#    if (tempMin < 5 and tempMax > 35):
#        diasErrorAmbas += 1 
#        totalDiasError +=1
#    elif (tempMin < 5):
#        diasErrorMinimas += 1 
#        totalDiasError +=1
#    elif (tempMax > 35):
#        diasErrorMaximas += 1 
#        totalDiasError +=1
#    else:
#        totalTempMediaMinima    = tempMin + totalTempMediaMinima
#        contadorTempMediaMinima = 1 + contadorTempMediaMinima
#        totalTempMediaMaxima    = tempMax + totalTempMediaMaxima
#        contadorTempMediaMaxima = 1 + contadorTempMediaMaxima
##
print (totalDias)
print (totalDiasError)
print (diasErrorMinimas)
print (diasErrorMaximas)
print (diasErrorAmbas)
#tempMediaMinima = totalTempMediaMinima / contadorTempMediaMinima
#tempMediaMaxima = totalTempMediaMaxima / contadorTempMediaMinima
print (tempMediaMaxima)
#porcentajeDiasErrores = totalDiasError/totalDias * 100
print (tempMediaMinima)
#tempMediaMaxima = totalTempMediaMaxima / contadorTempMediaMaxima
print (porcentajeDiasErrores)
#
#
