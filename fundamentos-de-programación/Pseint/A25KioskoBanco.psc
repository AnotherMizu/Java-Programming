Proceso A25KioskoBanco
	
	Definir eleccion, i Como Entero;
	Definir saldo, retiro Como Real;
	saldo <- 5000;
	Repetir
		Escribir "Bienvenido, escoja una opcion del menú";
		Escribir "_______________________________________";
		Escribir "Opcion 1) consultar saldo";
		Escribir "Opcion 2) retirar efectivo";
		Escribir "Opcion 3) salir ";
		Escribir "_______________________________________";
		Escribir "opcion: ";
		Leer eleccion;
		segun eleccion hacer
			1: 
				Escribir "Su saldo es de ", saldo;
			2:
				Escribir "¿Cuanto desea retirar?";
				leer retiro;
				
				si retiro>saldo y retiro>0 Entonces
					Escribir "Cantidad no valida";
				SiNo
					saldo <- saldo - retiro;
					Escribir "Su retiro de: ", retiro, " a sido efectivo";
					Escribir "ahora cuenta con un saldo de: ", saldo;
				FinSi
			3:
				Escribir "que le vaya bien:)";
			de otro modo:
				Escribir "Opcion no valida, intente de nuevo";
				
		FinSegun
		Escribir "Presione cualquier tecla para continuar...";
		Esperar Tecla;
		Escribir "";
		Escribir "...";
		para i<-1 Hasta 3 Hacer
			Borrar Pantalla;
			segun i Hacer
				1:
					Escribir ".";
					Escribir " ..";
				2:
					Escribir " .";
					Escribir ". .";
				3:
					Escribir "  .";
					Escribir ".. ";
				De Otro Modo:
					Escribir "wtf";
			FinSegun
			Esperar 20 Milisegundos;;
		FinPara
		Borrar Pantalla;
		
	Hasta Que eleccion = 3; 
FinProceso
