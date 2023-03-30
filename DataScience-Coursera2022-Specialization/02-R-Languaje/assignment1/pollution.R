
sumPollutant <- function (filepath, pollutant) {
	data <- read.csv (filepath)
	dataPollutant = data [, pollutant]
	dataCleaned  = dataPollutant [complete.cases (dataPollutant)]
	return (dataCleaned)
}


pollutantMean <- function (directory, pollutant, id=1:332) {
	filepathList = sprintf ("%s/%.3d.csv", directory, id)
	
	polls = c()
	for (filepath in filepathList) {
		meanPoll = sumPollutant (filepath, pollutant)
		polls = c (polls, meanPoll)
	}
	return (mean (polls))
}

complete <- function (directory, ids = 1:332) {
	ccList = c()
	for (id in ids) {
		filepath = sprintf ("%s/%.3d.csv", directory, id)
		dt   = read.csv (filepath)
		cc   = nrow (dt [complete.cases (dt),])
		ccList = c (ccList, cc)
	}
	df = data.frame (id=ids, nobs=ccList)
	return (df)
}

corr <- function (directory, threshold = 0) {
	fileList = dir (directory)
	filePaths = sprintf ("%s/%s", directory, fileList)

	corrList = c()
	for (filename in filePaths) {
		dt  = read.csv (filename)
		dtc = dt [complete.cases (dt),]
		if (nrow (dtc) > threshold) {
			corrPoll = cor (dtc$sulfate, dtc$nitrate)
			corrList = c (corrList, corrPoll)
		}
	}
	return (corrList)
}

#poll = "nitrate"
ids  = 54
#round (pollutantMean ("specdata", poll), 3)
 
RNGversion("3.5.1")  
set.seed(42)
cc <- complete("specdata", 332:1)
use <- sample(332, 10)
print(cc[use, "nobs"])
#complete ("specdata", ids)
#print (df)


cr <- corr("specdata")                
cr <- sort(cr)   
RNGversion("3.5.1")
set.seed(868)                
out <- round(cr[sample(length(cr), 5)], 4)
print(out)
#corrTh = corr ("specdata", 400)
#print (head (corrTh))
#print (summary (corrTh))

cr <- corr("specdata", 129)                
cr <- sort(cr)                
n <- length(cr)    
RNGversion("3.5.1")
set.seed(197)                
out <- c(n, round(cr[sample(n, 5)], 4))
print(out)


cr <- corr("specdata", 2000)                
n <- length(cr)                
cr <- corr("specdata", 1000)                
cr <- sort(cr)
print(c(n, round(cr, 4)))
