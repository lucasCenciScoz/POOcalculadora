package CalculadoraGeometrica.Prova;

public class Bicicleta extends Transporte { // criando a heranca entre a classe pai(Transporte) e a subclasse
    public Bicicleta(String nome, int velocidadeMaxima, String tipoDeCombustivel, int autonomia) {
        super(nome, velocidadeMaxima, tipoDeCombustivel, autonomia); // pegando os valores da classe pai
    }




    public Bicicleta (){

    }

    @Override
    public void mover() { // implementacao dos metodos abstratos
        System.out.println("A bicicleta esta se movendo pela calçada");
    }

    @Override
    public void parar() {
        System.out.println("A bicicleta esta parada em casa ");
    }

    @Override
    public void exibirInformacoes() { // utilizacao desta classe para a visualizao do usuario
        super.exibirInformacoes();
    }
}


