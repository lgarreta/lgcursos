edad = 0
notaExamen = 0
smlv = 0
descuentoTotal = 0
#
edad         = int(input())
notaExamen   = int(input())
smlv         = int(input())
#
if edad in range(15, 19):
    edad = 25   
    
elif edad in range(19,22):
    edad = 15
    
elif edad in range(22,26):
    edad = 10
    
else:
    edad = 0
#
   
if (notaExamen >= 80 and notaExamen < 86):
    notaExamen = 30
    
elif (notaExamen >= 86 and notaExamen < 91):
    notaExamen = 35
     
elif (notaExamen >= 91 and notaExamen < 96):
    notaExamen = 40
     
elif (notaExamen >= 96):
    notaExamen = 45
             
elif (notaExamen < 80):
    notaExamen = 0
   
     
    
#
if (smlv <= 1):
    smlv = 30
    
elif (smlv >1 and smlv <= 2):
    smlv = 20
    
elif (smlv > 2 and smlv <= 3):
    smlv = 10
    
elif (smlv > 3 and smlv <= 4):
    smlv = 5
    
elif (smlv > 4):
    smlv = 0
    
#
descuentoTotal = edad + smlv + notaExamen
# 

print(edad)
print(notaExamen)
print(smlv)
print(descuentoTotal)