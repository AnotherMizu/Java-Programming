Proceso A15ReglasDelClub
	Definir nombre, sexo, estadoCivil Como Caracter;
	Definir edad Como Entero;
	
	Escribir "Hola buenos días ¿Con quien tengo el gusto?";
	leer nombre;
	Escribir "Muy bien ", nombre, "¿Podrías decirnos tu edad?";
	Leer edad;
	Escribir "Usted es ¿Masculino o Femenino? (F o M)";
	leer sexo;
	Escribir "Y por ultimo, ¿podría decirnos cual es su estado civil?(S, C u O)";
	leer estadoCivil;
	
	estadoCivil <- Mayusculas(estadoCivil);
	sexo <- Mayusculas(Sexo);
	
	si edad >= 10 y edad <= 65 Entonces
		Escribir "Muy bien usted esta dentro de la edad valida";
		
		Si Sexo = M y estadoCivil = "c" Entonces
			Escribir "No puedes venir solo, tienes que venir con tu pareja";
		sino 
			Si edad < 18 Entonces
				Escribir "Estas muy chico para venir solo";
			SiNo
				Escribir "Datos invalidos";
			FinSi
			
			
		FinSi
		
	SiNo
		Escribir "Esta fuera de la edad valida";
	FinSi
	
	

FinProceso
