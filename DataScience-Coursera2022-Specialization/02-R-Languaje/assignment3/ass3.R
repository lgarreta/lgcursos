library (dplyr)
outcome <- read.csv("outcome-of-care-measures.csv", colClasses = "character")
head (outcome)
dim (outcome)
names (outcome)

outcome [,11] = as.numeric (outcome [,11])
hist (outcome [,11])



`%notin%` <- Negate(`%in%`)

state="TX"
outcome="heart attack"
best <- function(state, outcome) {
	if (outcome == "heart attack"){
		column = 11
	}else if (outcome=="heart failure"){
		column = 17
	}else if (outcome=="pneumonia"){
		column = 23
	}else {
		stop ("invalid outcome")
	}

	data   = read.csv("outcome-of-care-measures.csv", colClasses = "character")

	if (state %notin% data$State)
		stop ("invalid outcome")

	data [, column] = as.numeric (data [, column]) 
	dataStt  = data [data[,7]==state,]
	dataOrd  = dataStt [order (dataStt[, column]),]
	hospital = dataOrd [1, 2]
	hospital
}

best("SC", "heart attack")
best("NY", "pneumonia")
best("AK", "pneumonia")

## Read outcome data
## Check that state and outcome are valid
## Return hospital name in that state with lowest 30-day death
## rate

source ("lglib11.R")
rankhospital <- function (state, outcome, num="best") {
#state ="TX"
#outcome ="heart failure"
#num     = 4
	if (outcome == "heart attack"){
		column = 11
	}else if (outcome=="heart failure"){
		column = 17
	}else if (outcome=="pneumonia"){
		column = 23
	}else {
		stop ("invalid outcome")
	}

	data   = read.csv("outcome-of-care-measures.csv", colClasses = "character")

	if (state %notin% data$State)
		stop ("invalid outcome")

	dataHospital           = data [data[, column]!="Not Available",]; view (dataHospital)
	dataFiltered           = dataHospital [dataHospital$State==state,]; view (dataFiltered)
	dataFiltered [,column] = as.numeric (dataFiltered [,column])
	dataSorted             = dataFiltered %>% arrange (Hospital.Name);view (dataSorted)
	dataSorted             = dataSorted [order (dataSorted [,column]),];view (dataSorted)
	dataCols               = dataSorted [, c(2,7, column)];view (dataCols)

	n = nrow (dataFiltered)
	if (num=="best") {
		return (dataCols [1,1])
	}else if (num=="worst") {
		return (dataCols [n,1])
	}else if (num > n){
		return (NA)
	}else {
		return (dataCols [num,1])
	}
}

rankhospital("NC", "heart attack", "worst")
rankhospital("WA", "heart attack", 7)
rankhospital("TX", "pneumonia", 10)
rankhospital("NY", "heart attack", 7)





selState <- function (x, data, num) {
  dataState  = data %>% filter (State==x)
  dataSorted = dataState %>% arrange (Value)
  n = nrow (dataSorted)
  if (num=="best") {
   df = data.frame (hospital = dataSorted$Hospital[1], state = dataSorted$State[1], values=dataSorted$Value[1])
  }else if (num=="worst") {
   df = data.frame (hospital = dataSorted$Hospital[n], state = dataSorted$State[n])
  }else if (num > n){
   return (NA)
  }else {
   df = data.frame (hospital = dataSorted$Hospital[num], state = dataSorted$State[num], values=dataSorted$Value[num])
  }
  return (df)
}

rankall <- function (outcome, num="best") {
	allData = read.csv("outcome-of-care-measures.csv", colClasses = "character")

	if (outcome == "heart attack"){
		column = 11
	}else if (outcome=="heart failure"){
		column = 17
	}else if (outcome=="pneumonia"){
		column = 23
	}else {
		stop ("invalid outcome")
	}

	dataCols     = allData [,c(1,2,7, column)]; #view (data)
	names (dataCols) = c("Id", "Hospital", "State", "Value")
	rownames (dataCols) = dataCols$Id
	data = dataCols %>% filter (Value != "Not Available")
	data$Value = as.numeric (data$Value)
	minList= tapply (data[,1], data$State, function (x) x); 
	states = sort (names (minList))
	outs = lapply (states, selState, data, num)
	outsDF = do.call ("rbind", outs)
	return (outsDF)
}

head(rankall("heart attack", 20), 10)

tail(rankall("pneumonia", "worst"), 3)

tail(rankall("heart failure"), 10)

r <- rankall("heart attack", 4)
as.character(subset(r, state == "HI")$hospital)

r <- rankall("pneumonia", "worst")
as.character(subset(r, state == "NJ")$hospital)

r <- rankall("heart failure", 10)
as.character(subset(r, state == "NV")$hospital)

