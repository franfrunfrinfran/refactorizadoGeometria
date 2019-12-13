package factorial;

public class Geometria2 {
	
	public static final double Pi = 3.14;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int radio=13;

perimetro(radio);

area(radio);
	}

	public static void perimetro(int radio) {
		double perimetro=Pi*radio*radio;
		System.out.println("El perímetro del círculo es "+perimetro);
	}

	public static void area(int radio) {
		double area=2*Pi*radio;
		System.out.println("La superficie del círculo es "+area);
	}
}
