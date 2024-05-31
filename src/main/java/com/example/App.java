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
//		sumatoriaDeLosSalarios = sumatoriaDeLosSalarios + persona.getSalario();
		sumatoriaDeLosSalarios += persona.getSalario();
		
	}
	
//	salarioPromedio = sumatoriaDeLosSalarios / totalDePersonas;
//		System.out.println("SALARIO PROMEDIO MUJERES ------" +salarioPromedio);	
//		
//		
		// Ejercicio 2 recorrer el array de personas y calcular el salario 
		// promedio por genero
		
		
    	double sumatoriaSalariosHombre = 0.0;
    	double sumatoriaSalariosMujer = 0.0;
    	double sumatoriaSalariosOtro = 0.0;
    	
    	int totalGeneroHombre = 0;
    	int totalGeneroMujer = 0;
    	int totalGeneroOtro = 0;
    	
    	double salarioPromedioHombres = 0.0;
    	double salarioPromedioMujeres = 0.0;
    	double salarioPromedioOtros = 0.0;

	for(Persoona p : personas) {
		if(p.getGenero().equals(Genero.HOMBRE)) {
		sumatoriaSalariosHombre += p.getSalario();
		totalGeneroHombre++;
		} else if(p.getGenero().equals(Genero.MUJER)) {
		sumatoriaSalariosMujer += p.getSalario();
		totalGeneroMujer++;				
		} else {
		sumatoriaSalariosOtro += p.getSalario();
		totalGeneroOtro++;
		}
   
}
  	salarioPromedioHombres = sumatoriaSalariosHombre / totalGeneroHombre;
  	salarioPromedioMujeres = sumatoriaSalariosMujer / totalGeneroMujer;
  	salarioPromedioOtros = sumatoriaSalariosOtro / totalGeneroOtro;
  	
      	
      	System.out.println("Salario promedio de los Hombres: " + salarioPromedioHombres);
      	System.out.println("Salario promedio de las Mujeres: " + salarioPromedioMujeres);
      	System.out.println("Salario promedio de Otros Generos: " + salarioPromedioOtros);
    }
}