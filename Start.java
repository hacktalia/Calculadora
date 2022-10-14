

	
import java.util.Scanner;


public class Start {


	Scanner sc = null;

	
	public Start (){ 
		this.sc = new Scanner(System.in);
	}



	public static void main(String[] args) {
		
		 
		Start calculadoraTextual = new Start();

		while(true){
			int opcion = (int) calculadoraTextual.menu();
			
			if (opcion>=6) {
			}
			else {
				
				}
			System.out.println("Opción errónea");

			switch(opcion){
				case 1:
					calculadoraTextual.opSuma();
					break;
				case 2:
					calculadoraTextual.opResta();
					break;
				case 3:
					calculadoraTextual.opMultiplicar();
				break;
				case 4:
					calculadoraTextual.opDividir();
					break;
				case 5:
					 calculadoraTextual.opMayorDeTres();
					break;
				case 6:
					calculadoraTextual.opFactorial();
					break;
					
				case 0:
					System.out.println("El programa ha finalizado");
					System.exit(1);
				default:
					break;
			}
		}
		
	}
	
	

	public float menu() {
		
		System.out.println("***************************************");
		System.out.println("**** Calculadora de Calculator S.A.****");
		System.out.println("***************************************");
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("Introduzca una operación del menú: ");
		System.out.println("1.- FunciónSumar");
		System.out.println("2.- FunciónRestar");
		System.out.println("3.- FunciónMultiplicar");
		System.out.println("4.- FunciónDividir");
		System.out.println("5.- Función Número mayor de tres números");
		System.out.println("6.- FunciónFactorial");
		System.out.println("0.- Salir");

		return sc.nextInt();
	}



	// ------- Operación de Suma -------

	public void opSuma() {

		System.out.println("1.- FunciónSumar");
		System.out.println("introduzca el primer número flotante a sumar: ");
		float x = sc.nextFloat();
		System.out.println("introduzca el segungo número flotante a sumar: ");
		float y = sc.nextFloat();

		System.out.println("Resultado: " + suma(x,y));
	}
	
	

	public float suma(float x, float y) {
		return x +y;
	}




// ------- Operación de Resta -------	

	public void opResta() {

		System.out.println("2.- FunciónRestar");
		System.out.println("introduzca el primero número flotante a restar: ");
		float x = sc.nextFloat();
		System.out.println("introduzca el segungo número flotante a restar: ");
		float y = sc.nextFloat();

		System.out.println("Resultado: " + resta(x,y));
	}

	public float resta(float x, float y) {
		return x -y;
	}
	
	
	// ------- Operación de Multiplicar -------	

	public void opMultiplicar() {

		System.out.println("3.- FunciónMultiplicar");
		System.out.println("introduzca el primer número flotante a multiplicar: ");
		float x = sc.nextFloat();
		System.out.println("introduzca el segundo número flotante a multiplicar: ");
		float y = sc.nextFloat();

		System.out.println("Resultado: " + multiplicar(x,y));
	}

	public float multiplicar(float x, float y) {
		return x * y;
	}
	
	// ------- Operación de Dividir -------	
	
	public void opDividir() {

		System.out.println("4.- FunciónDividir");
		System.out.println("introduzca el primer número flotante a dividir: ");
		float x = sc.nextFloat();
		System.out.println("introduzca el segundo número flotante a dividir: ");
		float y = sc.nextFloat();
		
		
		if(y!=0) {
			
		System.out.println("Resultado:"  + division (x,y));
			
			
			}
		
		
			else if (y==0) {
			
			System.out.println("Error division por 0");
			
			}
		
		else division(x,y);
		
			
		}
	
	
		
	public float division(float x, float y) {	
	return x/y;
	
	
		
	}
	
	
		// ------- Número mayor de tres números-------	




		public void opMayorDeTres() {

			System.out.println("5.- Función Número mayor de 3 números");
			System.out.println("introduzca el primer número flotante de los 3");
			float x = sc.nextFloat();
			System.out.println("introduzca el segundo número flotante de los 3");
			float y = sc.nextFloat();
			System.out.println ("introduzca el tercer número flotante de los 3");
			float z = sc.nextFloat();
			


			if (x > y) {
	            if (x > z) {
	                System.out.println("El mayor es: " + x);                                             
	            } else {
	                System.out.println("El mayor es: " + z);     
	            }
	        } else if (y > z) {
	        	
	        
	            System.out.println("el mayor es: " + y);
	            
	            } else {
		        	 System.out.println("el mayor es: " + z);
		        }
		          
		        
			}
	            
	        	
				
			
		// ------- Factorial-------//

	public void opFactorial() {
		
		System.out.println("5.- FunciónFactorial");
		System.out.println("introduzca un número para calcular el factorial");
		int y=sc.nextInt ();
		
		
		long factorial=1;
		
		for (int i=y; i>0; i--){
			factorial =factorial*i;
			
			}
			

				
		 System.out.println("El factorial de " + y + " es: " + factorial);
	
	
			}	
							
					   
					   
}

			
							