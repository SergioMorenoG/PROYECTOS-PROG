Algoritmo Saber_numpar_numimpar
	
	Definir numpares, numimpares, contnum Como Entero
	
	Dimension numeros[5]
	
	contnum = 1
	Para i<-1 Hasta 5 Con Paso 1 Hacer
		Escribir "Ingrese el número " contnum " :" Sin Saltar
		Leer numeros[i]
		contnum <- contnum + 1
	Fin Para
	
	numpares = 0
	numimpares = 0
	
	Para i<-1 Hasta 5 Con Paso 1 Hacer
		Si numeros[i] MOD 2 = 0 Entonces
			numpares = numpares + 1
		Sino
			numimpares = numimpares + 1
		FinSi
	Fin Para
	
	Escribir "La cantidad de PARES es: " numpares
	Escribir "La cantidad de IMPARES es: " numimpares
	
	
	
	
	
	
	
FinAlgoritmo
