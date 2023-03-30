source ("lglib12.R")
library (dplyr)
download.file ("https://d396qusza40orc.cloudfront.net/getdata%2Fdata%2Fss06hid.csv",
			   destfile="survey.csv")
dt = read.csv ("survey.csv");view (dt)

#Q1
dts = dt %>% select (ACR, AGS); view (dts)
al = dt %>% filter (ACR == 3 & AGS == 6);view (al)
al = dt$ACR==3 & dt$AGS==6
which (al)

#Q2
library (jpeg)
download.file ("https://d396qusza40orc.cloudfront.net/getdata%2Fjeff.jpg", destfile="jeff.jpg")
img = readJPEG ("jeff.jpg", native=T)
	F
#Q3
download.file ("https://d396qusza40orc.cloudfront.net/getdata%2Fdata%2FGDP.csv", "FGDP.csv")
download.file ("https://d396qusza40orc.cloudfront.net/getdata%2Fdata%2FEDSTATS_Country.csv", "country.csv")

#---------------
fgdp = read.csv ("FGDP.csv", skip=4)
names (fgdp) = c("CountryCode", "Ranking", "NA", "Economy", "Dollars", "A", "B","C","D","E")
fg   = fgdp %>% filter (CountryCode !="" & Ranking!=""); view (fg,m=0)
fg$Ranking = as.numeric (fg$Ranking)

country = read.csv ("country.csv"); view (country)

mm   = match (country$CountryCode, fg$CountryCode);view (mm)
mmf  = mm [!is.na (mm)]; view (mmf)
fgm  = fg [mm, c("CountryCode", "Ranking")];view (fgm)
fgm$Ranking = as.numeric (fgm$Ranking)
fgms = fgm %>% arrange (desc(Ranking));view (fgms,n=15)

mg  = merge (country,fg, by="CountryCode");view (mg) 
mgs = mg %>% arrange (desc(Ranking)); view (mgs, n=15)
mgs[1:15,c("Ranking", "Long.Name")]


mgs[1:15,c("Ranking", "Long.Name")]

mm3 = inner_join (country, fgdp, by="CountryCode")
view (mm3)


#------------------
fgdp = read.csv ("FGDP.csv", skip=4)
names (fgdp) = c("CountryCode", "Ranking", "NA", "Economy", "Dollars", "A", "B","C","D","E")
fg   = fgdp %>% filter (CountryCode !="" & Ranking!=""); view (fg,m=0)
fg$Ranking = as.numeric (fg$Ranking)
fgm  = merge (fg, country, by="CountryCode");view (fgm) 
fgms = fgm %>% arrange (desc (Ranking));view (fgcs, n=15, m=2)
fgms [1:15, c("CountryCode", "Ranking", "Long.Name")]
fgms = fgms %>% filter (Ranking!="")

fgmf = fgms[!is.na(fgms$Income.Group) & fgms$Income.Group !="",] 
mgg  = fgmf %>% group_by (Income.Group);view (mgg)
mgs  = mgg %>% summarize (avr = mean (Ranking, na.rm=F));view (mgs)



#------- Q4
cf  = merge (country, fg, by="CountryCode");view (cf) 
cfg  = cf %>% group_by (Income.Group);
cfgs = cfg %>% summarize (avr = mean (Ranking, na.rm=F));view (cfg)

#------- Q5
fgdp = read.csv ("FGDP.csv", skip=4)
names (fgdp) = c("CountryCode", "Ranking", "NA", "Economy", "Dollars", "A", "B","C","D","E")
fg   = fgdp %>% filter (CountryCode !="" & Ranking!=""); view (fg,m=0)
fg$Ranking = as.numeric (as.character (fg$Ranking));view (fg)

fgm  = merge (fg, country, by="CountryCode");view (fgm)
#Q3:
fgms = fgm %>% arrange (desc(Ranking));view (fgms, n=15,m=2)

#Q4:
fgmg = fgm %>% group_by (Income.Group) 
fgms = fgmg %>% group_by (Income.Group) %>% summarize (avg=mean (Ranking, na.rm=T));view (fgms)

#Q5:
fgms = fgm %>% arrange (Ranking);view (fgms, n=15,m=2)
hgnts = as.character (fgms[1:38, c("CountryCode")]); hgnts 
fgmh = fgmg %>% filter (CountryCode %in% hgnts);view (fgmh)

df = fgmh %>% group_by (Income.Group) %>% summarize (res=n ());view (df)
