package Colecoes.Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> animais = new HashMap<>();
		
		//adicionar 
		animais.put(4, "Camelo");
		animais.put(20, "Cachorro");
		animais.put(3, "Gato");
		animais.put(3, "Gata"); // inclui e substitui
		System.out.println(animais.size());
		System.out.println(animais.isEmpty());
		System.out.println(animais);

		// buscar a partir da chave
		System.out.println("valor da chave 3: " + animais.get(2));
		
		System.out.println(animais.keySet()); // conjunto das chave
		System.out.println(animais.values()); // conjuntos dos valores
		System.out.println(animais.entrySet()); // ambos
		
		System.out.println(animais.containsKey(1));
		System.out.println(animais.containsValue("Gata")); // case sensitive
		
		for(int chave: animais.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor: animais.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> linha: animais.entrySet()) { // Entry = java.util.Map.Entry
			System.out.println(linha);
			System.out.println(linha.getKey());
			System.out.println(linha.getValue());
		}
		
		
		//remover
		System.out.println(animais.remove(4));
		System.out.println(animais.remove(20, "Elefante"));
		
		System.out.println(animais.entrySet());
	}
}
