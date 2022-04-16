package Aula02;

import java.util.Random;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner entrada = new Scanner(System.in);
        Integer numInput = 0;
        Integer cont = 0;

        Integer numero = rand.nextInt(11);

        do {
            System.out.println("Tente adivinha o número de 0 a 10: ");
            numInput = entrada.nextInt();
            cont++;

            if (numInput < numero) {
                System.out.println("O número " + numInput + " é menor do que o número sorteado");
            } else if (numInput > numero) {
                System.out.println("O número " + numInput + " é maior do que o número sorteado");
            } else {
                System.out.println("Você acertou em " + cont + " tentativas");
            }
        } while (numInput != numero);
    }
}
