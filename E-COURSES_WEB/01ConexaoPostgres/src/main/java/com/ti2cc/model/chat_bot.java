package com.ti2cc.model;

public class chat_bot 
{
    
    private int id_chat;
    private String chat_desc;

    public chat_bot()
    {
        this.id_chat=-1;
        this.chat_desc="";
    }

public chat_bot(int id_chat, String chat_desc) 
{
    this.id_chat = id_chat;
    this.chat_desc = chat_desc;
}
public int getID_chat() {
    return id_chat;
}

public void setID_Chat(int id_chat) {
    this.id_chat = id_chat;
}

public String get_chat_desc() {
    return chat_desc;
}

public void set_chat_chat(String chat_desc) {
    this.chat_desc = chat_desc;
}

@Override
public String toString() {
    return "chat_bot [id_chat=" + id_chat + ", chat_desc=" + chat_desc + "]";
}
}
