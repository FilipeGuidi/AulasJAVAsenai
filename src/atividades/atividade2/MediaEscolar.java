package atividades.atividade2;

import java.util.Scanner;

public class MediaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a nota da sua atividade 1?");
        double nota1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Qual a nota da sua atividade 2?");
        double nota2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Qual a nota da sua atividade 3?");
        double nota3 = scanner.nextDouble();
        scanner.nextLine();

        double media = ((nota1 + nota2 + nota3)/3);

        System.out.println("A sua média é: "+ media);

        if (media < 5){
            System.out.println("Reprovado!");
        } else if (media <= 6,9) {
            
        }
    }
}
