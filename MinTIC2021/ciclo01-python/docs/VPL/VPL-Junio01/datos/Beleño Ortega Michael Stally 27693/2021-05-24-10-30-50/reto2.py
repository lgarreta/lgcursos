# FUNCIONA PARA SIMULAR UN SWITCH-CASE
def switch_descuento(valor, opcion):
    # EN CASO DE NECESITAR REALIZAR EL DESCUENTO POR EDAD SE VALIDARÁ SEGÚN REQUERIMIENTOS
    if opcion == "Edad":

        # SI ES MAYOR O IGUAL A 15 Y MENOR O IGUAL A 18
        if 15 <= valor <= 18:
            descuento = 25

        # SI ES MAYOR O IGUAL A 19 Y MENOR O IGUAL A 21
        elif 19 <= valor <= 21:
            descuento = 15

        # SI ES MAYOR O IGUAL A 22 Y MENOR O IGUAL A 25
        elif 22 <= valor <= 25:
            descuento = 10

        # SI ES MAYOR A 25 Y MENOR A 15
        else:
            descuento = 0

    # EN CASO DE NECESITAR REALIZAR EL DESCUENTO POR SMLV SE VALIDARÁ SEGÚN REQUERIMIENTOS
    elif opcion == "Smlv":

        # SI ES MENOR O IGUAL A 1
        if valor <= 1:
            descuento = 30

        # SI ES MAYOR A 1 Y MENOR O IGUAL A 2
        elif 1 < valor <= 2:
            descuento = 20

        # SI ES MAYOR A 2 Y MENOR O IGUAL A 3
        elif 2 < valor <= 3:
            descuento = 10

        # SI ES MAYOR A 3 Y MENOR O IGUAL A 4
        elif 3 < valor <= 4:
            descuento = 5

        # SI ES MAYOR A 4
        else:
            descuento = 0

    # EN CASO DE NECESITAR REALIZAR EL DESCUENTO POR NOTA SE VALIDARÁ SEGÚN REQUERIMIENTOS
    else:

        # SI ES MAYOR O IGUAL A 80 Y MENOR A 86
        if 80 <= valor < 86:
            descuento = 30

        # SI ES MAYOR O IGUAL A 86 Y MENOR A 91
        elif 86 <= valor < 91:
            descuento = 35

        # SI ES MAYOR O IGUAL A 91 Y MENOR A 96
        elif 91 <= valor < 96:
            descuento = 40

        # SI ES MAYOR A 96
        elif valor >= 96:
            descuento = 45

        # SI ES MENOR A 80
        else:
            descuento = 0
    return descuento


# PROGRAMA PRINCIPAL ------------------------------------------------------------------
edad = int(input("Por favor ingrese la EDAD del estudiante : "))
nota = int(input("Por favor ingrese la NOTA del examén para el estudiante : "))
smlv = float(input("Por favor ingrese la cantidad de SMLV familiar del estudiante : "))

total = switch_descuento(edad, "Edad") + switch_descuento(smlv, "Smlv") + switch_descuento(nota, "Nota")

print(switch_descuento(edad, "Edad"))
print(switch_descuento(nota, "Nota"))
print(switch_descuento(smlv, "Smlv"))
print(total)
