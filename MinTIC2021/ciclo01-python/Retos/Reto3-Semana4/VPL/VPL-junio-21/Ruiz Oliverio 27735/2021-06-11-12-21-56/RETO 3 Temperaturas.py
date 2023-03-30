DiasCampo=0
TempMedMin=0
TempMedMax=0
TotalDias=0
SumaAlta=0
SumaBaja=0
PorDiasError=0
DiasTempBaja=[]
DiasTempAlta=[]
DiasTempAmb=[]
TempBuena=[]
TempMal=[]
Temp=[]       # Temeperaturas de entradad desde el teclado,alternadas  mayor primero meno despues

valor=int(input(" "))       #("Ingresar valor temperatura (0 para finalizar):"))

while (valor!=0):
    Temp.append(valor)
    valor=int(input(" "))     #("Ingresar valor temperatura (0 para finalizar):"))

DiasCampo = int(len(Temp)/2)

ListTemp=[]  #temperatura agrupadas por parejas

for i in range(0, len(Temp),2):
    ListTemp.append(Temp[i:i+2])
    
TempPar = len(ListTemp) 

j=0
while j < DiasCampo:
        T1=ListTemp[j]
        T2=T1[0]
        T3=T1[1] 
        if (T2 > 35) or (T3 < 5):
            TempMal.append(ListTemp[j])
        j=j+1

n=0
while n < DiasCampo: 
        T1=ListTemp[n]
        T2=T1[0]
        T3=T1[1]
        if (T3 <5 and T2 >35):
            DiasTempAmb.append(ListTemp[n])
        n=n+1

k=0
while k < DiasCampo: 
        T1=ListTemp[k]
        T2=T1[0]
        T3=T1[1]
        if (T2 <= 35) and (T3 >= 5) :
            TempBuena.append(ListTemp[k])
        k=k+1
        
l=0
while l < DiasCampo: 
        T1=ListTemp[l]
        T2=T1[0]
        T3=T1[1]
        if (T3 < 5 ) and (T2 <=35):
            DiasTempBaja.append(ListTemp[l])
        l=l+1

m=0
while m < DiasCampo: 
        T1=ListTemp[m]
        T2=T1[0]
        T3=T1[1]
        if (T2 > 35) and (T3 >= 5):
            DiasTempAlta.append(ListTemp[m])
        m=m+1
TB = (len(TempBuena))

o=0
while o < TB:
    T1 = TempBuena[o]
    T2= T1[0]
    T3= T1[1]
    SumaAlta = SumaAlta + T2
    SumaBaja = SumaBaja + T3
    o = o + 1

TempMedMax =(SumaAlta/TB)    
TempMedMin =(SumaBaja/TB)
PorDiasError = (len(TempMal)*100)/(len(ListTemp))

print(DiasCampo)
print(len(TempMal))
print(len(DiasTempBaja)) 
print(len(DiasTempAlta))
print(len(DiasTempAmb))
print(TempMedMax)
print(TempMedMin)
print(PorDiasError)





