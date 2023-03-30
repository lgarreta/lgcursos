#ENTRADAS
Horastrabajadas = int(input())
valorhoraT      = int(input())


#variables
horasnormales   = 0
horasextras     = 0
sueldobruto     = 0
parafiscales    = 0
salud           = 0
pension         = 0
sueldoneto      = 0
Pprimas         = 0  #provisiones
cesantias       = 0  # provisiones
cesantiasint    = 0
vacaciones      = 0

#porcentajes
horassinaumento  = 40
incremento       = 1.5
Dparafiscales    = 0.09
Dsalud           = 0.04
Dpension         = 0.04
provisionesprima = 0.0833
Pcesantias       = 0.0833
interescesantias = 0.01
porvacaciones    = 0.0417




def ValorhoraNormal (ht,vt):
    if ht > 40:
        ht= 40
    horasnormal= ht * vt
    return (horasnormal)

def valorextras (ht,hn, incremento, vt ):
    if ht <= 40:
        horasextras = 0
        return (horasextras)
    elif ht > 40:
        horasextras= ((ht- hn) * (incremento * vt))
        return (horasextras)

def sueldototal (hn,he):
    sueldoneto = hn + he
    return (sueldoneto)

def parafis (ht,dp):
    parafisca = ht*dp
    return (parafisca)

def aportesalud (sb,ds):
    saludA = sb * ds
    return (saludA)

def aportepension (sb, dp):
    despension = sb * dp
    return (despension)

def descuentos (pf, s, p):
    descuentototal = (pf + s+ p)
    return (descuentototal)

def sueldocondes (sb, tdes):
    sueldofinal = (sb - tdes)
    return (sueldofinal)

def prima (sb, pp):
    deduccionprima = (sb * pp)
    return (deduccionprima)

def provicesantias (sb,pc):
    cesantiasp = (sb* pc)
    return (cesantiasp)

def cesantiasinteres ( sb, ic):
    interesce  = (sb * ic)
    return (interesce)

def vacas (sb, pv):
    vacacionesp = (sb * pv)
    return (vacacionesp)

horasnormales    = ValorhoraNormal(Horastrabajadas, valorhoraT)
horasextras      = valorextras (Horastrabajadas, horassinaumento, incremento, valorhoraT)
sueldobruto      = sueldototal (horasextras, horasnormales)
parafiscales     = parafis (sueldobruto,Dparafiscales)
salud            = aportesalud (sueldobruto, Dsalud)
pension          = aportepension (sueldobruto, Dpension)
totaldescuentos  = descuentos (parafiscales,salud,pension)
sueldoneto       = sueldocondes (sueldobruto,totaldescuentos)
Pprimas          = prima  (sueldobruto, provisionesprima)
cesantias        = provicesantias (sueldobruto, Pcesantias)
cesantiasint     = cesantiasinteres (sueldobruto,interescesantias)
vacaciones       = vacas (sueldobruto,porvacaciones )

#SALIDAS
print (horasnormales)
print (horasextras)
print (sueldobruto)
print (parafiscales)
print (salud)
print (pension)
print (totaldescuentos)
print (sueldoneto)
print (Pprimas)
print (cesantias)
print (cesantiasint)
print (vacaciones)
