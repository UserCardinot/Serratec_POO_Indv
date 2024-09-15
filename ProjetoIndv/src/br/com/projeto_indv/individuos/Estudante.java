package br.com.projeto_indv.individuos;

import java.util.HashMap;
import java.util.Map;

public class Estudante {
    int id;
    String nome;
    String cpf;
    String email;
    int RegistroAcademico;
    int fkIdMaterias;
    private static Map<Integer, Estudante> getMapaEstudante = new HashMap<>();

    public Estudante(int id, String nome, String cpf, String email, int RegistroAcademico, int fkIdMaterias) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.RegistroAcademico = RegistroAcademico;
        this.fkIdMaterias = fkIdMaterias;
    }

    public Estudante() {
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

    public void setIdMaterias(int fkIdMaterias) {
        this.fkIdMaterias = fkIdMaterias;
    }

    public static Map<Integer, Estudante> getMapaEstudante() {
        return getMapaEstudante;
    }

    @Override
    public String toString() {
        return "Estudante{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", RegistroAcademico=" + RegistroAcademico + ", idMaterias=" + fkIdMaterias + '}';
    }
}