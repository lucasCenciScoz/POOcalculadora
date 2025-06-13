package CalculadoraGeometrica.Prova;

public class Moto extends Transporte { // todas as informacoes presentes na classe Bicicleta tambem valem para esta

        public Moto(String nome, int velocidadeMaxima, String tipoDeCombustivel, int autonomia) {
            super(nome, velocidadeMaxima, tipoDeCombustivel, autonomia);
        }


        public Moto(){

        }

        @Override
        public void mover() {
            System.out.println("A moto esta acelerando");
        }

        @Override
        public void parar() {
            System.out.println("A moto esta parada");
        }

        @Override
        public void exibirInformacoes() {
            super.exibirInformacoes();
        }
    }


