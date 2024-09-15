package br.com.projeto_indv.individuos;

public class Materias {
    int id;
    String nome;
    String descricao;
    int cargaHoraria;
    int idProfessor;
    int idAlunos;
    

    public Materias(int id, String nome, String descricao, int cargaHoraria, int idProfessor, int idAlunos) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.idProfessor = idProfessor;
        this.idAlunos = idAlunos;
    }

    public Materias() {
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public int getIdAlunos() {
        return idAlunos;
    }   

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public void setIdAlunos(int idAlunos) {
        this.idAlunos = idAlunos;
    }

    @Override
    public String toString() {
        return "Materias{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", cargaHoraria=" + cargaHoraria + ", idProfessor=" + idProfessor + ", idAlunos=" + idAlunos + '}';
    }
}
