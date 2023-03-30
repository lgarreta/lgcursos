library (dplyr)

dataAll = read.table ("household_power_consumption.txt", sep=";", header=T, na.strings=c("?","NA"))
data    = dataAll %>% filter (Date=="1/2/2007" | Date=="2/2/2007")

# Values
Sys.setlocale ("LC_TIME", "C")
datetime = strptime (paste (data$Date, data$Time), "%d/%m/%Y %H:%M:%S")
gap       = data$Global_active_power
vol       = data$Voltage
sub1      = data$Sub_metering_1
sub2      = data$Sub_metering_2
sub3      = data$Sub_metering_3
grp       = data$Global_reactive_power

# Graphs
png ("plot4.png", width=480, height=480)

par (mfrow = c(2,2)) 

plot (y = gap, x=datetime, type="l", xlab="", ylab="Global Active Power")
plot (y = vol, x=datetime, type="l", xlab="datetime", ylab="Voltage")
plot (y = sub1, x=datetime, type="l", xlab="", ylab="Energy sub metering")
lines (y = sub2, x=datetime, col="red")
lines (y = sub3, x=datetime, col="blue")
legend (x="topright", legend=c("Sub_metering_1","Sub_metering_2", "Sub_metering_3"), 
		col=c("black", "red", "blue"), lty=1, bty='n')
plot (y=grp, x=datetime, type="l", ylab="Global_reactive_power")

dev.off()
