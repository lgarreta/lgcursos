complete_name = ""
age=0
exam_score=0
salarios_minimos=0.0
#ya no es necesario# complete_name = input("ingrese su nombre completo")
age=int(input())
exam_score=int(input())
salarios_minimos=float(input())
valor_de_matricula =1
#valor ya no es necesario valor_de_matricula=int(input("ingrese el valor de matricula"))

if age >=15 and age <=18:
    descuento_edad= valor_de_matricula*0.25
elif age >=19 and age <=21: 
    descuento_edad= valor_de_matricula*0.15
elif age >=22 and age <=25:
    descuento_edad= valor_de_matricula*0.10
elif age >25:
    descuento_edad= valor_de_matricula*0
#print("su descuento por edad es",descuento_edad)

if salarios_minimos <=1:
    descuento_salario= float(valor_de_matricula*0.30)
elif salarios_minimos >1 and salarios_minimos <=2:
    descuento_salario= float(valor_de_matricula*0.20)
elif salarios_minimos >2 and salarios_minimos <=3:
    descuento_salario = float(valor_de_matricula*0.10)
elif salarios_minimos >3:
    descuento_salario= valor_de_matricula*0

#print (complete_name,"su descuento por ingresos es",descuento_salario)

if   exam_score <80:
     descuento_puntaje= valor_de_matricula*0
elif exam_score >=80 and exam_score <86:
    descuento_puntaje= valor_de_matricula*0.3
elif exam_score >=86 and exam_score <91:
    descuento_puntaje= valor_de_matricula*0.35
elif exam_score >=91 and exam_score <96:
    descuento_puntaje= valor_de_matricula*0.4
elif exam_score >=96:
    descuento_puntaje= valor_de_matricula*0.45
#print (complete_name,"su descuento por puntaje es",descuento_puntaje)
descuento_edad=int(descuento_edad*100)
descuento_puntaje=int(descuento_puntaje*100)
descuento_salario=int(descuento_salario*100)
descuento_total= int(descuento_edad+descuento_salario+descuento_puntaje)
#if descuento_total < 0:
  #print (complete_name,"su descuento total es gratis")
#if descuento_total >0:
  #print (complete_name,"su descuento total es", descuento_total )
print (descuento_edad)
print (descuento_puntaje)
print (descuento_salario)
print (descuento_total)