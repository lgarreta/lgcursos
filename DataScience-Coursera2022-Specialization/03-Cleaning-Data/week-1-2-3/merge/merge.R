set.seed(61)

employee_id <- 1:10
employee_name <- c("Andrew", "Susan", "John", "Joe", "Jack",
                   "Jacob", "Mary", "Kate", "Jacqueline", "Ivy")
employee_salary <- round(rnorm(10, mean = 1500, sd = 200))
employee_age <- round(rnorm(10, mean = 50, sd = 8))
employee_position <- c("CTO", "CFO", "Administrative", rep("Technician", 7))


df_1 <- data.frame(id = employee_id[1:8], name = employee_name[1:8],
                   month_salary = employee_salary[1:8])
df_2 <- data.frame(id = employee_id[-5], name = employee_name[-5],
                   age = employee_age[-5], position = employee_position[-5])

df_1
df_2
