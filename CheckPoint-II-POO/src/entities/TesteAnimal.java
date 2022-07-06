package entities;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteAnimal {

    public static void main(String[] args) throws ErrorIdadeAnimalException{

        List<Animal> animais = new ArrayList<>();


        Scanner scanner = new Scanner(System.in);


        System.out.println("Qual o nome do cachorro? ");

        String nome = scanner.nextLine();

        System.out.println("Qual a idade do cachorro? ");

        int idade = scanner.nextInt();

        System.out.println("O Cachorro está doente? ");

         boolean doente = scanner.nextBoolean();




        Cachorro cachorro = new Cachorro();
        cachorro.setNome(nome);
        cachorro.setIdade(idade);
        cachorro.setDoente(doente);
        animais.add(cachorro);

        Gato gato = new Gato();
        gato.setNome("Cesar");
        gato.setIdade(5);
        gato.setDoente(false);
        animais.add(gato);

        Lobo lobo = new Lobo();
        lobo.setNome("Nymeria");
        lobo.setIdade(3);
        lobo.setDoente(true);
        animais.add(lobo);

        for(Animal animal : animais) {
            Veterinario.cuidaDoAnimal(animal);
        }

        scanner.close();
    }

}