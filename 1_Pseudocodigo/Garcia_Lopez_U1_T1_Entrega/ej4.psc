Algoritmo ej4_psc
	Definir x,num,contador,contadormedia,suma Como Entero
	
	
	
	contadormedia = 0
	suma = 0
	v<-verdadero
	Repetir
		Escribir "Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo"
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
	
	
	
	Escribir "Has introducido "  contadormedia " números no primos"
	Escribir "El máximo es: " max
	Escribir "El mínimo es: " min
	Escribir "La media es: " suma/contadormedia
	
	
	
	
FinAlgoritmo
