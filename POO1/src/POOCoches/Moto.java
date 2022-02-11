package POOCoches;

public class Moto {
	
	private int tanque;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	private int maxvelocidad;
	
	String postura, tipo, marca, color;
	boolean compartimiento, dobletubo;
	
	
	//Metodo Constructor ()
	
	public Moto() {
		
		tanque = 8;
		largo = 1700;
		ancho = 700;
		motor = 150;
		peso = 200;
		maxvelocidad = 110;
		
	}
	
	//Getter
	public String dimeLargo() {
		return "El largo de la moto es "+ largo + " centimetros";
	}
	
	public String dimeTanque() {
		return "La capacidad del tanque de gasolina de la moto es "+ tanque + " litros";
	}
	
	public String dimeAncho() {
		return "El ancho de la moto es "+ ancho + " centimetros";
	}
	
	public String dimeMotor() {
		return "El motor de la moto es "+ motor + " cc";
	}
	
	public String dimePeso() {
		return "El peso de la moto es "+ peso + " kilogramos";
	}
	
	public String dimeMaxVelocidad() {
		return "La moto puede llegar hasta los "+ maxvelocidad + " km/h";
	}
	
	public String dimeColor() {
		return "El color de la moto es "+ color;
	}
	
	public String dimeTipo() {
		return "La moto es de tipo " + tipo;
	} 
	
	public String dimeMarca() {
		return "La moto es de marca " + marca;
	} 
	
	public String dimePostura() {
		return "El asiento de la moto es de postura " + postura;
	} 
	
	public String dimeCompartimiento() {
		if(compartimiento == true)
			return "La moto tiene compartimiento trasero";
		else
			return "La moto no tiene ningun compartimiento";
	}
	
	public String dimeDobleTubo() {
		if(dobletubo == true)
			return "La moto tiene doble tubo de escape";
		else
			return "La moto tiene solo un tubo de escape";
	}

	
	
	//Setters
	public void Color(String colorMoto) {
		color=colorMoto;
	}
	
	public void Tanque(int tanqueMoto) {
		tanque=tanqueMoto;
	}

	public void Largo(int largoMoto) {
		largo=largoMoto;
	}
	
	public void Ancho(int anchoMoto) {
		ancho=anchoMoto;
	}
	
	public void Motor(int motorMoto) {
		motor=motorMoto;
	}
	
	public void Peso(int pesoMoto) {
		peso=pesoMoto;
	}
	
	public void MaxVelocidad(int maxVelocidadMoto) {
		maxvelocidad=maxVelocidadMoto;
	}

	public void Tipo(String tipoMoto) {
		tipo=tipoMoto;
	}
	
	public void Marca(String marcaMoto) {
		marca=marcaMoto;
	}
	
	public void Postura(String posturaMoto) {
		postura=posturaMoto;
	}
	
	public void Compartimiento(boolean compartimientoMoto) {
		compartimiento=compartimientoMoto;
	}
	
	public void DobleTubo(boolean dobleTuboMoto) {
		dobletubo=dobleTuboMoto;
	}

}
