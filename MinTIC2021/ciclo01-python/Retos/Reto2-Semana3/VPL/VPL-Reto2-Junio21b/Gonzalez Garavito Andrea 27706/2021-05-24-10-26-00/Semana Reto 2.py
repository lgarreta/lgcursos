nombre = input("Escriba su nombre:")
apellido = input("Escriba su apellido:")
edad = int(input("Escriba su edad :"))
ingreso_familiar = float(input("Cuantos salarios minimos gana tu familia:"))
valor_examen =int(input("Nota final:"))

if(15<=edad<=18):
    valor=int(25)
elif(19<=edad<=21):
    valor=int(15)
elif(22<=edad<=25):
    valor=int(10)
else:
    valor=int(0)



if(ingreso_familiar<=1):
    valor_f=int(30)
elif(1<ingreso_familiar<=2):
    valor_f=int(20)
elif(2<ingreso_familiar<=3):
    valor_f=int(10)
elif(3<ingreso_familiar<=4):
    valor_f=int(5)
else:
    valor_f=0
    


if(80<=valor_examen<86):
    valor_e=int(30)
elif(86<=valor_examen<91):
    valor_e=int(35)
elif(91<=valor_examen<96):
    valor_e=int(40)
elif(100>=valor_examen>=96):
    valor_e=int(45)
else:
    valor_e=int(0)

    
totalDescuento=int(valor+valor_f+valor_e)
print("El alumno: ",nombre,apellido," de edad: ",edad," años, donde sus ingresos familiares son de",ingreso_familiar," salarios minimos y con una nota de:",valor_examen,"Obtiene un descuento por:",totalDescuento,"%")


