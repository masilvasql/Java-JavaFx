package fundamentos;

public class desafioFarenheitCelsius {
	
	public static void main(String[] args) {
		final int CONV_FC = 32;
		double farenheit = 41;
		final double fator = 5.0 / 9.0;
		
		double celcius = (farenheit - CONV_FC) * fator;
		
		System.out.println("Celsius = " + celcius + "�C");
		
		
		
	}
	
}
