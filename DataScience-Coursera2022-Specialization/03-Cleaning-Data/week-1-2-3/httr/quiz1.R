source ("lglib11.R")
#Q2
acs = read.csv ("getdata_data_ss06pid.csv"); view (acs)

library (sqldf)
sqldf ("select pwgtp1 from acs where AGEP < 50")

#Q3
unique (acs$AGEP)

sqldf ("select distinct AGEP from acs")

#Q4
con = url ("http://biostat.jhsph.edu/~jleek/contact.html")
htmlCode = readLines (con)
htmlCode [2]

nchar (htmlCode [10])
nchar (htmlCode [20])
nchar (htmlCode [30])
nchar (htmlCode [100])

#Q5
dt = read.fwf ("getdata_wksst8110.for", c(-1,9,rep (c(-5,4,-1,3),4)),skip=4)
view (dt, m=0)
sqldf ("select sum (V4) from dt")
