package CalculadoraGeometrica.Prova;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class MainFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("digite o nome do funcionario:");
            String nome = sc.next();
            System.out.println("digite o cpf do funcionario:");
            String cpf = sc.next();
            int x = cpf.length();
            System.out.println("digite o salario do funcionario:");
            double salario = sc.nextDouble();

            if (nome == null || x != 11 || salario < 0){
                System.out.println("um ou mais valores estao incorretos");
                i--;
            }else {
                System.out.println("Digite qual o tipo de funcionario:   \n 1-Desenvolvedor \n 2-Administrador \n 3-Suporte Tecnico");
                int profissao = sc.nextInt();

                switch (profissao) {

                    case 1:
                        funcionarios.add(new Desenvolvedor(nome, cpf, salario));
                        break;
                        case 2:
                            funcionarios.add(new Administrador(nome, cpf, salario) );
                            break;
                        case 3:
                            funcionarios.add(new SuporteTecnico(nome, cpf, salario));
                            break;
                    default:
                        System.out.println("o valor inserido e invalido"); // caso o valor esteja errado , havera uma mensagem e o contador sera decrescido
                        --i;
                        break;
                }


            }
            if (i > 1) {
                for (Funcionario funcionario : funcionarios) {
                    funcionario.exibirInformacoes();
                    funcionario.calcularBonus();
                    funcionario.exibirCargo();
                }
            }


        }
    }

}
