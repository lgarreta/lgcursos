#definicion de funciones

def horasnormales (a,b):
    if (a>40):
        a=40
    valorhorasnormales=a*b
    return (valorhorasnormales)
    
def horasextras (a,b):
    if (a>40):
        a=a-40
        valorhorasextras=a*(b*1.5)
        return (valorhorasextras)
    else:
        return (0)

def sueldobruto (a, b):
    sbruto=a+b
    return (sbruto)

def descparafiscales (a):
    dparafiscal=a*0.09
    return (dparafiscal)

def descsalud (a):
    dsalud=a*0.04
    return (dsalud)

def descpension (a):
    dpension=a*0.04
    return (dpension)

def sumadescuentos (a,b,c):
    sdescuentos=a+b+c
    return (sdescuentos)

def sueldoneto (a,b,c,d):
    sneto=a-(b+c+d)
    return (sneto)

def provprima (a):
    pprima=a*0.0833
    return (pprima)

def provcesantias (a):
    pcesantia=a*0.0833
    return (pcesantia)

def provinterescesantia (a):
    picesantia=a*0.01
    return (picesantia)

def provvacaciones (a):
    pvacaciones=a*0.0417
    return (pvacaciones)

#programa
#inicio variables globales
horasterabajadas=int (0)
valorhoras=int (0)
hnormales=int (0)
hextras=float (0)
sbruto=float (0)
dparafiscales=float (0)
dsalud=float (0)
dpension=float (0)
tdescuentos=float (0)
sneto=float (0)
pprima=float (0)
pcesantias=float (0)
pinterescesantia=float (0)
pvacaciones=float (0)

# proceso

horastrabajadas=int(input("Ingrese horas trabajadas: "))
valorhora=int(input("Ingrese valor hora: "))

hnormales= horasnormales (horastrabajadas,valorhora)
print (hnormales)

hextras= horasextras (horastrabajadas, valorhora)
print (hextras)

sbruto= sueldobruto (hnormales, hextras)
print (sbruto)

dparafiscales= descparafiscales (sbruto)
print (dparafiscales)

dsalud= descsalud (sbruto)
print (dsalud)

dpension= descpension (sbruto)
print (dpension)

tdescuentos= sumadescuentos (dparafiscales, dsalud, dpension)
print (tdescuentos)

sneto= sueldoneto (sbruto, dparafiscales, dsalud, dpension)
print (sneto)

pprima= provprima (sbruto)
print (pprima)

pcesantias= provcesantias (sbruto)
print (pcesantias)

pinterescesantia = provinterescesantia (sbruto)
print (pinterescesantia)

pvacaciones= provvacaciones (sbruto)
print (pvacaciones)
