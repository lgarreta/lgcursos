library (dplyr)

#---- 0. Read input data ----
ytrain        = read.table ("inputs/y_train.txt", col.names=c("ActivityId"));#view (ytrain)
xtrain        = read.table ("inputs/X_train.txt");#view (xtrain)
xtrainSubjects = read.table ("inputs/subject_train.txt", col.names=c("Subject"));#view (xtrainSubjects)
ytest         = read.table ("inputs/y_test.txt", col.names=c("ActivityId"));#view (ytest)
xtest         = read.table ("inputs/X_test.txt");#view (xtest)
xtestSubjects  = read.table ("inputs/subject_test.txt", col.names=c("Subject"));#view (xtestSubjects)


#---- 1. Merges the training and the test sets to create one data set ----
dataSubjTrainTest = rbind (cbind (xtrainSubjects, ytrain, xtrain, stringsAsFactors=F), 
						   cbind (xtestSubjects, ytest, xtest, stringsAsFactors=F), stringsAsFactors=F); 

#view (dataSubjTrainTest)

#---- 3. Uses descriptive activity names to name the activities in the data set ----
activities = read.table ("inputs/activity_labels.txt", col.names=c("ActivityId", "Activity"));#view (activities)
dataWithActivities = merge (activities, dataSubjTrainTest, by= c("ActivityId"));#view (dataWithActivities)
dataWithActivities ["ActivityId"] = NULL; #view (dataWithActivities)

#---- 4. Appropriately labels the data set with descriptive variable names ----
features      = read.table ("inputs/features.txt");view (features)
featuresNames = sub ("\\(\\)[-|\\s]*","", features[,2]);view (featuresNames)
#featuresNames = as.character (features [,2]);#view (featuresNames)
names (dataWithActivities) = c("Activity", "Subject", featuresNames);
view (dataWithActivities)

#---- 2. Extracts only the measurements on the mean and standard deviation for each measurement ----
indexes  = features %>% 
           filter (grepl ("mean", V2) | grepl ("std", V2)) %>% 
           select (V1) %>% unlist; #view (indexes)

dataMeanStd = dataWithActivities [, c(1,2, indexes+2)];#view (dataMeanStd)

#---- 5. aFrom the data set in step 4, creates a second, independent tidy data set with the average of each variable for each activity and each subject.From the data set in step 4, creates a second, independent tidy data set with the average of each variable for each activity and each subject.----
dataGroupedMean = dataMeanStd %>% group_by (Activity, Subject) %>% summarize_all (mean)
write.table (dataGroupedMean, "table-grouped-mean-Activiy-Subject.txt", row.names=F)
write.csv (dataGroupedMean, "table-grouped-mean-Activiy-Subject.csv", row.names=F)

