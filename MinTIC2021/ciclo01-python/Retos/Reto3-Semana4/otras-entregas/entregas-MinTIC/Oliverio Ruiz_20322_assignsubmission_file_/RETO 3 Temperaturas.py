DiasCampo=1
TempBuena=[]
TempMal=[]

TempMedMin=0
TempMedMax=0
TotalDias=0

PorDiasError=0
TempAmbMal=0
DiasTempBaja=[]
DiasTempAlta=[]
DiasTempAmb=[]


Temp=[] # Temeperaturas de entradad desde el teclado,alternadas  mayor primero meno despues
valor=int(input("Valor"))
#print("Tamano de la lista:")
#print(len(Temp))

while (valor!=0):
    Temp.append(valor)
    valor=int(input("Ingresar valor temperatura (0 para finalizar):"))

DiasCampo = int(len(Temp))/2

ListTemp=[]  #temperatura agrupadas por parejas


for i in range(0, len(Temp),2):
    ListTemp.append(Temp[i:i+2])
    #print(ListTemp)
    #print (len(ListTemp))

TempPar = len(ListTemp) 

j=0

while j < DiasCampo:
        T1=ListTemp[j]
        #print(T1)
        T2=T1[0]
        T3=T1[1] 
        if (T2 > 35) or (T3 < 5):
            TempMal.append(ListTemp[j])
        j=j+1

k=0
while k < DiasCampo: 
        T1=ListTemp[k]
        #print(T1)
        T2=T1[0]
        T3=T1[1]
        if (T2 <= 35) and (T3 >= 5) :
            TempBuena.append(ListTemp[k])
        k=k+1
        
l=0
while l < DiasCampo: 
        T1=ListTemp[l]
        #print(T1)
        T2=T1[0]
        T3=T1[1]
        if (T3 < 5 ):
            DiasTempBaja.append(ListTemp[l])
        l=l+1

m=0
while m < DiasCampo: 
        T1=ListTemp[m]
        #print(T1)
        T2=T1[0]
        T3=T1[1]
        if (T2 >35):
            DiasTempAlta.append(ListTemp[m])
        m=m+1


n=0
while n < DiasCampo: 
        T1=ListTemp[n]
        #print(T1)
        T2=T1[0]
        T3=T1[1]
        if (T3 <5 and T2 >35):
            DiasTempAmb.append(ListTemp[n])
        n=n+1

TB = (len(TempBuena))
TM= (len(TempBuena))


TempMedMax = (TempBuena[0][0] + TempBuena[1][0])/TB      
TempMedMin = (TempBuena[0][1] + TempBuena[1][1])/TM 
PorDiasError = (len(TempMal)*100)/(len(ListTemp))



print(DiasCampo)
print(len(TempMal))
print(len(DiasTempBaja)-1) 
print(len(DiasTempAlta)-1)
print(len(DiasTempAmb))
print(TempMedMax)
print(TempMedMin)
print(PorDiasError)





