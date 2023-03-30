

ingpor = 0
punpor = 0
edadpor = 0

edad = int (input ("Ingrese la Edad del Candidato: "))
punexa = int(input ("Ingrese Puntaje Examen: "))
ingfam = float (input("Introduzca el Ingreso Familiar(en decimales): "))

if (edad > 15 and edad <= 18):
    edadpor = 25
elif (edad >= 19 and edad <= 21):
    edadpor = 15
elif (edad > 22 and edad <= 25):
    edadpor = 10
else:
    edadpor = 0


if (punexa >= 80 and punexa < 86):
    punpor = 30
elif (punexa >= 86 and punexa < 91):
    punpor = 35
elif (punexa >= 91 and punexa < 96):
    punpor = 40
elif (punexa >= 96):
    punpor = 45
else:
    punpor = 0
    
if (ingfam <= 1):
    ingpor = 30
elif (ingfam > 1 and ingfam <= 2):
    ingpor = 20
elif (ingfam > 2 and ingfam <= 3):
    ingpor = 10
elif (ingfam > 3 and ingfam <= 4):
    ingpor = 5
else:
    ingpor = 0
    
porTotal = edadpor + punpor + ingpor
    
print (edadpor)
print (punpor)
print (ingpor)
print (porTotal)
    
    


    
    
    






