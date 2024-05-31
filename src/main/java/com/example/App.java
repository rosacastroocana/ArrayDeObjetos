package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
	private static int SIZE;
    public static void main( String[] args )
    {
    	
    	if(args.length != 0)
    		SIZE = Integer.parseInt(args[0]);
    	
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
    
// Otra variante (no recomendada) para crear objetos  
// Aunque no está recomendada permite agregar nuevos elementos al array
Persoona[] arrayPersonasNoRecomendado = new Persoona[10];

arrayPersonasNoRecomendado[0] = new Persoona();
arrayPersonasNoRecomendado[0].setNombre("Jessica");

//Que podemos hacer con los arrays de objetos:
//1- Recorrerlos y mostrar los elementos por consola.
// Podemos recorrer el array de personas con un for mejorado.

System.out.println("Recorriendo el array de personas ----------------");
for(Persoona pers: personas)
	System.out.println(pers);

;
// Agregar una nueva persona al array de personas NO ES POSIBLE


// por ejemplo si fuese de enteros:

int[] arrayDeNumeros = {1, 2, 3, 4};

// arrayDeNumeros.push(5);
// arrayDeNumeros[4] = 5;

// Recorrer el array de personas y almacenar las personas del genero MUJER en un nuevo array que podemos
// llamar arrayDeMujeres

Persoona[] arrayDeMujeres = new Persoona[SIZE];
//hay que declarar la variable, lo hemos hecho arriba:
// private static int SIZE;
//	if(args.length != 0)
//	SIZE = Integer.parseInt(args[0]);

int indice = 0;

for(Persoona p:personas){
	if(p.getGenero().equals(Genero.MUJER))
		arrayDeMujeres[indice++] = p;
}

//		for(Persoona mujer : arrayDeMujeres)
//		System.out.println(mujer);
// Aqui saldrian todas los registros aunque no tengan datos saldria null

	System.out.println(("PERSONAS del genero mujer------"));	
	for(Persoona mujer : arrayDeMujeres) {
		if(mujer != null)
	System.out.println(mujer);
	else
		break;	
	
}

    	
    }
}


