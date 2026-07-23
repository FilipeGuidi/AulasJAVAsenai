package aulas.heranca.atividade;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-Vindo ao zoologico de Brasília!|\n");

        Animal lobo = new LoboGuara();
        lobo.emitirSom();
        System.out.println("AAuuui!");

        Animal arara = new AraraAzul();
                arara.comer();


    }
}
