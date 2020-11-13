Algoritmo ej2_psc
	Definir n,a Como Entero
	Escribir " Escribe la cifra a invertir "
	leer n; 
	
	a<-0;
	Repetir  
		a<-(a*10)+(n Mod 10)
		n<-trunc(n/10)
	Hasta Que n<=0
	Escribir "La cifra invertida es " a
	
FinAlgoritmo
