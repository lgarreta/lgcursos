horasTrabajadas = 0
valorHora = 0

#Toma de datos
horasTrabajadas = int(input())
valorHora = int(input())
 
 
#Definicion de funciones
def vHNormales (horas , valorHora):
    if(horas <= 40):
        return (horas * valorHora)    
    
    elif(horas > 40):
        horasEx = horas - 40
        horas = horas - horasEx
        return (horas * valorHora)
    
    
def vHExtras (horas , valorHora):
    if(horas <= 40):
        return (0)
    elif (horas > 40):
        return ( (horas - 40) * (1.5 * valorHora) )
 
def sBruto (vHNormales , vHExtras):
    return (vHNormales + vHExtras)
 
def dParafiscales (sBruto):
    return (sBruto * 0.09)

def dSalud (sBruto):
    return (sBruto * 0.04)

def dPension (sBruto):
    return (sBruto * 0.04)

def sTDescuentos (dParafiscal , dSalud ,dPension):
    return (dParafiscal + dSalud + dPension)

def sNeto (sBruto , descuentos):
    return (sBruto - descuentos)

def pPrima (sBruto):
    return (sBruto * 0.0833)

def pCesantias (sBruto):
    return (sBruto * 0.0833)

def pICesantias (sBruto):
    return (sBruto * 0.01)

def pVacaciones (sBruto):
    return (sBruto * 0.0417)

#Llamando a las funciones

valorHorasNormales = vHNormales (horasTrabajadas , valorHora)
valorHorasExtras = vHExtras (horasTrabajadas , valorHora)
sueldoBruto = sBruto (valorHorasNormales , valorHorasExtras)
descuentoParafiscales = dParafiscales (sueldoBruto)
descuentoSalud = dSalud (sueldoBruto)
descuentoPension = dPension (sueldoBruto)
totalDescuentos = sTDescuentos (descuentoParafiscales , descuentoSalud , descuentoPension)
sueldoNeto = sNeto (sueldoBruto , totalDescuentos)
provisionesPrima = pPrima (sueldoBruto)
provisionesCesantias = pCesantias (sueldoBruto)
provisionesInteresesCesantia = pICesantias (sueldoBruto)
provisionesVacaciones = pVacaciones (sueldoBruto)



#Muestra los datos en pantalla
print(valorHorasNormales)
print(valorHorasExtras)
print(sueldoBruto)
print(descuentoParafiscales)
print(descuentoSalud)
print(descuentoPension)
print(totalDescuentos)
print(sueldoNeto)
print(provisionesPrima)
print(provisionesCesantias)
print(provisionesInteresesCesantia)
print(provisionesVacaciones)
