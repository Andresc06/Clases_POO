package Vehiculos_Aereos;

//Utilicé el extend para asi ahorrar codigo y juntar la clase principal "vehiculoAereo" con el especifico "pasajeros"
public class pasajeros extends vehiculoAereo{
	
	//Caracteristicas particulares del Avion de pasajeros
		private String modelo;
		private boolean doblepiso; //Hace que el avion tenga dos pisos
		private boolean calentador; //Hace que los pasajeros puedan tener la opcion de calentar sus asientos
		private int tobogan;
		private int puertas;
		
		//Metodo Constructor de un Avion de pasajeros general
	    public pasajeros(){
	    	super(4, 210, 200, 2500, 310, 2, 500); 
	        //modelo, Trenes Aterrizaje, capacidad, peso, alcance, velocidad maxima, numero de motores y pasajeros
	    } 
	    //Setter
	    public void s_modelo(String model) {
			modelo = model;
		}
	    
	    public void s_tobogan(int slide) {
			tobogan = slide;
		}
	    
	    public void s_puertas(int exit) {
			puertas = exit;
		}
	    
	    public void s_doblepiso(String piso) {
			
			if (piso.equalsIgnoreCase("Si")) {
				
				this.doblepiso = true;
			}
			else{
				
				this.doblepiso = false;
			}
		}
	    
	    public void s_calentador(String heater) {
			
			if (heater.equalsIgnoreCase("Si")) {
				
				this.calentador = true;
			}
			else{
				
				this.calentador = false;
			}
		}
	    
	    
	    //Datos Especificos Avion de pasajeros
	    public void g_pasajero() {
	    	g_modelo();
	    	g_tobogan();
	    	g_puertas();
	    	g_doblepiso();
	    	g_calentador();
		}
	    
	    public void g_tobogan() {
	    	System.out.println("Cantidad de toboganes del Avion de Pasajeros: " + tobogan);
	    }
	    
	    public void g_puertas() {
	    	System.out.println("Cantidad de puertas del Avion de Pasajeros: " + puertas);
	    }
	    
	    //Getter   
	    public void g_modelo() {
	    	System.out.println("Modelo del Avion de Pasajero: " + modelo);
	    }
	    
	    public void g_doblepiso(){
	    	if(doblepiso) {
	    		System.out.println("El avion de pasajero tiene doble piso incluido");
	        }
	        
	        else {
	        	System.out.println("El avion de pasajero tiene doble piso incluido");
	        }
	    }
	    
	    public void g_calentador(){
	    	if(calentador) {
	    		System.out.println("El avion de pasajero si tiene calentador incluido");
	        }
	        
	        else {
	        	System.out.println("El avion de pasajero no tiene calentador incluido");
	        }
	    }
	    
	    public void g_precio(){
	        float precioGeneral = Precio();
	        System.out.println("El precio general sin tomar en cuenta las caracteristicas especificas es: " + precioGeneral + "$");
	    }
	    
	    
	    //Calculo precio especifico
	    public void precioPasajero(){
	        float precioPasajero = Precio();
	        if(doblepiso) {
	        	precioPasajero += 10000;
	        }
	        if(calentador) {
	        	precioPasajero += 5000;
	        }        
	        System.out.println("El Precio del avion de pasajero dado las caracteristicas especificas es de: " + precioPasajero + "$");
	    }

}
