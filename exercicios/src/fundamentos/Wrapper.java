package fundamentos;

public class Wrapper {
	public static void main(String[] args) {
		
		//byte
		
		Byte    b = 100;
		Short   s = 1000;
		Integer i = 10000;
		Long    l = 100000L;
		String result ;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		
		result = b > s ? "Sim" : "N�o"; 
		
		System.out.println(result);
		
		
		
	}
}
