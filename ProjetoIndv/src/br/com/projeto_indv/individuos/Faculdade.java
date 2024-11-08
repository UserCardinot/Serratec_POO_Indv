package br.com.projeto_indv.individuos;

import java.util.HashMap;
import java.util.Map;

public class Faculdade {
    private int id;
    private String nome;
    private String campus;
    private String cidade;
    private String estado;
    private String pais;
    private static Map<String, Faculdade> getMapaFaculdade = new HashMap<>();

    public Faculdade() {
    }

    public Faculdade(int id, String nome, String campus, String cidade, String estado, String pais) {
        this.id = id;
        this.nome = nome;
        this.campus = campus;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCampus() {
        return campus;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getPais() {
        return pais;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public static Map<String, Faculdade> getMapaFaculdade() {
        return getMapaFaculdade;
    }

    @Override
    public String toString() {
        return "Faculdade{" +
                "nome='" + nome + '\'' +
                ", campus='" + campus + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
