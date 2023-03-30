
dia = 0
tem_minima= 0
tem_maxima= 0
tem_min_max= 0
m_minima = float (0)
m_maxima = float (0)
porc_dias_error = float (0) 
dias_con_error = 0



while (True):
    temperatura2= int (input("temperatura minima: "))
    temperatura1= int (input("temperatura maxima: "))

   
    
    if temperatura1==0 and  temperatura2==0:
        break
    
    print ("las temperaturas fueron: ", temperatura2, temperatura1)
    print ("")
    
    dia=  dia+1
    
    
    if (temperatura2<5 or temperatura1>35 ):
        dias_con_error +=1
    if (temperatura2<5 and temperatura1>35 ):
        tem_min_max +=1
    if (temperatura2<5):
        tem_minima +=1
    if (temperatura1>35) :    
        tem_maxima +=1
    if (temperatura2>=5 and temperatura1<=35 ):
        m_minima += temperatura2
        m_maxima +=  temperatura1
        
print (f"total dias: {dia}")
print (f"dias con error: {dias_con_error}")
print (f"dias menores de 5 grados: {tem_minima}")
print (f"dias mayores de 35 grados: {tem_maxima} ")
print (f"dias mayores de 35 grados y menores de 5 grados: {tem_min_max} ")
print (f"tem. med maxima: {m_maxima/(dia-dias_con_error)}")
print (f"tem. med minima: {m_minima/(dia-dias_con_error)}")


porc_dias_error = dias_con_error / dia
print (f"porcentaje dias error: {porc_dias_error}")

