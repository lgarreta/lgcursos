Temperatura_Max = 0
Temperatura_Min = 0

Contador_Dias = 0
Dias_Error = 0
Contador_Min = 0
Contador_Max = 0
Contador_AmbasMalas = 0
Contador_AmbasBuenas = 0
Valor_TempMinimas = 0
Valor_TempMaxima = 0
Media_Max = 0
Media_Max_Acumulador = 0 
Media_Max_Contador = 0
Media_Min = 0
Media_Min_Acumulador = 0
Media_Min_Contador = 0
Porcentaje_Dias_Error = 0

while (True):
    Temperatura_Max = int (input())
    Temperatura_Min = int (input())
    if (Temperatura_Min == 0 and Temperatura_Max == 0):
        break
    
    Contador_Dias += 1
    
    if (Temperatura_Min <5 and Temperatura_Max <=35):
        Contador_Min += 1
        Dias_Error += 1
    if (Temperatura_Min >=5 and Temperatura_Max >35):
        Contador_Max += 1
        Dias_Error +=1
    if (Temperatura_Min <5 and Temperatura_Max >35):
        Contador_AmbasMalas += 1
        Dias_Error +=1
        if (Temperatura_Min <5):
            Contador_Min += 1
        if (Temperatura_Max >35):
            Contador_Max += 1
    elif (Temperatura_Min >=5 and Temperatura_Max <=35):
        Media_Max_Acumulador = Media_Max_Acumulador + Temperatura_Max
        Media_Max_Contador += 1
        Media_Min_Acumulador = Media_Min_Acumulador + Temperatura_Min
        Media_Min_Contador += 1

        Contador_AmbasBuenas += 1

        
Contador_Min = Contador_Min - Contador_AmbasMalas 
Contador_Max = Contador_Max - Contador_AmbasMalas
Media_Max = Media_Max_Acumulador / Media_Max_Contador
Media_Min = Media_Min_Acumulador / Media_Min_Contador

Porcentaje_Dias_Error = 100 * (Dias_Error / Contador_Dias)

print (Contador_Dias)
print (Dias_Error)
print (Contador_Min)
print (Contador_Max)
print (Contador_AmbasMalas)
print (Media_Max)
print (Media_Min)
print (Porcentaje_Dias_Error)