package CalculadoraGeometrica.Prova;

public class Onibus extends Transporte{ // todas as informacoes presentes na classe Bicicleta tambem valem para esta
    public Onibus(String nome, int velocidadeMaxima, String tipoDeCombustivel, int autonomia) {
        super(nome, velocidadeMaxima, tipoDeCombustivel, autonomia);
    }


    public Onibus(){

    }

    @Override
    public void mover() {
        System.out.println("O onibus esta acelerando para chegar no horario");
    }

    @Override
    public void parar() {
        System.out.println("O onibus esta parando no ponto");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
    }
}

