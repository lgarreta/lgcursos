age = int(input("¿Cuál es tu edad? "))
#salary
#discount
#score
if age >= 15 and age <18:
    discAge = 25
elif age >= 19 and age <= 21:
    discAge = 15
elif age >=22 and age <= 25:
    discAge = 10
elif age > 25:
    discAge = 0

score = int(input("¿Cuál es tu puntaje? "))

if score >= 80 and score < 86:
    discScore = 30
    # si es mayor o igual a 86 y menor de 91 dar 35%,
elif score >= 86 and score < 91:
    discScore = 35
# si es mayor o igual a 91 y menor de 96 dar 40%,,
elif score >= 91 and score < 96:
    discScore = 40
# si es mayor o igual a 96 dar 45%,
elif score >= 96:
    discScore = 45

salary = float(input("¿Cuál es su salario?"))

if salary <= 1:
    discSalary = 30
elif salary > 1.0 and salary <= 2.0:
    discSalary = 20
elif salary > 2.0 and salary <= 3.0:
    discSalary = 10
elif salary > 3.0 and salary <= 4.0:
    discSalary = 5
elif salary > 4.0:
    discSalary = 0

#total = sumanos los 3 valores

percentageTotal = discAge + discSalary + discScore

#imprimir

print (discAge)
print (discScore)
print (discSalary)
print (percentageTotal)