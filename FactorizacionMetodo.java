package factorial;

public class FactorizacionMetodo {

	public static void calcularfactorial(String[] args) {
		// TODO Auto-generated method stub
		int numero = 5;
	System.out.println("Factorial de "+numero+" : "+calcularfactorial(numero));
	
	}

	public static int calcularfactorial(int numero) {
		
		int contador=1;
		double resultado=1;
		
		while (contador<=numero)
		{
			resultado= resultado*contador;
			contador++;
		}
		return numero;
	}
	
}
