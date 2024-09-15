package br.com.projeto_indv.enums;

public enum TipoMaterias {

    EXPERIMENTAL("Experimental", 1),
    TEORICA("Teorica", 2),
    PRATICA("Pratica", 3);

    private String tipo;
    private int id;

    TipoMaterias(String tipo, int id) {
        this.tipo = tipo;
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public int getId() {
        return id;
    }
}
