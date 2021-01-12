package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");
		
		System.out.println("Usando foreach...");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nUsando Iterator..."); 
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext()) { // tem proximo? se tiver entra no while
			System.out.println(iterator.next());  // tem proxima string? pega o proximo
		}
		
		System.out.println("\nUsando Stream..."); // uma sequencia de dados
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println); // Laço interno!
	
	}

}
