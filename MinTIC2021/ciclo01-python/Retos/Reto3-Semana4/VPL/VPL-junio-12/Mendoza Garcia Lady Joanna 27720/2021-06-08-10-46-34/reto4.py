#Reto 4 Semana 5 programa Nomina

horasTrabajadas=0
valorHora=0
horasExtras=0
valorHoraExtra=0
horasOrdinarias=0
parafiscales=0

#Entradas
input("Nombre docente: ")
horasTrabajadas=int(input("Horas: "))
valorHora=int(input("Valor: "))

#Proceso calculo salario

def calcularSalarioBruto (costoExtras,CostoOrdinarias):
    salbruto=0
    calculoExtras=0
    calculoOrdinarias=0
    if(horasTrabajadas >40):
        horasExtras=horasTrabajadas-40
        calculoExtras=horasExtras*valorHora*1.5
    if(horasTrabajadas >40):   
        horasOrdinarias= horasTrabajadas-horasExtras
        calculoOrdinarias=valorHora*horasOrdinarias
  
    salbruto=calculoOrdinarias+calculoExtras
    return(salbruto)

def totalOrdinarias(ordinarias,valorHora):
     if(horasTrabajadas >40):
        horasExtras=horasTrabajadas-40
        horasOrdinarias= horasTrabajadas-horasExtras
        
        calculoOrdinarias=valorHora*horasOrdinarias
        return (calculoOrdinarias)
    
def totalExtras (extras,valorHora):
    if(horasTrabajadas >40):
        horasExtras=horasTrabajadas-40
        calculoExtras=horasExtras*valorHora*1.5
    return(calculoExtras)

       
salariobruto= calcularSalarioBruto(horasTrabajadas,valorHora)
valorOrdinarias=totalOrdinarias(horasTrabajadas,valorHora)
valorExtras=totalExtras(horasTrabajadas,valorHora)

#descuentos parafiscales

def parafiscales(salbruto,porcentaje):
    parafiscal=salariobruto *0.09
    return(parafiscal)

parafiscal= parafiscales(horasTrabajadas,valorHora)


def descuentos(salud,pension):
    descuento=salariobruto*0.04
    return (descuento)

pension=descuentos(horasTrabajadas,valorHora)
salud=descuentos(horasTrabajadas,valorHora)

def totaldescuentos(parafiscales,salud,pension):
    totaldesc=parafiscal+salud+pension
    return(totaldesc)

totalDescontar=totaldescuentos(parafiscales,salud,pension)

def sueldoneto(salariobruto,totaldescuentos):
    neto=salariobruto-totaldescuentos
    return(neto)

sueldoNeto=sueldoneto(salariobruto,totalDescontar)

#provisiones

def prima_cesantias(salariobruto,porcentaje):
    prima_y_ces=salariobruto*0.0833
    return(prima_y_ces)

prima=prima_cesantias(salariobruto,valorHora)
cesantias= prima_cesantias(salariobruto,valorHora)

def interescesantias(salariobruto,porcentaje):
    interes=salariobruto*0.01
    return (interes)

def vacaciones(salariobruto,porcentaje):
    vacacion=salariobruto*0.0417
    return (vacacion)

interesCesantias=interescesantias(salariobruto,valorHora)
vacaciones=vacaciones(salariobruto,valorHora)

#Salidas
print(valorOrdinarias)
print(valorExtras)
print(salariobruto)
print(parafiscal)
print(salud)
print(pension)
print(totalDescontar)
print(sueldoNeto)
print(prima)
print(cesantias)
print(interesCesantias)
print(vacaciones)