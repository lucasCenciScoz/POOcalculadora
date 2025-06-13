package CalculadoraGeometrica.Prova;

public class Administrador extends Funcionario{
    public Administrador(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }
        public Administrador(){
        }


    @Override
    public double calcularBonus() {
     return this.getSalario() + 0.10;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
    }

    @Override
    public void exibirCargo() {
        System.out.println("Administrador");
    }
}
