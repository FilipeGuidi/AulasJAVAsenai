package atividades.atividade2;

import java.util.Scanner;

public class SistemaVotacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Qual a sua idade?");
        int idade = scanner.nextInt();
        scanner.nextLine();
        if (idade < 16) {
            System.out.println("Não pode votar");
        } else if (idade <= 17 || idade > 70) {
            System.out.println("Voto facultativo");
        } else {
            System.out.println("voto obrigatório");
        }

    }
}
