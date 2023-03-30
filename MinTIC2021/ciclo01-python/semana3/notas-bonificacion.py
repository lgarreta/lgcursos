# Problema notas:
# Ingresa nombre:
# Se ingresan 2 (decimales) notas y participacion en clase (como porcentaje 30%: 0.3, 100%: 1.0, 0%:0.0)
# Bonificaciones >= 4.0:0.5, >= 3.0:0.2, < 3.0:-0.5
# Participacion estuvo 10% y 30% -> 0.5, 31% y 50: 1.0, > 50:2.0

# ENTRADAS: Nombre (string), nota1 (float), nota2 (float), participacion (int)
# SALIDAS: Nombre, bonificacion por nota, bonificacion por participacion, notaFinal

# PASO0: Inicializacion de variables
nombre    = "Desconocido"
bonoNota  = 0.0
bonoParti = 0
notaFinal = 0.0

# PASO1: Entradas
nombre        = input ("Ingrese nombre: ")
nota1         = float (input ("Ingrese nota1: "))
nota2         = float (input ("Ingrese nota2: "))
participacion = int (input("Ingrese porcentaje participacion en valor entero. Ej. 30: "))

# PASO2: Calculo de nota y bonificacion por nota
notaFinal = (nota1 + nota2) / 2

# PASO3: Calculamos bonificaciones por nota
if (notaFinal >= 4.0):
    
    notaFinal = notaFinal + 0.5
    bonoNota  = 0.5
elif (notaFinal >= 3.0):
    
    notaFinal = notaFinal + 0.2
    bonoNota  = 0.2
else:
    
    notaFinal = notaFinal - 0.5
    bonoNota  = -0.5
    
    
# PASO4: Calculo bonificaciones participacion    
if (participacion >= 10 and participacion <= 30):
    notaFinal = notaFinal + 0.5
    bonoParti = 0.5
elif (participacion > 30 and participacion <=50):
    bonoParti = 1.0
    notaFinal = notaFinal + bonoParti
else:
    bonoParti = 2.0
    notaFinal = notaFinal + bonoParti
#    

print ("Usuario: ", nombre, "Bonificación Nota: ", bonoNota, "Bono participación: ", bonoParti, "Nota final :", notaFinal)
    

