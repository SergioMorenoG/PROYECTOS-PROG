Algoritmo Pir�mide_Invertida
	
	Definir alt Como Entero
	Definir fila Como Entero
	Definir espacios Como Entero
	Definir estrella Como Entero
	
	
	Escribir "Introduzca la altura de la pir�mide que desea: " Sin Saltar
	Leer alt
	
	Para fila<-alt hasta 1 Con Paso -1 Hacer
		Para espacios<-1 hasta alt-fila Con Paso 1 Hacer
			Escribir "  " Sin Saltar
		FinPara
		Para estrella <-1 hasta 2*fila-1 Con Paso 1 Hacer
			Escribir " *" Sin Saltar
		FinPara
		Escribir ""
	FinPara
	
	
	
	
	
	
	
	
	
	
FinAlgoritmo
