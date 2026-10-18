Algoritmo A07CineUniversitario
	
	Definir edad Como entero;
	Definir nombre Como Caracter;
	
	Escribir "Hola buenas tardes con quien tengo el gusto? ";
	leer nombre;
	Escribir "Muy bien ", nombre, "La pelicula a la que queires ir tiene minimo de edad, ¿podrías decirnos tu edad?";
	leer edad;
	
	si edad>= 18 Entonces
		Escribir nombre, " Puedes pasar, disfrute la función";
	SiNo
		Escribir "No tienes edad suficiente así que no puedes venir a esta función";
	FinSi
	
	Escribir "Vuelva pronto :)";
FinAlgoritmo
