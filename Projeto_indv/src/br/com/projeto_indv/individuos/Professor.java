package br.com.projeto_indv.individuos;

public class Professor {
    int id;
    String nome;
    String cpf;
    String email;
    int RegistroAcademico;
    int idMaterias;

    public Professor(int id, String nome, String cpf, String email, int RegistroAcademico, int idMaterias) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.RegistroAcademico = RegistroAcademico;
        this.idMaterias = idMaterias;
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

    public int getIdMaterias() {
        return idMaterias;
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

    public void setIdMaterias(int idMaterias) {
        this.idMaterias = idMaterias;
    }

    @Override
    public String toString() {
        return "Professor{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", RegistroAcademico=" + RegistroAcademico + ", idMaterias=" + idMaterias + '}';
    }
}
