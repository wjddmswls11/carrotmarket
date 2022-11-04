package com.example.carrotmarket.around;

public class AroundDTO {
    private int around_img_first;
    private String around_txt_first;

    public AroundDTO(int around_img_first, String around_txt_first) {
        this.around_img_first = around_img_first;
        this.around_txt_first = around_txt_first;
    }

    public int getAround_img_first() {
        return around_img_first;
    }

    public void setAround_img_first(int around_img_first) {
        this.around_img_first = around_img_first;
    }

    public String getAround_txt_first() {
        return around_txt_first;
    }

    public void setAround_txt_first(String around_txt_first) {
        this.around_txt_first = around_txt_first;
    }
}
