package Vehiculos_Aereos;

//Utilicé el extend para asi ahorrar codigo y juntar la clase principal "vehiculoAereo" con el especifico "carga"
public class carga extends vehiculoAereo{
	
	//Caracteristicas particulares del Avion de caarga
			private String modelo;
			private boolean estabilizador; //Hace que el avion tenga un estabilizador de carga para evitar dañarlas
			private boolean puertaDoble; //Hace que el avion tenga doble puerta para facilitar la carga y descarga
			private int paquetesCabina;
			private int lucesInternas;
			
			//Metodo Constructor de un Avion de carga general
		    public carga(){
		    	super(4, 210, 200, 2500, 310, 2, 500); 
		        //modelo, Trenes Aterrizaje, capacidad, peso, alcance, velocidad maxima, numero de motores y pasajeros
		    } 
		    //Setter
		    public void s_modelo(String model) {
				modelo = model;
			}
		    
		    public void s_paquetesCabina(int paquetes) {
				paquetesCabina = paquetes;
			}
		    
		    public void s_lucesInternas(int luces) {
				lucesInternas = luces;
			}
		    
		    public void s_estabilizador(String stabilizator) {
				
				if (stabilizator.equalsIgnoreCase("Si")) {
					
					this.estabilizador = true;
				}
				else{
					
					this.estabilizador = false;
				}
			}
		    
		    public void s_puertaDoble(String door) {
				
				if (door.equalsIgnoreCase("Si")) {
					
					this.puertaDoble = true;
				}
				else{
					
					this.puertaDoble = false;
				}
			}
		    
		    
		    //Datos Especificos Avion de carga
		    public void g_carga() {
		    	g_modelo();
		    	g_paquetesCabina();
		    	g_lucesInternas();
		    	g_estabilizador();
		    	g_puertaDoble();
			}
		    
		    //Getter   
		    public void g_modelo() {
		    	System.out.println("Modelo del Avion de Carga: " + modelo);
		    }
		    
		    public void g_lucesInternas() {
		    	System.out.println("Cantidad de luces internas del Avion de Carga: " + lucesInternas);
		    }
		    
		    public void g_paquetesCabina() {
		    	System.out.println("Cantidad de paquetes por cabina del Avion de Carga: " + paquetesCabina);
		    }
		    
		    public void g_estabilizador(){
		    	if(estabilizador) {
		    		System.out.println("El avion de pasajero tiene doble piso incluido");
		        }
		        
		        else {
		        	System.out.println("El avion de pasajero tiene doble piso incluido");
		        }
		    }
		    
		    public void g_puertaDoble(){
		    	if(puertaDoble) {
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
		    public void precioCarga(){
		        float precioCarga = Precio();
		        if(estabilizador) {
		        	precioCarga += 5000;
		        }
		        if(puertaDoble) {
		        	precioCarga += 2000;
		        }        
		        System.out.println("El Precio del avion de carga dado las caracteristicas especificas es de: " + precioCarga + "$");
		    }

}
