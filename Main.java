import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro("Bob", 5, "Caramelo"));
        animais.add(new Gato("Batman", 2, "Preto"));
        animais.add(new Passaro("Zé", 1, "Verde"));

        for (Animal animal: animais) {
            animal.exibirInformacoes();
            animal.emitirSom();
            animal.comer();
        }


//        System.out.println("Registre um cachorro:");
//        System.out.println("Digite o nome do cachorro");
//        String nome = sc.next();
//        System.out.println("Digite a idade do cachorro");
//        int idade = sc.nextInt();
//        System.out.println("Digite a raça do cachorro");
//        String raca = sc.next();
//
//        Animal animal;
//        try{
//            animal = new Cachorro(nome, idade, raca);
//        } catch (Exception exception) {
//            System.out.println(exception.getMessage());
//        }

        Animal animal = new Cachorro();

        System.out.println("Registre um cachorro:");
        System.out.println("Digite o nome do cachorro");
        animal.setNome(sc.next());
        System.out.println("Digite a idade do cachorro");
        if(animal.setIdade(sc.nextInt())) {
            System.out.println("Idade não pode ser menor que zero!");
            System.out.println("Digite novamente:");
            animal.setIdade(sc.nextInt());
        }
        System.out.println("Digite a raça do cachorro");
        String raca = sc.next();

        animal = new Cachorro(animal.getNome(), animal.getIdade(), raca);


    }
}