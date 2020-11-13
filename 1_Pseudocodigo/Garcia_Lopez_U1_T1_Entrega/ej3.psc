Algoritmo ej3_psc
	Definir tam,f Como Entero	
	
	Repetir
	Escribir "Escribe la altura de la figura, debe ser mayor 4 e impar "
	Leer tam
	
	Si tam<=4
		Escribir "Error"
	FinSi

	Hasta Que tam>4 y tam%2=1 
	
	Para f<-1 Hasta tam Hacer
		Si f%2=1 Entonces
			Escribir "MMMMMM"
		SiNo
			Escribir "M    M"
		FinSi
		
	Fin Para

FinAlgoritmo


