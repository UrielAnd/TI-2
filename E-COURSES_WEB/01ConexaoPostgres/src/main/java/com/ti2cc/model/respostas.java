package com.ti2cc.model;

public class respostas {
    private int id_resp;

    public respostas()
    {
        this.id_resp=-1;
    }

public respostas(int id_resp) 
{
    this.id_resp= id_resp;
}
public int getid_resp() {
    return id_resp;
}

public void setid_resp(int id_resp) {
    this.id_resp = id_resp;
}


@Override
public String toString() {
    return "respostas [id_resp=" + id_resp +"]";
}
}