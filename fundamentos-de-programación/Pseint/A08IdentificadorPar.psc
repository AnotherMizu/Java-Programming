Proceso A08IdentificadorPar
	Definir identificador Como Real;
	
	Escribir "Dime cual es tu identificador";
	leer identificador;
	
	si identificador%2==0 Entonces
		Escribir "su identificador es valido, pase";
	SiNo
		Escribir "su identificador no es valido, no puede pasar";
	FinSi
FinProceso
