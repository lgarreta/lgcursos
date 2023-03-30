library (tidyverse)
library(tibble)

library(data.table)
library (xlsx)
df = read.table ("table-grouped-mean-Activiy-Subject.txt", sep="", header=T)
#dt = data.table (df[,1:2])
dt = data.table (df)

setattr(dt$Activity, "label", "Subject activity")
setattr(dt$Subject, "label", "Subject activity")
map_df (dt, function (x) setattr(x, "label", "Measure"))



# Codebooka as a simple table of variable
dft = as_tibble (dt)
codebookSimple <- map_df(dft, function(x) attributes(x)$label) %>% gather(key = Variable, value = Description)

codebookSimple

codebookExtended <- codebookSimple %>% 
  mutate(Class = map_chr(dft, class),
         #Mean = map_dbl(df, mean, na.rm = T),
         Proportion_missing = map_dbl(dft, function(x) mean(is.na(x))))

codebookExtended
write.xlsx (codebookExtended, "Codebook-table.xlsx")

# Codebook describing each variable

library (memisc)
avrVariableActivitySubject = dt
x = data.set (avrVariableActivitySubject)

xc = codebook (x)

Write (xc, "Codebook.txt")


