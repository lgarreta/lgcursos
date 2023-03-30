# Programa de porcentajes de ayuda para la matricula de la Universidad "Universia"

# nombre = input("Ingrese nombre y apellido completo: ")
Edad = int(input("Cuantos años tiene? "))
PuntajeExamen = int(input("Cual es el puntaje del examen: "))
IngresoFamiliar = int(input("Cual es el ingreso familiar: "))

PorcentajePorEdad = 0
PorcentajePorExamen = 0
PorcentajePorIngresos = 0
DescuentoTotal = 0

if (Edad >= 15 and Edad <= 18):
    PorcentajePorEdad = 25 
elif (Edad >= 19 and Edad <= 21):
    PorcentajePorEdad = 15
elif (Edad >= 22 and Edad <= 25):
    PorcentajePorEdad = 10 
else:
    (Edad < 15 and edad > 25)
    PorcentajePorEdad = 0
 
if (PuntajeExamen >= 80 and PuntajeExamen < 86):
    PorcentajePorExamen = 30 
elif (PuntajeExamen >= 86 and PuntajeExamen < 91):
    PorcentajePorExamen = 35
elif (PuntajeExamen >= 91 and PuntajeExamen <= 100):
    PorcentajePorExamen = 45 
else:
     (PuntajeExamen < 80)
     PorcentajePorExamen = 0
   
if (IngresoFamiliar <= 1.0):
    PorcentajePorIngresos = 30 
elif (IngresoFamiliar > 1.0 and IngresoFamiliar < 2.0):
    PorcentajePorIngresos = 20
elif (IngresoFamiliar > 2.0 and IngresoFamiliar < 3.0):
    PorcentajePorIngresos = 10 
elif (IngresoFamiliar > 3.0 and IngresoFamiliar < 4.0):
    PorcentajePorIngresos = 5 
else:
    PorcentajePorIngresos = 0

DescuentoTotal = PorcentajePorEdad + PorcentajePorExamen + PorcentajePorIngresos

print (PorcentajePorEdad)
print (PorcentajePorExamen)
print (PorcentajePorIngresos)
print (DescuentoTotal)