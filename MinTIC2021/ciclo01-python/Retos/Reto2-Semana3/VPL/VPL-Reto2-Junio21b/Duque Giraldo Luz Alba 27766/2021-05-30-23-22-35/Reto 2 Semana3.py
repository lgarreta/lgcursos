nombre = "Desconocido" 
apellido = "Desconocido"

ingresoporcentaje1=30
ingresoporcentaje2=20
ingresoporcentaje3=10
ingresoporcentaje4=5
ingresoporcentaje5=0
puntajeporcentaje1=30
puntajeporcentaje2=35
puntajeporcentaje3=40
puntajeporcentaje4=45
puntajeporcentaje5=0

nombre = input ("Ingrese Nombre Candidato: ")
apellido = input ("Ingrese Apellido Candidato: ")
edad = int (input ("Ingrese la Edad del Candidato: "))
ingresofamiliar = float (input("Introduzca ingreso familiar en números decimales: "))
puntajexamen = int(input ("Ingrese el puntaje del examen: "))
if (edad > 15 and edad <= 18):
    descuento1= 25
    print ("Su porcentaje de descuento por edad es de: ", descuento1, "%")
    if (ingresofamiliar <= 1):
        print ("Su porcentaje de descuento por ingreso familiar es de: ", ingpor1, "%")
        if (puntajexamen >= 80 and puntajexamen < 86):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje1, "%")
            totalporcentaje1 = descuento1 + ingresoporcentaje1 + puntajeporcentaje1
        elif (puntajexamen >= 86 and puntajexamen < 91):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje2, "%")
            totalporcentaje1 = descuento1 + ingresoporcentaje1 + puntajeporcentaje2
        elif (puntajexamen >= 91 and puntajexamen < 96):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje3, "%")
            totalporcentaje1 = descuento1 + ingresoporcentaje1 + puntajeporcentaje3
        elif (puntajexamen >= 96):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje4, "%")
            totalporcentaje1 = descuento1 + ingresoporcentaje1 + puntajeporcentaje4
        else:
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje5, "%")
            totalporcentaje1 = descuento1 + ingresoporcentaje1 + puntajeporcentaje5
    elif (ingresofamiliar > 1 and ingresofamiliar <= 2):
        print ("Su porcentaje de descuento por ingreso familiar es de: ", ingresoporcentaje2, "%")
        if (puntajexamen >= 80 and puntajexamen < 86):
            print ("Su porcentaje de descuento por examen es de : ", puntajeporcentaje1, "%")
            totalporcentaje1 = descuento1 + ingresoporcentaje2 + puntajeporcentaje1
        elif (puntajexamen >= 86 and puntajexamen < 91):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje2, "%")
            totalporcentaje1 = descuento1 + ingresoporcentaje2 + puntajeporcentaje2
        elif (puntajexamen >= 91 and puntajexamen < 96):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje3, "%")
            totalporcentaje1 = descuento1 + ingresoporcentaje2 + puntajeporcentaje3
        elif (puntajexamen >= 96):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje4, "%")
            totalporcentaje1 = descuento1 + ingresoporcentaje2 + puntajeporcentaje4
        else:
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje5, "%")
            totalporcentaje1 = descuento1 + ingresoporcentaje2 + puntajeporcentaje5
    elif (ingresofamiliar > 2 and ingresofamiliar <= 3):
        print ("Su porcentaje de descuento por ingreso familiar es de: ", ingresoporcentaje3, "%")
        if (puntajexamen >= 80 and puntajexamen < 86):
            print ("Su porcentaje de descuento por examen es de: ", ingresoporcentaje1, "%")
            totalporcentaje1 = descuento1 + ingresoporcentaje3 + puntajeporcentaje1
        elif (puntajexamen >= 86 and puntajexamen < 91):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje2, "%")
            totalporcentaje1 = descuento1 + ingresoporcentaje3 + puntajeporcentaje2
        elif (puntajexamen >= 91 and puntajexamen < 96):
            print ("Su porcentaje de descuento por Examen es de: ", puntajeporcentaje3, "%")
            totalporcentaje1 = descuento1 + ingresoporcentaje3 + puntajeporcentaje3
        elif (puntajexamen >= 96):
            print ("Su porcentaje de descuen to por examen es de: ", puntajeporcentaje4, "%")
            totalporcentaje1 = descuento1 + ingresoporcentaje3 + puntajeporcentaje4
        else:
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje5, "%")
            totalporcentaje1 = descuento1 + ingresoporcentaje3 + puntajeporcentaje5
    elif (ingfam > 3 and ingfam <= 4):
        print ("Su porcentaje de descuento por ingreso familiar es de: ", ingresoporcentaje4, "%")
        if (puntajexamen >= 80 and puntajexamen < 86):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje1, "%")
            totalporcentaje1 = descuento1 + ingresoporcentaje4 + puntajeporcentaje1
        elif (puntajexamen >= 86 and puntajexamem < 91):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje2, "%")
            totalporcentaje1 = descuento1 + ingresoporcentaje4 + puntajeporcentaje2
        elif (puntajexamen >= 91 and puntajexamen < 96):
            print ("Su porcentaje de descuento por examen es de: ", puntajepocentajer3, "%")
            totalporcentaje1 = descuento1 + ingresoporcentaje4 + puntajeporcentaje3
        elif (puntajexamen >= 96):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje4, "%")
            totalporcentaje1 = descuento1 + ingresoporcentaje4 + puntajeporcentaje4
        else:
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje5, "%")
            totalporcentaje1 = descuento1 + ingresoporcentaje4 + puntajeporcentaje5
    else:
        print ("Su porcentaje de descuento por ingreso familiar es de: ", ingresoporcentaje5, "%")
        if (puntajexamen >= 80 and puntajexamen < 86):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje1, "%")
            totalporcentaje1 = descuento1 + ingresoporcentaje5 + puntajeporcentaje1
        elif (puntajexamen >= 86 and puntajexamen < 91):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje2, "%")
            totalporcentaje1 = descuento1 + ingresoporcentaje5 + puntajeporcentaje2
        elif (puntajexamen >= 91 and puntajexamen < 96):
            print ("Su porcentaje de descuento por examen es de: ", puntajepocentajer3, "%")
            totalporcentaje1 = descuento1 + ingresoporcentaje5 + puntajeporcentaje3
        elif (puntajexamen >= 96):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje4, "%")
            totalporcentaje1 = descuento1 + ingresoporcentaje5 + puntajeporcentaje4
        else:
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje5, "%")
            totalporcentaje1 = descuento1 + ingresoporcentaje5 + puntajeporcentaje5
elif (edad >= 19 and edad <= 21):
    descuento2 = 15
    print ("Su descuento por edad es de: ", descuento2, "%")
    if (ingresofamiliar <= 1):
        print ("Su porcentaje de descuento por ingreso familiar es de: ", ingresoporcentaje1, "%")
        if (puntajexamen >= 80 and puntajexamen < 86):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje1, "%")
            totalporcentaje1 = descuento2 + ingresoporcentaje1 + puntajeporcentaje1
        elif (puntajexamen >= 86 and puntajexamen < 91):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje2, "%")
            totalporcentaje1 = descuento2 + ingresoporcentaje1 + puntajeporcentaje2
        elif (puntajexamen >= 91 and puntajexamen < 96):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje3, "%")
            totalporcentaje1 = descuento2 + ingresoporcentaje1 + puntajeporcentaje3
        elif (puntajexamen >= 96):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje4, "%")
            totalporcentaje1 = descuento2 + ingresoporcentaje1 + puntajeporcentaje4
        else:
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje5, "%")
            totalporcentaje1 = descuento2 + ingresoporcentaje1 + puntajeporcentaje5
    elif (ingresofamiliar > 1 and ingresofamiliar <= 2):
        print ("Su porcentaje de descuento por ingreso familiar es de: ", ingresoporcentaje2, "%")
        if (puntajexamen >= 80 and puntajexamen < 86):
            print ("Su porcentaje de descuento por examen es de : ", puntajeporcentaje1, "%")
            totalporcentaje1 = descuento2 + ingresoporcentaje2 + puntajeporcentaje1
        elif (puntajexamen >= 86 and puntajexamen < 91):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje2, "%")
            totalporcentaje1 = descuento2 + ingresoporcentaje2 + puntajeporcentaje2
        elif (puntajexamen >= 91 and puntajexamen < 96):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje3, "%")
            totalporcentaje1 = descuento2 + ingresoporcentaje2 + puntajeporcentaje3
        elif (puntajexamen >= 96):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje4, "%")
            totalporcentaje1 = descuento2 + ingresoporcentaje2 + puntajeporcentaje4
        else:
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje5, "%")
            totalporcentaje1 = descuento2 + ingresoporcentaje2 + puntajeporcentaje5
    elif (ingresofamiliar > 2 and ingresofamiliar <= 3):
        print ("Su porcentaje de descuento por ingreso familiar es de: ", ingresoporcentaje3, "%")
        if (puntajexamen >= 80 and puntajexamen < 86):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje1, "%")
            totalporcentaje1 = descuento2 + ingresoporcentaje3 + puntajeporcentaje1
        elif (puntajexamen >= 86 and puntajexamen < 91):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje2, "%")
            totalporcentaje1 = descuento2 + ingresoporcentaje3 + puntajeporcentaje2
        elif (puntajexamen >= 91 and puntajexamen < 96):
            print ("Su porcentaje de descuento por Examen es de: ", puntajeporcentaje3, "%")
            totalporcentaje1 = descuento2 + ingresoporcentaje3 + puntajeporcentaje3
        elif (puntajexamen >= 96):
            print ("Su porcentaje de descuen to por examen es de: ", puntajeporcentaje4, "%")
            totalporcentaje1 = descuento2 + ingresoporcentaje3 + puntajeporcentaje4
        else:
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje5, "%")
            totalporcentaje1 = descuento2 + ingresoporcentaje3 + puntajeporcentaje5
    elif (ingresofamiliar > 3 and ingresofamiliar <= 4):
        print ("Su porcentaje de descuento por ingreso familiar es de: ", ingresoporcentaje4, "%")
        if (puntajexamen >= 80 and puntajexamen < 86):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje1, "%")
            totalporcentaje1 = descuento2 + ingresoporcentaje4 + puntajeporcentaje1
        elif (puntajexamen >= 86 and puntajexamen < 91):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje2, "%")
            totalporcentaje1 = descuento2 + ingresoporcentaje4 + puntajeporcentaje2
        elif (puntajexamen >= 91 and puntajexamen < 96):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje3, "%")
            totalporcentaje1 = descuento2 + ingresoporcentaje4 + puntajeporcentaje3
        elif (puntajexamen >= 96):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje4, "%")
            totalporcentaje1 = descuento2 + ingresoporcentaje4 + puntajeporcentaje4
        else:
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje5, "%")
            totalporcentaje1 = descuento2 + ingresoporcentaje4 + puntajeporcentaje5
    else:
        print ("Su porcentaje de descuento por ingreso familiar es de: ", ingresoporcentaje5, "%")
        if (puntajexamen >= 80 and puntajexamen < 86):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje1, "%")
            totalporcentaje1 = descuento2 + ingresoporcentaje5 + puntajeporcentaje1
        elif (puntajexamen >= 86 and puntajexamen < 91):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje2, "%")
            totalporcentaje1 = descuento2 + ingresoporcentaje5 + puntajeporcentaje2
        elif (puntajexamen >= 91 and puntajexamen < 96):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje3, "%")
            totalporcentaje1 = descuento2 + ingresoporcentaje5 + puntajeporcentaje3
        elif (puntajexamen >= 96):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje4, "%")
            totalporcentaje1 = descuento2 + ingresoporcentaje5 + puntajeporcentaje4
        else:
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje5, "%")
            totalporcentaje1 = descuento2 + ingresoporcentaje5 + puntajeporcentaje5
elif (edad > 22 and edad <= 25):
    descuento3 = 10
    print ("Su porcentaje de descuento por edad es de: ", descuento3, "%")
    if (ingresofamiliar <= 1):
        print ("Su porcentaje de descuento por ingreso familiar es de: ", ingresoporcentaje1, "%")
        if (puntajexamen >= 80 and puntajexamen < 86):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje1, "%")
            totalporcentaje1 = descuento3 + ingresoporcentaje1 + puntajeporcentaje1
        elif (puntajexamen >= 86 and puntajexamen < 91):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje2, "%")
            totalporcentaje1 = descuento3 + ingresoporcentaje1 + puntajeporcentaje2
        elif (puntajexamen >= 91 and puntajexamen < 96):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje3, "%")
            totalporcentaje1 = descuento3 + ingresoporcentaje1 + puntajeporcentaje3
        elif (puntajexamen >= 96):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje4, "%")
            totalporcentaje1 = descuento3 + ingresoporcentaje1 + puntajeporcentaje3
        else:
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje5, "%")
            totalporcentaje1 = descuento3 + ingresoporcentaje1 + puntajeporcentaje5
    elif (ingresofamiliar > 1 and ingresofamiliar <= 2):
        print ("Su porcentaje de descuento por ingreso familiar es de: ", ingresoporcentaje2, "%")
        if (puntajexamen >= 80 and puntajexamen < 86):
            print ("Su porcentaje de descuento por examen es de : ", puntajeporcentaje1, "%")
            totalporcentaje1 = descuento3 + ingresoporcentaje2 + puntajeporcentaje1
        elif (puntajexamem >= 86 and puntajexamen < 91):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje2, "%")
            totalporcentaje1 = descuento3 + ingresoporcentaje2 + puntajeporcentaje2
        elif (puntajexamen >= 91 and puntajexamen < 96):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje3, "%")
            totalporcentaje1 = descuento3 + ingresoporcentaje2 + puntajeporcentaje3
        elif (puntajexamen >= 96):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje4, "%")
            totalporcentaje1 = descuento3 + ingresoporcentaje2 + puntajeporcentaje4
        else:
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje5, "%")
            totalporcentaje1 = descuento3 + ingresoporcentaje2 + puntajeporcentaje5
    elif (ingresofamiliar > 2 and ingresofamiliar <= 3):
        print ("Su porcentaje de descuento por ingreso familiar es de: ", ingresoporcentaje3, "%")
        if (puntajexamen >= 80 and puntajexamen < 86):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje1, "%")
            totalporcentaje1 = descuento3 + ingresoporcentaje3 + puntajeporcentaje1
        elif (puntajexamen >= 86 and puntajexamen < 91):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje2, "%")
            totalporcentaje1 = descuento3 + ingresoporcentaje3 + puntajeporcentaje2
        elif (puntajexamen >= 91 and puntajexamen < 96):
            print ("Su porcentaje de descuento por Examen es de: ", puntajeporcentaje3, "%")
            totalporcentaje1 = descuento3 + ingresoporcentaje3 + puntajeporcentaje3
        elif (puntajexamen >= 96):
            print ("Su porcentaje de descuen to por examen es de: ", puntajeporcentaje4, "%")
            totalporcentaje1 = descuento3 + ingresoporcentaje3 + puntajeporcentaje4
        else:
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje5, "%")
            totalporcentaje1 = descuento3 + ingresoporcentaje3 + puntajeporcentaje5
    elif (ingresofamiliar > 3 and ingresofamiliar <= 4):
        print ("Su porcentaje de descuento por ingreso familiar es de: ", ingresoporcentaje4, "%")
        if (puntajexamen >= 80 and puntajexamen < 86):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje1, "%")
            totalporcentaje1 = descuento3 + ingresoporcentaje4 + puntajeporcentaje1
        elif (puntajexamen >= 86 and puntajexamen < 91):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje2, "%")
            totalporcentaje1 = descuento3 + ingresoporcentaje4 + puntajeporcentaje2
        elif (puntajexamen >= 91 and puntajexamen < 96):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje3, "%")
            totalporcentaje1 = descuento3 + ingresoporcentaje4 + puntajeporcentaje3
        elif (puntajexamen >= 96):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje4, "%")
            totalporcentaje1 = descuento3 + ingresoporcentaje4 + puntajeporcentaje4
        else:
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje5, "%")
            totalporcentaje1 = descuento3 + ingresoporcentaje4 + puntajeporcentaje5
    else:
        print ("Su porcentaje de descuento por ingreso familiar es de: ", ingresoporcentaje5, "%")
        if (puntajexamen >= 80 and puntajexamen < 86):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje1, "%")
            totalporcentaje1 = descuento3 + ingresoporcentaje5 + puntajeporcentaje1
        elif (puntajexamen >= 86 and puntajexamen < 91):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje2, "%")
            totalporcentaje1 = descuento3 + ingresoporcentaje5 + puntajeporcentaje2
        elif (puntajexamen >= 91 and puntajexamen < 96):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje3, "%")
            totalporcentaje1 = descuento3 + ingresoporcentaje5 + puntajeporcentaje3
        elif (puntajexamen >= 96):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje4, "%")
            totalporcentaje1 = descuento3 + ingresoporcentaje5 + puntajeporcentaje4
        else:
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje5, "%")
            totalporcentaje1 = descuento3 + ingresoporcentaje5 + puntajeporcentaje5
else:
    descuento4 = 0
    if (ingresofamiliar <= 1) :
        print ("Su porcentaje de descuento por ingreso familiar es de: ", ingresoporcentaje1, "%")
        if (puntajexamen >= 80 and puntajexamen < 86):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje1, "%")
            totalporcentaje1 = descuento4 + ingresoporcentaje1 + puntajeporcentaje1
        elif (puntajexamen >= 86 and puntajexamen < 91):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje2, "%")
            totalporcentaje1 = descuento4 + ingresoporcentaje1 + puntajeporcentaje2
        elif (puntajexamen >= 91 and puntajexamen < 96):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje3, "%")
            totalporcentaje1 = descuento4 + ingresoporcentaje1 + puntajeporcentaje3
        elif (puntajexamen >= 96):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje4, "%")
            totalporcentaje1 = descuento4 + ingresoporcentaje1 + puntajeporcentaje4
        else:
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje5, "%")
            totalporcentaje1 = descuento4 + ingresoporcentaje1 + puntajeporcentaje5
    elif (ingresofamiliar > 1 and ingresofamiliar <= 2):
        print ("Su porcentaje de descuento por ingreso familiar es de: ", ingresoporcentaje2, "%")
        if (punexa >= 80 and punexa < 86):
            print ("Su porcentaje de descuento por examen es de : ", puntajeporcentaje1, "%")
            totalporcentaje1 = descuento4 + ingresoporcentaje2 + puntajeporcentaje1
        elif (puntajexamen >= 86 and puntajexamen < 91):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje2, "%")
            totalporcentaje1 = descuento4 + ingresoporcentaje2 + puntajeporcentaje2
        elif (puntajexamen >= 91 and puntajexamen < 96):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje3, "%")
            totalporcentaje1 = descuento4 + ingresoporcentaje2 + puntajeporcentaje3
        elif (puntajexamen >= 96):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje4, "%")
            totalporcentaje1 = descuento4 + ingresoporcentaje2 + puntajeporcentaje4
        else:
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje5, "%")
            totalporcentaje1 = descuento4 + ingresoporcentaje2 + puntajeporcentaje5
    elif (ingresofamiliar > 2 and ingresofamiliar <= 3):
        print ("Su porcentaje de descuento por ingreso familiar es de: ", ingresoporcentaje3, "%")
        if (puntajexamen >= 80 and puntajexamen < 86):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje1, "%")
            totalporcentaje1 = descuento4 + ingresoporcentaje3 + puntajeporcentaje1
        elif (puntajexamen >= 86 and puntajexamen < 91):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje2, "%")
            totalporcentaje1 = descuento4 + ingresoporcentaje3 + puntajeporcentaje2
        elif (puntajexamen >= 91 and puntajexamen < 96):
            print ("Su porcentaje de descuento por Examen es de: ", puntajeporcentaje3, "%")
            totalporcentaje1 = descuento4 + ingresoporcentaje3 + puntajeporcentaje3
        elif (puntajexamen >= 96):
            print ("Su porcentaje de descuen to por examen es de: ", puntajeporcentaje4, "%")
            totalporcentaje1 = descuento4 + ingresoporcentaje3 + puntajeporcentaje4
        else:
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje5, "%")
            totalporcentaje1 = descuento4 + ingresoporcentaje3 + puntajeporcentaje5 
    elif (ingresofamiliar > 3 and ingresofamiliar <= 4):
        print ("Su porcentaje de descuento por ingreso familiar es de: ", ingresoporcentaje4, "%")
        if (puntajexamen >= 80 and puntajexamen < 86):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje1, "%")
            totalporcentaje1 = descuento4 + ingresoporcentaje4 + puntajeporcentaje1
        elif (puntajexamen >= 86 and puntajexamen < 91):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje2, "%")
            totalporcentaje1 = descuento4 + ingresoporcentaje4 + puntajeporcentaje2
        elif (puntajexamen >= 91 and puntajexamen < 96):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje3, "%")
            totalporcentaje1 = descuento4 + ingresoporcentaje4 + puntajeporcentaje3
        elif (puntajexamen >= 96):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje4, "%")
            totalporcentaje1 = descuento4 + ingresoporcentaje4 + puntajeporcentaje4
        else:
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje5, "%")
            totalporcentaje1 = descuento4 + ingresoporcentaje4 + puntajeporcentaje5
    else:
        print ("Su porcentaje de descuento por ingreso familiar es de: ", ingresoporcentaje5, "%")
        if (puntajexamen >= 80 and puntajexamen < 86):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje1, "%")
            totalporcentaje1 = descuento4 + ingresoporcentaje5 + puntajeporcentaje1
        elif (puntajexamen >= 86 and puntaexamen < 91):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje2, "%")
            totalporcentaje1 = descuento4 + ingresoporcentaje5 + puntajeporcentaje2
        elif (puntajexamen >= 91 and puntajexamen < 96):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje3, "%")
            totalporcentaje1 = descuento4 + ingresoporcentaje5 + puntajeporcentaje3
        elif (puntajexamen >= 96):
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje4, "%")
            totalporcentaje1 = descuento4 + ingresoporcentaje5 + puntajeporcentaje4
        else:
            print ("Su porcentaje de descuento por examen es de: ", puntajeporcentaje5, "%")
            totalporcentaje1 = descuento4 + ingresoporcentaje5 + puntajeporcentaje5
       
print ("señor(a): ",nombre," ",apellido,". ","Su porcentaje total de descuento es de: ", totalporcentaje1, "%")


