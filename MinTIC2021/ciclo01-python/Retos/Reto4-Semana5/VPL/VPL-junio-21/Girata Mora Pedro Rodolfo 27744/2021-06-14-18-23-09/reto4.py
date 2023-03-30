#funciones
def calcularValorhorasExtras (horasTrabajadas, ValorHora):
    if (horasTrabajadas > 40):
        horasExtras  = (horasTrabajadas - 40)
        ValorhorasExtras = horasExtras*ValorHora*1.5
    else:
        ValorhorasExtras   =  0
    return (ValorhorasExtras)

def calcularDescuentos (SueldoBruto,porcentajedescuento):
    totalDescuentos = porcentajedescuento*SueldoBruto
    return (totalDescuentos)


def TotalHoras (horasTrabajadas, ValorHora, ValorhorasExtras):
    if (horasTrabajadas < 40):
        Valorhoras   = horasTrabajadas*ValorHora
    else:
        Extras  = (horasTrabajadas - 40)
        Reales = horasTrabajadas - Extras
        Valorhoras   = Reales*ValorHora+ValorhorasExtras
    return (Valorhoras)
def HorasNormales(horasTrabajadas,ValorHora):
    if (horasTrabajadas < 40):
        sinExtras   = horasTrabajadas*ValorHora
    else:
        Extras  = (horasTrabajadas - 40)
        Reales = horasTrabajadas - Extras
        sinExtras  = Reales*ValorHora
    return sinExtras

##liquidadcion salirio Docentes##
print ()
horasTrabajadas   = int (input ("Horas Tabajadas                        :   ",))
ValorHora         = int (input ("valor Hora                             :   ",))

ValorhorasExtras            = calcularValorhorasExtras (horasTrabajadas, ValorHora)
HorasNormales               = HorasNormales(horasTrabajadas,ValorHora)
SueldoBruto                 = TotalHoras (horasTrabajadas, ValorHora, ValorhorasExtras)
DescuentoParafiscales       = calcularDescuentos (SueldoBruto,0.09)
DescuentoSalud              = calcularDescuentos (SueldoBruto,0.04)
DescuentoPension            = calcularDescuentos (SueldoBruto,0.04)
TotalDescuentos             = DescuentoParafiscales + DescuentoSalud + DescuentoPension
SueldoNeto                  = SueldoBruto - TotalDescuentos
ProvPrima                   = calcularDescuentos (SueldoBruto,0.0833)
ProvCesantías               = calcularDescuentos (SueldoBruto,0.0833)
ProvInterCesantia           = calcularDescuentos (SueldoBruto,0.010)
ProvVacaciones              = calcularDescuentos (SueldoBruto,0.0417)
print ()
print ("Valor Horas Normales                   :  ", HorasNormales)  #400000  
print ("Valor Horas Extras                     :  ", ValorhorasExtras)  #75000.0
print ("Sueldo Bruto                           :  ", SueldoBruto)  #475000.0
print ("Descuento parafiscales                 :  ", DescuentoParafiscales) #42750.0
print ("Descuento Salud                        :  ", DescuentoSalud) #19000.0
print ("Descuento Pensión                      :  ", DescuentoPension) #19000.0
print ("Suma de todos los descuentos           :  ", TotalDescuentos) #80750.0
print ("Sueldo Neto                            :  ", SueldoNeto) #394250.0
print ("Provisiones para prima                 :  ", ProvPrima) #39567.5
print ("Provisiones para cesantías             :  ", ProvCesantías) #39567.5
print ("Provisiones para intereses de cesantía :  ", ProvInterCesantia) #4750.0
print ("Provisiones para vacaciones            :  ", ProvVacaciones) #19807.5
