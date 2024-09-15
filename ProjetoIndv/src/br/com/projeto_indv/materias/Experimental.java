package br.com.projeto_indv.materias;

import br.com.projeto_indv.enums.TipoMaterias;
import java.util.HashMap;
import java.util.Map;

public class Experimental extends Materia {

    private TipoMaterias tipo = TipoMaterias.EXPERIMENTAL;
    private int id;
    String salaDeAula;
    private static Map<Integer, Experimental> getMapaExperimental = new HashMap<>();

    public Experimental(int id, String nome, int cargaHoraria, int fkIdProfessor, String salaDeAula) {
        super(id, nome, cargaHoraria, fkIdProfessor);
        this.salaDeAula = salaDeAula;
    }

    public Experimental() {
    }

    public int getId() {
        return id;
    }

    public String getSalaDeAula() {
        return salaDeAula;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalaDeAula(String salaDeAula) {
        this.salaDeAula = salaDeAula;
    }

    public static Map<Integer, Experimental> getMapaExperimental() {
		return getMapaExperimental;
	}

    public TipoMaterias getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Materias{" + "id=" + id + ", nome=" + nome + ", cargaHoraria=" + cargaHoraria + ", idProfessor=" + fkIdProfessor + ", idAlunos=" + '}';
    }

}