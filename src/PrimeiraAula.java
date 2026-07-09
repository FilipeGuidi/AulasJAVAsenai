import java.sql.SQLOutput;
import java.util.Scanner;

public class PrimeiraAula {
    public static void main(String[] args) {
        String nome = "Filipe";
        int idade = 22;
        boolean professor = false;

        int anoNascimento = 2026 - idade;

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(professor);
        System.out.println(anoNascimento);

        Scanner entrada = new Scanner(System.in);

        nome = entrada.nextLine();
        System.out.println(nome);
    }
    

}
