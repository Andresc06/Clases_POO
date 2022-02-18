package POOCoches;

import javax.swing.JOptionPane;

public class UsoMoto {

		public static void main (String [] args) {
			
			Moto Duke = new Moto();

			Duke.Color(JOptionPane.showInputDialog("Ingrese el color de la moto"));
			Duke.Tanque(JOptionPane.showInputDialog("Ingrese la capacidad en litros del tanque de su moto"));
			Duke.Ancho(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ancho en cm de la moto")));
			Duke.Largo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el largo en cm de la moto")));
			Duke.Peso(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso en kg de la moto")));
			Duke.Motor(Integer.parseInt(JOptionPane.showInputDialog("Ingrese los cc de la moto")));
			Duke.Postura(JOptionPane.showInputDialog("Que postura desea? Disponibles: Crucero, estandar o deportiva"));
			Duke.Tipo(JOptionPane.showInputDialog("Que tipo de moto desea?"));
			Duke.Marca(JOptionPane.showInputDialog("Ingrese la marca de la moto"));
			Duke.Compartimiento(JOptionPane.showInputDialog("Desea un compartimiento en su moto?"));
			Duke.DobleTubo(JOptionPane.showInputDialog("Desea doble tubo de escape en su moto?"));
			
			
		System.out.println("********************Datos de la Moto********************");
		System.out.println(Duke.dimeDatos());
		System.out.println(Duke.dimeCompartimiento());
		System.out.println(Duke.dimeDobleTubo());
			
		}
}
