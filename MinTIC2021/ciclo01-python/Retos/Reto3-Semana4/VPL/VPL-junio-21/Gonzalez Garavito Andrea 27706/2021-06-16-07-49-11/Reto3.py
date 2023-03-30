
boleano='true'
temperaturas=[]
dias=0
dias_error=0
dia_menor=0
dia_mayor=0
temperaturas=0
menor=0
mayor=0
while(boleano=='true'):
    
    temperatura_dia=int(input("temperatura del dia:"))
    print(temperatura_dia)
    confirmar=input("¿Desea continuar S/N?")
    if(confirmar=='N' or confirmar=='n'):
        boleano='false'
    if(temperatura_dia<=5 or temperatura_dia>=35):
        dias_error=dias_error+1
        if(temperatura_dia<=5):
            dia_menor=dia_menor+1
        if(temperatura_dia>=35):
            dia_mayor=dia_mayor+1
    else:
        temperaturas=temperaturas+temperatura_dia
        if(menor>temperatura_dia or menor==0):
            menor=temperatura_dia
        if(mayor<temperatura_dia or mayor==0):
            mayor=temperatura_dia
    dias=dias+1
    

print('El numero total de dias de registro es:',dias)  
print('El numero total de dias con error de registro es:',dias_error)      
print('El numero total de dias mayores a 35:',dia_mayor)
print('El numero total de dias menores a 5:',dia_menor)
dias_bien=dias-dias_error
if (dias_bien>0):
    media=temperaturas/dias_bien
else:
    media=0
print(media,mayor,menor)