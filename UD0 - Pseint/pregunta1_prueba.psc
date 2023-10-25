Algoritmo divisores
	
	Definir num, cont, resto, div, i Como Entero
	
	Escribir "Introduzca un número para saber sus divisores y la suma de los mismos: " Sin Saltar
	Leer num
	
	Escribir ""
	Escribir "Los divisores propios de " num " son " Sin Saltar
	
	cont<-0
	
	Para i<-1 Hasta num-1 Con Paso 1 Hacer
		resto <- num mod i
		Si resto = 0 Entonces 
			div <- i
			cont <- div + cont
			Si div = 1 Entonces
				Escribir div "" Sin Saltar
			SiNo
				Escribir "," div Sin Saltar
			FinSi
		FinSi
	Fin Para
	
	Escribir " y la suma de los mismos es " cont
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
FinAlgoritmo
