Proceso A22Mientras
	Definir ahorro, dinero, montoLimite Como real;
	Escribir "Hola cual es ¿tú monto maximo de ahorro?";
	leer montoLimite;
	Escribir "Tu meta esta fija en ", montoLimite;
	
	Mientras ahorro < montoLimite Hacer
		Escribir "Cuanto dinero metiste hoy?";
		leer dinero; 
		si dinero<0 Entonces
			Escribir "Esta cantidad es incorrecta, intente de nuevo";
		SiNo
			ahorro <- dinero + ahorro;
			si ahorro = montoLimite Entonces
				Escribir "Felicidades ya alcanzaste tu cantidad";
			FinSi
		FinSi
	FinMientras
	
	
FinProceso
