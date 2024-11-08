package br.com.projeto_indv.individuos;

import java.util.HashMap;
import java.util.Map;

public class Professor {
    int id;
    String nome;
    String cpf;
    String email;
    int RegistroAcademico;
    int Materias;
    private static Map<String, Professor> getMapaProf = new HashMap<>();

    public Professor(int id, String nome, String cpf, String email, int RegistroAcademico, int Materias) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.RegistroAcademico = RegistroAcademico;
        this.Materias = Materias;
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

    public int getMaterias() {
        return Materias;
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

    public void setMaterias(int Materias) {
        this.Materias = Materias;
    }

    public static Map<String, Professor> getMapaProf() {
        return getMapaProf;
    }
    
    @Override
    public String toString() {
        return "Professor{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", RegistroAcademico=" + RegistroAcademico + '}';
    }
}
