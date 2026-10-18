Proceso A16
	definir diaDelaSemana como entero;
	Definir  diaLaborable como logico;
	Definir dia Como Caracter;
	Escribir "Hola ¿Qué día es?";
	leer diaDelaSemana;
	si diaDelaSemana>=1 Y diaDelaSemana<=7 Entonces
		Segun diaDelaSemana Hacer
			1:
				dia <- "Lunes";
			2:
				dia <- "Martes";
			3:
				dia <- "Miercoles";
			4:
				dia <- "Jueves";
			5:
				dia <- "Viernes";
			6:
				dia <- "Sabado";
			7:
				dia <- "Domingos";
			De Otro Modo:
				Escribir "report this";
		FinSegun
		
		si diaDelaSemana<=5 y diaDelaSemana>=1 Entonces
			Escribir "Su día es ", dia, "y es un día laborable";
		SiNo
			Escribir "Su día es ", dia, "y no es laborable";
		FinSi
		
	SiNo
		Escribir "Su valor es invalido";
	FinSi
FinProceso
