Proceso A09TermostatoDeInvernadero
	Definir temperatura Como Real;
	
	si temperatura<15 Entonces
		Escribir "!Alerta¡ Temperatura fría. Encendiedno calefacción";
	sino 
		si temperatura>=40 Entonces
			Escribir "Temperatura adecuada. Estado estable.";
		SiNo
			Escribir "¡Alerta! usted esta muy caliente";
		FinSi
		
	FinSi
	
FinProceso
