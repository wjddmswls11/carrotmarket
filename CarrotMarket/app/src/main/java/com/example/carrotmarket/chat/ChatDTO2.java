package com.example.carrotmarket.chat;

public class ChatDTO2 {
    private int img_chat_carrot;
    private  String chat_carrot,chat_carrot_time,chat_carrot_cont;

    public ChatDTO2(int img_chat_carrot, String chat_carrot, String chat_carrot_time, String chat_carrot_cont) {
        this.img_chat_carrot = img_chat_carrot;
        this.chat_carrot = chat_carrot;
        this.chat_carrot_time = chat_carrot_time;
        this.chat_carrot_cont = chat_carrot_cont;
    }

    public int getImg_chat_carrot() {
        return img_chat_carrot;
    }

    public void setImg_chat_carrot(int img_chat_carrot) {
        this.img_chat_carrot = img_chat_carrot;
    }

    public String getChat_carrot() {
        return chat_carrot;
    }

    public void setChat_carrot(String chat_carrot) {
        this.chat_carrot = chat_carrot;
    }

    public String getChat_carrot_time() {
        return chat_carrot_time;
    }

    public void setChat_carrot_time(String chat_carrot_time) {
        this.chat_carrot_time = chat_carrot_time;
    }

    public String getChat_carrot_cont() {
        return chat_carrot_cont;
    }

    public void setChat_carrot_cont(String chat_carrot_cont) {
        this.chat_carrot_cont = chat_carrot_cont;
    }
}
