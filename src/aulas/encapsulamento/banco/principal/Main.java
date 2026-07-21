package aulas.encapsulamento.banco.principal;

import aulas.encapsulamento.banco.modelo.ContaBancaria;


public class Main {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("Fulano", 123456);
        minhaConta.setTitular("Felipe");
        System.out.println(minhaConta.getTitular());

        minhaConta.deposistar(100);

        ContaBancaria pessoa1 = new ContaBancaria("Fulano");
        ContaBancaria pessoa2 = new ContaBancaria("Robso");
    }
}