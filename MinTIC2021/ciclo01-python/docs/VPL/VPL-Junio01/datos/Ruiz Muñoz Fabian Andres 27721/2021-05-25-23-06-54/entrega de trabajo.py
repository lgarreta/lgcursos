#trabajo
edad     =int(input("ingresar edad "))
puntaje  =int(input("ingresar puntaje de actitud "))
salario  =int(input("ingresar salario "))

auxedad=0
auxexamen=0
auxsalario=0
totalaux=0

if (edad >=15 and edad <=18):
    auxedad=25
elif (edad >=19 and edad <=21):
    auxedad=15
elif (edad >=22 and edad <=25):
    auxedad=10
elif (edad >25):
    auxedad=0
    
if(puntaje>=0 and puntaje <80):
    auxexamen=0
elif(puntaje >=80 and puntaje <86):
    auxexamen =30
elif(puntaje>=86 and puntaje <91):
    auxexamen =35
elif(puntaje >=91 and puntaje <96):
    auxexamen =40
elif(puntaje>96 and puntaje  <=100):
    auxexamen =45
    
if (salario <=1):
    auxsalario = 30
elif (salario>1 and salario <=2):
    auxsalario = 20
elif(salario>2 and salario<=3):
    auxsalario=10
elif(salario>3 and salario<=4):
    auxsalario=5
elif(salario>=5):
    auxsalario=0

totalaux=(auxsalario+auxexamen+auxedad)
    
print (auxedad)
print (auxexamen)
print (auxsalario)
print (totalaux)