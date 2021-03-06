package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
		
		marcas.stream().map(m -> m.toUpperCase()).forEach(print); // foreach � opera��o terminal, depois dela nao se pode chamnar mais nada
	
		//UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + ""; // um caractere com string vazia vai gerar apenas o primeiro caractere
		//UnaryOperator<String> grito = n -> n + "!!! ";
		
		System.out.println("\n\nUsando composi��o...");
		
		marcas.stream() // o stream original continua o mesmo.
			.map(Utilitarios.maiuscula) // lambda expression 
			.map(primeiraLetra)
			.map(Utilitarios::grito) //  a partir de funcao com referencia
			.forEach(print);
	}
}
