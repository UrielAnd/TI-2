package com.ti2cc.model;

public class curso {
    private int id_curso;
    private char Nome_curso;

    public curso() {
        this.id_curso = -1;
        this.Nome_curso = '*';
    }

    public curso(int id_curso, char Nome_curso) {
        this.id_curso = id_curso;
        this.Nome_curso = Nome_curso;
    }

    public int getid_curso() {
        return id_curso;
    }

    public void setid_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public char getNome_curso() {
        return Nome_curso;
    }

    public void setNome_curso(char Nome_curso) {
        this.Nome_curso = Nome_curso;
    }

    @Override
    public String toString() {
        return "curso [id_curso=" + id_curso + ", Nome_curso=" + Nome_curso + "]";
    }
}
