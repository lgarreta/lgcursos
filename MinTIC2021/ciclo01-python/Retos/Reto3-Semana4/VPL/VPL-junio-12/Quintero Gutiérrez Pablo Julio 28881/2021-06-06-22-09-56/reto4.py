
#Nombre = input ("")
HoraTrab = int ( input (""))
Costo_Hora = int (input (""))

#Datos = [1.5,0.09,0.0833,0.833,0.01,0.0417,0.04,0.04]
#print (Datos [0])

Hora_Extra   = 1.5
Parafiscal   = 0.09
Prima        = 0.0833
Cesantia     = 0.0833
Int_Cesantia = 0.01
Vacaciones   = 0.0417
Pension      = 0.04
Salud        = 0.04
Base = 0
Costo_NumeroExtras = 0

#Funciones

def mult (a, b):
    c = a * b
    return (c)

def mult02 (d, e, f):
    g = d * e * f
    return (g)

def rest (h, i):
    j = h - i
    return (j)

def sum (k, l):
    m = k + l
    return (m)

def sum01 (n, o, p):
    q = n + o + p
    return (q)

#
if (HoraTrab > 40):
    NumeroExtras = rest (HoraTrab, 40)
    Costo_NumeroExtras = mult02 (NumeroExtras, Hora_Extra, Costo_Hora)
    Base = mult (40, Costo_Hora)
    SalarioBruto = sum (Costo_NumeroExtras, Base)
    
else:
    SalarioBruto = mult (HoraTrab, Costo_Hora)
#





parafiscal01 = mult (SalarioBruto, Parafiscal)
Salud01 = mult (SalarioBruto, Salud)
Pension01 = mult (SalarioBruto, Pension)
Deducciones = sum01 (parafiscal01, Salud01, Pension01)
SueldoNeto = rest (SalarioBruto, Deducciones)
Prima01 = mult (SalarioBruto, Prima)
Cesantias01 = mult (SalarioBruto, Cesantia)
Int_Cesantia01 = mult (SalarioBruto, Int_Cesantia)
Vacaciones01 = mult (SalarioBruto, Vacaciones)

#Salidas

print ("Costo horas normales: ", SalarioBruto)
print ("Costo extras: ", Costo_NumeroExtras)
print ("Sueldo bruto: ", SalarioBruto)
print ("Parafiscal: ", parafiscal01)
print ("Salud: ", Salud01)
print ("Pensión: ", Pension01)
print ("Deducciones: ", Deducciones) 
print ("Sueldo neto: ", SueldoNeto)   
print ("Prima: ", Prima01)
print ("Cesantías: ", Cesantias01)
print ("Intereses cesantías: ", Int_Cesantia01)
print ("vacaciones: ", Vacaciones01)
 









