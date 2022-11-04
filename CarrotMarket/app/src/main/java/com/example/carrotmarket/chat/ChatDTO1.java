package com.example.carrotmarket.chat;

public class ChatDTO1 {
        private int img_chat,chat_pro;
        private String chat_id, chat_town, chat_time, chat_con;

    public ChatDTO1(int img_chat, int chat_pro, String chat_id, String chat_town, String chat_time, String chat_con) {
        this.img_chat = img_chat;
        this.chat_pro = chat_pro;
        this.chat_id = chat_id;
        this.chat_town = chat_town;
        this.chat_time = chat_time;
        this.chat_con = chat_con;
    }

    public int getImg_chat() {
        return img_chat;
    }

    public void setImg_chat(int img_chat) {
        this.img_chat = img_chat;
    }

    public int getChat_pro() {
        return chat_pro;
    }

    public void setChat_pro(int chat_pro) {
        this.chat_pro = chat_pro;
    }

    public String getChat_id() {
        return chat_id;
    }

    public void setChat_id(String chat_id) {
        this.chat_id = chat_id;
    }

    public String getChat_town() {
        return chat_town;
    }

    public void setChat_town(String chat_town) {
        this.chat_town = chat_town;
    }

    public String getChat_time() {
        return chat_time;
    }

    public void setChat_time(String chat_time) {
        this.chat_time = chat_time;
    }

    public String getChat_con() {
        return chat_con;
    }

    public void setChat_con(String chat_con) {
        this.chat_con = chat_con;
    }
}
