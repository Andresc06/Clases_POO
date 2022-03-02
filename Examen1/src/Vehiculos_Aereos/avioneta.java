package Vehiculos_Aereos;

// Utilicé el extend para asi ahorrar codigo y juntar la clase principal "vehiculoAereo" con el especifico "avioneta"
public class avioneta extends vehiculoAereo{
	
	//Caracteristicas particulares de las avionetas	
	private String modelo;
	private boolean superAceleracion; //Hace que la aceleracion sea el doble del promedio
	private boolean cabinaPresurizada; //Hace que los pasajeros tengan un compartimiento comodo para viajar en alta velocidad
	private int flotadores;
	private int asientos;
	
	//Metodo Constructor de una Avioneta general
    public avioneta(){
    	super(2, 1, 2, 1300, 220, 1, 2); 
        //modelo, Trenes Aterrizaje, capacidad, peso, alcance, velocidad maxima, numero de motores y pasajeros
    } 
    //Setters
    public void s_modelo(String model) {
		modelo = model;
	}
    
    public void s_asientos(int asiento) {
		asientos = asiento;
	}
    
    public void s_flotadores(int flotador) {
		flotadores = flotador;
	}
    
    public void s_cabina(String cPresurizada) {
		
		if (cPresurizada.equalsIgnoreCase("Si")) {
			
			this.cabinaPresurizada = true;
		}
		else{
			
			this.cabinaPresurizada = false;
		}
	}
    
    public void s_superAceleracion(String Aceleracion) {
		
		if (Aceleracion.equalsIgnoreCase("Si")) {
			
			this.superAceleracion = true;
		}
		else{
			
			this.superAceleracion = false;
		}
	}
    
    
    //Datos Especificos Avioneta
    public void g_avioneta() {
    	g_modelo();
    	g_flotadores();
    	g_asientos();
    	g_superAceleracion();
    	g_cabina();
	}
    
    //Getter   
    public void g_modelo() {
    	System.out.println("Modelo de la Avioneta: " + modelo);
    }
    
    public void g_asientos() {
    	System.out.println("Cantidad de asientos de la Avioneta: " + asientos);
    }
    
    public void g_flotadores() {
    	System.out.println("Cantidad de flotadores de la Avioneta: " + flotadores);
    }
    
    public void g_cabina(){
    	if(cabinaPresurizada) {
    		System.out.println("La avioneta si tiene una cabina presurizada incluida");
        }
        
        else {
        	System.out.println("La avioneta no tiene una cabina presurizada incluida");
        }
    }
    
    public void g_superAceleracion(){
    	if(superAceleracion) {
    		System.out.println("La avioneta si tiene super aceleracion incluida");
        }
        
        else {
        	System.out.println("La avioneta no tiene super aceleracion incluida");
        }
    }
    
    public void g_precio(){
        float precioGeneral = Precio();
        System.out.println("El precio general sin tomar en cuenta las caracteristicas especificas es: " + precioGeneral + "$");
    }
    
    
    //Calculo precio especifico
    public void precioAvioneta(){
        float precioAvioneta = Precio();
        if(superAceleracion) {
        	precioAvioneta += 5000;
        }
        if(cabinaPresurizada) {
        	precioAvioneta += 2500;
        }        
        System.out.println("El Precio de la avioneta dado las caracteristicas especificas es de: " + precioAvioneta + "$");
    }

}
