package Colecoes.Colecoes;

import java.util.ArrayList;

public class ListaList {

	public static void main(String[] args) {
		
		ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
		
		Funcionario maria = new Funcionario(3, "Maria");
		Funcionario ana = new Funcionario(2, "Ana");
		Funcionario marcia = new Funcionario(1, "Marcia");
		
		lista.add(marcia);
		lista.add(ana);
		lista.add(maria);
		lista.add(new Funcionario(5, "Jana"));
		
		// buscar em determinada posi��o (indice)
		System.out.println(lista.get(2));
		
		
		
		for (Funcionario funcionario : lista) {
			System.out.println(funcionario.nome);
		}
		
		System.out.println(lista);
		lista.remove(0);
		lista.remove(1);
		

		System.out.println(lista);
		System.out.println(lista.contains(marcia)); // equals
	}
}
