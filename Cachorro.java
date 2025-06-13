public class Cachorro extends Animal{
    private String raca;

    public Cachorro(String nome, int idade, String raca) throws Exception {
        super(nome, idade);
        this.raca = raca;
    }

    public Cachorro(){

    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au!");
    }

    @Override
    public void comer() {
        System.out.println("O cachorro está comendo ração.");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome do Cachorro: " + this.getNome() +
                "\n Idade do Cachorro: " + this.getIdade() +
                "\n Raça do Cachorro: " + this.raca);
    }

}
