maxTemp = 0
minTemp = 0

numDays = 0
numDaysError5 = 0
numDaysError35 = 0
numDaysCorrect = 0
numDaysTotalError = 0
totalMinCor = 0
totalMaxCor = 0
mediaTempMinCor = 0
mediaTempMaxCor = 0
percentageDaysError = 0
countMinMax = 0

while (True):
    maxTemp = float (input("Maximum Temperature: "))
    minTemp = float (input("Minimum Temperature: "))
    if ((minTemp == 0) and (maxTemp == 0)):
        break
    
    if ((minTemp >= 5 and minTemp <= 35) and (maxTemp <= 35)):
        numDaysCorrect += 1
    
    if (minTemp < 5 and maxTemp > 35):
        countMinMax +=1
        numDaysError5 -= 1
        numDaysError35 -= 1
        numDaysTotalError += 1
    
    if (maxTemp > 35):
        numDaysError35 += 1
    
    if ((minTemp < 5) and (minTemp != 0)):
        numDaysError5 += 1
        
    numDays += 1        
    
    if ((minTemp >= 5 and minTemp <= 35) and (maxTemp <= 35)):
        totalMinCor = totalMinCor + minTemp
        totalMaxCor = totalMaxCor + maxTemp
                
numDaysTotalError = numDaysTotalError + numDaysError5 + numDaysError35

if (numDays != 0):
    percentageDaysError = (numDaysTotalError * 100)/(numDays)

if (numDaysCorrect != 0):
    mediaTempMinCor = ((totalMinCor)/(numDaysCorrect))
    mediaTempMaxCor = ((totalMaxCor)/(numDaysCorrect))

print (numDays)
print (numDaysTotalError)
print (numDaysError5)
print (numDaysError35)
print (countMinMax)
print (mediaTempMaxCor)
print (mediaTempMinCor)
print (percentageDaysError)