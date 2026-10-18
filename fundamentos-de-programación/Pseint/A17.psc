Algoritmo A17
    Definir radio, b, h, area Como Real;
    Definir eleccion Como Entero;
    
    Escribir "Menú";
    Escribir "--------------------------------";
    Escribir "1) Fuente circular";
    Escribir "2) Cancha rectangular";
    Escribir "3) Área triangular para jardines";
    Escribir "--------------------------------";
    Escribir "Opción: " Sin Saltar;
    Leer eleccion;
    
    Si NO(eleccion >= 1 Y eleccion <= 3) Entonces
        Escribir "Su opción no es válida";
    SiNo
        Segun eleccion Hacer
            1:
                Escribir "Dame el radio de la fuente circular: " Sin Saltar;
                Leer radio;
                area <- PI * (radio ^ 2);
                Escribir "El área de la fuente circular es: ", area;
            2:
                Escribir "Dame la base del rectángulo: " Sin Saltar;
                Leer b;
                Escribir "Dame la altura del rectángulo: " Sin Saltar;
                Leer h;
                area <- b * h;
                Escribir "El área de la cancha rectangular es: ", area;
            3:
                Escribir "Dame la base del área triangular: " Sin Saltar;
                Leer b;
                Escribir "Dame la altura del área triangular: " Sin Saltar;
                Leer h;
                area <- (b * h) / 2;
                Escribir "El área triangular para jardines es: ", area;
			de otro modo:
				Escribir "Wtf que hiciste";
        FinSegun
    FinSi
    
FinAlgoritmo