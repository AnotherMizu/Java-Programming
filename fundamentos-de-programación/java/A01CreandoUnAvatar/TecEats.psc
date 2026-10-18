Proceso TecEats
	Definir validacion, Pedido Como Cadena;
	Repetir
		Escribir '¿Que deseas ordenar?';
		Leer Pedido;
		Escribir '¿Deseas ordenar otra cosa?';
		Leer validacion;
	Hasta Que validacion='no'
	Escribir 'Pedido registrado';
FinProceso
