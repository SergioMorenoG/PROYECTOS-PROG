Algoritmo sin_titulo
	
	Definir haydiv Como Logico
	Definir i, num Como Entero
	i<-0
	haydiv <- Falso
	
	Escribir "Introduce un n�mero para saber si es primo"
	Leer num
	
	Para i<-2 Hasta TRUNC(num/2) Con Paso 1 Hacer
		Si (num % i = 0) Entonces
			haydiv = Verdadero
		FinSi
		i = i + 1
	FinPara
	
	Si haydiv = Verdadero Entonces
		Escribir "El n�mero no es primo"
	SiNo
		Escribir "El n�mero es primo"
	FinSi
	
	
	
	
	
	
	
	
FinAlgoritmo
