#ENTRADAS
Tmax = 0
Tmin = 0 
Tma = 0
Tmi = 0
n=0
#SALIDAS
ContDias = 0
DiasError = 0
ContMin = 0
ContMax = 0
ContAmbos = 0
MediaMax = 0
MediaMin = 0
AcomMin = 0
AcomMax = 0
a = 0
PorcentajeError = 0

while (True):
    Tmax = int (input())
    Tmin = int (input())
    n=n+1
    if (Tmax<=35 and Tmin>=5):
        a = a+1
        AcomMin=Tmin+AcomMin
        AcomMax=Tmax+AcomMax
       
    if (Tmin<5 and Tmax>35):
        ContAmbos=ContAmbos+1  
    elif (Tmin<5):
        ContMin=ContMin+1
    elif (Tmax>35):
        ContMax=ContMax+1
        
    if (Tmin<5 or Tmax>35):
        DiasError=DiasError+1    
        
    if (Tmax ==0 and Tmin ==0):
        n=n-1
        DiasError=DiasError-1
        ContMin=ContMin-1
        break
    
PorcentajeError = 100*(DiasError/n)
MediaMax = AcomMax/a
MediaMin = AcomMin/a

#salidas
print (n)
print (DiasError)
print (ContMin)
print (ContMax)
print (ContAmbos)
print (MediaMax)
print (MediaMin)
print (PorcentajeError)

