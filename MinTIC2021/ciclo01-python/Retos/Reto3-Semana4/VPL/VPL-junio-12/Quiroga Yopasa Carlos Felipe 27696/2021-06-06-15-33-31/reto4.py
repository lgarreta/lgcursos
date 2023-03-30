#RETO 4
DescFiscal             = 0.09
Desc_Salud             = 0.04
Desc_Pension           = 0.04
Prima                  = 0.0833
Cesantias              = 0.0833
IntCesantias           = 0.01
Vacaciones             = 0.0417
#Entradas
Horas_Trabajadas = int(input("introduzca numero de horas trabajadas: "))
Valor_Hora       = int(input("Introduzca valor de la hora: "))

def suma (a,b):
    c=a+b
    return (c)
def resta (a,b):
    c=a-b
    return (c)
def multiplicacion (a,x):
    c=a*x
    return (c)

        
#Horas extra
Horas_Extra = (Horas_Trabajadas - 40) * 1.5* Valor_Hora

if (Horas_Trabajadas>40):
    Horas_Trabajadas=40

#Horas normales
Valor_Horas_Normales = Horas_Trabajadas* Valor_Hora

print (Valor_Horas_Normales)
print (Horas_Extra)

#sueldo bruto
Sueldo_Bruto =suma (Valor_Horas_Normales, Horas_Extra)
print (Sueldo_Bruto)

#Descuento parafiscales
Descuento_Parafiscales = multiplicacion(Sueldo_Bruto,DescFiscal)
print (Descuento_Parafiscales)


#Descuento_Salud
Descuento_Salud= multiplicacion(Sueldo_Bruto,Desc_Salud)
print (Descuento_Salud)

#Descuento Pension
Descuento_Pension= multiplicacion(Sueldo_Bruto,Desc_Pension)
print (Descuento_Pension)

#suma de los descuentos
Suma_Descuentos= Descuento_Parafiscales +Descuento_Salud+ Descuento_Pension
print (Suma_Descuentos)
#sueldo neto
Sueldo_Neto= resta(Sueldo_Bruto, Suma_Descuentos)
print (Sueldo_Neto)


#provisiones prima
Prov_Prima=multiplicacion (Sueldo_Bruto, Prima)
print (Prov_Prima)

#provisiones cesantias
Prov_Cesantias=multiplicacion( Sueldo_Bruto, Cesantias)

print (Prov_Cesantias)

#provisiones int cesantias
Prov_Int_Cesantia=multiplicacion( Sueldo_Bruto , IntCesantias)

print (Prov_Int_Cesantia)


#Prov_Vaciones
Prov_Vacaciones=multiplicacion( Sueldo_Bruto , Vacaciones)

print (Prov_Vacaciones)
#Salidas
