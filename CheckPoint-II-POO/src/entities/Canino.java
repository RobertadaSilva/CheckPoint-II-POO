package entities;

public abstract class Canino extends Animal {

    public void latir(){
        System.out.println("Au Au Au");
    }
    public void fazBarulho(){
        this.latir();

    }
}


