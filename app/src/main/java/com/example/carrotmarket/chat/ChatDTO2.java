package com.example.carrotmarket.chat;

public class ChatDTO2 {
    private int img_chat_carrot, chat_greencheck;
    private String chat_carrot, chat_carrot_cont;

    public ChatDTO2(int img_chat_carrot, int chat_greencheck, String chat_carrot, String chat_carrot_cont) {
        this.img_chat_carrot = img_chat_carrot;
        this.chat_greencheck = chat_greencheck;
        this.chat_carrot = chat_carrot;
        this.chat_carrot_cont = chat_carrot_cont;
    }

    public int getImg_chat_carrot() {
        return img_chat_carrot;
    }

    public void setImg_chat_carrot(int img_chat_carrot) {
        this.img_chat_carrot = img_chat_carrot;
    }

    public int getChat_greencheck() {
        return chat_greencheck;
    }

    public void setChat_greencheck(int chat_greencheck) {
        this.chat_greencheck = chat_greencheck;
    }

    public String getChat_carrot() {
        return chat_carrot;
    }

    public void setChat_carrot(String chat_carrot) {
        this.chat_carrot = chat_carrot;
    }

    public String getChat_carrot_cont() {
        return chat_carrot_cont;
    }

    public void setChat_carrot_cont(String chat_carrot_cont) {
        this.chat_carrot_cont = chat_carrot_cont;
    }
}
