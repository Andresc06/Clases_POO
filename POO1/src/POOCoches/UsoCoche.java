package POOCoches;

import javax.swing.JOptionPane;

public class UsoCoche {

		public static void main (String [] args) {
			
			Coche Renault = new Coche();

			Renault.estableceColor(JOptionPane.showInputDialog("Ingrese el color del coche"));
			Renault.estableceMotor(1800);
			Renault.estableceClimatizador(JOptionPane.showInputDialog("Desea climatizador en su coche?"));
			Renault.estableceAsientosCuero(JOptionPane.showInputDialog("Desea asientos de cuero en su coche?"));
			Renault.establecePesoTotal(4000);
			
			
		System.out.println("********************Datos del Coche********************");
		System.out.println(Renault.dimeDatos());
		System.out.println(Renault.dimeClimatizador());
		System.out.println(Renault.dimeAsientosCuero());
			
		}
}
