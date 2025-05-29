package CalculadoraGeometrica.Empresa;

public class Funcionario {
   private String nome;
    private double salarioBase;

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario(double salarioBase, String nome) {
        this.salarioBase = salarioBase;
        this.nome = nome;
    }
    public double calcularBonus() {
        System.out.println("não implemantado");
        return 0.0;
    }
}
