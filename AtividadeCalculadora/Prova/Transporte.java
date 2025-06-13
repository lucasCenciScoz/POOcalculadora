package CalculadoraGeometrica.Prova;

public abstract class Transporte { // criacao da classe abstrata
    private String nome;
    private int velocidadeMaxima;
    private int autonomia;
    private String tipoDeCombustivel;
    // criacao de atributos privados

    public Transporte(String nome, int velocidadeMaxima, String tipoDeCombustivel, int autonomia) { // criacao da classe transport
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
        this.tipoDeCombustivel = tipoDeCombustivel;
        this.autonomia = autonomia;
    }

    public Transporte(){

    }

    public String getNome() {  // utilizacao de gets e sets para criar o encapsulamento e manter o codigo seguro
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public abstract void mover(); // criacao das classes abstratas que serao definidas nas subclasses
    public abstract void parar();


    public void exibirInformacoes(){ // criando a classe que ira imprimir os atributos
        System.out.println("Nome do veiculo : " + getNome() +
                "\nvelocidade maxima : " + getVelocidadeMaxima() +
                "\nautonomia :" + getAutonomia() +
                "\ntipo Do Combustivel:" + getTipoDeCombustivel());
    }


}
