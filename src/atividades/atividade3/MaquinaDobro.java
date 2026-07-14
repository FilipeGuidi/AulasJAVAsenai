package atividades.atividade3;

import java.util.Scanner;

public class MaquinaDobro {
    public static int calcularDobro(int numero){
        int resultado = numero * 2;


        return resultado;
    }
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número que irá dobrar:");
        int numero = entrada.nextInt();

        System.out.println("O dobro do número é: " + numero * 2);


    }
}
