package com.example.carrotmarket.around;

public class AroundDTO3 {
    private int around_coupon, around_coupon_perimgper, popup_coupon;
    private String around_coupon_shopname, around_coupon_distance, arouond_coupon_info, around_coupon_person, coupon_guest, coupon_review;

    public AroundDTO3(int around_coupon, int around_coupon_perimgper, int popup_coupon, String around_coupon_shopname, String around_coupon_distance, String arouond_coupon_info, String around_coupon_person, String coupon_guest, String coupon_review) {
        this.around_coupon = around_coupon;
        this.around_coupon_perimgper = around_coupon_perimgper;
        this.popup_coupon = popup_coupon;
        this.around_coupon_shopname = around_coupon_shopname;
        this.around_coupon_distance = around_coupon_distance;
        this.arouond_coupon_info = arouond_coupon_info;
        this.around_coupon_person = around_coupon_person;
        this.coupon_guest = coupon_guest;
        this.coupon_review = coupon_review;
    }

    public int getAround_coupon() {
        return around_coupon;
    }

    public void setAround_coupon(int around_coupon) {
        this.around_coupon = around_coupon;
    }

    public int getAround_coupon_perimgper() {
        return around_coupon_perimgper;
    }

    public void setAround_coupon_perimgper(int around_coupon_perimgper) {
        this.around_coupon_perimgper = around_coupon_perimgper;
    }

    public int getPopup_coupon() {
        return popup_coupon;
    }

    public void setPopup_coupon(int popup_coupon) {
        this.popup_coupon = popup_coupon;
    }

    public String getAround_coupon_shopname() {
        return around_coupon_shopname;
    }

    public void setAround_coupon_shopname(String around_coupon_shopname) {
        this.around_coupon_shopname = around_coupon_shopname;
    }

    public String getAround_coupon_distance() {
        return around_coupon_distance;
    }

    public void setAround_coupon_distance(String around_coupon_distance) {
        this.around_coupon_distance = around_coupon_distance;
    }

    public String getArouond_coupon_info() {
        return arouond_coupon_info;
    }

    public void setArouond_coupon_info(String arouond_coupon_info) {
        this.arouond_coupon_info = arouond_coupon_info;
    }

    public String getAround_coupon_person() {
        return around_coupon_person;
    }

    public void setAround_coupon_person(String around_coupon_person) {
        this.around_coupon_person = around_coupon_person;
    }

    public String getCoupon_guest() {
        return coupon_guest;
    }

    public void setCoupon_guest(String coupon_guest) {
        this.coupon_guest = coupon_guest;
    }

    public String getCoupon_review() {
        return coupon_review;
    }

    public void setCoupon_review(String coupon_review) {
        this.coupon_review = coupon_review;
    }
}
