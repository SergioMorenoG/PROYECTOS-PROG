Algoritmo sin_titulo
	
	Definir num, ter Como Entero
	
	Escribir "Introduzca un n�mero"
	Leer num
	
	Si num < 0 Entonces
		num = num *( -1)
	FinSi
	
	Si num >= 0 Entonces
		ter = num - Trunc(num/10)*10
	FinSi
	
	Si ter = 5 Entonces
		Escribir "El n�mero termina en 5"
	Sino
		Escribir "El n�mero no termina en 5"
	FinSi
	
	
	
	
	
	
	
	
	
	
	
	
FinAlgoritmo
