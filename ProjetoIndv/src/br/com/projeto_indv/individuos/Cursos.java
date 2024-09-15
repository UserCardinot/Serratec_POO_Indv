package br.com.projeto_indv.individuos;

import java.util.HashMap;
import java.util.Map;

public class Cursos {
    int id;
    String nomeCurso;
    String turno;
    private static Map<Integer, Cursos> getMapaCursos = new HashMap<>();

    public Cursos() {
    }

    public Cursos(int id, String nomeCurso, String turno) {
        this.id = id;
        this.nomeCurso = nomeCurso;
        this.turno = turno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public String getTurno() {
        return turno;
    }

    public void setNome(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public static Map<Integer, Cursos> getMapaCursos() {
        return getMapaCursos;
    }

    @Override
    public String toString() {
        return "Cursos{" +
                "nome='" + nomeCurso + '\'' +
                ", turno='" + turno + '\'' +
                '}';
    }
}
