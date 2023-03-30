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
        Contador_AmbasBuenas += 1
        Media_Max_Acumulador = Media_Max_Acumulador + Temperatura_Max
        Media_Max_Contador += 1 

        
Contador_Min = Contador_Min - Contador_AmbasMalas 
Contador_Max = Contador_Max - Contador_AmbasMalas

Porcentaje_Dias_Error = 100 * (Dias_Error / Contador_Dias)

print (Contador_Dias) #El total de días que duro la salida de campo: 
print (Dias_Error) #Dias de error:
print (Contador_Min) #"La cantidad de dias con temperatura de error menor a 5 fueron de: "
print (Contador_Max) #"La cantidad de dias con temperatura de error mayor a 35 fueron de: "
print (Contador_AmbasMalas) #"La cantidad de dias con temperatura menor a 5 y mayor a 35 fue de: "

Media_Max = Media_Max_Acumulador / Media_Max_Contador
print (Media_Max) #"La temperatura media maxima sin tener en cuentas los errores fue de: "
print (Media_Min) #"La temperatura media minima sin tener en cuentas los errores fue de: "
print (Porcentaje_Dias_Error) #"El porcentaje de dias que se reportaron errores fue de: ",


