#Declaracion variables
tenperatura1 = 0
temperatura2 = 0
diasEnCampo = 0
errorMenor5 = 0
errorMayor35 = 0
errorAmbas = 0

totalTemperatura = 0
totalDatos = 0
temperaturaMax = 0
temperaturaMin = 0
inicializacion = False
diasError = 0
temperaturaMedia = 0
porcentajeError = 0.0

#Inicio ciclo 
while(True):
#Lectura de datos
    temperatura1 = int(input())
    temperatura2 = int(input())

    if(temperatura1 == 0 and temperatura2 == 0): #Finaliza el Ciclo
        break
    elif(temperatura2 < 5 and temperatura1 > 35):
        errorAmbas = errorAmbas + 1
    elif(temperatura1 > 35): #Suma de error temperatura minima
        errorMayor35 = errorMayor35 +1
    elif(temperatura2 < 5): #Suma de error temperatura minima
        errorMenor5 = errorMenor5 +1   
    else:
        temperaturaMax = temperaturaMax + temperatura1
        temperaturaMin = temperaturaMin + temperatura2
       
        
    diasEnCampo = diasEnCampo + 1

diasError = errorMenor5 + errorMayor35 + errorAmbas
Tmax = temperaturaMax / (diasEnCampo - diasError)
Tmin = temperaturaMin / (diasEnCampo - diasError)
porcentajeError = (diasError * 100) / diasEnCampo

# print("Los dias en campo fueron:",diasEnCampo)
# print("Dias totales con error:",diasError)
# print("Dias con temperatura menores a 5 grados:",errorMenor5)
# print("Dias con temperatura mayores a 35 grados:",errorMayor35)
# print("Error ambas:",errorAmbas)
# print("Media maxima:",Tmax)
# print("Media minima:",Tmin)
# print("Porcentaje de dias con error:",porcentajeError,"%")


print(diasEnCampo)
print(diasError)
print(errorMenor5)
print(errorMayor35)
print(errorAmbas)
print(Tmax)
print(Tmin)
print(porcentajeError)

