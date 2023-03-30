# Programa notas
# ENTRADAS: nombre (cadena), codigo (entero), nota (decimal), participacion (entero)
# SALIDAS : nombre, codigo, bonoNota (decimal), bonoParticipacion (decimal), notaFinal (decimal)

# Tipos de datos python
# cadena  : str
# entero  : int
# decimal : float

# ENTRADAS:
nombre        = input ("Ingrese nombre: ")
codigo        = int (input ("Ingrese codigo: "))
nota          = float (input("Ingrese nota final: "))
participacion = int (input ("Ingrese partipacion: "))

# INICIALIZACION DE LAS SALIDAS:
# nombre
# codigo
bonoNota  = 0.0
bonoParticipacion = 0.0
totalBonos = 0.0
notaTotal = 0.0

# SOLUCION: nota=4.0
# Solucion bonoNota
if ( nota >=3.5 and nota < 4.0 ):
    bonoNota = 0.3
elif (nota >= 4.0 and nota < 4.5):
    bonoNota = 0.5
elif (nota >= 4.5):
    bonoNota = 0.0
else:
    bonoNota = 0.0
    
# Solucion bonoParticipacion
if (participacion >= 20     and   participacion <= 50 ):
    bonoParticipacion = 0.2
elif (participacion > 50    and   participacion < 80):
    bonoParticipacion = 0.4
elif (participacion >= 80):
    bonoParticipacion = 0.5
else:
    bonoParticipacion = 0.0
    
# Solucion totales
totalBonos = bonoNota + bonoParticipacion

notaTotal = nota + totalBonos

if (notaTotal > 5.0):
    notaTotal = 5.0
#

# RESPUESTA:
print (nombre, codigo, bonoNota, bonoParticipacion, totalBonos, notaTotal)
