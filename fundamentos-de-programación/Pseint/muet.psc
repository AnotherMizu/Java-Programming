Proceso sin_titulo
	
	Definir pieza, piezasAprobadas, piezasRechazadas Como Entero;
	
	piezasAprobadas <- 0;
	piezasAprobadas <- 0;
	
	Escribir "Hola buenos dias inespector";
	
	para i<-1 hasta 10 Hacer
		pieza <- Aleatorio(0,1);
		
		si pieza <0 y pieza >1 Entonces
			si pieza == 0 Entonces
				piezasRechazadas <- piezasRechazadas+1;
			SiNo
				piezasAprobadas <- piezasAprobadas +1;
			FinSi
		SiNo
			Escribir "Tu valor es invalido, pasa la siguiente pieza";
		FinSi
		
	FinPara
	
	Escribir "De sus 10 piezas";
	Escribir "_________________";
	Escribir "Su total de piezas aprobadas fue de:", piezasAprobadas;
	Escribir "Su total de piezas rechazadas fue de:", piezasRechazadas;
FinProceso
