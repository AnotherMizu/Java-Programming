Algoritmo A03BateriaTelefono
	definir capacidadBateria, consumoPorHora, vidaEstimada Como Real
	
	Escribir "Dime la capacidad de bateria en miliamperios"
	leer capacidadBateria
	Escribir "Dime cuanto consume en promedio por hora tu telefono"
	leer consumoPorHora
	vidaEstimada = capacidadBateria/consumoPorHora
	
	
	Escribir "Bateria"
	Escribir "_________________"
	Escribir "Su consumo por hora es de: "
	Escribir "y con su capacidad actual que es: "
	Escribir "su tiempo restante es de ", vidaEstimada, "horas. "
FinAlgoritmo
