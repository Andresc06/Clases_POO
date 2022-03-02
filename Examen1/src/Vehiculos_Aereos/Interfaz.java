package Vehiculos_Aereos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Interfaz {

	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		int op, op1 = 1, op2;

        System.out.println("\nPROGRAMA PARA LA CREACION DE VEHICULOS AEREOS\n");
        System.out.println("A continuacion ingrese el tipo de vehiculo que desea:\n");
        System.out.println("1. Avioneta");
        System.out.println("2. Avion de Carga");
        System.out.println("3. Helicoptero");
        System.out.println("4. Avion de Pasajeros\n");
        op = input.nextInt();
        
        switch(op){
        
        case 1:
        	System.out.println("\nHa elegido crear una Avioneta\n");
        	System.out.println("Creando una Avioneta...\n");
        	try{Thread.sleep(1000);} catch(InterruptedException e ) {}
            avioneta vehiculo = new avioneta();
            System.out.println("Avioneta creado con exito\n");
            System.out.println("A continuacion eliga las caracteristicas COMUNES del vehiculo que desea cambiar:");
            while(op1 == 1) {
                System.out.println("\n1. Trenes de Aterrizaje");
                System.out.println("2. Capacidad");
                System.out.println("3. Peso");
                System.out.println("4. Alcance");
                System.out.println("5. Velocidad Maxima");
                System.out.println("6. Numero de Motores");
                System.out.println("7. Numero de Pasajeros");
                System.out.println("8. Ninguno\n");
                op2 = input.nextInt();
                
                switch(op2){
                case 1:
                	vehiculo.s_trenesAterrizaje(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de trenes de aterrizaje")));
                    break;

                case 2:
                	vehiculo.s_capacidad(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la capacidad en toneladas")));
                    break;

                case 3:
                	vehiculo.s_peso(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el peso en toneladas")));
                    break;

                case 4:
                	vehiculo.s_alcance(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el alcance en km")));
                    break;

                case 5:
                	vehiculo.s_maxVelocidad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la velocidad maxima en km/h")));
                    break;

                case 6:
                	vehiculo.s_nroMotores(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de motores")));
                    break;

                case 7:
                	vehiculo.s_nroPasajeros(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad de pasajeros")));
                    break;

                case 8:
                    break;

                default:
                	System.out.println("Opcion Invalida\n");
                	continue;
                }
                if(op2!=8) {
                System.out.println("\nDesea continuar modificando las caracteristicas COMUNES de la avioneta? (0 = No  ;  1 = Si)");
                op1 = input.nextInt();}
                else {op1 = 0;}
            }
            System.out.println("\nCARACTERISTICAS PARTICULARES DE LA AVIONETA\n");
            System.out.println("Esperando por caracteristicas PARTICULARES de la avioneta...\n");
            vehiculo.s_modelo(JOptionPane.showInputDialog("Ingrese el modelo de la avioneta:  (Ejemplo: Cessna 120, Beechcraft Baron, etc)"));
            vehiculo.s_cabina(JOptionPane.showInputDialog("Desea una cabina presurizada en su avioneta? (Si o No)"));
            vehiculo.s_flotadores(Integer.parseInt(JOptionPane.showInputDialog("Cuantos flotadores quiere en su avioneta?")));
            vehiculo.s_asientos(Integer.parseInt(JOptionPane.showInputDialog("Cuantos asientos extras quiere en su avioneta?")));
            vehiculo.s_superAceleracion(JOptionPane.showInputDialog("Desea una super aceleracion en su avioneta? (Si o No)"));
            System.out.println("\n********************Datos de la Avioneta********************");
            System.out.println("***Comunes***");
            vehiculo.caracteristicas();
            System.out.println("\n***Especificas***");
            vehiculo.g_avioneta();
            System.out.println("\n***Precio***");
            vehiculo.g_precio();
            vehiculo.precioAvioneta();
            break;
                        
            
        case 2:
        	System.out.println("\nHa elegido crear un Avion de Carga\n");
        	System.out.println("Creando el Avion de Carga...\n");
        	try{Thread.sleep(1000);} catch(InterruptedException e ) {}
            carga vehiculo2 = new carga();
            System.out.println("Avion de carga creado con exito\n");
            System.out.println("A continuacion eliga las caracteristicas COMUNES del vehiculo que desea cambiar:");
            while(op1 == 1) {
                System.out.println("\n1. Trenes de Aterrizaje");
                System.out.println("2. Capacidad");
                System.out.println("3. Peso");
                System.out.println("4. Alcance");
                System.out.println("5. Velocidad Maxima");
                System.out.println("6. Numero de Motores");
                System.out.println("7. Numero de Pasajeros");
                System.out.println("8. Ninguno\n");
                op2 = input.nextInt();
                
                switch(op2){
                case 1:
                	vehiculo2.s_trenesAterrizaje(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de trenes de aterrizaje")));
                    break;

                case 2:
                	vehiculo2.s_capacidad(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la capacidad en toneladas")));
                    break;

                case 3:
                	vehiculo2.s_peso(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el peso en toneladas")));
                    break;

                case 4:
                	vehiculo2.s_alcance(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el alcance en km")));
                    break;

                case 5:
                	vehiculo2.s_maxVelocidad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la velocidad maxima en km/h")));
                    break;

                case 6:
                	vehiculo2.s_nroMotores(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de motores")));
                    break;

                case 7:
                	vehiculo2.s_nroPasajeros(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad de pasajeros")));
                    break;

                case 8:
                    break;

                default:
                	System.out.println("Opcion Invalida\n");
                	continue;
                }
                if(op2!=8) {
                System.out.println("\nDesea continuar modificando las caracteristicas COMUNES del Avion de carga? (0 = No  ;  1 = Si)");
                op1 = input.nextInt();}
                else {op1 = 0;}
            }
            System.out.println("\nCARACTERISTICAS PARTICULARES DEL AVION DE CARGA\n");
            System.out.println("Esperando por caracteristicas PARTICULARES del Avion de Carga...\n");
            vehiculo2.s_modelo(JOptionPane.showInputDialog("Ingrese el modelo del Avion de Carga:  (Ejemplo: Boeing 737, Airbus 320, etc)"));
            vehiculo2.s_estabilizador(JOptionPane.showInputDialog("Desea un estabilizador en su Avion de Carga? (Si o No)"));
            vehiculo2.s_puertaDoble(JOptionPane.showInputDialog("Desea que su Avion de Carga tenga Doble Puerta para la descarga? (Si o No)"));
            vehiculo2.s_paquetesCabina(Integer.parseInt(JOptionPane.showInputDialog("Cuantos paquetes por cabina requiere en su Avion de Carga?")));
            vehiculo2.s_lucesInternas(Integer.parseInt(JOptionPane.showInputDialog("Cuantas luces internas extras quiere en su Avion de Carga?")));
            System.out.println("\n********************Datos del Avion de Carga********************");
            System.out.println("***Comunes***");
            vehiculo2.caracteristicas();
            System.out.println("\n***Especificas***");
            vehiculo2.g_carga();
            System.out.println("\n***Precio***");
            vehiculo2.g_precio();
            vehiculo2.precioCarga();
            break;     
            
        case 3:
        	System.out.println("\nHa elegido crear un Helicoptero\n");
        	System.out.println("Creando el Helicoptero...\n");
        	try{Thread.sleep(1000);} catch(InterruptedException e ) {}
            helicoptero vehiculo3 = new helicoptero();
            System.out.println("Helicoptero creado con exito\n");
            System.out.println("A continuacion eliga las caracteristicas COMUNES del vehiculo que desea cambiar:");
            while(op1 == 1) {
                System.out.println("\n1. Trenes de Aterrizaje");
                System.out.println("2. Capacidad");
                System.out.println("3. Peso");
                System.out.println("4. Alcance");
                System.out.println("5. Velocidad Maxima");
                System.out.println("6. Numero de Motores");
                System.out.println("7. Numero de Pasajeros");
                System.out.println("8. Ninguno\n");
                op2 = input.nextInt();
                
                switch(op2){
                case 1:
                	vehiculo3.s_trenesAterrizaje(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de trenes de aterrizaje")));
                    break;

                case 2:
                	vehiculo3.s_capacidad(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la capacidad en toneladas")));
                    break;

                case 3:
                	vehiculo3.s_peso(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el peso en toneladas")));
                    break;

                case 4:
                	vehiculo3.s_alcance(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el alcance en km")));
                    break;

                case 5:
                	vehiculo3.s_maxVelocidad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la velocidad maxima en km/h")));
                    break;

                case 6:
                	vehiculo3.s_nroMotores(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de motores")));
                    break;

                case 7:
                	vehiculo3.s_nroPasajeros(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad de pasajeros")));
                    break;

                case 8:
                    break;

                default:
                	System.out.println("Opcion Invalida\n");
                	continue;
                }
                if(op2!=8) {
                System.out.println("\nDesea continuar modificando las caracteristicas COMUNES del Helicoptero? (0 = No  ;  1 = Si)");
                op1 = input.nextInt();}
                else {op1 = 0;}
            }
            System.out.println("\nCARACTERISTICAS PARTICULARES DEL HELICOPTERO\n");
            System.out.println("Esperando por caracteristicas PARTICULARES del Helicoptero...\n");
            vehiculo3.s_modelo(JOptionPane.showInputDialog("Ingrese el modelo del Helicoptero:  (Ejemplo: Bell 47, Eurocopter EC 145, etc)"));
            vehiculo3.s_ventanasAntirruido(JOptionPane.showInputDialog("Desea Ventanas Antirruido en su Helicoptero? (Si o No)"));
            vehiculo3.s_doblehelice(JOptionPane.showInputDialog("Desea que su Helicoptero tenga Doble Helice? (Si o No)"));
            vehiculo3.s_mascarasOxigeno(Integer.parseInt(JOptionPane.showInputDialog("Cuantas mascaras de oxigeno requiere en su Helicoptero?")));
            vehiculo3.s_paracaidas(Integer.parseInt(JOptionPane.showInputDialog("Cuantas paracaidas quiere en su Helicoptero?")));
            System.out.println("\n********************Datos del Helicoptero********************");
            System.out.println("***Comunes***");
            vehiculo3.caracteristicas();
            System.out.println("\n***Especificas***");
            vehiculo3.g_helicoptero();
            System.out.println("\n***Precio***");
            vehiculo3.g_precio();
            vehiculo3.precioHelicoptero();
            break; 
      
        case 4:
        	System.out.println("\nHa elegido crear un Avion de Pasajeros\n");
        	System.out.println("Creando un Avion de Pasajeros..\n");
        	try{Thread.sleep(1000);} catch(InterruptedException e ) {}
            pasajeros vehiculo4 = new pasajeros();
            System.out.println("Avion de Pasajeros creado con exito\n");
            System.out.println("A continuacion eliga las caracteristicas COMUNES del vehiculo que desea cambiar:");
            while(op1 == 1) {
                System.out.println("\n1. Trenes de Aterrizaje");
                System.out.println("2. Capacidad");
                System.out.println("3. Peso");
                System.out.println("4. Alcance");
                System.out.println("5. Velocidad Maxima");
                System.out.println("6. Numero de Motores");
                System.out.println("7. Numero de Pasajeros");
                System.out.println("8. Ninguno\n");
                op2 = input.nextInt();
                
                switch(op2){
                case 1:
                	vehiculo4.s_trenesAterrizaje(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de trenes de aterrizaje")));
                    break;

                case 2:
                	vehiculo4.s_capacidad(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la capacidad en toneladas")));
                    break;

                case 3:
                	vehiculo4.s_peso(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el peso en toneladas")));
                    break;

                case 4:
                	vehiculo4.s_alcance(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el alcance en km")));
                    break;

                case 5:
                	vehiculo4.s_maxVelocidad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la velocidad maxima en km/h")));
                    break;

                case 6:
                	vehiculo4.s_nroMotores(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de motores")));
                    break;

                case 7:
                	vehiculo4.s_nroPasajeros(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad de pasajeros")));
                    break;

                case 8:
                    break;

                default:
                	System.out.println("Opcion Invalida\n");
                	continue;
                }
                if(op2!=8) {
                System.out.println("\nDesea continuar modificando las caracteristicas COMUNES del Avion de Pasajeros? (0 = No  ;  1 = Si)");
                op1 = input.nextInt();}
                else {op1 = 0;}
            }
            System.out.println("\nCARACTERISTICAS PARTICULARES DEL AVION DE PASAJEROS\n");
            System.out.println("Esperando por caracteristicas PARTICULARES del Avion de Pasajeros...\n");
            vehiculo4.s_modelo(JOptionPane.showInputDialog("Ingrese el modelo del Avion de Pasajeros  (Ejemplo: C919, Airbus A380-800, etc)"));
            vehiculo4.s_doblepiso(JOptionPane.showInputDialog("Desea que su Avion de Pasajeros posea doble piso? (Si o No)"));
            vehiculo4.s_calentador(JOptionPane.showInputDialog("Desea tener calentadores para su Avion de Pasajeros? (Si o No)"));
            vehiculo4.s_tobogan(Integer.parseInt(JOptionPane.showInputDialog("Cuantos toboganes requiere en su Avion de Pasajeros?")));
            vehiculo4.s_puertas(Integer.parseInt(JOptionPane.showInputDialog("Cuantas puertas de salida requiere en su Avion de Pasajeros?")));
            System.out.println("\n********************Datos del Avion de Pasajeros********************");
            System.out.println("***Comunes***");
            vehiculo4.caracteristicas();
            System.out.println("\n***Especificas***");
            vehiculo4.g_pasajero();
            System.out.println("\n***Precio***");
            vehiculo4.g_precio();
            vehiculo4.precioPasajero();
            break;
            
        
        default:
            System.out.println("\nOpción invalida.\n");
            input.close();
            
        } 
    System.out.println("\n\nGracias por usar este Diseñador de Vehiculos Aereos, Ha finalizado el Programa\n");
    input.close();	
	}
	
}
