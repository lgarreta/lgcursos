


edad= int (input ("ingrese su edad: "))
exameningreso= int (input ("puntaje examen:"))
salario= int (input ("salarios minimos de ingreso familiar:"))


descmatri= 0
descsalario= 0
descexaming= 0


#porcentaje por edad
if (edad >= 15 and edad <= 18):
    descmatri= 25

elif (edad >= 19 and edad <= 21):
    descmatri= 15
    
elif (edad >=22 and edad <= 25):
    descmatri= 10 
    
else:
    descmatri= 0 

#porcentaje salario
if (salario <= 1):
    descsalario= 30
    
elif (salario >1 and salario <=2):
    descsalario= 20

elif (salario >2 and salario <=3):
    descsalario= 10
    
elif (salario >3 and salario <=4):
    descsalario= 5

else:
    descsalario= 0
    
#porcentaje puntaje de ingreso
if (exameningreso >= 80 and exameningreso < 86):
    descexamening= 30
    
elif (exameningreso >= 86 and exameningreso < 91):
    descexamening= 35
    
elif (exameningreso >= 91 and exameningreso < 96):
    descexamening= 40
    
elif (exameningreso >=96):
    descexamening= 45
    
else:
    descexamening= 0
    
#total de porcentaje apoyo a beneficiario
totalapoyo= descmatri + descsalario + descexamening

print ("DESCUENTO POR EDAD:", descmatri,)
print ("DESCUENTO POR PUNTAJE EXAMEN DE INGRESO:", descexamening,)
print ("DESCUENTO POR INGRESOS FAMILIARES:", descsalario,)
print ("TOTAL PORCENTAJE DE APOYO A BENEFICIARIO:",totalapoyo,)


