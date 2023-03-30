#Variables e inicializacion
Tmax=int (0)
Tmin=int (0)
Tmaxsuma=int(0)
Tminsuma=int(0)
Diasprueba=int (0)
Diaserrormaxima=int (0)
Diaserrorminima=int (0)
Diascorrectos=int (0)
Diasmalos=int (0)
Diaserrorambos=int (0)
Promediomaximas=float (0)
Promediominimas=float (0)
Porcentajediaserror=float (0)

while True:
    Tmax=int(input("Ingrese temperatura maxima: "))
    Tmin=int(input("ingrese temperatura minima: "))
    
    Diasprueba=Diasprueba+1
    
    if (Tmax==0 and Tmin==0):
        break
    if (Tmax<5 or Tmax>35):
        Diaserrormaxima=Diaserrormaxima+1
    if (Tmin<5 or Tmin>35):
        Diaserrorminima=Diaserrorminima+1
    if (Tmax<=35 and Tmax>=5 and Tmin>=5 and Tmin<=35):
        Tmaxsuma=Tmaxsuma+Tmax
        Tminsuma=Tminsuma+Tmin
        Diascorrectos=Diascorrectos+1
    if ((Tmax>35 or Tmax<5) and (Tmin<5 or Tmin>35)):
        Diaserrorambos=Diaserrorambos+1
    
    
    
Diasprueba=Diasprueba-1
Diasmalos=Diasprueba-Diascorrectos
Diaserrorminima=Diaserrorminima-Diaserrorambos
Diaserrormaxima=Diaserrormaxima-Diaserrorambos
Promediomaximas=Tmaxsuma/Diascorrectos
Promediominimas=Tminsuma/Diascorrectos
Porcentajediaserror=((100/Diasprueba)*(Diasmalos))


print (Diasprueba)
print (Diasmalos)
print (Diaserrorminima)
print (Diaserrormaxima)
print (Diaserrorambos)
print (Promediomaximas)
print (Promediominimas)
print (Porcentajediaserror)
