package POOCoches;

import javax.swing.JOptionPane;

public class UsoCamioneta {

		public static void main (String [] args) {
			
			Camioneta Colorado = new Camioneta();

			Colorado.Color(JOptionPane.showInputDialog("Ingrese el color de la camioneta"));
			Colorado.Puertas(4);
			Colorado.NroAsientos(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nro de asientos de la camioneta")));
			Colorado.Ancho(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ancho en cm de la camioneta")));
			Colorado.Largo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el largo en cm de la camioneta")));
			Colorado.Peso(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso en kg de la camioneta")));
			Colorado.Motor(Integer.parseInt(JOptionPane.showInputDialog("Ingrese los cc del motor de la camioneta")));
			Colorado.Modelo(JOptionPane.showInputDialog("Ingrese el modelo de la camioneta"));
			Colorado.Marca(JOptionPane.showInputDialog("Ingrese la marca de la camioneta"));
			Colorado.cuatroXcuatro(JOptionPane.showInputDialog("Desea que su camioneta sea 4x4?"));
			Colorado.DeteccionPeatones(JOptionPane.showInputDialog("Desea deteccion de peatones en su camioneta?"));
			
			
		System.out.println("********************Datos de la Camioneta********************");
		System.out.println(Colorado.dimeDatos());
		System.out.println(Colorado.dimeCuatroXCuatro());
		System.out.println(Colorado.dimeDeteccionPeatones());
			
		}
}

