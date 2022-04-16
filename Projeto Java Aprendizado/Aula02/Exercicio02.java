package Aula02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("Digite sua primeira nota: ");
        Integer notaUm = entrada.nextInt();
        System.out.print("Digite sua segunda nota: ");
        Integer notaDois = entrada.nextInt();

        Integer media = (notaUm + notaDois) / 2;

        if (media >= 6) {
            System.out.println(nome + " você foi aprovado!!");
        }else {
            System.out.println(nome + " você foi reprovado!!");
        }

        System.out.println("A sua média é " + media);
    }
}