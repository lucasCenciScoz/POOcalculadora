package CalculadoraGeometrica.Prova;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }
    public Desenvolvedor(){
    }


    @Override
    public double calcularBonus() {
        return this.getSalario() + 0.15;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
    }

    @Override
    public void exibirCargo() {
        System.out.println("Desenvolvedor");
    }
}

