package com.example.carrotmarket.around;

public class AroundDTO5 {
    private int around_shopimg, around_shop_favimg;
    private String around_shop_shopname, around_shop_load, around_shop_product, around_shop_percent, around_shop_won, around_shop_like;

    public AroundDTO5(int around_shopimg, int around_shop_favimg, String around_shop_shopname, String around_shop_load, String around_shop_product, String around_shop_percent, String around_shop_won, String around_shop_like) {
        this.around_shopimg = around_shopimg;
        this.around_shop_favimg = around_shop_favimg;
        this.around_shop_shopname = around_shop_shopname;
        this.around_shop_load = around_shop_load;
        this.around_shop_product = around_shop_product;
        this.around_shop_percent = around_shop_percent;
        this.around_shop_won = around_shop_won;
        this.around_shop_like = around_shop_like;
    }

    public int getAround_shopimg() {
        return around_shopimg;
    }

    public void setAround_shopimg(int around_shopimg) {
        this.around_shopimg = around_shopimg;
    }

    public int getAround_shop_favimg() {
        return around_shop_favimg;
    }

    public void setAround_shop_favimg(int around_shop_favimg) {
        this.around_shop_favimg = around_shop_favimg;
    }

    public String getAround_shop_shopname() {
        return around_shop_shopname;
    }

    public void setAround_shop_shopname(String around_shop_shopname) {
        this.around_shop_shopname = around_shop_shopname;
    }

    public String getAround_shop_load() {
        return around_shop_load;
    }

    public void setAround_shop_load(String around_shop_load) {
        this.around_shop_load = around_shop_load;
    }

    public String getAround_shop_product() {
        return around_shop_product;
    }

    public void setAround_shop_product(String around_shop_product) {
        this.around_shop_product = around_shop_product;
    }

    public String getAround_shop_percent() {
        return around_shop_percent;
    }

    public void setAround_shop_percent(String around_shop_percent) {
        this.around_shop_percent = around_shop_percent;
    }

    public String getAround_shop_won() {
        return around_shop_won;
    }

    public void setAround_shop_won(String around_shop_won) {
        this.around_shop_won = around_shop_won;
    }

    public String getAround_shop_like() {
        return around_shop_like;
    }

    public void setAround_shop_like(String around_shop_like) {
        this.around_shop_like = around_shop_like;
    }
}
