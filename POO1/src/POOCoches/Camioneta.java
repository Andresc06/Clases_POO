package POOCoches;

public class Camioneta {
	
	private int nroAsientos;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	private int puertas;
	
	String color, tipo, marca;
	boolean cuatroXcuatro, deteccionPeatones;
	
	
	//Metodo Constructor ()
	
	public Camioneta() {
		
		puertas = 4;
		largo = 3000;
		ancho = 1500;
		motor = 2000;
		peso = 3000;
		nroAsientos = 4;
		
	}
	
	//Getter
	public String dimeLargo() {
		return "El largo de la camioneta es "+ largo + " centimetros";
	}
	
	public String dimeNroAsientos() {
		return "El numero de asientos de la camioneta es "+ nroAsientos;
	}
	
	public String dimeAncho() {
		return "El ancho de la camioneta es "+ ancho + " centimetros";
	}
	
	public String dimeMotor() {
		return "El motor de la camioneta es "+ motor + " cc";
	}
	
	public String dimePeso() {
		return "El peso de la camioneta es "+ peso + " kilogramos";
	}
	
	public String dimePuertas() {
		return "La camioneta tiene "+ puertas + " puertas";
	}
	
	public String dimeColor() {
		return "El color de la camioneta es "+ color;
	}
	
	public String dimeTipo() {
		return "La camioneta es de tipo " + tipo;
	} 
	
	public String dimeMarca() {
		return "La camioneta es de marca " + marca;
	} 
	
	public String dimeCuatroXCuatro() {
		if(cuatroXcuatro == true)
			return "La camioneta si es 4x4";
		else
			return "La camioneta no es 4x4";
	}
	
	public String dimeDeteccionPeatones() {
		if(deteccionPeatones == true)
			return "La camioneta si tiene deteccion de peatones incluido";
		else
			return "La camioneta no tiene deteccion de peatones incluido";
	}
	
	
	
	//Setters
	public void Color(String colorCamioneta) {
		color=colorCamioneta;
	}
	
	public void Puertas(int puertasCamioneta) {
		puertas=puertasCamioneta;
	}

	public void NroAsientos(int nroAsientosCamioneta) {
		nroAsientos=nroAsientosCamioneta;
	}
	
	public void Ancho(int anchoCamioneta) {
		ancho=anchoCamioneta;
	}
	
	public void Largo(int largoCamioneta) {
		largo=largoCamioneta;
	}
	
	public void Motor(int motorCamioneta) {
		motor=motorCamioneta;
	}
	
	public void Peso(int pesoCamioneta) {
		peso=pesoCamioneta;
	}

	public void Tipo(String tipoCamioneta) {
		tipo=tipoCamioneta;
	}
	
	public void Marca(String marcaCamioneta) {
		marca=marcaCamioneta;
	}
	
	public void cuatroXcuatro(String cuatroXcuatroCamioneta) {
		
		if (cuatroXcuatroCamioneta.equalsIgnoreCase("Si")) {
			
			this.cuatroXcuatro=true;
		}
		else{
			
			this.cuatroXcuatro=false;
		}
	}
	
	public void DeteccionPeatones(String deteccionPeatonesCamioneta) {
		
		if (deteccionPeatonesCamioneta.equalsIgnoreCase("Si")) {
			
			this.deteccionPeatones=true;
		}
		else{
			
			this.deteccionPeatones=false;
		}
	}
}
