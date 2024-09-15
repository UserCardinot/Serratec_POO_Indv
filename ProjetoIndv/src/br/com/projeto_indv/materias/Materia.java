package br.com.projeto_indv.materias;

import br.com.projeto_indv.individuos.Cursos;
import java.util.HashMap;
import java.util.Map;

public class Materia extends Cursos{
    int id;
    String nomeMateria;
    int cargaHoraria;
    int fkIdProfessor;
    private static Map<Integer, Materia> getMapaMateria = new HashMap<>();

    public Materia(int id, String nomeCurso, String turno, String nomeMateria, int cargaHoraria, int fkIdProfessor) {
        super(id, nomeCurso, turno);
        this.id = id;
        this.nomeMateria = nomeMateria;
        this.cargaHoraria = cargaHoraria;
        this.fkIdProfessor = fkIdProfessor;
    }

    public Materia() {
    }

    public int getId() {
        return id;
    }

    public String getNomeMateria() {
        return nomeMateria;
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

    public void setNomeMateria(String nomeMateria) {
        this.nomeMateria = nomeMateria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setFkIdProfessor(int fkIdProfessor) {
        this.fkIdProfessor = fkIdProfessor;
    }

    public static Map<Integer, Materia> getMapaMateria() {
		return getMapaMateria;
	}

    @Override
    public String toString() {
        return "Materias{" + "id=" + id + ", nome=" + nomeMateria + ", cargaHoraria=" + cargaHoraria + ", idProfessor=" + fkIdProfessor + '}';
    }
}
