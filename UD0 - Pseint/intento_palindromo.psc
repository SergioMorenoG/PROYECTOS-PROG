Algoritmo sin_titulo
	
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
	
	Si Subcadena(frase,izq,izq) = "" Entonces
		izq <- izq + 1
	FinSi
	Si Subcadena(frase,der,der) = "" Entonces
		der <- der + 1
	FinSi
	Si Subcadena(frase,izq,izq) <> Subcadena(frase,der,der) Entonces
		*
	FinSi
	
	Mientras izq <= der Hacer
		Mientras der<= izq Hacer
			Subcadena(frase,izq,izq) = 
		FinMientras
	Fin Mientras
	
	
	
	
	
	
	
	
	
	
	
	
	
FinAlgoritmo
