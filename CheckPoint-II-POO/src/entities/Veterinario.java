package entities;

public class Veterinario {

    public static void cuidaDoAnimal(Animal animal) {
        System.out.println("Recebendo um " + animal.getClass());
        System.out.print(animal);
        if(animal.getDoente() == false) {
            System.out.println("O animal está ok!");
            return;
        }
        System.out.println("Dando comida para " + animal.getNome());
        animal.procuraComida();
        Veterinario.curaAnimal(animal);
        animal.dorme();
        System.out.println("Pode levar o animal");
        System.out.println("");
    }

    private static void curaAnimal(Animal animal) {
        System.out.println("Aplicando vacina");
        animal.setDoente(false);
        animal.fazBarulho();
        System.out.println("Animal curado");
    }

}


