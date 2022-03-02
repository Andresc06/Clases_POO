package Vehiculos_Aereos;

public class vehiculoAereo {

		private int nroTrenesAterrizaje;
		private float capacidad;
		private float peso;
		private float alcance;
		private int maxVelocidad;
		private int nroMotores;
		private int nroPasajeros;
		private boolean on = false;
		private boolean aire = false;
		
		
		
		/*Metodo Constructor que recibe 8 parámetros del vehiculo que se ingresará por teclado*/
		public vehiculoAereo(int nroTrenesAterrizaje, float capacidad, float peso, float alcance, int maxVelocidad, int nroMotores, int nroPasajeros){
	        this.nroTrenesAterrizaje = nroTrenesAterrizaje;
	        this.capacidad = capacidad;
	        this.peso = peso;
	        this.alcance = alcance;
	        this.maxVelocidad = maxVelocidad;
	        this.nroMotores = nroMotores;
	        this.nroPasajeros = nroPasajeros;
	    }
		
		//Getters
		
	    //Datos Generales
	    public void caracteristicas(){
	        System.out.println("Capacidad maxima: " + capacidad + " toneladas");
	        System.out.println("Tiene " + nroTrenesAterrizaje + " trenes de aterrizaje");
	        System.out.println("Peso: " + peso + " toneladas");
	        System.out.println("Alcance: " + alcance + " km");
	        System.out.println("Velocidad maxima: " + maxVelocidad + "km/h");
	        System.out.println("Numero de motores: " + nroMotores);
	        System.out.println("Tiene capacidad para " + nroPasajeros + " pasajeros");
	        System.out.println("El vehiculo aereo" + nroMotores);	        
	    }
	    

	    //Calculo del precio del vehiculo aereo
	    public float Precio(){
	        float precio = (1000 * peso) + (2500 * capacidad) + (50 * nroPasajeros); 
	        return precio;
	    }
		
		
		//Setters
		public void s_peso(float weight) {
			peso = weight;
		}
		
		public void s_trenesAterrizaje(int wheels) {
			nroTrenesAterrizaje= wheels;
		}
		
		public void s_capacidad(float capacity) {
			capacidad = capacity;
		}
		
		public void s_alcance(float range) {
			alcance = range;
		}
		
		public void s_maxVelocidad(int speed) {
			maxVelocidad = speed;
		}
		
		public void s_nroMotores(int gears) {
			nroMotores = gears;
		}
		
		public void s_nroPasajeros(int passengers) {
			nroPasajeros = passengers;
		}
		
		//Comportamiento
		
		public void Encender(){
	        if(on){
	            System.out.println("Encendiendo el vehiculo aereo...");
	            System.out.println("El vehiculo aereo ya se encuentra encendido");
	            return;
	        }
	        
	        else{
	            on = true;
	        }
	    }

	    public void Apagar(){
	        if(on == false){
	            System.out.println("Apagando el vehiculo aereo...");
	            System.out.println("El vehiculo aereo ya se encuentra apagado");
	            return;
	        }
	        
	        else{
	            on = false;
	        }
	    }

	    public void Acelerar(){
	        if(on){
	            System.out.println("Acelerando el vehiculo aereo...");
	            System.out.println("Se aceleró exitosamente el vehiculo aereo");
	            return;  
	        }

	        else{
	            System.out.println("No se puede acelerar con el vehiculo aereo apagado");
	        }
	    }

	    public void Desacelerar(){
	        if(on == false){
	        	System.out.println("Desacelerando el vehiculo aereo...");
	            System.out.println("Se desaceleró exitosamente el vehiculo aereo");
	            return;
	        }
	        
	        else{
	        	System.out.println("No se puede desacelerar con el vehiculo aereo apagado");
	        }
	    }
	    
	    public void Descender(){        
	    	if((on) & (aire)){
	    		System.out.println("Decendiendo...");
		        System.out.println("Se ha descendido con exito el vehiculo aereo");
	    	}
	    	
	    	if(aire == false){
		        System.out.println("No se puede descender cuando el vehiculo aereo no esta en aire");
	    	}
	    	
	    	else {
	    		System.out.println("No se puede descender con el vehiculo aereo apagado");
	    	}
	    }
	    
	    public void Elevarse(){        
	    	if(on) {
	    		System.out.println("Girando...");
		        System.out.println("Se ha descendido con exito el vehiculo aereo");
		        aire = true;
	    	}
	    	
	    	else {
	    		System.out.println("No se puede ascender con el vehiculo aereo apagado");
	    	}
	        
	    }
	    
	    public void Girar(){        
	    	if((on) & (aire)){
	    		System.out.println("Girando...");
		        System.out.println("Se ha girado con exito el vehiculo aereo");
	    	}
	    	
	    	if(aire == false){
		        System.out.println("No se puede girar en Tierra!");
	    	}
	    	
	    	else {
	    		System.out.println("No se puede girar con el vehiculo aereo apagado");
	    	}
	        
	    }
		
}
