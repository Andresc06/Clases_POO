package Tarea;

import java.util.Scanner;

public class Palo_Cartas {

	//Metodo Constructor
	
			enum palo {
				
				ESPADAS("♠"), CORAZONES("♥"), TREBOLES("♣"), DIAMANTE("♦");
				
				private palo(String simbolo) {
					
					this.simbolo = simbolo;
				}
				
				//GETTER
				public String get_simbolo() {
					
					return simbolo;
				}
				
				private String simbolo;
				
			}
			
	public static void main(String[] args) {
		
		int continuar = 1;
		Scanner input = new Scanner(System.in);
		
		while (continuar == 1) {	
			
		System.out.println("Ingrese un palo de las cartas: ESPADAS, CORAZONES, TREBOLES, DIAMANTE");
		
		String input_data = input.next().toUpperCase();
		
		palo palo_elegido = Enum.valueOf(palo.class, input_data);
		
		System.out.println("El palo elegido es: " + palo_elegido);
		
		System.out.println("La simbologia de este palo es: " + palo_elegido.simbolo);
		
		System.out.println("Desea realizar otra vez la operacion? 0 = No; 1 = Si");
		
		continuar = input.nextInt();
		}
		
		System.out.println("Ha finalizado el programa");
	}
}
