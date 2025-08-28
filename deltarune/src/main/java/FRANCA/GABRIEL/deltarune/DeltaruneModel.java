package FRANCA.GABRIEL.deltarune;

import Missoes.Missoes;
import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_cadastro_de_deltarune")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class DeltaruneModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private int idade;
    @ManyToOne
    @JoinColumn(name = "missoes_id")//foreing Key
    private Missoes missoes;

    public DeltaruneModel() {
    }

    public DeltaruneModel(String nome, String email, int idade, Missoes missoes){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.missoes = missoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
