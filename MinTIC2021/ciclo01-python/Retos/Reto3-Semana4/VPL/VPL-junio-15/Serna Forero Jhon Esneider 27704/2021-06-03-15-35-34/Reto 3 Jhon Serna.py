#ENTRADAS
TempMax=0
TempMin=0

#SALIDAS
DiasCampo=0
TempMenorE=0
TempMayorE=0
TempErrorAmbas=0

#VARIABLE
TempOK=0
SumaMin=0
SumaMax=0

DiasMinOK=0
DiasMaxOK=0


while (True):
    TempMax= int(input("Digite la Temperatura Maxima: "))
    TempMin= int(input("Digite la Temperatura Minima: "))
    if (TempMax==0 and TempMin==0):
        break
    #print ( "Temperaturas fueron",TempMax, TempMin )
    
    DiasCampo= DiasCampo + 1
    
    if (TempMin>=5 and TempMax<=35):
        SumaMin= SumaMin+TempMin
        SumaMax= SumaMax+TempMax
        TempOK += 1
        
    else:
        if (TempMin>=5 and TempMin!=0):
            DiasMinOK += 1
        if (TempMax<=35 and TempMax!=0):
            DiasMaxOK += 1
            
    if (TempMin<5 and TempMax>35):
        TempErrorAmbas += 1
    else:
        if (TempMin<5 ):
            TempMenorE +=1
        if (TempMax>35):
            TempMayorE +=1
DiasE=(TempMayorE+TempMenorE+TempErrorAmbas)

#print ("Numero de días de salida de campo: ", DiasCampo)
print (DiasCampo)
print ((DiasCampo-TempOK))
print ( TempMenorE)
print ( TempMayorE)
print ( TempErrorAmbas)

MediaMin= (SumaMin/TempOK)
MediaMax= (SumaMax/TempOK)
DiasPorE=  (DiasE/DiasCampo)*100
print (MediaMax)
print ( MediaMin)
print ( DiasPorE )


