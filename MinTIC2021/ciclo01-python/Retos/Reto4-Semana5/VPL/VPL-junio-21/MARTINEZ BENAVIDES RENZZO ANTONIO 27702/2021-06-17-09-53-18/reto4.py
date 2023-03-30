
# Parámetros de entrada:
horas                   = 0 # Numero Horas Trabajadas Semana
valorHoras              = 0 # Valor Horas Trabajadas Semana

# Inicializacion salidas:
# nombreDocente         = ""
valorTotalHorasNormales = 0
valorTotalHorasExtras   = 0
sueldoBruto             = 0
descuentoParaFiscales   = 0
descuentoSalud          = 0
descuentoPension        = 0
suldoNetoPagar          = 0
sumaTodosDescuentos     = 0
provisionesPrima        = 0
provisionesCesantias    = 0
interesesCesantias      = 0
vacaciones              = 0
###############################
#Tasas/provisiones
maxiHoras               = 40
porcentaje              = 1.5
tasa_Parafiscales       = 0.09
tasa_Salud              = 0.04
tasa_Pension            = 0.04
tasa_Prima              = 0.0833
tasa_Cesantias          = 0.0833
tasa_Interes_cesantias  = 0.01
tasa_Inte_vacaciones    = 0.0417

################################

while (True):
     horas = int(input())
     valorHoras  = int(input())

     if horas != 0 and valorHoras != 0:
         break       
           
#Definicion de Funciones:


def cal_Valor_horas_norm(horas,valorHoras):
    if (horas > 40):
        horas = 40
    valorTotalHorasNormales = (horas * valorHoras)  
    return(valorTotalHorasNormales)


def cal_Total_horas_ext(horas,maxiHoras,porcentaje,valorHoras):
    if (horas <= 40):
        valorTotalHorasExtras = 0
        return(valorTotalHorasExtras)
    elif (horas > 40):
        valorTotalHorasExtras = ((horas - maxiHoras)*porcentaje*valorHoras)
        return(valorTotalHorasExtras)                              

                    
def cal_sueldo_bruto(valorTotalHorasNormales,valorTotalHorasExtras):
    sueldoBruto = valorTotalHorasNormales + valorTotalHorasExtras
    return(sueldoBruto)


def cal_parafiscales(sueldoBruto,tasa_Parafiscales):
    descuentoParaFiscales = (sueldoBruto * tasa_Parafiscales)
    return(descuentoParaFiscales)

def cal_salud(sueldoBruto,tasa_Salud):
    descuentoSalud = (sueldoBruto*tasa_Salud)
    return(descuentoSalud)

   
def cal_pension(sueldoBruto,tasa_Pension):
    descuentoPension = (sueldoBruto*tasa_Pension)
    return(descuentoPension)

    
def cal_descuento_total(descuentoParaFiscales,descuentoSalud,descuentoPension):
    sumaTodosDescuentos = (descuentoParaFiscales+descuentoSalud+descuentoPension)
    return(sumaTodosDescuentos)

def cal_neto(sueldoBruto,sumaTodosDescuentos):
    suldoNetoPagar = (sueldoBruto-sumaTodosDescuentos)
    return(suldoNetoPagar)

def cal_prima(sueldoBruto,tasa_Prima):
    provisionesPrima = (sueldoBruto*tasa_Prima)
    return(provisionesPrima)

    

def cal_cesantias(sueldoBruto,tasa_Cesantias):
    tasa_Interes_cesantias =  0.01
    provisionesCesantias = (sueldoBruto*tasa_Interes_cesantias)
    return(provisionesCesantias)

    
def cal_intereses(sueldoBruto,tasa_Parafiscales):
    tasa_Cesantias = 0.0833
    interesesCesantias = (sueldoBruto*tasa_Cesantias)
    return(interesesCesantias)


def cal_vaca(sueldoBruto,tasa_Inte_vacaciones):
    vacaciones = (sueldoBruto*tasa_Inte_vacaciones)
    return(vacaciones)    

    #Procedimientos   
valorTotalHorasNormales = cal_Valor_horas_norm (horas,valorHoras) 
valorTotalHorasExtras = cal_Total_horas_ext (horas,maxiHoras,porcentaje,valorHoras)   
sueldoBruto = cal_sueldo_bruto (valorTotalHorasNormales,valorTotalHorasExtras)
descuentoParaFiscales = cal_parafiscales (sueldoBruto,tasa_Parafiscales)
descuentoSalud = cal_salud (sueldoBruto,tasa_Salud)
descuentoPension = cal_pension (sueldoBruto,tasa_Pension)
sumaTodosDescuentos = cal_descuento_total (descuentoParaFiscales,descuentoSalud,descuentoPension)
suldoNetoPagar = cal_neto (sueldoBruto,sumaTodosDescuentos)
provisionesPrima = cal_prima (sueldoBruto,tasa_Prima)
interesesCesantias = cal_intereses (sueldoBruto,tasa_Parafiscales)     
provisionesCesantias  = cal_cesantias (sueldoBruto,tasa_Cesantias)
vacaciones = cal_vaca (sueldoBruto,tasa_Inte_vacaciones)



print(valorTotalHorasNormales)
print(valorTotalHorasExtras)
print(sueldoBruto)
print(descuentoParaFiscales)
print(descuentoSalud)        
print(descuentoPension)
print(sumaTodosDescuentos)
print(suldoNetoPagar)
print(provisionesPrima)
print(interesesCesantias)
print(provisionesCesantias)
print(vacaciones)




