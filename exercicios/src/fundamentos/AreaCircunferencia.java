package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		//final = constante, impede que o valor definido inicialmente � imut�vel.
		double raio = 3.4;
		final double PI = 3.14159;
		double area = PI * Math.pow(raio, 2);
		
		System.out.println(area);		
	}
	
}
