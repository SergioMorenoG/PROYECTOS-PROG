Algoritmo calculadora_bien_hecha
	
	Escribir "Bienvenido/a a la calculadora"
	Escribir "Elige la operaci�n que deseas realizar: "
	
	Repetir
		Escribir "   1. Suma"
		Escribir "   2. Resta"
		Escribir "   3. Multiplicaci�n"
		Escribir "   4. Divisi�n"
		Escribir "   5. Salir de la calculadora"
		Escribir " "
		Leer operacion
		
		Si operacion = 0 o operacion > 5 Entonces
			Escribir "Por favor, introduzca una operaci�n v�lida"
			Escribir " "
		FinSi
		
		Segun operacion Hacer
			1:
				contsum <- 0
				Escribir "�Cu�ntos n�meros quieres sumar?: " Sin Saltar
				Leer suma
				Para ad<-1 Hasta suma Con Paso 1 Hacer
					Escribir "Introduzca el valor " ad ": " Sin Saltar
					Leer numsum
					contsum <- contsum + numsum
				Fin Para
				Escribir "El resultado de la suma es: " contsum
			2:
				totalrest <- 0
				Escribir "�Cu�ntos n�meros quieres restar?: " Sin Saltar
				Leer resta
				Para re<-1 Hasta resta Con Paso 1 Hacer
					Escribir "Introduzca el valor " re ": " Sin Saltar
					Leer numrest
					Si totalrest = 0 Entonces
						totalrest <- numrest - totalrest
					SiNo
						totalrest <- totalrest - numrest
					FinSi
				Fin Para
				Escribir "El resultado de la resta es: " totalrest
			3:
				totalmult <- 1
				Escribir "�Cu�ntos n�meros quieres multiplicar?: " Sin Saltar
				Leer multiplicacion
				Para mul<-1 Hasta multiplicacion Con Paso 1 Hacer
					Escribir "Introduzca el valor " mul ": " Sin Saltar
					Leer nummult
					totalmult <- totalmult * nummult
				Fin Para
				Escribir "El resultado de la multiplicaci�n es: " totalmult
			4:
				totaldiv <- 1
				Escribir "�Cu�ntos n�meros quieres dividir?: " Sin Saltar
				Leer division
				Para div <-1 Hasta division Con Paso 1 Hacer
					Escribir "Introduzca el valor " div ": " Sin Saltar
					Leer numdiv
					Si totaldiv = 1 Entonces
						totaldiv <- numdiv / totaldiv
					SiNo
						totaldiv <- totaldiv/numdiv
					FinSi
				FinPara
				Escribir "El resultado de la divisi�n es: " totaldiv
		Fin Segun
	Hasta Que operacion = 5  
	
	Si operacion = 5 entonces
		Escribir "�Gracias por usar esta calculadora!"
	FinSi
	
	
FinAlgoritmo
