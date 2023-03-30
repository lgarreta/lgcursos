Contador_Dias = 0 #Número de días que duró la expedición
Dias_Error = 0 #Número de días en los cuales se obtuvieron errores de temperatura
Contador_Min = 0 #Número de temperaturas minimas
Contador_Max = 0 #Número de temperaturas maximas
Contador_Ambos = 0 #Número de temperaturas en las que se presentaron errores
Acumulador_Max = 0 #Acumulador de la suma de temperaturas maximas
Acumulador_Min = 0 #Acumulador de la suma de temperaturas minimas
Porcentaje_Dias_Error = 0 #Procentaje de días con error de temperaturas

Temperatura_Max = float(input())
Temperatura_Min = float(input())

while Temperatura_Max != 0 and Temperatura_Min != 0:
    Contador_Dias = Contador_Dias + 1
       
    if Temperatura_Max < 5 or Temperatura_Max > 35 or Temperatura_Min < 5 or Temperatura_Min > 35: #Evalúa que las temperaturas Máxima y Mínima salgan del rango establecido.
        Dias_Error = Dias_Error + 1 #Acumulador del número de días en los cuales se obtuvieron valores fuera del rango.
        
    if 5 <= Temperatura_Max <= 35 and 5<= Temperatura_Min <= 35: #Evalúa que las temperaturas mínimas y máximas estén dentro del rango.
        Contador_Min = Contador_Min + 1 #Acumulador del número de parejas de  temperaura máxima y mínima dentro del rango.
        Acumulador_Min = Acumulador_Min + Temperatura_Min #Sumatoria de temperaturas minimas
    elif Temperatura_Max < 5 or Temperatura_Max > 35 and Temperatura_Min< 5 or Temperatura_Min > 35: #Sí ninguna temperatura del día se encuentra dentro del rango.
        Contador_Ambos = Contador_Ambos + 1 #Sumatoria de las temperaturas minimas fuera del rango.
        
    if 5 <= Temperatura_Max <= 35: #Evalúa que la temperatura máxima esté dentro del rango.
        Contador_Max = Contador_Max + 1 #Acumula el número de temperaturas máximas dentro del rango.
        Acumulador_Max = Acumulador_Max + Temperatura_Max #Sumatoria de las temperaturas maximas dentro del rango.

    Temperatura_Max = float(input())
    Temperatura_Min = float(input())

if Contador_Max != 0: #Evalúa que la cantidad de temperaturas maximas no sea cero
    Media_Max = Acumulador_Max/Contador_Max #Media de la temperatura maxima

if Contador_Min != 0: #Evalúa que la cantidad de temperaturas minimas no sea cero
    Media_Min = Acumulador_Min/Contador_Min #Media de la temperatura minima
    
if Contador_Dias != 0 and Dias_Error != 0: #Evalúa que la cantidad de días del campamento no sea cero
    Porcentaje_Dias_Error = (Dias_Error*100)/Contador_Dias #Porcentaje de días en los cuales se obtuvieron error de lectura de temperturas
    
print(Contador_Dias)
print(Dias_Error)
print(Contador_Min)
print(Contador_Max)
print(Contador_Ambos)
print(Media_Max)
print(Media_Min)
print(Porcentaje_Dias_Error)
    
    