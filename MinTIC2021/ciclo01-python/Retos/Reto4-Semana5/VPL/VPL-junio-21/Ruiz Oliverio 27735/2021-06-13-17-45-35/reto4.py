def SBasico(Horas,VHora):
    if(Horas <= 40):
      return Horas * VHora
    elif(Horas > 40) :  
      return VHora* (Horas - (Horas - 40))

def HExtras(Horas,VHora):
    if (Horas > 40):
       HorasE = Horas - 40 
       return HorasE *((VHora * 1.5))
    elif (Horas <= 40):
       HorasE= 0
       return HorasE 
          
def Descuentos(SBruto):
    Parafiscales = (SBruto  * 0.09 )# parafiscales
    Salud = SBruto  * 0.04 #Salud
    Pension = SBruto  * 0.04 #Pension
    SumDescuentos=Parafiscales + Salud + Pension
    SNeto = SBruto - SumDescuentos
    return (Parafiscales,Salud,Pension,SumDescuentos,SNeto)

def Provisiones(SBruto):
     Prima = SBruto * 0.0833  # Prima = 
     Cesantias = SBruto  * 0.0833  #Cesantias =
     IntCesantia = SBruto   * 0.01    #IntCesantia =
     Vacaciones = SBruto  * 0.0417  #Vacaciones=
     return (Prima,Cesantias,IntCesantia,Vacaciones)
     
Horas = 0
VHora = 0

Horas =int (input(""))#Horas =float (input("Horas: "))
VHora = int(input(""))#VHora = float(input("VHora: "))

SB1 = SBasico(Horas,VHora)
SB2 = HExtras(Horas,VHora)
SBruto = SB1 + SB2
print (SB1)  #print ("Salario Basico", SB1)

HExtra= HExtras(Horas,VHora)
print(HExtra) #print("HExtra: ",HExtra)

print(SBruto )#print("Salario Bruto",SBruto )

Descuento = Descuentos(SBruto)
print(Descuento[0]) #print("Parafiscales: ",Descuento[0])
print(Descuento[1])#print("Salud: ",Descuento[1])
print(Descuento[2])#print("Pension: ",Descuento[2])
print(Descuento[3])#print("SumDescuentos: ",Descuento[3])#
print(Descuento[4])#print("SNeto: ",Descuento[4])#

Provision= Provisiones(SBruto)
print(Provision[0])#print("Prima: ",Provision[0])
print(Provision[1])#print("Cesantia",Provision[1])
print(Provision[2])#print("IntCesantia",Provision[2])#
print(Provision[3])#print("Vacaciones",Provision[3])#
