public class Passaro extends Animal{
    private String corPenas;

    public Passaro(String nome, int idade, String corPenas) throws Exception {
        super(nome, idade);
        this.corPenas = corPenas;
    }

    @Override
    public void emitirSom() {
        System.out.println("Piu piu!");
    }

    @Override
    public void comer() {
        System.out.println("O pássaro está comendo sementes.");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome do Passaro: " + this.getNome() +
                "\n Idade do Passaro: " + this.getIdade() +
                "\n Cor do pelo do Passaro: " + this.corPenas);
    }
}
