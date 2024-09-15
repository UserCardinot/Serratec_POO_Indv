package br.com.projeto_indv.individuos;

public class Cursos {
    private int id;
    private String nome;
    private String turno;

    public Cursos() {
    }

    public Cursos(int id, String nome, String turno) {
        this.id = id;
        this.nome = nome;
        this.turno = turno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getTurno() {
        return turno;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Cursos{" +
                "nome='" + nome + '\'' +
                ", turno='" + turno + '\'' +
                '}';
    }
}
