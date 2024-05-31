package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	//Para crear un array de Persona. Esta variante crea un array INMUTABLE, es decir, que no se puede
    	//modificar una vez que se ha creado
    	
    	Persoona[] personas = {
    			Persoona.builder()
    				.nombre("Ivan")
    				.primerApellido("Santiago")
    				.genero(Genero.HOMBRE)
    				.salario(300.60)
    				.build(),
    			Persoona.builder()
    				.nombre("Maria Jose")
    				.primerApellido("Rodriguez")
    				.salario(2500.50)
    				.genero(Genero.MUJER)
    				.build(),
    			Persoona.builder()
    				.nombre("Tamara")
    				.primerApellido("Sanchez")
    				.genero(Genero.MUJER)
    				.salario(2800.90)
    				.build(),
    				Persoona.builder()
    				.nombre("Adrian")
    				.primerApellido("Santos")
    				.segundoApellido("Gil")
    				.genero(Genero.HOMBRE)
    				.salario(3000.00)
    				.build(),
    	};	
    

	// Ejercicio 1. Crear una rama nueva
	// Recorrer el array de personas y recuperar el salario promedio de todas las personas
	
    	double sumatoriaDeLosSalarios = 0.0;
    	int totalDePersonas = personas.length;
    	double salarioPromedio = 0.0;

	for(Persoona persona : personas) {
		sumatoriaDeLosSalarios = sumatoriaDeLosSalarios + persona.getSalario();
		sumatoriaDeLosSalarios += persona.getSalario();
		
	}
	
	salarioPromedio = sumatoriaDeLosSalarios / totalDePersonas;
		System.out.println("SALARIO PROMEDIO MUJERES ------" +salarioPromedio);	

		
    }
}



