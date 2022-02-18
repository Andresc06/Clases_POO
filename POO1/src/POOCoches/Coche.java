package POOCoches;

public class Coche {

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	private int pesoPlataforma;
	
	String color;
	int pesoTotal;
	boolean asientosCuero, Climatizador;
	
	
	//Metodo Constructor (condiciones iniciales)
	//Metodo ayuda a comunicarse
	
	public Coche() {
		
		ruedas = 4;
		largo = 2000;
		ancho = 1000;
		motor = 1600;
		peso = 1300;
		pesoPlataforma = 1200;
		
	}
	
	
	
	//Datos Generales
	public String dimeDatos() {
		return "Su coche tiene un largo de " + largo + " cm " + "y de ancho " + ancho + " cm.\n" + "El coche es de color " + color + ", con un motor de " + motor + " cc.\n" + "Tiene " + ruedas + " ruedas," + " un peso de " + peso + " kg " + "(plataforma: " + pesoPlataforma + " kg)";
	}
	
	
	
	
	
	
	//Getter
	public String dimeLargo() {
		return "El largo del coche es: "+ largo + " centimetros";
	}
	
	public String dimeRuedas() {
		return "El numero de ruedas del coche es "+ ruedas;
	}
	
	public String dimeAncho() {
		return "El color ancho del coche es "+ ancho + " centimetros";
	}
	
	public String dimeMotor() {
		return "El motor del coche: "+ motor + " cc";
	}
	
	public String dimePeso() {
		return "El peso del coche es "+ peso + " kilogramos";
	}
	
	public String dimePesoPlataforma() {
		return "EL peso plataforma del coche es "+ pesoPlataforma + " kilogramos";
	}
	
	public String dimeColor() {
		return "El color del coche es "+ color;
	}
	
	public String dimePesoTotal() {
		return "El peso total del coche es "+ pesoTotal + " kilogramos";
	}
	
	public String dimeAsientosCuero() {
		if(asientosCuero == true)
			return "El coche si tiene asientos de cuero";
		else
			return "El coche no tiene asientos de cuero";
	} 
	
	public String dimeClimatizador() {
		if(Climatizador == true)
			return "El coche si tiene climatizador";
		else
			return "El coche no tiene climatizador";
	}
	
	
	//Setters
	public void estableceColor(String colorCoche) {
		color=colorCoche;
	}
	
	public void estableceRuedas(int ruedasCoche) {
		ruedas=ruedasCoche;
	}
	
	public void estableceLargo(int largoCoche) {
		largo=largoCoche;
	}
	
	public void estableceAncho(int anchoCoche) {
		ancho=anchoCoche;
	}
	
	public void estableceMotor(int motorCoche) {
		motor=motorCoche;
	}
	
	public void establecePeso(int pesoCoche) {
		peso=pesoCoche;
	}
	
	public void establecePesoPlataforma(int pesoPlataformaCoche) {
		pesoPlataforma=pesoPlataformaCoche;
	}
	
	public void establecePesoTotal(int pesoTotalCoche) {
		pesoTotal=pesoTotalCoche;
	}
	
	public void estableceAsientosCuero(String asientosCueroCoche) {
		
		if (asientosCueroCoche.equalsIgnoreCase("Si")) {
			
			this.asientosCuero=true;
		}
		else{
			
			this.asientosCuero=false;
		}
	}
	
	public void estableceClimatizador(String ClimatizadorCoche) {
		
		if (ClimatizadorCoche.equalsIgnoreCase("Si")) {
			
			this.Climatizador=true;
		}
		else{
			
			this.Climatizador=false;
		}
	}
	
}
