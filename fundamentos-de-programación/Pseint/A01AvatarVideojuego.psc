Algoritmo A01AvatarVideojuego
	Definir  nombreJugador Como texto
	Definir nivelJugador Como entero
	Definir  monedasOro  Como Real
	Definir tienePaseActivo Como Logico
	
	Escribir "Hola, podrías decirme tu nombre aventurero?"
	leer nombreJugador
	Escribir "¿Qué nivel eres?"
	leer nivelJugador
	Escribir "¿Cuántas monedas de oro tienes?"
	leer monedasOro
	Escribir "¿Tienes pase de batalla activo?"
	leer tienePaseActivo
	
	Escribir "PLAYER STATS"
	Escribir "-------------------------"
	Escribir "Nombre/apodo: ", nombreJugador
	Escribir "Nivel: ", nivelJugador
	Escribir "Monedas de oro ", monedasOro
	Escribir "Tiene pase de batalla activo: ", tienePaseActivo
	Escribir "Tu promedio de monedas es: ", monedasOro/nivelJugador
	
	
FinAlgoritmo
