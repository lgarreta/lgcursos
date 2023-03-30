## Put comments here that give an overall description of what your
## functions do

## Write a short comment describing this function

makeCacheMatrix <- function(x = matrix()) {
	inverse = NULL
	set <- function (y){
		x <<- y
		inverse <<- NULL
	}
	get <- function () x
	setInverse <- function (inverseMat) inverse <<- inverseMat
	getInverse <- function () inverse
	list (set=set, get=get, 
		  setInverse=setInverse, getInverse=getInverse)
}


## Write a short comment describing this function

cacheSolve <- function(x, ...) {
	## Return a matrix that is the inverse of 'x'
	inverse <- x$getInverse()
	if (!is.null (inverse)) {
		message("Getting cached data...")
		return (inverse)
	}
	data <- x$get ()
	inverse <- solve (data, ...)	
	x$setInverse (inverse)
	inverse
}

testAssignment <- function () {
	m = matrix (c(4,7,2,6),2,2);m
	funs = makeCacheMatrix (m)
	cacheSolve (funs)
}

