edad = int (input ("Edad: "))
puntajeExamen = int (input ("Puntaje: "))
salarioMinimoFamiliar = int (input ("Ingreso: "))

acumuludaBonoDeDescuento = 0

if(edad >= 15 and edad <= 18):
    descuentoPorEdadPorcentaje = 25
    descuentoPorEdadTexto = 'El descuento de acuerdo a tu edad es de: 25%'
elif(edad >= 19 and edad <= 21):
    descuentoPorEdadPorcentaje = 15
    descuentoPorEdadTexto = 'El descuento de acuerdo a tu edad es de: 15%'
elif(edad >= 22 and edad <= 25):
    descuentoPorEdadPorcentaje = 10
    descuentoPorEdadTexto = 'El descuento de acuerdo a tu edad es de: 10%'
elif(edad > 25):
    descuentoPorEdadPorcentaje = 0
    descuentoPorEdadTexto = 'De acuerdo a tu edad, no se aplica ningun descuento'
else:
    descuentoPorEdadPorcentaje = 0
    descuentoPorEdadTexto = 'La edad que ingresaste no es valida'

if(salarioMinimoFamiliar >= 0 and salarioMinimoFamiliar <= 1):
    descuentoPorIngresoFamiliarPorcentaje = 30
    descuentoPorIngresoFamiliarTexto = 'El descuento de acuerdo a tu ingreso familiar es de: 30%'
elif(salarioMinimoFamiliar > 1 and salarioMinimoFamiliar <= 2):
    descuentoPorIngresoFamiliarPorcentaje = 20
    descuentoPorIngresoFamiliarTexto = 'El descuento de acuerdo a tu ingreso familiar es de: 20%'
elif(salarioMinimoFamiliar > 2 and salarioMinimoFamiliar <= 3):
    descuentoPorIngresoFamiliarPorcentaje = 10
    descuentoPorIngresoFamiliarTexto = 'El descuento de acuerdo a tu ingreso familiar es de: 10%'
elif(salarioMinimoFamiliar > 3 and salarioMinimoFamiliar <= 4):
    descuentoPorIngresoFamiliarPorcentaje = 5
    descuentoPorIngresoFamiliarTexto = 'El descuento de acuerdo a tu ingreso familiar es de: 5%'
elif(salarioMinimoFamiliar > 4):
    descuentoPorIngresoFamiliarPorcentaje = 0
    descuentoPorIngresoFamiliarTexto = 'De acuerdo a tu ingreso familiar, no aplica ningun descuento'
else:
    descuentoPorIngresoFamiliarPorcentaje = 0
    descuentoPorIngresoFamiliarTexto = 'El ingreso familiar que ingresaste no es valido'

if(puntajeExamen >= 80 and puntajeExamen < 86):
    descuentoPorPuntajeExamenPorcentaje = 30
    descuentoPorPuntajeExamenTexto = 'El descuento de acuerdo a tu puntaje del examen es de: 30%'
elif(puntajeExamen >= 86 and puntajeExamen < 91):
    descuentoPorPuntajeExamenPorcentaje = 35
    descuentoPorPuntajeExamenTexto = 'El descuento de acuerdo a tu puntaje del examen es de: 35%'
elif(puntajeExamen >= 91 and puntajeExamen < 96):
    descuentoPorPuntajeExamenPorcentaje = 40
    descuentoPorPuntajeExamenTexto = 'El descuento de acuerdo a tu puntaje del examen es de: 40%'
elif(puntajeExamen >= 96 and puntajeExamen <= 100):
    descuentoPorPuntajeExamenPorcentaje = 45
    descuentoPorPuntajeExamenTexto = 'El descuento de acuerdo a tu puntaje del examen es de: 45%'
elif(puntajeExamen >= 0 and puntajeExamen < 80):
    descuentoPorPuntajeExamenPorcentaje = 0
    descuentoPorPuntajeExamenTexto = 'De acuerdo al puntaje de tu examen, no aplica ningun descuento'
else:
    descuentoPorPuntajeExamenPorcentaje = 0
    descuentoPorPuntajeExamenTexto = 'El puntaje de examen que ingresaste no es valido'

acumuludaBonoDeDescuento = descuentoPorEdadPorcentaje + descuentoPorIngresoFamiliarPorcentaje + descuentoPorPuntajeExamenPorcentaje


print(descuentoPorEdadPorcentaje)
print(descuentoPorPuntajeExamenPorcentaje)
print(descuentoPorIngresoFamiliarPorcentaje)
print(acumuludaBonoDeDescuento)