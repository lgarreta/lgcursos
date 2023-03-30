# ENTRADAS
edad    = int(input("Edad: "))
puntaje = int(input("puntaje: "))
salario = float(input("salarios: "))

# PROCESO
if edad>=15 and edad<=18:
#    print ("descuento por edad: 25%")
    t=25
elif edad>=19 and edad <=21:
#    print ("descuento por edad: 15%")
    t=15
elif edad>=22 and edad <=25:
#    print ("descuento por edad: 10%")
    t=10
else:
#    print ("descuento por edad 0%")
    t=0
    
if salario>=0 and salario<=1:
#    print ("descuento por salario: 30%")
    t1=30
elif salario>=1.1 and salario <=2:
#    print ("descuento por salario: 20%")
    t1=20
elif salario>=2.1 and salario <=3:
#    print ("descuento por salario: 10%")
    t1=10
elif salario>=3.1 and salario <=4:
#    print ("descuento por salario: 5%")
    t1=5
else:
#    print ("descuento por salario: 0%")
    t1=0

if puntaje>=80 and puntaje<=85:
#    print ("descuento por el puntaje del examen: 30%")
    t2=30
elif puntaje>=86 and puntaje<=90:
#    print ("descuento por el puntaje del examen: 35%")
    t2=35
elif puntaje>=91 and puntaje<=95:
#    print ("descuento por el puntaje del examen: 40%")
    t2=40
elif puntaje>=96 and puntaje<=100:
#    print ("descuento por el puntaje del examen: 45%")
    t2=45
else:
#    print ("descuento por el puntaje del examen: 0%")
    t2=0
descuento=t+t1+t2

# SALIDAS
print (t)
print (t2)
print (t1)
print (descuento)

    