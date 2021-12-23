package com.ti2cc.model;

public class perguntas 
{
    private int id_pergunta;

    public perguntas()
    {
        this.id_pergunta=-1;
    }

public perguntas(int id_pergunta) 
{
    this.id_pergunta= id_pergunta;
}
public int getID_pergunta() {
    return id_pergunta;
}

public void setID_pergunta(int id_pergunta) {
    this.id_pergunta = id_pergunta;
}

@Override
public String toString() {
    return "Pergunta [id_pergunta=" + id_pergunta +"]";
}
}
