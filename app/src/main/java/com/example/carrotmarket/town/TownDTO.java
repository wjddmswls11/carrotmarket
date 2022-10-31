package com.example.carrotmarket.town;

public class TownDTO {
    private int img_town_map, img_town_talk;
    private String tv_town_btn, tv_town_orange, tv_town_conten, tv_town_id, tv_town_load, tv_town_time, tv_town_question, tv_town_answer;

    public TownDTO(int img_town_map, int img_town_talk, String tv_town_btn, String tv_town_orange, String tv_town_conten, String tv_town_id, String tv_town_load, String tv_town_time, String tv_town_question, String tv_town_answer) {
        this.img_town_map = img_town_map;
        this.img_town_talk = img_town_talk;
        this.tv_town_btn = tv_town_btn;
        this.tv_town_orange = tv_town_orange;
        this.tv_town_conten = tv_town_conten;
        this.tv_town_id = tv_town_id;
        this.tv_town_load = tv_town_load;
        this.tv_town_time = tv_town_time;
        this.tv_town_question = tv_town_question;
        this.tv_town_answer = tv_town_answer;
    }

    public int getImg_town_map() {
        return img_town_map;
    }

    public void setImg_town_map(int img_town_map) {
        this.img_town_map = img_town_map;
    }

    public int getImg_town_talk() {
        return img_town_talk;
    }

    public void setImg_town_talk(int img_town_talk) {
        this.img_town_talk = img_town_talk;
    }

    public String getTv_town_btn() {
        return tv_town_btn;
    }

    public void setTv_town_btn(String tv_town_btn) {
        this.tv_town_btn = tv_town_btn;
    }

    public String getTv_town_orange() {
        return tv_town_orange;
    }

    public void setTv_town_orange(String tv_town_orange) {
        this.tv_town_orange = tv_town_orange;
    }

    public String getTv_town_conten() {
        return tv_town_conten;
    }

    public void setTv_town_conten(String tv_town_conten) {
        this.tv_town_conten = tv_town_conten;
    }

    public String getTv_town_id() {
        return tv_town_id;
    }

    public void setTv_town_id(String tv_town_id) {
        this.tv_town_id = tv_town_id;
    }

    public String getTv_town_load() {
        return tv_town_load;
    }

    public void setTv_town_load(String tv_town_load) {
        this.tv_town_load = tv_town_load;
    }

    public String getTv_town_time() {
        return tv_town_time;
    }

    public void setTv_town_time(String tv_town_time) {
        this.tv_town_time = tv_town_time;
    }

    public String getTv_town_question() {
        return tv_town_question;
    }

    public void setTv_town_question(String tv_town_question) {
        this.tv_town_question = tv_town_question;
    }

    public String getTv_town_answer() {
        return tv_town_answer;
    }

    public void setTv_town_answer(String tv_town_answer) {
        this.tv_town_answer = tv_town_answer;
    }
}
