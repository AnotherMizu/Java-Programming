Proceso A14ConcursoCanto
	
	Definir EDADMAXIMA, EDADMINIMA, edad COMO ENTERO;
	Definir sexo, nombre Como Caracter;
	
	EDADMAXIMA <- 65;
	EDADMINIMA <- 10;
	
	Escribir "Hola buenos días ¿Cuál es tu nombre?: ";
	Leer nombre;
	Escribir "Hola", nombre, "Este concurso solo es valido para aquellos entre 10-65 años ¿podrias decirnos tu edad? ";
	leer edad;
	si edad<=EDADMAXIMA Y edad >= EDADMINIMA Entonces
		Escribir "Estas dentro de la edad correcta, pase";
		
		Escribir "Sexo (F/M): ";
		leer sexo;
		sexo <- Mayusculas(sexo);
		
		si sexo = "F" o sexo = "M" Entonces
			si sexo = "F" Y edad >= 18 Entonces
				Escribir "Usted a entrado a la categoria especial, gusto en recibirlo ^^";
			SiNo
				Escribir nombre, " Bienvenido a la categoría normal";
			FinSi
		SiNo
			Escribir "Sexo no registrado";
		FinSi
		
	SiNo
		Escribir "Disculpe ", nombre, "Su edad no es valida para el concurso";
	FinSi
	
	
FinProceso
