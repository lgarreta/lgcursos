#Registro de temperaturas
#Entradas
tempmax = 0
tempmin = 0

#Salidas
numerodias = 0
numerodiastotal = 0
diaserror35 = 0
diaserror5 = 0
diaserrorambos = 0
totaldiaserror = 0
diastempmaxcorrec = 0
diastempmincorrec = 0
tempmaxsuma = 0
tempminsuma = 0
tempmaxmedia = 0
tempminmedia = 0
porcentajedias = 0

while (True):
    numerodias = numerodias + 1
    tempmax = int (input('Ingrese la temperatura máxima: '))
    tempmin = int (input('Ingrese la temperatura mínima: '))
    if (tempmax == 0)and (tempmin == 0):
        break
    if (tempmax > 35) and (tempmin < 5):
        diaserrorambos = diaserrorambos + 1
    elif(tempmax > 35):
        diaserror35 = diaserror35 + 1
    elif (tempmin < 5):
        diaserror5 = diaserror5 + 1
    totaldiaserror = diaserrorambos + diaserror5 + diaserror35
    if (tempmax <=35) and (tempmin >=5):
        diastempmaxcorrec = diastempmaxcorrec + 1
        tempmaxsuma = tempmaxsuma + tempmax
        tempmaxmedia = (tempmaxsuma) / diastempmaxcorrec
    if (tempmax <=35) and (tempmin >= 5):
        diastempmincorrec = diastempmincorrec + 1
        tempminsuma = tempminsuma + tempmin
        tempminmedia = (tempminsuma) / diastempmincorrec
numerodiastotal = int (numerodias - 1)
porcentajedias = (totaldiaserror / numerodiastotal)*100


print (numerodiastotal)
print (totaldiaserror)
print (diaserror5)
print (diaserror35)
print (diaserrorambos)
print (tempmaxmedia)
print (tempminmedia)
print (porcentajedias)
       

    
    
