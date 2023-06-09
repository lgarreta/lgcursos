library (dplyr)

dataAll = read.table ("household_power_consumption.txt", sep=";", header=T, na.strings=c("?","NA"))
data    = dataAll %>% filter (Date=="1/2/2007" | Date=="2/2/2007")

# Plot1
png ("plot1.png", width=480, height=480)
hist (data$Global_active_power, 
	  col="red", 
	  main="Global Active Power", 
	  xlab ="Global Active Power (kilowatts)")

dev.off()
