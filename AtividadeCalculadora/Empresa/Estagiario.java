package CalculadoraGeometrica.Empresa;

public class Estagiario extends Funcionario{
    private int horasEstagio;

    public Estagiario(double salarioBase, String nome, int horasEstagio) {
        super(salarioBase, nome);
        this.horasEstagio = horasEstagio;
    }

    public int getHorasEstagio() {
        return horasEstagio;
    }

    public void setHorasEstagio(int horasEstagio) {
        this.horasEstagio = horasEstagio;
    }

    @Override
    public double calcularBonus() {
        return this.getSalarioBase() * 0.05;

    }
}
