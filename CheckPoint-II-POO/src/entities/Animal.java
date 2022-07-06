package entities;

public abstract class Animal {

    private String nome;
    private int idade;
    private boolean doente;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws ErrorIdadeAnimalException {
        if (idade < 0 ){
            throw new ErrorIdadeAnimalException("Idade não pode ser negativa");
        }

        this.idade = idade;
    }

    public boolean getDoente() {
        return doente;
    }

    public void setDoente(boolean doente) {
        this.doente = doente;
    }

    public void  dorme() {
        System.out.println("ZZZZ");
    }

    public abstract void procuraComida();

    public abstract void fazBarulho();

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", doente='" + doente + '\'' +
                '}';
    }
}

