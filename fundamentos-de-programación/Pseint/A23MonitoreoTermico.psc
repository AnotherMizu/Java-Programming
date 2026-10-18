Proceso sin_titulo
	Definir temperatura, contador como entero;
	contador <- 0;
	
	Escribir "Dime la temperatura actual del reactor";
	Leer temperatura;
	Mientras temperatura <= 80 Hacer
		contador <- contador + 1;
		temperatura <- Aleatorio(0,90);
		Escribir "Chequeo numero: ", contador, " la temperatura fue ", temperatura;
		Esperar 40 Milisegundos;
	FinMientras
	
	Escribir "Alerta!!! TEMPERATURA MUY ALTA", contador;
FinProceso
