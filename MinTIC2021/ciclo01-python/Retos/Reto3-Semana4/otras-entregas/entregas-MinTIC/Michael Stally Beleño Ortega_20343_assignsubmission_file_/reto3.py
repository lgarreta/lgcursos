# FUNCION PARA ENCONTRAR DIAS CON ERRORES
def errores_temperatura(opcion):
    por_mayor = 0
    por_menor = 0
    por_ambas = 0
    temporal = []
    sin_errores = []
    resultado = 0

    for index in range(len(lista_temperaturas)):
        keys = lista_temperaturas[index].keys()
        temporal.append(error_temperatura_dia(index, keys))
        if error_temperatura_dia(index, keys) == "Sin errores":
            sin_errores.append(index)

    for index in range(len(temporal)):
        if temporal[index] == "Ambos":
            por_ambas += 1
        elif temporal[index] == "Menor":
            por_menor += 1
        elif temporal[index] == "Mayor":
            por_mayor += 1

    if opcion == "Informe":
        resultado = "Informe de los días "+str(por_mayor+por_menor+por_ambas)+" días con error:    \n" \
                    "   - Los días con temperaturas menores a 5°, suman un total de " + str(por_menor) + " días \n" \
                    "   - Los días con temperaturas mayores a 35°, suman un total de " + str(por_mayor) + " días \n" \
                    "   - Los días con temperaturas erradas tanto mayor como menor, suman un total de " + str(por_ambas) + " días \n"
    elif opcion == "Media":
        for index in range(len(sin_errores)):
            keys = lista_temperaturas[sin_errores[index]].keys()
            for key in keys:
                resultado += lista_temperaturas[sin_errores[index]].get(key)
        resultado /= (len(sin_errores) * 2)
        resultado = "La temperatura promedio de las temperaturas ingresadas para los días sin errores es de "+str(resultado)+"° \n"

    elif opcion == "Minima":
        resultado = 999999*999999
        for index in range(len(sin_errores)):
            keys = lista_temperaturas[sin_errores[index]].keys()
            for key in keys:
                if lista_temperaturas[sin_errores[index]].get(key) < resultado:
                    resultado = lista_temperaturas[sin_errores[index]].get(key)
        resultado = "La temperatura minima de las temperaturas ingresadas para los días sin errores es de " + str(resultado) + "° \n"

    elif opcion == "Maxima":
        for index in range(len(sin_errores)):
            keys = lista_temperaturas[sin_errores[index]].keys()
            for key in keys:
                if index == 0:
                    resultado = lista_temperaturas[sin_errores[index]].get(key)
                elif lista_temperaturas[sin_errores[index]].get(key) > resultado:
                    resultado = lista_temperaturas[sin_errores[index]].get(key)
        resultado = "La temperatura maxima de las temperaturas ingresadas para los días sin errores es de " + str(resultado) + "° \n"

    else:
        dias_errados = len(temporal) - len(sin_errores)
        porc_errados = (dias_errados * 100) / len(temporal)
        porc_buenos = (len( sin_errores) * 100) / len(temporal)
        resultado = "Informe de las temperaturas ingresadas:    \n" \
                     "   - Los días CON temperaturas erradas suman un total de "+str(dias_errados)+" que equivale al "+str(porc_errados)+"% \n" \
                     "   - Los días SIN temperaturas erradas suman un total de "+str(len(sin_errores))+" que equivale al "+str(porc_buenos)+"% \n"
    return resultado


# FUNCION PARA CLASIFICAR LOS ERRORES POR DÍA
def error_temperatura_dia(posicion, keys):
    regresar = "Sin errores"
    temp_menor = 0
    temp_mayor = 0

    for key in keys:
        temperatura_dia = lista_temperaturas[posicion].get(key)
        if temperatura_dia > 35 and temp_mayor == 0:
            temp_mayor += 1
        elif temperatura_dia < 5 and temp_menor == 0:
            temp_menor += 1

    if temp_mayor == 1 and temp_menor == 1:
        regresar = "Ambos"
    elif temp_mayor == 1:
        regresar = "Mayor"
    elif temp_menor == 1:
        regresar = "Menor"

    return regresar


# FUNCION PARA VALIDAR QUE SE HAYA INGRESADO UN NUMERO DECIMAL
def validar_temperaturas(mensaje):
    contador = 0  # VARIABLE QUE NOS AYUDARÁ A SABER CUANTAS VECES SE HA EQUIVOCADO EL CLIENTE
    puntos = 0  # VARIABLE QUE NOS AYUDARÁ A SABER CUANTAS VECES SE HA EQUIVOCADO EL CLIENTE
    digitos = 0  # VARIABLE QUE NOS AYUDARÁ A SABER CUANTOS DIGITOS HAY EN LA ENTRADA DE DATOS
    correctos = 0  # VARIABLE QUE NOS PERMITIRÁ SABER CUANTAS TEMPERATURAS SON VALIDAS
    temperaturas = ''  # VARIABLE DONDE SE VAN A GUARDAR LAS TEMPERATURAS

    # CICLO PARA PEDIR UN NUMERO
    while True:
        # SI EL CLIENTE SE HA EQUIVOCADO MÁS DE UNA VEZ, ENTONCES MOSTRARÁ MENSAJE DE ERROR
        if correctos == 1 and contador > 0:
            temporal = valida_vacio(mensaje, "Una de las temperaturas está mal. Cada una debe tener un número o "
                                             "decimal(Con punto). ")

            # SI EL CLIENTE INGRESO MAL UNA DE LAS DOS TEMPERATURAS
        elif correctos > 2 and contador > 0:
            temporal = valida_vacio(mensaje, "Ha ingresado más de dos temperaturas. Recuerde que solo deben ser dos "
                                             "separadas por medio de una coma (,). ")

        # SI EL CLIENTE INGRESO MAL UNA DE LAS DOS TEMPERATURAS
        elif correctos < 1 and contador > 0:
            temporal = valida_vacio(mensaje, "Ha ingresado menos de dos temperaturas. Recuerde que deben ser dos "
                                             "separadas por medio de una coma (,). ")

            # SI ES LA PRIMERA VEZ QUE VA A INGRESAR UN VALOR, ENTONCES NO MOSTRARÁ MENSAJE DE ERROR
        else:
            temporal = valida_vacio(mensaje, "")

        contador += 1  # AUMENTARÁ CADA VEZ QUE EL CICLO SE REPITA (NO SE INGRESO UN NUMERO)
        correctos = 0  # REINICIAMOS LA VARIABLE CADA VEZ QUE EL CLINETE INGRESA DATOS
        temporal = temporal.replace(' ', '')  # BORRAMOS LO ESPACIOS EN BLANCO

        # VALIDAMOS SI SE INGRESARON MAS TEMPERATURAS
        if temporal.count(',') > 0:
            temperaturas = temporal.split(',')  # SEPARAMOS LAS TEMPERATURAS INGRESADAS

            # CICLO PARA RECORRER CADA TEMPERATURA INGRESADA Y VALIDARLA
            for temperatura in temperaturas:

                # CICLO PARA RECORRER TODOS LOS CARACTERES DE LA TEMPERATURA
                for caracter in temperatura:

                    # VALIDAMOS SI INGRESÓ UN NUMERO
                    if caracter.isdigit():
                        digitos += 1

                    # EN CASO DE NO INGRESAR UN NÚMERO PUEDE INGRESAR SOLO UN PUNTO "."
                    elif caracter == "." and puntos == 0:
                        puntos += 1

                # VALIDAMOS SI EL NUMERO DE CARACTERES VALIDOS ES IGUAL AL NUMERO DE CARACTERES DE LA ENTRADA DE DATO
                if (digitos + puntos) == len(temperatura):
                    correctos += 1
                digitos = 0
                puntos = 0
        else:
            correctos = 0

        # EN CASO DE SE HAYAN INGRESADO DOS TEMPERATURAS Y LOS VALORES CADA UNA SEA VALIDA
        if correctos == 2 and temporal.count(',') == 1:
            # EN CASO DE INGRESAR 0,0
            if (float(temperaturas[0]) + float(temperaturas[1])) == 0:
                temporal = 0
            else:
                temporal = {"Temperatura Min": float(temperaturas[0]), "Temperatura Max": float(temperaturas[1])}
            break
    return temporal


# FUNCION PARA VALIDAR ENTRADAS VACIAS
def valida_vacio(mensaje, error):
    temporal = input(error + mensaje)  # PRIMERO PEDIREMOS AL CLIENTE QUE INGRESE UN VALOR

    # CICLO QUE SE REPETIRA HASTA INGRESAR AL MENOS UN VALOR
    while True:

        # SI NO SE INGRESO NADA (PRESIONO ENTER) O LA VARIABLE RECIBIO LA MENOS UN DATO, SALDRÁ DEL CICLO
        if len(temporal) > 0:
            break

        # SI NO INGRESÓ NADA, ENTONCES SE LE VOLVERÁ A PEDIR CON UN MENSAJE DE ERROR
        else:
            temporal = input("Debe ingresar dos temperaturas en formato 'TEMP1 , TEMP2'. " + mensaje)

    return str(temporal)


# FLUJO PRINCIPAL
lista_temperaturas = []
i = 0
while True:
    i += 1
    entrada = validar_temperaturas("Ingresa las temperaturas del día " + str(i) + " en formato TEMP_MIN , TEMP_MAX: ")
    if entrada == 0:
        break
    else:
        lista_temperaturas.append(entrada)

# IMPRIMIRMOS LOS DATOS QUE NECESITA EL CLIENTE
print("\n -------------------------- RESULTADOS -------------------------- \n")
print("La salida de campo duró ", len(lista_temperaturas), " día.\n")
print(errores_temperatura("Informe"))
print(errores_temperatura("Media"))
print(errores_temperatura("Minima"))
print(errores_temperatura("Maxima"))
print(errores_temperatura("Otro"))
