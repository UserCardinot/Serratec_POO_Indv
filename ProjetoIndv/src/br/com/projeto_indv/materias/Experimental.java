package br.com.projeto_indv.materias;

import br.com.projeto_indv.enums.TipoMaterias;
import java.util.HashMap;
import java.util.Map;

public class Experimental extends Materia {

    private TipoMaterias tipo = TipoMaterias.EXPERIMENTAL;
    private int id;
    String salaDeAula;
    private static Map<Integer, Experimental> getMapaExperimental = new HashMap<>();

    public Experimental(TipoMaterias tipo, int id, String nomeCurso, String turno, String nomeMateria, int cargaHoraria, int fkIdProfessor, String salaDeAula) {
        super(id, nomeCurso, turno, nomeMateria, cargaHoraria, fkIdProfessor);
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
        return "Materias{" + "id=" + id + ", nome=" + nomeMateria + ", cargaHoraria=" + cargaHoraria + ", idProfessor=" + fkIdProfessor + '}';
    }
}