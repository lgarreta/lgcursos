#-------------------------------------------------------- ENTRADAS -----------------------------------------------------------

ht=int(input("Digite la cant. horas trabajadas: "))
vh=int(input("Digite el valor x hora: "))
Valorhorasnormales=valornomina(ht,vh)
Valorhorasextras=0
sb=0
Descuentoparafiscales=0
Descuentosalud=0
descuentototal=0
sueldoneto=0
Provisionesprima=0
Provisionescesantias=0
ProvisionesInteresescesantia=0
Provisionesvacaciones=0


#-----------------------------------------------------------------------------------------------------------------------------

if(ht>40):
    Valorhorasextras=valorhorextras(ht,vh)

sb = Valorhorasnormales+Valorhorasextras

Descuentoparafiscales=parafiscales(sb)
Descuentopension=pension(sb)
Descuentosalud=salud(sb)

descuentototal=Descuentoparafiscales+Descuentopension+Descuentosalud
sueldoneto=sb-descuentototal

Provisionesprima=prima(sb)
Provisionescesantias=cesantias(sb)
ProvisionesInteresescesantia=intecesantias(sb)
Provisionesvacaciones=vaca(sb)


#--------------------------------------------------------------- SALIDAS -------------------------------------------------------

print("VALOR HORAS NORMALES: ", Valorhorasnormales)
print("VALOR HORAS EXTRAS: ", Valorhorasextras)
print("SUELDO BRUTO: ", sb)
print("DESCUENTO PARAFISCALES: ", Descuentoparafiscales)
print("DESCUENTO SALUD: ", Descuentosalud)
print("DESCUENTO PENSION: ", Descuentopension)
print("DESCUENTO TOTAL: ", descuentototal)
print("SUELDO NETO:", Sueldoneto)
print("PROVISIONES PARA PRIMA: ",Provisionesprima)
print("PROVISIONES PARA CESANTIAS: ",Provisionescesantias)
print("PROVISIONES PARA INTERESES DE CESANTIA: ", ProvisionesInteresescesantia)
print("PROVISIONES PARA VACACIONES: ", Provisionesvacaciones)


#-------------------------------------- FUNCIONES --------------------------------------------

def valornomina(a,b):
    return a*b
def valorhorextras(a,b):
    c=(a-40)*1.5*b
    return c
def parafiscales(c):
    d=0.09*c
    return d
def salud(c):
    d=sb*0.04
    return d
def pension(c):
    d=sb*0.04
    return d
def prima(c):
    d=sb*0.0833
    return d
def cesantias(c):
    d=sb*0.0833
    return d
def intecesantias(c):
    d=sb*0.01
    return d
def vaca(c):
    d=sb*0.0417
    return d