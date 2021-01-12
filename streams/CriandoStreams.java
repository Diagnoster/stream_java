package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print; // referencia para passar para funcoes
		Consumer<Object> println = System.out::print;
		
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n"); // passando valores literais
		langs.forEach(print);
		
		String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" }; // passando arrays
		
		Stream.of(maisLangs).forEach(print);	
		Arrays.stream(maisLangs).forEach(print); // passando arrays inteiro e passar string
		Arrays.stream(maisLangs, 1, 4).forEach(print);
		
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print); // stream paralelo, não vai sair por ordem
	
		// Stream.generate(() -> "a").forEach(print); // string de forma infinita sem ordenação
		
		Stream.iterate(0, n -> n + 1).forEach(println); // string de forma infinita com seed
	}
}


