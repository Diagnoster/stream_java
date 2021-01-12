package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {
	
	private Utilitarios () {
		
	}
	
	public final static UnaryOperator<String> maiuscula = 
			n -> n.toUpperCase();
	
	public final static UnaryOperator<String> primeiraLetra =
			n -> n.charAt(0) + "";
	
	public  static String grito (String n) { //funcao grito
		return n + "!!! ";
	}
	
	public static void decimalParaBinario (int n) {
		if (n > 0) {
			decimalParaBinario(n/2);
			System.out.println(n%2);
		}
	}
	// NAO PODE TER UM METODO FINAL QUE NAO PODE SER SOBRESCRITO POR INTERFACE

}
