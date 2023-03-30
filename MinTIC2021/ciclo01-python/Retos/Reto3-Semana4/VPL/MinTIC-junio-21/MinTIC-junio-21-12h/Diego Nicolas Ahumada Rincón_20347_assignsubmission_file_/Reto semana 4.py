totalDiasDeCampo = 0
totalDiasConError = 0
diasConErrorTemperaturasMinimas = 0
diasConErrorTemperaturasMaximas = 0
diasConErrorAmbasTemperaturas = 0
mediaDiasConTemperaturasMaximas = 0
mediaDiasConTemperaturasMinimas = 0
porcentajeDiasConError = 0
diasSinErrorAmbasTemperaturas = 0

while (True):

    totalDiasDeCampo = totalDiasDeCampo + 1

    temperaturaMaxima =  int(input('Ingrese la temperatura maxima: '))
    temperaturaMinima =  int(input('Ingrese la temperatura minima: '))

    if (temperaturaMaxima == 0 and temperaturaMinima == 0):
        totalDiasDeCampo = totalDiasDeCampo -1
        break
    if (temperaturaMinima < 5 or temperaturaMaxima > 35):
        totalDiasConError = totalDiasConError + 1
    if (temperaturaMinima < 5):
            diasConErrorTemperaturasMinimas = diasConErrorTemperaturasMinimas + 1
    if (temperaturaMaxima > 35):
            diasConErrorTemperaturasMaximas = diasConErrorTemperaturasMaximas + 1
    if (temperaturaMinima < 5 and temperaturaMaxima > 35):
        diasConErrorAmbasTemperaturas = diasConErrorAmbasTemperaturas + 1
        diasConErrorTemperaturasMinimas = diasConErrorTemperaturasMinimas - 1
        diasConErrorTemperaturasMaximas = diasConErrorTemperaturasMaximas - 1
    if (temperaturaMinima >= 5 and temperaturaMaxima <= 35):
        diasSinErrorAmbasTemperaturas = diasSinErrorAmbasTemperaturas + 1
        mediaDiasConTemperaturasMaximas = mediaDiasConTemperaturasMaximas + temperaturaMaxima
        mediaDiasConTemperaturasMinimas = mediaDiasConTemperaturasMinimas + temperaturaMinima
        mediaDiasConTemperaturasMaximas1 = (mediaDiasConTemperaturasMaximas / diasSinErrorAmbasTemperaturas)
        mediaDiasConTemperaturasMinimas1 = (mediaDiasConTemperaturasMinimas / diasSinErrorAmbasTemperaturas)

    porcentajeDiasConError = (100 / totalDiasDeCampo) * totalDiasConError

print(totalDiasDeCampo)
print(totalDiasConError)
print(diasConErrorTemperaturasMinimas)
print(diasConErrorTemperaturasMaximas)
print(diasConErrorAmbasTemperaturas)
print(mediaDiasConTemperaturasMaximas1)
print(mediaDiasConTemperaturasMinimas1)
print(porcentajeDiasConError)