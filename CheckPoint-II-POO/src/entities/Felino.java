package entities;

public abstract class Felino extends Animal {

    public void miar(){
        System.out.println("Miau");
    }

    public void fazBarulho(){
        this.miar();
    }
}



