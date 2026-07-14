package atividades.atividade2;

import java.util.Scanner;

public class CaixaLoja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Qual o valor da sua compra?");
        double valorCompra = scanner.nextDouble();
        scanner.nextLine();

        if (valorCompra < 100){
            System.out.println("Sua compra é: R$"+valorCompra+"\n Você não tem desconto");
        } else if (valorCompra < 300){
            System.out.println("Sua compra é: R$"+valorCompra+"\nVocê tem desconto de 10%: R$"+valorCompra * 0.1+"\nO valor final da compra: R$"+valorCompra * 0.9);
        } else {
            System.out.println("Sua compra é: R$" + valorCompra + "\nVocê tem desconto de 20%: R$" + valorCompra * 0.2 + "\nO valor final da compra: R$" + valorCompra * 0.8);
        }

        }
}
