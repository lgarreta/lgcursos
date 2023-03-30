
edad                = int   (input ("ingrese edad:   "  ,))
notaExamen          = int (input ("ingrese nota Examen:   ",))
salarioFamiliar     = int (input ("Ingrese Salario Familiar:   ",))

descuentoedad        = 0
descuentoExamen      = 0
dessalarioFamiliar   = 0

#
if   (edad >= 15 and  edad <= 18):
      descuentoedad = 25
elif (edad >= 19 and edad <= 21):
      descuentoedad = 15
elif (edad >= 22 and edad <=25):
      descuentoedad = 10
else:
     descuentoedad = 0

if   (notaExamen >= 80 and notaExamen <= 86):
      descuentoExamen  = 30
elif (notaExamen >= 86 and notaExamen <= 91):
      descuentoExamen  = 40
elif (notaExamen >= 96):
      descuentoExamen  = 45
else:
      descuentoExamen = 0    

if  (salarioFamiliar >= 1.0 and salarioFamiliar<= 1.9):
     dessalarioFamiliar  = 30
elif (salarioFamiliar >= 2.0 and salarioFamiliar <= 2.9):
      dessalarioFamiliar = 20
elif (salarioFamiliar >= 3.0 and salarioFamiliar <= 3.9):
      dessalarioFamiliar = 10
elif (salarioFamiliar >= 4.0 and salarioFamiliar <= 4.9):
      dessalarioFamiliar = 5
else:
    dessalarioFamiliar  = 0
     
descuentoTotal = descuentoedad+descuentoExamen+dessalarioFamiliar
print  (descuentoedad)
print  (descuentoExamen)
print  (dessalarioFamiliar)
print  (descuentoTotal)


