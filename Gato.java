public class Gato extends Animal{
    private String corPelo;

    public Gato(String nome, int idade, String corPelo) throws Exception {
        super(nome, idade);
        this.corPelo = corPelo;
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }

    @Override
    public void comer() {
        System.out.println("O gato está comendo peixe.");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome do Gato: " + this.getNome() +
                "\n Idade do Gato: " + this.getIdade() +
                "\n Cor do pelo do Gato: " + this.corPelo);
    }
}
