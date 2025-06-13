package CalculadoraGeometrica.Prova;

public class Carro extends Transporte{  // todas as informacoes presentes na classe Bicicleta tambem valem para esta
    public Carro(String nome, int velocidadeMaxima, String tipoDeCombustivel, int autonomia) {
        super(nome, velocidadeMaxima, tipoDeCombustivel, autonomia);
    }




    public Carro (){

    }

    @Override
    public void mover() {
        System.out.println("O carro esta se movendo");
    }

    @Override
    public void parar() {
        System.out.println("O carro esta parando no sinaleiro ");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
    }
}
