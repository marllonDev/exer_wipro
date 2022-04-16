package Colecoes.Colecoes;

import java.util.HashSet;
import java.util.Set;

public class MisturadoSET {
	
	public static void main(String[] args) {
		
		
		HashSet conjunto = new HashSet();
		conjunto.add(1);
		conjunto.add("Ola Mundo");
		conjunto.add(true);
		conjunto.add('a');
		
		//descobrir tamanho
		System.out.println(conjunto.size());
		
		// nao aceira repeticao
		conjunto.add('a');
		
		System.out.println(conjunto.size());
		
		
		conjunto.remove('a');
		
		System.out.println(conjunto.size());
		
		// verificar se estar presente ou n
		conjunto.contains('a');
		
		
		Set nome = new HashSet();
		nome.add("Nome :");
		nome.add('j');
		System.out.println(nome);
		
		
		Set letras = new HashSet();
		letras.add('j');
		letras.add('o');
		letras.add('n');
		letras.add('a');
		letras.add('t');
		letras.add('h');
		letras.add('A');
		letras.add('N');
		
		System.out.println(letras);

		//interse��o
		nome.retainAll(letras);
		System.out.println(nome);
		
		//uni�o entre os 2 conjuntos
		nome.addAll(letras);
		System.out.println(nome);
		
		// remover
		nome.remove("Nome :");
		
		// limpar
		nome.clear();
		System.out.println(nome);
		
	}

}
