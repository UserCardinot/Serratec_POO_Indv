package br.com.projeto_indv.materias;

import br.com.projeto_indv.enums.TipoMaterias;
import java.util.HashMap;
import java.util.Map;

public class Pratica extends Materia {

    private TipoMaterias tipo = TipoMaterias.PRATICA;
    private int id;
    String materialExtra;
    private static Map<Integer, Pratica> getMapaPratica = new HashMap<>();


    public Pratica(int id, String nome, int cargaHoraria, int fkIdProfessor, String materialExtra) {
        super(id, nome, cargaHoraria, fkIdProfessor);
        this.materialExtra = materialExtra;
    }

    public Pratica() {
    }

    public int getId() {
        return id;
    }

    public String getMaterialExtra() {
        return materialExtra;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMaterialExtra(String materialExtra) {
        this.materialExtra = materialExtra;
    }

    public static Map<Integer, Pratica> getMapaPratica() {
        return getMapaPratica;
    }

    public TipoMaterias getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Materias{" + "id=" + id + ", nome=" + nome + ", cargaHoraria=" + cargaHoraria + ", idProfessor=" + fkIdProfessor + ", idAlunos=" + '}';
    }
}