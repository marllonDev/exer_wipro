package Colecoes.Colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class NaoMistutadoSET {
	
	public static void main(String[] args) {
		
		Set<String> conjunto = new HashSet<String>();
		
		//conjunto.add(1.3);
		conjunto.add("Jonathan");
		conjunto.add("Jenifer");
		conjunto.add("Ana");
		
		
		
		System.out.println(conjunto);
		
				
		Funcionario joao = new Funcionario(1, "Joao");
		Funcionario maria = new Funcionario(2, "Maria");//1
		
		Set<Funcionario> conjuntoFuncionario = new HashSet<>();
		
		conjuntoFuncionario.add(joao);
		conjuntoFuncionario.add(maria);
		
		
		for (Funcionario funcionario : conjuntoFuncionario) {
			System.out.println(funcionario.getNome());
		}
		
		Set<Integer> conjuntoNumeros = new TreeSet<>();
		conjuntoNumeros.add(1);
		conjuntoNumeros.add(2);
		conjuntoNumeros.add(3);
		conjuntoNumeros.add(4);
		conjuntoNumeros.add(5);
		conjuntoNumeros.add(6);
		conjuntoNumeros.add(7);
		
		for (int i = 10; i <= 15; i++) conjuntoNumeros.add(i);
		
		for (Integer numero : conjuntoNumeros) {
			System.out.println(numero);
		}
		
		System.out.println(conjuntoNumeros);
	}

}
