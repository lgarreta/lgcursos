# Programa para calcular sueldos
# Entradas: nombreEmpleado, tarifaSueldo, horasTrabajadas

# 1. Entrada de datos
nombreTexto = input ("Ingrese su nombre: ")
tarifaTexto = input ("Ingrese tarifa sueldo: ")
horasTexto  = input ("Ingrese horas trabajadas: ")

# 2. Convertimos datos
nombreEmpleado  = str (nombreTexto)
tarifaSueldo    = float (tarifaTexto)
horasTrabajadas = int (horasTexto) 

print ("")
print ("Datos de entrada ", nombreEmpleado, tarifaSueldo, horasTrabajadas)

# 3. Calculo de sueldo sin ajuste
sueldoTotal = tarifaSueldo * horasTrabajadas
print ("El sueldo sin ajuste es: ", sueldoTotal)

# 4. Ajuste si horasTrabajadas > 35
if (horasTrabajadas > 35):
    sueldoTotal = tarifaSueldo * (1.5 * horasTrabajadas)
    
print ("Sueldo con ajuste: ", sueldoTotal)

# 5. Calculamos impuestos
if (sueldoTotal < 2000):
    impuestos = 0
else:
    if (sueldoTotal > 2000 and sueldoTotal < 2200):
        valorAdicional = sueldoTotal - 2200
        impuestoTotal = valorAdicional * 0.2
    else:
        if (sueldoTotal > 2200):
            impuesto1 = 220 * 0.3
            valorAdicional = sueldoTotal - 2200
            impuesto2 = valorAdicional * 0.2
            impuestoTotal = impuesto1 + impuesto2
        #
    #
#

# 6. Calculamos sueldo despues de impuestos
sueldoConImpuestos = sueldoTotal - impuestoTotal

print ("Su sueldo con impuestos es: ", sueldoConImpuestos)