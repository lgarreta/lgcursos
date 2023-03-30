horas_trabajadas =int(input("horas de trabajador "))
valor_horas= int(input("valor horas "))

#salidas
valor_hora_Nor   = 0
valor_horas_ext  = 0
sueldo_bruto= 0 
Descuento_parafiscales=0
descuento_salud  = 0
descuento_pension= 0
total_descuentos = 0
sueldo_neto      = 0
provisiones_prima = 0
provisiones_cesantias = 0
provisiones_inter_cesantias=0
provisiones_vacaciones = 0


maxhoras=40
porcentaje =1.5
tasaparafiscal=0.09
tasasalud=0.04
tasapension=0.04
tasaprima=0.0833
tasacesantias=0.0833
tasainteres=0.01
tasavacaciones=0.0417


def valorapagar(horas_trabajadas,valor_horas):
    if(horas_trabajadas>40):
        horas_trabajadas=40
    valor_hora_Nor = horas_trabajadas*valor_horas
    return  (valor_hora_Nor)

def horasextras(horas_trabajadas,maxhoras,porcentaje,valor_horas):
    if(horas_trabajadas <=40):
       valor_horas_ext = 0
       return (valor_horas_ext)
    elif (horas_trabajadas>40):
       valor_horas_ext = (horas_trabajadas-maxhoras)*porcentaje*valor_horas
       return(valor_horas_ext)
     
def salariobruto(valor_hora_Nor, valor_horas_ext):
    sueldo_bruto = valor_hora_Nor + valor_horas_ext
    return(sueldo_bruto)
    
def calculardescuentoparafiscales(sueldo_bruto,tasaparafiscal):
   Descuento_parafiscales =(sueldo_bruto*tasaparafiscal)
   return (Descuento_parafiscales)
    
def calculardescuentosalud(sueldo_bruto,tasasalud):
    descuento_salud=(sueldo_bruto*tasasalud)
    return(descuento_salud)

def calculardescuentopension(sueldo_bruto,tasapension):
    descuento_pension =(sueldo_bruto*tasapension)
    return(descuento_pension)

def calculartotaldescuentos(descuentoparafiscales, descuento_salud,descuento_pension):
    total_descuentos=(descuentoparafiscales+ descuento_salud +descuento_pension)
    return(total_descuentos)

def calcularsueldoneto(sueldo_bruto,totaldescuento):
    sueldo_neto =(sueldo_bruto-total_descuentos)
    return(sueldo_neto )

def calcularprima(sueldo_bruto,tasaprima):
    provisiones_prima=(sueldo_bruto*tasaprima)
    return(provisiones_prima)
def calcularcesantias(sueldo_bruto,tasacesantias):
    provisiones_cesantias =(sueldo_bruto*tasacesantias)
    return(provisiones_cesantias)
def calcularintereses(sueldo_bruto,tasainteres):
    provisiones_inter_cesantias=(sueldo_bruto*tasainteres)
    return(provisiones_inter_cesantias)
def calcularvacaciones(sueldo_bruto,tasavacaciones):
    provisiones_vacaciones=(sueldo_bruto*tasavacaciones)
    return(provisiones_vacaciones)
    
valor_hora_Nor    = valorapagar(horas_trabajadas,valor_horas)
valor_horas_ext   = horasextras(horas_trabajadas,maxhoras,porcentaje,valor_horas)
sueldo_bruto      = salariobruto(valor_hora_Nor, valor_horas_ext)
Descuento_parafiscales = calculardescuentoparafiscales(sueldo_bruto,tasaparafiscal)
descuento_salud   = calculardescuentosalud(sueldo_bruto,tasasalud)
descuento_pension = calculardescuentopension(sueldo_bruto,tasapension)
total_descuentos  = calculartotaldescuentos(Descuento_parafiscales , descuento_salud,descuento_pension)
sueldo_neto       = calcularsueldoneto(sueldo_bruto,total_descuentos)
provisiones_prima = calcularprima(sueldo_bruto,tasaprima)
provisiones_cesantias       = calcularcesantias(sueldo_bruto,tasacesantias)
provisiones_inter_cesantias = calcularintereses(sueldo_bruto,tasainteres)
provisiones_vacaciones      = calcularvacaciones(sueldo_bruto,tasavacaciones)

print (valor_hora_Nor)
print (valor_horas_ext)
print (sueldo_bruto)  
print (Descuento_parafiscales) 
print (descuento_salud)
print (descuento_pension)
print (total_descuentos)
print (sueldo_neto)
print (provisiones_prima)
print (provisiones_cesantias)
print (provisiones_inter_cesantias)
print (provisiones_vacaciones)

