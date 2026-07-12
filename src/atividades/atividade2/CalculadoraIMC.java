package atividades.atividade2;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Qual o seu peso?");
        double peso = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Qual a sua altura?");
        double altura = scanner.nextDouble();
        scanner.nextLine();

        double massaCorporal = peso/(altura*altura);
        System.out.println("Seu IMC é: "+massaCorporal);


        if (massaCorporal < 18.5) {
            System.out.println("Classificação: Abaixo do peso.");
        } else if (massaCorporal >= 18.5 && massaCorporal <= 24.9) {
            System.out.println("Classificação: Peso normal.");
        } else if (massaCorporal >= 25.0 && massaCorporal <= 29.9) {
            System.out.println("Classificação: Sobrepeso.");
        } else {
            System.out.println("Classificação: Obesidade.");
        }
    }
}
