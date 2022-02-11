package POOCoches;

public class UsuCoche {

		public static void main (String [] args) {
			
			Coche Renault = new Coche();

			Renault.estableceColor("Amarillo");
			Renault.estableceMotor(1800);
			Renault.estableceClimatizador(true);
			Renault.estableceAsientosCuero(false);
			Renault.establecePesoTotal(4000);
			
			
		
		System.out.println(Renault.dimeColor());
		System.out.println(Renault.dimeRuedas());
		System.out.println(Renault.dimeMotor());
		System.out.println(Renault.dimeClimatizador());
		System.out.println(Renault.dimeAsientosCuero());
		System.out.println(Renault.dimeAncho());
		System.out.println(Renault.dimeLargo());
		System.out.println(Renault.dimePesoPlataforma());
		System.out.println(Renault.dimePeso());
		System.out.println(Renault.dimePesoTotal());
			
		}
}
