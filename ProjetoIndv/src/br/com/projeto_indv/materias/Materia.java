package br.com.projeto_indv.materias;

public class Materia {
    int id;
    String nome;
    int cargaHoraria;
    int fkIdProfessor;

    public Materia(int id, String nome, int cargaHoraria, int fkIdProfessor) {
        this.id = id;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.fkIdProfessor = fkIdProfessor;
    }

    public Materia() {
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public int getFkIdProfessor() {
        return fkIdProfessor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setFkIdProfessor(int fkIdProfessor) {
        this.fkIdProfessor = fkIdProfessor;
    }

    @Override
    public String toString() {
        return "Materias{" + "id=" + id + ", nome=" + nome + ", cargaHoraria=" + cargaHoraria + ", idProfessor=" + fkIdProfessor + ", idAlunos=" + '}';
    }
}
