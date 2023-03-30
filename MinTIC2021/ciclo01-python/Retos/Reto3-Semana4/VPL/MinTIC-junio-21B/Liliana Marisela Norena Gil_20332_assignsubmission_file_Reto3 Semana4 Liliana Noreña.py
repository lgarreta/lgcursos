#RETO 3 SEMANA 4

#ENTRADAS
#Temperatura Diaria (mínima, máxima)

Temperatura_Max=0
Temperatura_Min=0

#LISTAS

listTempMax=[]
listTempMin=[]

#INICIALIZACIÓN DE VARIABLES

Contador_Dias=0
Dias_Error=0
Contador_Min=0
Contador_Max=0
Contador_Ambos=0
Media_Max=0
Media_Min=0
Porcentaje_Dias_Error=0
total_TempMax=0
total_TempMin=0
Dias_Sin_Error_Max=0
Dias_Sin_Error_Min=0
Contador_ParcMin=0
Contador_ParcMax=0

#PROCESO

while (True):
    Temperatura_Max=int (input("TemperaturaMax: "))    
    Temperatura_Min=int (input("TemperaturaMin: "))
    
    if (Temperatura_Max!=0 or Temperatura_Min!=0):
        Contador_Dias+=1
        listTempMax.append (Temperatura_Max)
        listTempMin.append (Temperatura_Min)
    else:
        break
            
    if (Temperatura_Max<5 or Temperatura_Min<5):
        Dias_Error+=1
        Contador_ParcMin+=1
    elif (Temperatura_Max>35 or Temperatura_Min>35):
        Dias_Error+=1
    
    if (Temperatura_Max>35 or Temperatura_Min>35):
        Contador_ParcMax+=1
    
    if (Temperatura_Min<5 and Temperatura_Max<5) or (Temperatura_Min>35 and Temperatura_Max>35) or (Temperatura_Min<5 and Temperatura_Max>35) or (Temperatura_Min>35 and Temperatura_Max<5):
        Contador_Ambos+=1
                
    Contador_Min=(Contador_ParcMin-Contador_Ambos)
    Contador_Max=(Contador_ParcMax-Contador_Ambos)
#

for Temperatura_Max, Temperatura_Min in zip(listTempMax,listTempMin):
    if (Temperatura_Max>=5 and Temperatura_Max<=35) and (Temperatura_Min>=5 and Temperatura_Min<=35):
        total_TempMax= total_TempMax+Temperatura_Max
        Dias_Sin_Error_Max+=1
        Media_Max=(total_TempMax/Dias_Sin_Error_Max)
        total_TempMin= total_TempMin+Temperatura_Min
        Dias_Sin_Error_Min+=1
        Media_Min=(total_TempMin/Dias_Sin_Error_Min)
        
       
Porcentaje_Dias_Error=(Dias_Error*100)/Contador_Dias
    
#SALIDAS

print(Contador_Dias)
print(Dias_Error)
print(Contador_Min)
print(Contador_Max)
print(Contador_Ambos)
print(Media_Max)
print(Media_Min)
print(Porcentaje_Dias_Error)