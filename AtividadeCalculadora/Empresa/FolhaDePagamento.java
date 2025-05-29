package CalculadoraGeometrica.Empresa;
import java.util.ArrayList;

public class FolhaDePagamento {
    public static void main(String[] args){
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
        listaFuncionarios.add(new Estagiario(1000 , "Reinaldo" , 100));
        listaFuncionarios.add(new Desenvolvedor(1000 , "Geovane" , "Portugues"));
        listaFuncionarios.add(new Gerente(1000 , "leonardo" , 23));
        listaFuncionarios.add(new Estagiario(1500 , "kevin" , 120));
        listaFuncionarios.add(new Desenvolvedor(3450 , "yeferson" , "Java"));
        listaFuncionarios.add(new Gerente(5600, "Leticia" , 5));
        listaFuncionarios.add(new Estagiario(1600 , "Lucas" , 70));
        listaFuncionarios.add(new Desenvolvedor(3450 , "Rafael" , "C#"));
        listaFuncionarios.add(new Gerente(6000 , "Adolar" ,  45));


        for (Funcionario funcionario : listaFuncionarios) {
         System.out.println(funcionario.getNome());
         System.out.println(funcionario.calcularBonus());
        }
    }
}
