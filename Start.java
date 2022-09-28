

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
					miCalculdora.opResta();
					break;
				case 0:
					System.out.println("Bye ;)");
					System.exit(1);
				default:
					break;
			}
		}
		
		
		
		
		
		
		
		
		/*System.out.print("1.- suma");
		System.out.print("introduzca valor número uno");
		numUno =entradaDatos.nextFloat();
		System.out.print("introduzca valor número dos");
		numDos=entradaDatos.nextFloat();
		resultado = (numUno)+(numDos);
		return; 
		
		System.out.print("2.- resta");
		System.out.print("introduzca valor número uno");
		numUno =entradaDatos.nextFloat();
		System.out.print("introduzca valor número dos");
		numDos=entradaDatos.nextFloat();
		resultado = (numUno)-(numDos);
		return;
		
		
		System.out.print("3.- Multiplicar");
		System.out.print("introduzca valor número uno");
		numUno =entradaDatos.nextFloat();
		System.out.print("introduzca valor número dos");
		numDos=entradaDatos.nextFloat();
		resultado = (numUno)*(numDos);
		return;
		
		System.out.print("4.- Dividir");
		System.out.print("introduzca valor número uno");
		numUno =entradaDatos.nextFloat();
		System.out.print("introduzca valor número dos");
		numDos=entradaDatos.nextFloat();
		resultado = (numUno)/(numDos);
		return;
		
		
		System.out.print("5.- Elija un número mayor de tres números  ");
		System.out.print("introduzca valor número uno");
		numUno =entradaDatos.nextFloat();
		System.out.print("introduzca valor número dos");
		numDos=entradaDatos.nextFloat();
		System.out.print("introduzca valor número tres");
		numTres=entradaDatos.nextFloat();
		if (numUno >0 && numDos >0 && numTres >0);
		return;
		
		
		System.out.print("6.- capicua");
	    while (n < 10);
		resultado= (n) + (inverso);
		boolean invertido = true; */
		
		
		
		
		
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
