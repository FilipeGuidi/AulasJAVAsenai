package aulas.polimorfismo.exemplos.calculos;

public class main {
    public static void main(String[] args) {
        Calculos calculos = new Calculos();
        System.out.println(calculos.soma(1.0, 1.0));
        System.out.println(calculos.soma(1, 1));
        calculos.soma(1.0, 1);
    }
}
