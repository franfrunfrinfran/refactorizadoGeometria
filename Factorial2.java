package factorial;

public class Factorial2 {
	

	private static int numero;
	
	public static double calcularfactorial(double n) {
		if (n==0) {
			return 1;
		}
		else
		{
			double resultado = n*calcularfactorial(n-1);
			return resultado;
		}
	}
		public static void main(String[] args) {
			numero = 3;
						
			System.out.println("El factorial es "+numero+" es "+ calcularfactorial(numero));
			numero=5;
			System.out.println("El factorial es "+numero+" es "+ calcularfactorial(numero));
		}
		

	}
