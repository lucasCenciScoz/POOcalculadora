package CalculadoraGeometrica.Empresa;

public class Desenvolvedor extends Funcionario{
    private String linguagemPreferida;

    public Desenvolvedor(double salarioBase, String nome, String linguagemPreferida) {
        super(salarioBase, nome);
        this.linguagemPreferida = linguagemPreferida;

    }

    public String getLinguagemPreferida() {
        return linguagemPreferida;
    }

    public void setLinguagemPreferida(String linguagemPreferida) {
        this.linguagemPreferida = linguagemPreferida;
    }






    @Override
    public double calcularBonus() {
        return this.getSalarioBase() * 0.10;
    }

}
