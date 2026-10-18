Proceso A26Nip
	
	Definir nip, intentos, correcto Como Entero;
	intentos <- 0;
	correcto <- 4321;
	Repetir
		intentos <- intentos + 1;
		Escribir "Introduzca su NIP";
		leer nip;
		si nip<>correcto Entonces
			Escribir "Nip incorrecto";
			Escribir "Intentos restantes ", 3 - intentos;
		FinSi
	Hasta Que intentos = 3 o nip = correcto;
	si nip <> correcto Entonces
		Escribir "Tuviste demasiados intentos, cuenta bloqueada";
	SiNo
		Escribir "Bienvenido a su boveda digital ";
	FinSi
FinProceso
