package atividades.atividade5;

import java.util.ArrayList;
import java.util.Scanner;

public class TarefasDinamicas { // Nome ajustado para corresponder ao arquivo
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();

        System.out.println("=== SISTEMA DE TAREFAS ===");

        while (true) {
            System.out.print("Nova tarefa: ");
            String tarefa = scanner.nextLine().trim();

            if (!tarefa.isEmpty()) {
                tarefas.add(tarefa);
            } else {
                System.out.println("A tarefa não pode estar em branco!");
                continue;
            }

            System.out.print("Deseja adicionar outra tarefa? (digite 'fim' para encerrar ou ENTER para continuar): ");
            String opcao = scanner.nextLine();

            if (opcao.equalsIgnoreCase("fim")) {
                break;
            }
        }

        System.out.println("\n--- Tarefas Salvas ---");
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println("Tarefa nº " + (i + 1) + ": " + tarefas.get(i));
            }
        }

        scanner.close();
    }
}