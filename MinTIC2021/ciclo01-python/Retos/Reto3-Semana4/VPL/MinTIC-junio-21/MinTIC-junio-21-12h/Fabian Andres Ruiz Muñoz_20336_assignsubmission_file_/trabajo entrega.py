
tempmax = 0
tempmin = 0

Contador_Dias=0

Dias_Error=0

Contador_Min=0

Contador_Max=0

Contador_Ambos=0

Media_Max=0

Media_Min=0
Dias_Err=0
Porcentaje_Dias_Error=0
contadormax= 0
contadormin=0
#temperatura=0


while (True) :
    tempmax = int (input(" max: "))
    tempmin = int (input(" min: "))
    if (tempmin == 0 and tempmax == 0):
        break
    Contador_Dias = Contador_Dias+1
    if ( tempmin < 5 or tempmax > 35):
        Dias_Error += 1
        
    if ( tempmin < 5 and tempmax > 35):
        Contador_Ambos += 1
       
    elif (tempmax >35):
        Contador_Max += 1
       
    elif (tempmin <5):
        Contador_Min += 1
     
    else:
        Dias_Err += 1
        
        contadormax = tempmax + contadormax
        contadormin = tempmin + contadormin
    
            
Porcentaje_Dias_Error= 100*(Dias_Error / Contador_Dias)

Media_Max = contadormax /Dias_Err
Media_Min = contadormin /Dias_Err
print("contador de dias: ", Contador_Dias)
print("Dias_Error: ", Dias_Error)
print("Contador_Min: ", Contador_Min)
print("contador max: ", Contador_Max)
print("Contador_Ambos: " ,Contador_Ambos)
print("mediamax: ", Media_Max)
print("mediamin: ", Media_Min)
print("Porcentaje_Dias_Error: ", Porcentaje_Dias_Error)


#print("dias_normal: ", dias_normal)34


# salidas

#Contador_DiasInput=34

#12

#38

#4

#25

#22

#39

#12

#30

#3

#36

#9

#38

#11

#29

#2

#39

#14

#0

#0

 

#Output=9

#Dias_Error7

#Contador_Min2

#Contador_Max4

#Contador_Ambos1

#Media_Max29.5

#Media_Min17.0

#Porcentaje_Dias_Error77.77777777777777














