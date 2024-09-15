package br.com.projeto_indv.individuos;

public class Professor {
    int id;
    String nome;
    String cpf;
    String email;
    int RegistroAcademico;
    int fkIdMaterias;

    public Professor(int id, String nome, String cpf, String email, int RegistroAcademico, int fkIdMaterias) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.RegistroAcademico = RegistroAcademico;
        this.fkIdMaterias = fkIdMaterias;
    }

    public Professor() {
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public int getRegistroAcademico() {
        return RegistroAcademico;
    }

    public int getFkIdMaterias() {
        return fkIdMaterias;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRegistroAcademico(int RegistroAcademico) {
        this.RegistroAcademico = RegistroAcademico;
    }

    public void setFkIdMaterias(int fkIdMaterias) {
        this.fkIdMaterias = fkIdMaterias;
    }

    @Override
    public String toString() {
        return "Professor{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", RegistroAcademico=" + RegistroAcademico + ", idMaterias=" + fkIdMaterias + '}';
    }
}
