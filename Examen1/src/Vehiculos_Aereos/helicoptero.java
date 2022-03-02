package Vehiculos_Aereos;

// Utilicé el extend para asi ahorrar codigo y juntar la clase principal "vehiculoAereo" con el especifico "helicoptero"
public class helicoptero extends vehiculoAereo{

	//Caracteristicas particulares de un helicoptero
		private String modelo; 
		private boolean doblehelice; //Hace que despejar el helicoptero sea mas rapido
		private boolean ventanasAntirruido; //Hace las ventanas tengan una capa antirruido para los pasajeros
		private int mascarasOxigeno;
		private int paracaidas;
		
		//Metodo Constructor de un helicoptero general
	    public helicoptero(){
	    	super(1, 3, 2, 450, 300, 1, 8); 
	    	//modelo, Trenes Aterrizaje, capacidad, peso, alcance, velocidad maxima, numero de motores y pasajeros
	    } 
	    //Setter
	    public void s_modelo(String model) {
			modelo = model;
		}
	    
	    public void s_paracaidas(int para) {
			paracaidas = para;
		}
	    
	    public void s_mascarasOxigeno(int mascaras) {
			mascarasOxigeno = mascaras;
		}
	    
	    public void s_doblehelice(String helice) {
			
			if (helice.equalsIgnoreCase("Si")) {
				
				this.doblehelice = true;
			}
			else{
				
				this.doblehelice = false;
			}
		}
	    
	    public void s_ventanasAntirruido(String antirruido) {
			
			if (antirruido.equalsIgnoreCase("Si")) {
				
				this.ventanasAntirruido = true;
			}
			else{
				
				this.ventanasAntirruido = false;
			}
		}
	    
	    
	    //Datos Especificos Helicoptero
	    public void g_helicoptero() {
	    	g_modelo();
	    	g_mascarasOxigeno();
	    	g_paracaidas();
	    	g_doblehelice();
	    	g_ventanasAntirruido();
		}
	    
	    //Getter    
	    public void g_modelo() {
	    	System.out.println("Modelo del helicoptero: " + modelo);
	    }
	    
	    public void g_mascarasOxigeno() {
	    	System.out.println("Cantidad de mascaras de Oxigeno del Helicoptero: " + mascarasOxigeno);
	    }
	    
	    public void g_paracaidas() {
	    	System.out.println("Cantidad de paracaidas del Helicoptero: " + paracaidas);
	    }
	    
	    public void g_doblehelice(){
	    	if(doblehelice) {
	    		System.out.println("El helicoptero si tiene integrado una doble helice");
	        }
	        
	        else {
	        	System.out.println("EL helicoptero no tiene integrado una doble helice");
	        }
	    }
	    
	    public void g_ventanasAntirruido(){
	    	if(ventanasAntirruido) {
	    		System.out.println("El helicoptero si tiene ventanas antirruido incluido");
	        }
	        
	        else {
	        	System.out.println("El helicoptero no tiene ventanas antirruido incluido");
	        }
	    }
	    
	    public void g_precio(){
	        float precioGeneral = Precio();
	        System.out.println("El precio general sin tomar en cuenta las caracteristicas especificas es: " + precioGeneral + "$");
	    }
	    
	    
	    //Calculo precio especifico
	    public void precioHelicoptero(){
	        float precioHelicoptero = Precio();
	        if(doblehelice) {
	        	precioHelicoptero += 1000;
	        }
	        if(ventanasAntirruido) {
	        	precioHelicoptero += 5000;
	        }        
	        System.out.println("El Precio del helicoptero dado las caracteristicas especificas es de: " + precioHelicoptero + "$");
	    }
	}
