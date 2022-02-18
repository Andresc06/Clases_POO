package POOCoches;

import javax.swing.JOptionPane;

public class UsoMoto {

		public static void main (String [] args) {
			
			Moto Duke = new Moto();

			Duke.Color(JOptionPane.showInputDialog("Ingrese el color de la moto"));
			Duke.Tanque(JOptionPane.showInputDialog("Ingrese la capacidad en litros del tanque de su moto"));
			Duke.Ancho(680);
			Duke.Largo(1620);
			Duke.Peso(194);
			Duke.Motor(165);
			Duke.MaxVelocidad(120);
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
