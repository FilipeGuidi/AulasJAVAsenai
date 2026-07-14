package atividades.atividade3;

import java.util.Scanner;

public class SaudacaoPersonalizada {
    public static void imprimirSaudacao(String nome) {
        System.out.println("Olá, " + nome + "! Bem-vindo(a) à nossa aula de métodos.");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual é o seu nome?");
        String nomeAluno = entrada.nextLine();

        System.out.println(nomeAluno);
        imprimirSaudacao(nomeAluno);

    }

}
