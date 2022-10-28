package com.example.carrotmarket.carrot;

public class FavoriteDTO {
    private int favor_item_pic;
    private String favor_item_txt, favor_item_txt2,favor_item_txt3, tv_home_chat,tv_home_favorite;

    public FavoriteDTO(int favor_item_pic, String favor_item_txt, String favor_item_txt2, String favor_item_txt3, String tv_home_chat, String tv_home_favorite) {
        this.favor_item_pic = favor_item_pic;
        this.favor_item_txt = favor_item_txt;
        this.favor_item_txt2 = favor_item_txt2;
        this.favor_item_txt3 = favor_item_txt3;
        this.tv_home_chat = tv_home_chat;
        this.tv_home_favorite = tv_home_favorite;
    }

    public int getFavor_item_pic() {
        return favor_item_pic;
    }

    public void setFavor_item_pic(int favor_item_pic) {
        this.favor_item_pic = favor_item_pic;
    }

    public String getFavor_item_txt() {
        return favor_item_txt;
    }

    public void setFavor_item_txt(String favor_item_txt) {
        this.favor_item_txt = favor_item_txt;
    }

    public String getFavor_item_txt2() {
        return favor_item_txt2;
    }

    public void setFavor_item_txt2(String favor_item_txt2) {
        this.favor_item_txt2 = favor_item_txt2;
    }

    public String getFavor_item_txt3() {
        return favor_item_txt3;
    }

    public void setFavor_item_txt3(String favor_item_txt3) {
        this.favor_item_txt3 = favor_item_txt3;
    }

    public String getTv_home_chat() {
        return tv_home_chat;
    }

    public void setTv_home_chat(String tv_home_chat) {
        this.tv_home_chat = tv_home_chat;
    }

    public String getTv_home_favorite() {
        return tv_home_favorite;
    }

    public void setTv_home_favorite(String tv_home_favorite) {
        this.tv_home_favorite = tv_home_favorite;
    }
}
