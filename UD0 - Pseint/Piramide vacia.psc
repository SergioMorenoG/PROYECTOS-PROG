Algoritmo Piramide_vac�a
	
	Definir alt Como Entero
	Definir fila Como Entero
	Definir espacios Como Entero
	Definir estrella Como Entero
	
	
	Escribir "Introduzca la altura de la pir�mide que desea: " Sin Saltar
	Leer alt
	
	Para fila<-1 hasta alt Con Paso 1 Hacer
		Para espacios<-1 hasta alt-fila Con Paso 1 Hacer
			Escribir "  " Sin Saltar
		FinPara
		Para estrella <-1 hasta 2*fila-1 Con Paso 1 Hacer
			Si fila = 1 o fila = alt o estrella = 1 o estrella = (2*fila-1) Entonces
				Escribir " *" Sin Saltar
			SiNo
				Escribir "  " Sin Saltar
			FinSi
		FinPara
		Escribir ""
	FinPara
	
	
FinAlgoritmo
