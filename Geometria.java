package factorial;

public class Geometria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int radio=13;

perimetro(radio);

area(radio);
	}

	public static void perimetro(int numero) {
		double numero3=3.14*numero*numero;
		System.out.println("El perímetro del círculo es "+numero3);
	}

	public static void area(int numero) {
		double numero2=2*3.14*numero;
		System.out.println("La superficie del círculo es "+numero2);
	}

}
