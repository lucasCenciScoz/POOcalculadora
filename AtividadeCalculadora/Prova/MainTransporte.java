package CalculadoraGeometrica.Prova;

import java.util.Scanner;
import java.util.ArrayList; // importando as ferramentas necessarias
import java.util.jar.JarOutputStream;

public class MainTransporte {
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in); // fazendo a estrutura do scanner
   ArrayList<Transporte> transportes = new ArrayList<>(); // estrututa da lista
        for (int i = 0; i <= 4; i++){ // criacao de um loop para colocar cada classe na lista
             System.out.println("digite o nome do veiculo:");// pedindo ao usuario as informacoes
        String nome = sc.next();
        System.out.println("digite a velocidade maxima do veiculo:");
        int velocidadeMaxima = sc.nextInt();
        System.out.println("digite o tipo de combustivel:");
        String tipoDeCombustivel = sc.next();
        System.out.println("digite a autonomia:");
        int autonomia = sc.nextInt();

        if (nome == null || velocidadeMaxima < 5 || tipoDeCombustivel == null || autonomia <= 0 ){ // verificando se os dados passam pelos requerimentos do sistema
            System.out.println("Um ou mais valores inseridos sao invalidos");
            --i;// caso nao passem , o contador tera o valor decrescido para colocar o valor correto
        }else {
                System.out.println("digite qual o tipo do veiculo:"); // pedindo que classe os valores serao colocados
                String tipo = sc.next();

                switch (tipo) { // verificando qual classe os valores serao enviados

                    case "Carro":
                        transportes.add(new Carro(nome, velocidadeMaxima, tipoDeCombustivel, autonomia));
                        break;

                    case "Moto":
                        transportes.add(new Moto(nome, velocidadeMaxima, tipoDeCombustivel, autonomia));
                        break;
                    case "Onibus":
                        transportes.add(new Onibus(nome, velocidadeMaxima, tipoDeCombustivel, autonomia));
                        break;

                    case "Bicicleta":
                        transportes.add(new Bicicleta(nome, velocidadeMaxima, tipoDeCombustivel, autonomia));
                        break;
                    default:
                        System.out.println("o valor inserido e invalido"); // caso o valor esteja errado , havera uma mensagem e o contador sera decrescido
                        --i;

                }

            }
              if (i == 4) { // criando um if para informar os valores somente ao final do loop
                  for (Transporte Transporte : transportes) {
                      Transporte.exibirInformacoes(); // utilizando exibirInformacoes para mostrar os valores de cada classe
                      Transporte.mover(); // mostrando as acoes especificadas de cada classe
                      Transporte.parar();
                  }
              }

        }


    }


}
