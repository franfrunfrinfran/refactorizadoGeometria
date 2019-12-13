package factorial;



public class Factorial {

	public static double f(double n) {
		if (n==0) {
			return 1;
		}
		else
		{
			double resultado = n*f(n-1);
			return resultado;
		}
	}
public static void main (String []args) {
	System.out.println(f(5));
}
	}


