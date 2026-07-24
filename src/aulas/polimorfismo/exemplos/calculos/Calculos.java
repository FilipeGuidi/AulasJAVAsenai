package aulas.polimorfismo.exemplos.calculos;

public class Calculos {
    private int resultadoInteiro;
    private double resultadoQuebrado;

    public int soma(int primeiroNumero, int segundoNumero){
        setResultadoInteiro(primeiroNumero + segundoNumero);
        return getResultadoInteiro();
    }
    public double soma(double primeiroNumero, double segundoNumero){
        setResultadoQuebrado(primeiroNumero + segundoNumero);
        return getResultadoQuebrado();
    }

    public void soma(double num1, int num2){
        setResultadoQuebrado((int)(num1 + num2));
        System.out.println(getResultadoQuebrado());
    }
    public void soma(int num1, double num2){
        setResultadoInteiro((double)(num1 + num2));
        System.out.println(getResultadoInteiro());
    }

    public int getResultadoInteiro() {
        return resultadoInteiro;
    }

    public void setResultadoInteiro(int resultadoInteiro) {
        this.resultadoInteiro = resultadoInteiro;
    }

    public double getResultadoQuebrado() {
        return resultadoQuebrado;
    }

    public void setResultadoQuebrado(double resultadoQuebrado) {
        this.resultadoQuebrado = resultadoQuebrado;
    }
}
