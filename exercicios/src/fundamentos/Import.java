package fundamentos;

import java.util.Date;
import java.util.Scanner;



public class Import {
	public static void main(String[] args) {
		String s = "Bom dia";
		
		System.out.println(s);
		
		Date d = new Date();
		System.out.println(d);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		String nome = entrada.nextLine();
		
		System.out.println("Digita sua idade");
		int idade = entrada.nextInt();
		
		System.out.printf("%s tem %d anos.%n", nome, idade);
		
		entrada.close();
		
		
	
	}
}
