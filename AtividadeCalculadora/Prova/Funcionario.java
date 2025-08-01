package CalculadoraGeometrica.Prova;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    public Funcionario() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract void exibirCargo();
    public abstract double calcularBonus();

    public void exibirInformacoes(){
        System.out.println("Nome do funcionario : " + getNome() + "\nCPF : " + getCpf() + "\nSalario : " + getSalario());
    }



}
