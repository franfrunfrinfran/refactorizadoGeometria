package factorial;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero =3;
		
		System.out.println(texto+numero+" es "+ calcularfactorial(numero));
		numero=5;
		System.out.println(texto+numero+" es "+ calcularfactorial(numero));
	}
	
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
	public static final String texto="El factorial de "; {
		
	}
	
}
