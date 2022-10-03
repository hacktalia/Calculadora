

import java.util.Scanner;


public class Start {


	Scanner sc = null;

	
	public Start (){ 
		this.sc = new Scanner(System.in);
	}



	public static void main(String[] args) {
		
		 
		Start calculadoraTextual = new Start();
		System.out.println("Inversio de 1234: " + calculadoraTextual.invertir(1234));

		while(true){
			int opcion = (int) calculadoraTextual.menu();

			switch(opcion){
				case 1:
					calculadoraTextual.opSuma();
					break;
				case 2:
					calculadoraTextual.opResta();
					break;
				case 3:
					calculadoraTextual.opmultiplicar();
				break;
				case 4:
					calculadoraTextual.opDividir();
					break;
				case 5:
					 calculadoraTextual.opMayorDeTres();
					break;
				case 6:
					calculadoraTextual.opcapicua(opcion);
				break;
					
				case 0:
					System.out.println("Bye ;)");
					System.exit(1);
				default:
					break;
			}
		}
		
	}

	public float menu() {
		
		System.out.println("Calculadora de Calculator S.A.");
		System.out.println("________________________________________\n");
		
		System.out.println("Introduzca una operación del menú: ");
		System.out.println("1.- Suma");
		System.out.println("2.- Resta");
		System.out.println("3.- Multiplicar");
		System.out.println("4.- Dividir");
		System.out.println("5.- Elija un número mayor de tres números");
		System.out.println("6.- Capicua");
		System.out.println("0.- Salir");

		return sc.nextInt();
	}



	// ------- Operación de Suma -------

	public void opSuma() {

		System.out.println("1.- suma");
		System.out.println("introduzca valor número uno");
		float x=0.0f;
		System.out.println("introduzca valor número dos");
		float y =0.0f;

		System.out.println("Resultado: " + suma(x,y));
	}




	public float suma(float x, float y) {
		return x + y;
	}




// ------- Operación de Resta -------	

	public void opResta() {

		System.out.println("2.- resta");
		System.out.println("introduzca valor número uno");
		float x = sc.nextFloat();
		System.out.println("introduzca valor número dos");
		float y = sc.nextFloat();

		System.out.println("Resultado: " + resta(x,y));
	}

	public float resta(float x, float y) {
		return x -y;
	}
	
	
	// ------- Operación de Multiplicar -------	

	public void opmultiplicar() {

		System.out.println("3.- multiplicar");
		System.out.println("introduzca valor número uno");
		float x = sc.nextInt();
		System.out.println("introduzca valor número dos");
		float y = sc.nextInt();

		System.out.println("Resultado: " + multiplicar(x,y));
	}

	public float multiplicar(float x, float y) {
		return x * y;
	}
	
	// ------- Operación de Dividir -------	

		public void opDividir() {

			System.out.println("4.- dividir");
			System.out.println("introduzca valor número uno");
			float x = sc.nextFloat();
			System.out.println("introduzca valor número dos");
			float y = sc.nextFloat();
			System.out.println("Resultado: " + Dividir(x,y));
		}

		public float Dividir(float x, float y) {
			return x / y;
		}
		
		

		// ------- Número mayor de tres números-------	

		public void opMayorDeTres() {

			System.out.println("5.- Elija un número mayor de tres números");
			System.out.println("introduzca valor número uno");
			int x = sc.nextInt();
			System.out.println("introduzca valor número dos");
			int y = sc.nextInt();
			System.out.println ("introduzca valor númeo tres");
			int z = sc.nextInt();
			


			if (x > y) {
	            if (x > z) {
	                System.out.println("El mayor es: " + x);                                             
	            } else {
	                System.out.println("el mayor es: " + z);     
	            }
	        } else if (y > z) {
	        	
	        
	            System.out.println("el mayor es: " + y);
	        } else {
	        	 System.out.println("el mayor es: " + z);
	        }
	          
	        
		}
				
			
			 // ------- Capicua-------	

			public void opcapicua(int invertido) {

			      System.out.println("esta es la opción 6");
			      System.out.println ("introduzca un número  : ");
			      int numero = sc.nextInt();
			      int resto =sc.nextInt ();
			      int numInver =sc.nextInt ();
			     
					   while (numero!=0)
					   {
						   resto=numero%10;
						   invertido = invertido * 10+ resto;
						   numero= numero/10;
					   
						   
		if (numero == numInver){
		
		
		System.out.println("Es capicua");
		
	          
		}	else {
	          System.out.println("No es capicua");
	          
		}

	
		
		System.out.println ("Fin de las operaciones");
		
					   
					   }
					   

			
		
		}

		public int invertir(int x) {
			String stNumber = String.valueOf(x);
			String result = new String();

			for (int i = stNumber.length(); i>0; i--) 
				result = result + (stNumber.charAt(i-1));

		
			return Integer.parseInt(result);
		}
}	
					
				


			
	