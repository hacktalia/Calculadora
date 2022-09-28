

import java.util.Scanner;

public class Start {

	Scanner sc = null;

	
	public Start (){ 
		this.sc = new Scanner(System.in);
	}

	 

	public static void main(String[] args) {
		
		Start miCalculadora = new Start();

		while(true){
			int opcion = miCalculadora.menu();

			switch(opcion){
				case 1:
					miCalculadora.opSuma();
					break;
				case 2:
					miCalculadora.opResta();
					break;
				case 0:
					System.out.println("Bye ;)");
					System.exit(1);
				default:
					break;
			}
		}
		
	}

	public int menu() {
		
		System.out.println("Calculadora de Calculator S.A.");
		System.out.println("________________________________________\n");
		
		System.out.println("Introduzca una operación del menú: ");
		System.out.println("1.- Suma");
		System.out.println("2.- Resta");
		System.out.println("3.- Multiplicar");
		System.out.println("4.- Dividir");
		System.out.println("5.- Elija un número mayor de tres números");
		System.out.println("6.- Número capicua");
		System.out.println("0.- Salir");

		return sc.nextInt();
	}



	// ------- Operación de Suma -------

	public void opSuma() {

		System.out.println("1.- suma");
		System.out.println("introduzca valor número uno");
		int x = sc.nextInt();
		System.out.println("introduzca valor número dos");
		int y = sc.nextInt();

		System.out.println("Resultado: " + suma(x,y));
	}




	public int suma(int x, int y) {
		return x + y;
	}




// ------- Operación de Resta -------	

	public void opResta() {

		System.out.println("2.- resta");
		System.out.println("introduzca valor número uno");
		int x = sc.nextInt();
		System.out.println("introduzca valor número dos");
		int y = sc.nextInt();

		System.out.println("Resultado: " + resta(x,y));
	}

	public int resta(int x, int y) {
		return x -y;
	}
}
