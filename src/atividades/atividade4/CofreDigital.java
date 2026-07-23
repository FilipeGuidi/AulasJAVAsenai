package atividades.atividade4;

import java.util.Scanner;

public class CofreDigital { // <--- Alterado aqui
    public static void abrirCofre() {
        Scanner entrada = new Scanner(System.in);

        int senha = 9999;
        int tentativas = 5;

        while (tentativas > 0) {
            System.out.print("Digite sua senha: ");
            int senhaDigitada = entrada.nextInt();

            if (senhaDigitada == senha) {
                System.out.println("Cofre aberto!");
                entrada.close();
                return;
            } else {
                tentativas--;
                System.out.println("Código errado!");
                if (tentativas > 0) {
                    System.out.println("Restam apenas " + tentativas + " tentativa(s)!");
                }
            }
        }

        System.out.println("Cofre bloqueado. Número de tentativas excedido.");
        entrada.close();
    }

    public static void main(String[] args) {
        abrirCofre();
    }
}