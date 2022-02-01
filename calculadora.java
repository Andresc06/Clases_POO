package calculadora;

import java.util.Scanner;

public class calculadora {
	
	public static void main(String[] args) {
		
		//Declaracion de variables de las opciones a seleccionar
		int op = 0, op2 = 0;
		
		do {
			
			//Declarando las variables
			int num1 = 0, num2 = 0, resultado = 0;

			//Se le pide la opción al usuario
			Scanner opt = new Scanner(System.in);
			System.out.println("Seleccione una opcion:\n");
			System.out.println("1. Suma\n2. Resta\n3.Multiplicacion\n4.Division\n");
			op = opt.nextInt();
				
			//Switch
			switch(op) {
			
			//Suma
			case 1:
				System.out.print("\nHa seleccionado 'suma', ingrese el 1er numero: ");
				num1 = opt.nextInt();
				System.out.print("\nAhora ingrese el 2do numero: ");
				num2 = opt.nextInt();
				resultado = num1 + num2;
				System.out.print("\nEl resultado de la suma es: "+resultado);
				break;
			
			//Resta
			case 2:
				System.out.print("\n\nHa seleccionado 'resta', ingrese el 1er numero: ");
				num1 = opt.nextInt();
				System.out.print("\nAhora ingrese el 2do numero: ");
				num2 = opt.nextInt();
				resultado = num1 - num2;
				System.out.print("\nEl resultado de la resta es: "+resultado);
				break;
			
			//Multiplicacion
			case 3:
				System.out.print("\n\nHa seleccionado 'multiplicacion', ingrese el 1er numero: ");
				num1 = opt.nextInt();
				System.out.print("\nAhora ingrese el 2do numero: ");
				num2 = opt.nextInt();
				resultado = num1 * num2;
				System.out.print("\nEl resultado de la multiplicacion es: "+resultado);
				break;
			
			//Division aqui ya que el resultado puede dar decimales, se declara las variables como FLOAT
			case 4:
				System.out.print("\n\nHa seleccionado 'division', ingrese el 1er numero: ");
				float a = opt.nextInt();
				System.out.print("\nAhora ingrese el 2do numero: ");
				float b = opt.nextInt();
				float res = a/b;
				System.out.print("\nEl resultado de la division es: "+res);
				break;
			
			//Caso en caso de ingresar otro numero
			default:
				System.out.print("\nNo ha ingresado una opcion valida");
			}
				
			System.out.print("\n\nDesea realizar otra operacion? 0. No 1. Si: ");
			op2 = opt.nextInt();
			
		}while(op2==1);
			
		System.out.print("\n\nHa finalizado la sesion.");
	}		

}
