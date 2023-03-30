#Entradas
Nombre=0
HoraW=0
ValorHora=0


#Salidas
ValorHNormal=0
ValorHExtra=0
SueldoBruto=0
DtoParafis=0
DtoSalud=0
Dtopension=0
SueldoNeto=0
ProvPrima=0
ProvCesant=0
ProviCesant=0
ProvVaca=0

#Nombre=input("Ingrese Nombre del docente :")
HoraW= float(input(" Numero de horas trabajadas en la semana :"))
#HoraW=float(input("Ingrese Numero de horas trabajadas en la semana :"))
#ValorHora=float(input("Ingrese el valor de la hora trabajada :"))
ValorHora= float(input("Ingrese el valor de la hora trabajada :"))

if (HoraW<=40):
    ValorHNormal=HoraW*ValorHora
    
elif (HoraW>40):
    ValorHNormal=40*ValorHora
    ValorHExtra= (HoraW-40)*(1.5*(ValorHora))



def F_SueldoBruto (ValorHNormal,ValorHExtra):
    SueldoBruto=(ValorHNormal + ValorHExtra)
    return (SueldoBruto)

def F_Parafis (SueldoBruto):
    DtoParafis=(SueldoBruto*0.09)
    return (DtoParafis)

def F_Salud (SueldoBruto):
    DtoSalud=(SueldoBruto*0.04)
    return (DtoSalud)

def F_pension (SueldoBruto):
    Dtopension=(SueldoBruto*0.04)
    return (Dtopension)

def F_SueldoN (Bruto,Dparaf,Dsalud,Dpension):
    SueldoNeto= Bruto-(Dparaf+Dsalud+Dpension)
    return (SueldoNeto)

def F_ProviPrima (Bruto):
    ProvPrima= (Bruto*0.0833)
    return (ProvPrima)

def F_ProviCes (Bruto):
    ProvCesant= (Bruto*0.0833)
    return (ProvCesant)

def F_ProviInt (Bruto):
    ProviCesant= (Bruto*0.01)
    return (ProviCesant)

def F_ProviVaca (Bruto):
    ProvVaca= (Bruto*0.0417)
    return (ProvVaca)

SueldoBruto= F_SueldoBruto (ValorHNormal,ValorHExtra)
DtoParafis= F_Parafis (SueldoBruto)
DtoSalud= F_Salud (SueldoBruto)
Dtopension= F_pension (SueldoBruto)
SumaDtos=(DtoParafis+DtoSalud+Dtopension)
SueldoNeto= F_SueldoN (SueldoBruto,DtoParafis,DtoSalud,Dtopension)
ProvPrima= F_ProviPrima (SueldoBruto)
ProvCesant= F_ProviCes (SueldoBruto)
ProviCesant= F_ProviInt (SueldoBruto)
ProvVaca= F_ProviVaca (SueldoBruto)


print (ValorHNormal)
print (ValorHExtra)
print (SueldoBruto)
print (DtoParafis)
print (DtoSalud)
print (Dtopension)
print (SumaDtos)
print (SueldoNeto)
print (ProvPrima)
print (ProvCesant)
print (ProviCesant)
print (ProvVaca)











