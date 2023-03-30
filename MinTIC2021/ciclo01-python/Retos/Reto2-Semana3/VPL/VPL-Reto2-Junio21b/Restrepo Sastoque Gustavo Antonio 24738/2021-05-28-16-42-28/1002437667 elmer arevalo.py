#Reto 2
#debemos ingresar nombres y edades de los estudiantes
#puntaje=puntaje de examen de ingreso
#smm=se refiere a los salarios minimos mensuales recibidos por la familia
#desc_edad=descuento por edad
#desc_punt=descuento por el puntaje del examen de ingreso
nombre=str(input("por favor, ingrese el nombre y los apellidos del candidato: \n"))
edad=int(input("por favor,ingrese la edad del candidato: \n"))
puntaje=float(input("por favor ingrese el puntaje del examen \n"))
smm=float(input("ingrese la cantidad de salarios minimos mensuales de la familia: \n"))

if edad>=15 and edad<=18:
	desc_edad=0.25
elif edad>=19 and edad<=21:
	desc_edad=0.15     
elif edad>=22 and edad<=25:
	desc_edad=0.10
else:
	edad>25
	print("no hay descuento")
if smm<=1:
	desc_smm=0.30
elif smm>1 and smm<=2:
	desc_smm=0.20
elif smm>2 and smm<=3:
	desc_smm=0.10
elif smm>3 and smm<=4:
	desc_smm=0.5
else:
	smm>4
	print("no hay descuento por ingresos familiares")

if puntaje>=80 and puntaje <86:
	desc_punt=0.30
elif puntaje>=86 and puntaje<91:
	desc_punt=0.35
elif puntaje>=91 and puntaje <96:
	desc_punt=0.40 
elif  puntaje>=96 :
	desc_punt=0.45
else:
	 puntaje <80
	 print("no hay apoyo por puntaje de examen")
descuento_total=desc_edad+desc_smm+desc_punt
print("beneficiario",nombre,)
print("el descuento por edad es",desc_edad,"%")
print("el descuento por salario minimo es",desc_smm,"%")
print("el descuento por puntaje del examen es",desc_punt,"%")
print("el descuento total es",descuento_total,"%") 

print("gracias por su interes en nuestra universidad")













