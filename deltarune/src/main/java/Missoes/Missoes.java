package Missoes;


import FRANCA.GABRIEL.deltarune.DeltaruneModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_Missoes_Deltarune  ")
@AllArgsConstructor
@NoArgsConstructor
@Data


public class Missoes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

    private float tempo;
    @OneToMany(mappedBy = "missoes")
    private List<DeltaruneModel> deltarune;

    public Missoes() {

    }

    public Missoes(String nome,String dificuldade, float tempo) {
        this.dificuldade = dificuldade;
        this.nome = nome;
        this.tempo = tempo;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public float getTempo() {
        return tempo;
    }

    public void setTempo(float tempo) {
        this.tempo = tempo;
    }
}
