package atividades.atividade2;

import java.util.Scanner;

public class DetetiveNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite um número");
        int numero = scanner.nextInt();
        scanner.nextLine();

        if (numero > 0) {
            System.out.print("O número " + numero + " é Positivo e ");
        } else if (numero < 0) {
            System.out.print("O número " + numero + " é Negativo e ");
        } else {
            System.out.println("O número é Zero (neutro).");
            return;
        }


        if (numero % 2 == 0) {
            System.out.println("Par.");
        } else {
            System.out.println("Ímpar.");
        }
    }
}
