package POOCoches;

public class UsoCamioneta {

		public static void main (String [] args) {
			
			Camioneta Colorado = new Camioneta();

			Colorado.Color("Plateado");
			Colorado.Puertas(4);
			Colorado.NroAsientos(6);
			Colorado.Ancho(1750);
			Colorado.Largo(3200);
			Colorado.Peso(3142);
			Colorado.Motor(2150);
			Colorado.Tipo("Pickup");
			Colorado.Marca("Chevrolet");
			Colorado.cuatroXcuatro(true);
			Colorado.DeteccionPeatones(true);
			
			
		System.out.println(Colorado.dimeColor());
		System.out.println(Colorado.dimePuertas());
		System.out.println(Colorado.dimeNroAsientos());
		System.out.println(Colorado.dimeAncho());
		System.out.println(Colorado.dimeLargo());
		System.out.println(Colorado.dimePeso());
		System.out.println(Colorado.dimeMotor());
		System.out.println(Colorado.dimeTipo());
		System.out.println(Colorado.dimeMarca());
		System.out.println(Colorado.dimeCuatroXCuatro());
		System.out.println(Colorado.dimeDeteccionPeatones());
			
		}
}

