library (iris)
data (iris)

iris [1:5,]

mn = tapply (iris$Sepal.Length, iris$Species, mean)
round (mn, 0)



# Q3
data (mtcars)
mtcars [1:10,]

# Q4
mtcars [1:10,]
sp = with (mtcars, split (hp, cyl))
abs (mean (sp$'4') - mean (sp$'8'))

sp = tapply (mtcars$hp, mtcars$cyl, mean) 
df = abs (sp['4'] - sp['8'])
round (df, 0)
