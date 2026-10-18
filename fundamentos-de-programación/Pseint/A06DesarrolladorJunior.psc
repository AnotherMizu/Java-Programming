Algoritmo A06DesarrolladorJunior
	definir salarioBruto, retencion, salarioNeto, horasTrabajadas, pagoPorHora, porcentajeDeRetención, pagoTotal Como Real
	Definir nombre Como Caracter
	porcentajeDeRetencion = 16/100
	
	
	Escribir "Puedes decirme tu nombre?"
	leer nombre
	Escribir "Cuantas horas trabajaras?" 
	leer horasTrabajadas
	Escribir "De cuanto es tu salario por hora?"
	leer pagoPorHora
	pagoTotal= pagoPorHora*horasTrabajadas
	retencion = pagoTotal*porcentajeDeRetencion
	salarioNeto = pagoTotal-retencion
	
	Escribir "_______"
	Escribir "Hola ", nombre
	Escribir "________________________"
	Escribir "con un pago por hora de ", pagoPorHora
	Escribir "Y habiendo trabajado ", horasTrabajadas
	Escribir "Tu salario sería de: ", pagoTotal
	Escribir "menos la retención que es del 16%: " retencion
	Escribir "tu pago seria de ", salarioNeto
FinAlgoritmo
