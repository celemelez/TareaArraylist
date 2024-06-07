package Ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Utilidades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Persona> lista = new ArrayList <Persona>();
		lista.add (new Persona ("Fede", "Gomez", "Masculino", 25));
		lista.add (new Persona ("Ana", "Arcucci", "Femenino", 21));
		lista.add (new Persona ("Fedee", "Gomez", "Masculino", 22));
		
		for (Persona persona : lista) {
			System.out.println("prueba: " + persona.getNombre() + persona.getApellido() + persona.getGenero() + persona.getEdad());
		}
		System.out.println("La cantidad de masculinos es: " + cantidadMasculino(lista));
		System.out.println("La cantidad de femeninos es: " + cantidadFemenino(lista));
		System.out.println("El promedio de edades es: " + calcularPromedioEdades(lista));
	}
		 public static double calcularPromedioEdades(List <Persona> lista) {
		        double suma = 0;
		        for (Persona p : lista) {
		           suma = suma + p.getEdad();
		        }
		        double promedio = suma / lista.size();
		        return promedio;	        

		 }
		 
		 public static double cantidadMasculino (List <Persona> lista) {
		        int cantidad = 0;
		        for (Persona p : lista) {
		          if (p.getGenero() == "Masculino") {
		        	  cantidad++;
		        	   
		        	  }
		          }
				return cantidad;
		 }
		          
		 public static double cantidadFemenino (List <Persona> lista) {
			 int cantidad = 0;
			 for (Persona p : lista) {
				 if (p.getGenero() == "Femenino") {
					 cantidad++;
					 }
				 }
			return cantidad;
			 }
		 }