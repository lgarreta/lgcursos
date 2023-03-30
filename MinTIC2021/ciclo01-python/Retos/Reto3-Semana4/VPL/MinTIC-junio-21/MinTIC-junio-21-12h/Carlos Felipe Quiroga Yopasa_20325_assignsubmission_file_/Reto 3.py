#temperaturas diarias maxima, minima
#no era posible temperaturas menores de 5grados
#ni mayores de 35 grados considerados errores
Contador_Dias         = 0
Dias_Error            = 0
Contador_Min          = 0
Contador_Max          = 0
Contador_Ambos        = 0
Media_Max             = 0
Media_Min             = 0
Porcentaje_Dias_Error = 0
Dias_Buenos_Min       = 0
Dias_Buenos_Max       = 0
Contador_Buenas       = 0
#entradas
while(True):
    
    Temperatura_Max=int(input("Intruduzca temperatura maxima: "))
    Temperatura_Min=int(input("Introduzca temperatura minima: "))
    if((Temperatura_Min == 0) and (Temperatura_Max == 0)):
            break
        
    Contador_Dias += 1 
    
    if (Temperatura_Min < 5 or Temperatura_Max > 35):
        Dias_Error += 1
            
    if (Temperatura_Min < 5 and Temperatura_Max > 35):
        Contador_Ambos+= 1
        
    if (Temperatura_Min >= 5 and Temperatura_Max<= 35):
        Contador_Buenas+= 1
        Dias_Buenos_Min += Temperatura_Min
        Dias_Buenos_Max += Temperatura_Max
    
    
    if (Temperatura_Min < 5 ):
        Contador_Min+= 1     
    if (Temperatura_Min < 5 and Temperatura_Max> 35):
            Contador_Min-=1
            
    if (Temperatura_Max > 35 ):
        Contador_Max+= 1
    if (Temperatura_Min < 5 and Temperatura_Max> 35):
            Contador_Max-= 1
    
    
    
    
    
   
   
Media_Max = Dias_Buenos_Max / Contador_Buenas
Media_Min =  Dias_Buenos_Min / Contador_Buenas
   
Porcentaje_Dias_Error = (100 / Contador_Dias) * Dias_Error        



#salidas
print (Contador_Dias)
print (Dias_Error)
print (Contador_Min )
print (Contador_Max )
print (Contador_Ambos)
print (Media_Max)
print (Media_Min)
print (Porcentaje_Dias_Error)

    
    
    

    


    