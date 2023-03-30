library (dplyr)

dataAll = read.table ("household_power_consumption.txt", sep=";", header=T, na.strings=c("?","NA"))
data    = dataAll %>% filter (Date=="1/2/2007" | Date=="2/2/2007")

# Plot3
Sys.setlocale ("LC_TIME", "C")
datetime = strptime (paste (data$Date, data$Time), "%d/%m/%Y %H:%M:%S")

Y1 = data$Sub_metering_1
Y2 = data$Sub_metering_2
Y3 = data$Sub_metering_3
X = datetime

png ("plot3.png", width=480, height=480)
plot (y=Y1, x=X, type="l", xlab="", ylab ="Energy sub metering")
lines (y=Y2, x=X, col="red")
lines (y=Y3, x=X, col="blue")

legend (x="topright", legend=c("Sub_metering_1","Sub_metering_2", "Sub_metering_3"), col=c("black", "red", "blue"), lty=1)
dev.off()
