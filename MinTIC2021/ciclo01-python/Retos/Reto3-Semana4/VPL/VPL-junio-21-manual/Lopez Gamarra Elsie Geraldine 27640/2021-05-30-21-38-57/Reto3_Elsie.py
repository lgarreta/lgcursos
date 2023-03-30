Temperatura_Max=0
Temperatura_Min=0
Contador_Dias=0 
Media_Min=0
Media_Max=0 
Contador_Min=0
Contador_Max=0
Contador_Ambos=0
Dias_Error=0

while (1):
    Temperatura_Max = int(input("Temp. max registrada: "))
    Temperatura_Min = int(input("Temp. min registrada: "))
    if (Temperatura_Max==0 and Temperatura_Min==0): break
    if (Temperatura_Min<5 and Temperatura_Max>35):
        Contador_Dias+=1
        Contador_Ambos+=1
        Dias_Error+=1
        continue
    if (Temperatura_Min<5 or Temperatura_Max>35): 
        Dias_Error+=1
        if (Temperatura_Min<5): 
            Contador_Min+=1
        else:
            Contador_Max+=1
    if (Temperatura_Min>4 and Temperatura_Max<36): 
        Media_Max+=Temperatura_Max 
        Media_Min+=Temperatura_Min
    Contador_Dias+=1
    
Media_Max=Media_Max/(Contador_Dias-Dias_Error)
Media_Min=Media_Min/(Contador_Dias-Dias_Error)
Porcentaje_Dias_E=(100*Dias_Error)/Contador_Dias

print("\n Número de días: ",Contador_Dias)
print("Número de días con errores en la toma de temperaturas: ",Dias_Error)
print("Número de errores por temperatura mínima: ",Contador_Min)
print("Número de errores por temperatura máxima: ",Contador_Max)
print("Número de errores por temperatura máxima y mínima: ",Contador_Ambos)
print("Promedio de temperatura máxima: ",Media_Max)
print("Promedio de temperatura mínima: ",Media_Min)
print("Porcentaje de días errados: ",Porcentaje_Dias_E,"%")