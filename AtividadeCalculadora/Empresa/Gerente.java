package CalculadoraGeometrica.Empresa;

public class Gerente extends Funcionario{
    private int projetosGerenciados;



    public Gerente(double salarioBase, String nome, int projetosGerenciados) {
        super(salarioBase, nome);
        this.projetosGerenciados = projetosGerenciados;
    }

    public int getProjetosGerenciados() {
        return projetosGerenciados;
    }

    public void setProjetosGerenciados(int projetosGerenciados) {
        this.projetosGerenciados = projetosGerenciados;
    }

    @Override
    public double calcularBonus() {
        return this.getSalarioBase() * 0.15;    }
}
