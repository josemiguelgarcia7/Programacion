Algoritmo ej1_psc
	Definir num Como Entero
	
	Escribir "Introduzca el número de unidades que quiere pedir"
	Leer num
	
	SI num<=100 Entonces
		Escribir "El precio del pedido es de " num*5.23
	Finsi
	Si num>=101 y num<=999 Entonces
		Escribir "El precio del pedido es de " 523+((num-100)*4.16)
	FinSi
	Si num>=1000 Entonces
		Escribir "El precio del pedido es de " ((num*5.23)/2)
	FinSi
FinAlgoritmo
