source ("lglib12.R")
library (dplyr)

#Q1:
download.file ("https://d396qusza40orc.cloudfront.net/getdata%2Fdata%2Fss06hid.csv", "hid.csv")
hid = read.csv ("hid.csv")
hnames = names (hid)

res = strsplit (hnames, "wgtp")
res [123]

#Q2:
download.file ("https://d396qusza40orc.cloudfront.net/getdata%2Fdata%2FGDP.csv", "FGDP.CSV")
fgdp = read.csv ("FGDP.csv", skip=4);view (fgdp)
names (fgdp) = c("CountryCode", "Ranking", "NA", "Economy", "Dollars", "A", "B","C","D","E")
view (fgdp)


dim (fgdp)
fgdpF = fgdp %>% filter (Ranking != "" & CountryCode !="")
dim (fgdpF)

dollars = as.numeric (gsub (",","",fgdpF$Dollars))
dollars = dollars [!is.na (dollars)]
class (dollars)
avr = mean (dollars, na.rm=F)
avr
a = dollars [1]
b = dollars [2]
a+b

#Q3:
view (fgdp)
countries = fgdp$Economy;view (countries)
countriesLst = grep ("^United", countries)

#Q4:
view (fgdpF)
download.file ("https://d396qusza40orc.cloudfront.net/getdata%2Fdata%2FEDSTATS_Country.csv", "educational.csv")
edu = read.csv ("educational.csv")
fedu = merge (fgdpF, edu, by="CountryCode");view (fedu)
fiscalYear = fedu$Special.Notes
length(grep ("June", fiscalYear))

#Q5:
library(quantmod)
amzn = getSymbols("AMZN",auto.assign=FALSE)
sampleTimes = index(amzn)
view (sampleTimes)

library (lubridate)
ymds = ymd (sampleTimes); view (ymds)
lsy = sapply (ymds, function (x) year(x)==2012)
length (ymds [lsy])

lsdy = sapply (ymds, function (x) year(x)==2012 && wday(x, label=T)=="lun")
length (ymds [lsdy])
