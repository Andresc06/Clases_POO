package Tarea;

import java.util.Scanner;

import Tarea.Palo_Cartas.palo;

public class electricidad {

	//Metodo Constructor
	
			enum variable {
				
				VOLTIOS("V"), OHMIOS("Ω"), AMPERIOS("A"), MILIAMPERIOS("mA"), KILOWATTS("kW"), WATTS("W");
				
				private variable(String unidad) {
					
					this.unidad = unidad;
				}
				
				//GETTER
				public String obten_unidad() {
					
					return unidad;
				}
				
				private String unidad;
				
			}
			
	public static void main(String[] args) {
		
		int continuar = 1;
		Scanner input = new Scanner(System.in);
		
		while (continuar == 1) {	
		
		System.out.println("Ingrese una unidad electrica: VOLTIOS, OHMNIOS, AMPERIOS, MILIAMPERIOS, KILOWATTS, WATTS");
		
		String data = input.next().toUpperCase();
		
		variable unidad_elegida = Enum.valueOf(variable.class, data);
		
		System.out.println("La unidad electrica es: " + unidad_elegida);
		
		System.out.println("La simbologia de esta unidad electrica es: " + unidad_elegida.unidad);
		
		System.out.println("\nDesea realizar otra vez la operacion? 0 = No; 1 = Si");
		
		continuar = input.nextInt();
		
		System.out.println("\n");
		
		}
		
		System.out.println("Ha finalizado el programa");
	}
}