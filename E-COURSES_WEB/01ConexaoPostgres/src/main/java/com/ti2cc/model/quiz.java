package com.ti2cc.model;

public class quiz {
    private int id_quiz;

    public quiz() {
        this.id_quiz = -1;
    }

    public quiz(int id_quiz) {
        this.id_quiz = id_quiz;
    }


    public int getid_quiz() {
        return id_quiz;
    }

    public void setid_quiz(int id_quiz) {
        this.id_quiz = id_quiz;
    }


    @Override
    public String toString() {
        return "quiz [id_quiz=" + id_quiz+"]";
    }
}