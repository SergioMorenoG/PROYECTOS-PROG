Algoritmo sin_titulo
	
	Escribir "Introduzca un número: " Sin Saltar
	Leer alt
	
	Para fila<-1 Hasta alt Con Paso 1 Hacer
		Para col <- 1 Hasta alt Con Paso 1 Hacer
			Si fila = 1 o fila = alt o col = 1 o col = alt Entonces
				Escribir " * " Sin Saltar
			SiNo
				Escribir "   " Sin Saltar
			FinSi
		FinPara
		Escribir ""
	FinPara
	
FinAlgoritmo
