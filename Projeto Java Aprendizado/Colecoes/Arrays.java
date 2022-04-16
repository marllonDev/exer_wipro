package Colecoes;

public class Arrays {

	public static void main(String[] args) {

		int[] b; // declara a vari�vel de array

		b = new int[12]; // atribui a vari�vel de array B a dimens�o de 12 posi��es

//		ou

		int[] x = new int[3];


		//           0   1  2  3    4                            12
		int[] c = { -45, 6, 0, 15, 1543, -89, 0, 62, -3, 1, 6453, 78 };

		
		String[] nomes2 = { "Jonathan", "b"};
		System.out.println(nomes2[0]); 
		
		String joao = "Jo�o";
		String ana = "Ana";
		String jenifer = "Jenifer";
		String variavelJ = "Jonathan";

		String[] professores = new String[4];
		
		professores[3] = "asa";
		
		
		professores[0] = joao;
		professores[1] = ana;
		professores[2] = jenifer;
		professores[3] = variavelJ;

		System.out.println("tamanho do arrays Professores:  " + professores.length);

		System.out.println(professores[0]);
		System.out.println(professores[1]);
		System.out.println(professores[2]);
		System.out.println(professores[3]);

		for (int j = 0; j < professores.length; j++) {
			System.out.println(professores[j]);
		}
		
		int[][] myrray = new int[2][2];
      
		 System.out.println("Intera��o array multidimensional:");
		 
		 // int[][] arrayMultidimensional = { {1, 2}, {3, 4}, {5, 6} };
		 
		 int[][] arrayMultidimensional = { 
				 {1, 2},
				 {3, 4},
				 {5, 6} 
				 };
		 
	        for (int i = 0; i < 3; i++) { 
	            for (int j = 0; j < 2; j++) { 
	            System.out.print(arrayMultidimensional [i][j] + " "); 
	            } 
	            System.out.println(); 
	        } 

	}

}
