library (dplyr)

dataAll = read.table ("household_power_consumption.txt", sep=";", header=T, na.strings=c("?","NA"))
data    = dataAll %>% filter (Date=="1/2/2007" | Date=="2/2/2007")

		
# Plot2
Sys.setlocale ("LC_TIME", "C")
datetime = strptime (paste (data$Date, data$Time), "%d/%m/%Y %H:%M:%S")

png ("plot2.png", width=480, height=480)
plot (y=data$Global_active_power,
	  x=datetime, 
	  type="l", 
	  xlab="",
	  ylab ="Global Active Power (kilowatts)")

dev.off()
