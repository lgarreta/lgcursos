Algoritmo sin_titulo
	nota1 <- 5.0
	nota2 <- 2.0
	notaFinal <- (nota1+nota2)/2
	Si notaFinal>=3.0 Entonces
		Escribir 'Felicitaciones'
		notaFinal <- notaFinal + 0.5
		Escribir "Su nota fue: ", notaFinal
	SiNo
		Escribir 'Lo sentimos. Perdio'
		notaFinal <- notaFinal - 0.1	
		Escribir "Nota fue: ", notaFinal
	FinSi
	Escribir 'Adios'
FinAlgoritmo
