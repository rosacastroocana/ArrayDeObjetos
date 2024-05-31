package com.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// Todas las clases heredan de la padre, en este caso Persona hereda de Objet, seria como poner:
// public class Persoona extends Object, pero no hace falta poner: extends Object
// En un constructor la primera llamada es super
// @Builder si la clase no participa en una herencia sino SuperBuilder
// private Genero genero; y creamos una clase publica para poder utilizarla en todas las clases
// y enumerable para que solo puedas seleccionar los valores predefinidos. Clase Genero:
// package com.example;
// public enum Genero {
// MUJER, HOMBRE, OTRO



@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder 

public class Persoona extends Object {
	
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private double salario;
	private Genero genero;
	

}
