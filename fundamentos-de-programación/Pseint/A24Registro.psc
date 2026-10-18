Proceso A24Registro
	Definir cantidadVentas Como Entero;
	Definir totalrecaudado, monto Como Real;
	cantidadVentas <- 0;
	totalrecaudado <- 0;
	Escribir "Monto de la primera venta: ";
	Leer monto;
	mientras monto > 0 Hacer
		cantidadVentas <- cantidadVentas +1; 
		totalrecaudado <- monto + totalrecaudado;
		
		Escribir "De cuanto fue la venta: ";
		leer monto;	
	FinMientras
	
	Escribir "Su venta total del dia fue: ", totalrecaudado;
	Escribir "Y fueron ", cantidadVentas, " ventas en total";
FinProceso
