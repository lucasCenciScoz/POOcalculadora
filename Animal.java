public abstract class Animal {
    private String nome;
    private int idade;
    public abstract void emitirSom();
    public abstract void comer();
    public abstract void exibirInformacoes();

    public Animal(String nome, int idade) throws Exception {
        if (idade < 0) {
            throw new Exception("A idade não pode ser negativa");
        }
        this.nome = nome;
        this.idade = idade;
    }

    public Animal() {

    }

    public int getIdade() {
        return idade;
    }

    public boolean setIdade(int idade) {
        if (idade < 0) {
            return true;
        }
        this.idade = idade;
        return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
