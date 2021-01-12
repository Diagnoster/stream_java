package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class DesafioJames {
	
	public static void main(String[] args) {
		
		Vocacao v1 = new Vocacao ("Knight", 100, true, false);
		Vocacao v2 = new Vocacao ("Druid", 105, true, true);
		Vocacao v3 = new Vocacao ("Sorcerer", 99, true, false);
		Vocacao v4 = new Vocacao ("Paladin", 95, false, true);
		
		List<Vocacao> level = Arrays.asList(v1, v2, v3, v4);
		
		Function<Vocacao, String> saudacao = // primeiro parametro outra classe, segundo o retorno
				a -> "Parabéns " + a.nome + "! Você é um high level!"; 	
				
		level.stream() 
			.filter( v -> v.level >= 100 && true)
			.filter(v -> v.promotion == true)
			.map(saudacao)
			.forEach(System.out::println);
		
			
	}

}
