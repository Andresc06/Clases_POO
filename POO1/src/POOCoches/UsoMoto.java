package POOCoches;

public class UsoMoto {

		public static void main (String [] args) {
			
			Moto Duke = new Moto();

			Duke.Color("Rojo");
			Duke.Tanque(8);
			Duke.Ancho(680);
			Duke.Largo(1620);
			Duke.Peso(194);
			Duke.Motor(165);
			Duke.MaxVelocidad(120);
			Duke.Postura("Crucero");
			Duke.Tipo("Ciclomotor");
			Duke.Marca("Alfa Romeo");
			Duke.Compartimiento(true);
			Duke.DobleTubo(false);
			
			
		System.out.println(Duke.dimeColor());
		System.out.println(Duke.dimeMarca());
		System.out.println(Duke.dimeTanque());
		System.out.println(Duke.dimeAncho());
		System.out.println(Duke.dimeLargo());
		System.out.println(Duke.dimePeso());
		System.out.println(Duke.dimeMotor());
		System.out.println(Duke.dimeMaxVelocidad());
		System.out.println(Duke.dimePostura());
		System.out.println(Duke.dimeTipo());
		System.out.println(Duke.dimeCompartimiento());
		System.out.println(Duke.dimeDobleTubo());
			
		}
}
