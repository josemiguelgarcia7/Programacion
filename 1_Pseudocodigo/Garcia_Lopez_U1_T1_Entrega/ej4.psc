Algoritmo ej4_psc
	Definir x,num,contador,contadormedia,suma Como Entero
	
	
	
	contadormedia = 0
	suma = 0
	v<-verdadero
	Repetir
		Escribir "Por favor, vaya introduciendo n�meros enteros positivos. Para terminar, introduzca un n�mero primo"
		leer num
		
		x=1 
		contador = 0
	
		Mientras x<=num Hacer
			si num mod x = 0 Entonces
				contador = contador + 1
			FinSi
			x=x+1
		FinMientras
		Escribir contador
		
		Si contador>2
			contadormedia = contadormedia +1
			suma=suma+num
			
		FinSi
	
		
		si v=verdadero entonces
			max<-num
			min<-num
			v=false
		Sino	
			
			si num > max Entonces
				
				max<-num
			SiNo
				si num < min Entonces
					min<-num
					finsi
			FinSi
		FinSi

	Hasta Que contador<=2
	
	
	
	Escribir "Has introducido "  contadormedia " n�meros no primos"
	Escribir "El m�ximo es: " max
	Escribir "El m�nimo es: " min
	Escribir "La media es: " suma/contadormedia
	
	
	
	
FinAlgoritmo
