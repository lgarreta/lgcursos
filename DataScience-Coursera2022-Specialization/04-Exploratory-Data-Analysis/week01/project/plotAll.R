library (dplyr)

dataAll = read.table ("household_power_consumption.txt", sep=";", header=T, na.strings=c("?","NA"))
data    = dataAll %>% filter (Date=="1/2/2007" | Date=="2/2/2007")

# Plot1
hist (data$Global_active_power, 
	  col="red", 
	  main="Global Active Power", 
	  xlab ="Global Active Power (kilowatts)")

# Plot2
Sys.setlocale ("LC_TIME", "C")
view (data)
dates = data$Date
times = data$Time

dataTimesStr = paste (dates, times);view (dataTimesStr)
datetime = strptime (dataTimesStr, "%Y-%m-%d %H:%M:%S");view (datetime)

plot (y=data$Global_active_power,
	  x=datetime, 
	  type="l", 
	  xlab="",
	  ylab ="Global Active Power (kilowatts)")

# Plot3
Sys.setlocale ("LC_TIME", "C")
datetime = strptime (paste (data$Date, data$Time), "%Y-%m-%d %H:%M:%S");view (datetime)

Y1 = data$Sub_metering_1
Y2 = data$Sub_metering_2
Y3 = data$Sub_metering_3
X = datetime

plot (y=Y1, x=X, type="l", xlab="", ylab ="Energy sub metering")
lines (y=Y2, x=X, col="red")
lines (y=Y3, x=X, col="blue")

legend (x="topright", legend=c("Sub_metering_1","Sub_metering_2", "Sub_metering_3"), col=c("black", "red", "blue"), lty=1)


#Plot4
dataAll = read.table ("household_power_consumption.txt", sep=";", header=T, na.strings=c("?","NA"))
data    = dataAll %>% filter (Date=="1/2/2007" | Date=="2/2/2007")

# Values
datetime = strptime (paste (data$Date, data$Time), "%Y-%m-%d %H:%M:%S");view (datetime)
gap       = data$Global_active_power
vol       = data$Voltage
sub1      = data$Sub_metering_1
sub2      = data$Sub_metering_2
sub3      = data$Sub_metering_3
grp       = data$Global_reactive_power

# Graphs
par (mfrow = c(2,2)) 

plot (y = gap, x=datetime, type="l", xlab="", ylab="Global Active Power")
plot (y = vol, x=datetime, type="l", xlab="datetime", ylab="Voltage")
plot (y = sub1, x=datetime, type="l", xlab="", ylab="Energy sub metering")
lines (y = sub2, x=datetime, col="red")
lines (y = sub3, x=datetime, col="blue")
legend (x="topright", legend=c("Sub_metering_1","Sub_metering_2", "Sub_metering_3"), 
		col=c("black", "red", "blue"), lty=1, bty='n')
plot (y=grp, x=datetime, type="l", ylab="Global_reactive_power")
