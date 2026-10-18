Algoritmo sin_titulo
	Definir precioCafe, precioPastel, subtotal, descuento Como Real
	Definir  cargoFijo Como Real
	cargoFijo = 15
	
	Escribir "cuanto cuesta tu cafe?"
	leer precioCafe
	Escribir "cuanto cuesta tu rebanada de pastel?"
	leer precioPastel
	
	subtotal = precioCafe + precioPastel
	descuento = subtotal*0.05
	
	
	Escribir "El precio del café seria"
	Escribir "________________________"
	Escribir "Seria un subtotal de ", subtotal
	Escribir "Menos el descuento de 5% seria: " subtotal-descuento
	Escribir "Con un cargo fijo de ", cargoFijo
	Escribir "lo que seria un total de ", subtotal-descuento+cargoFijo
FinAlgoritmo
