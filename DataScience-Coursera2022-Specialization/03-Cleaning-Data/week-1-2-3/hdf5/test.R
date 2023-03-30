library (rhdf5)
h5createFile ("example.h5")

h5createGroup ("example.h5", "foo")

h5ls ("example.h5")

A = matrix (1:10, nr=5,nc=2)
A
B = array (seq (0.1, 2.0, by=0.1), dim=c(5,2,2))
B
attr (B, "scale") <- "litter"

h5write (A, "example.h5", "foo/A")
h5write (B, "example.h5", "foo/B")
h5ls ("example.h5")
