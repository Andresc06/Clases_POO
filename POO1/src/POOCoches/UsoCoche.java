package POOCoches;

import javax.swing.JOptionPane;

public class UsoCoche {

		public static void main (String [] args) {
			
			Coche Renault = new Coche();

			Renault.estableceColor(JOptionPane.showInputDialog("Ingrese el color del coche"));
			Renault.estableceLargo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el largo en cm del coche")));
			Renault.estableceAncho(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ancho en cm del coche")));
			Renault.estableceMotor(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cc del motor")));
			Renault.estableceClimatizador(JOptionPane.showInputDialog("Desea climatizador en su coche?"));
			Renault.estableceAsientosCuero(JOptionPane.showInputDialog("Desea asientos de cuero en su coche?"));
			Renault.establecePeso(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso en kg del coche")));
			Renault.establecePesoPlataforma(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso de la plataforma en kg del coche")));
			
			
		System.out.println("********************Datos del Coche********************");
		System.out.println(Renault.dimeDatos());
		System.out.println(Renault.dimeClimatizador());
		System.out.println(Renault.dimeAsientosCuero());
			
		}
}
