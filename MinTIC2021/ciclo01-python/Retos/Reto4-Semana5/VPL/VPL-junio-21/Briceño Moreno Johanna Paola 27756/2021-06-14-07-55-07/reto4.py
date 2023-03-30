#ENTRADAS
hTrab = int(input("Ingresar Horas Trabajadas: "));
vHora = int(input("Ingresar Valor por Hora: "));

#SALIDAS
vHnor   = 0    # Valor horas normales : ht * vh
vHext   = 0    # Valor horas extras : (ht - 40)*1.5*vh
sBruto  = 0    # Sueldo bruto: valor horas normales + valor horas extras.
desParf = 0    # Descuento parafiscales: sb * 0.09
deSalud = 0    # Descuento salud: sb * 0.04
desPens = 0    # Descuento pensión: sb * 0.04
totDesc = 0    # Suma de todos los descuentos
sNeto   = 0    # Sueldo neto: sb – (descuento parafiscales + descuento salud + descuento pensión)
provPri = 0    # Provisiones para prima 8.33%
provCens = 0     # Provisiones para cesantías 8.33%
provIntCens = 0  # Provisiones para intereses de cesantía 1.0%
proVaca = 0    # Provisiones para vacaciones 4.17%.

TasaSP = 0.04

#FUNCIONES
def CalcularHorasNormal (hTrab, vHora):
    if (hTrab > 40):
        hTrab = 40
    
    vHnor =  hTrab * vHora
    return (vHnor)
    
def CalcularHorasExtras (hTrab, vHora):
    if (hTrab > 40):
        vHext = (hTrab - 40) * 1.5 * vHora
    else:
        vHext = 0
    return (vHext)

def CalcularSueldoBruto (vHnor,vHext):
    sBruto = vHnor + vHext
    return (sBruto)

def CalcularDescuentoParafiscales(sBruto):
    desParf = sBruto * 0.09
    return (desParf)

def CalcularDescuentoSalud(sBruto,TasaSP):
    deSalud = sBruto * 0.04 
    return (deSalud)

def CalcularDescuentoPension (sBruto,TasaSP):
    desPens = sBruto * 0.04
    return (desPens)

def CalcularTotalDescuentos (desParf,deSalud,desPens):
    totDesc = desParf + (deSalud + desPens)
    return (totDesc)

def calcularSueldoNeto (sBruto,desParf,deSalud,desPens):
    sNeto = sBruto - (desParf + deSalud + desPens)
    return  (sNeto)

def CalcularProvisionPrima (sBruto):
    provPri = sBruto * 0.0833
    return (provPri)

def CalcularProvisionCesantias (sBruto):
    provCens = sBruto * 0.0833
    return (provCens)

def CalcularProvisionInteresCesantias (sBruto):
    provIntCens = sBruto * 0.01
    return (provIntCens)

def CalcularProvisionVacaciones (sBruto):
    proVaca = sBruto * 0.0417
    return (proVaca)

# PROCESO
vHnor       = CalcularHorasNormal (hTrab, vHora);
vHext       = CalcularHorasExtras (hTrab, vHora);
sBruto      = CalcularSueldoBruto (vHnor, vHext);
desParf     = CalcularDescuentoParafiscales(sBruto);
deSalud     = CalcularDescuentoSalud(sBruto,TasaSP);
desPens     = CalcularDescuentoPension(sBruto,TasaSP);
totDesc     = CalcularTotalDescuentos (desParf,deSalud,desPens);
sNeto       = calcularSueldoNeto (sBruto,desParf,deSalud,desPens);
provPri     = CalcularProvisionPrima (sBruto);
provCens    = CalcularProvisionCesantias (sBruto);
provIntCens = CalcularProvisionInteresCesantias (sBruto);
proVaca     = CalcularProvisionVacaciones (sBruto);

#
print (vHnor);
print (vHext);
print (sBruto);
print (desParf);
print (deSalud);
print (desPens)
print (totDesc)  
print (sNeto)
print (provPri);
print (provCens);
print (provIntCens);
print (proVaca);
    
    