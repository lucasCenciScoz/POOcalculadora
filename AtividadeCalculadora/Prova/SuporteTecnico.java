package CalculadoraGeometrica.Prova;

public class SuporteTecnico extends Funcionario{
    public SuporteTecnico(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }
    public SuporteTecnico(){
    }


    @Override
    public double calcularBonus() {
        return this.getSalario() + 0.08;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
    }

    @Override
    public void exibirCargo() {
        System.out.println("Suporte Tecnico");
    }
}

