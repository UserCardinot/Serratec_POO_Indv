package br.com.projeto_indv.materias;

import br.com.projeto_indv.enums.TipoMaterias;
import java.util.HashMap;
import java.util.Map;

public class Teorica extends Materia {

    private TipoMaterias tipo = TipoMaterias.TEORICA;
    private int id;
    String Livro;
    private static Map<Integer, Teorica> getMapaTeorica = new HashMap<>();

    public Teorica(int id, String nome, int cargaHoraria, int fkIdProfessor, String Livro) {
        super(id, nome, cargaHoraria, fkIdProfessor);
        this.Livro = Livro;
    }

    public Teorica() {
    }

    public int getId() {
        return id;
    }

    public String getLivro() {
        return Livro;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLivro(String Livro) {
        this.Livro = Livro;
    }

    public static Map<Integer, Teorica> getMapaTeorica() {
        return getMapaTeorica;
    }

    public TipoMaterias getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Materias{" + "id=" + id + ", nome=" + nome + ", cargaHoraria=" + cargaHoraria + ", idProfessor=" + fkIdProfessor + ", idAlunos=" + '}';
    }  

}