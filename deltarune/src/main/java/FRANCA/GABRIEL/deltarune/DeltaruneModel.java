package FRANCA.GABRIEL.deltarune;

public class DeltaruneModel {
    String nome;
    String especi;
    int idade;

    public DeltaruneModel() {
    }
    public DeltaruneModel(String nome, String especi, int idade){
        this.nome = nome;
        this.especi = especi;
        this.idade = idade;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspeci() {
        return especi;
    }

    public void setEspeci(String especi) {
        this.especi = especi;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

