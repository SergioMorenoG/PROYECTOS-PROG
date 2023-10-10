Algoritmo Palindromo
	
	//Ejecuta un programa que imprime por pantalla el resultado si la palabra es palíndroma. 
	//Es decir, que se lee igual de izquierda a derecha que de derecha a izquierda.
	Definir izq, der, inversa Como Entero
	Definir es_palindromo Como Logico
	Definir frase como cadena
	
	Repetir
		Escribir "Introduzca la frase a comprobar: "
		Leer frase
	Hasta Que Longitud(frase)>1
	
	frase<-Minusculas(frase)
	izq <- 1
	der <- Longitud(frase)
	es_palindromo <- Verdadero
	
	Para izq<-1 Hasta der Con Paso 1 Hacer
		Para der<-Longitud(frase) Hasta izq Con Paso -1 Hacer
			Si subcadena(frase,izq,izq) = Subcadena(frase,der,der) Entonces
				izq <- izq + 1
			SiNo
				es_palindromo <- Falso
			FinSi
		Fin Para
	Fin Para
	
	Si es_palindromo = Verdadero  Entonces 
		Escribir "La frase introducida es un palíndromo"
	SiNo
		Escribir "La frase introducida no es un palíndromo"
	FinSi
	
	
	
FinAlgoritmo
