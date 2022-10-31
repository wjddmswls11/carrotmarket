package com.example.carrotmarket.around;

public class AroundDTO2 {
    private int store1_1, store1_2;
    private String around_storename, store_info, store_distance, store_review1, store_custom, store_guest, store_review2;

    public AroundDTO2(int store1_1, int store1_2, String around_storename, String store_info, String store_distance, String store_review1, String store_custom, String store_guest, String store_review2) {
        this.store1_1 = store1_1;
        this.store1_2 = store1_2;
        this.around_storename = around_storename;
        this.store_info = store_info;
        this.store_distance = store_distance;
        this.store_review1 = store_review1;
        this.store_custom = store_custom;
        this.store_guest = store_guest;
        this.store_review2 = store_review2;
    }

    public int getStore1_1() {
        return store1_1;
    }

    public void setStore1_1(int store1_1) {
        this.store1_1 = store1_1;
    }

    public int getStore1_2() {
        return store1_2;
    }

    public void setStore1_2(int store1_2) {
        this.store1_2 = store1_2;
    }

    public String getAround_storename() {
        return around_storename;
    }

    public void setAround_storename(String around_storename) {
        this.around_storename = around_storename;
    }

    public String getStore_info() {
        return store_info;
    }

    public void setStore_info(String store_info) {
        this.store_info = store_info;
    }

    public String getStore_distance() {
        return store_distance;
    }

    public void setStore_distance(String store_distance) {
        this.store_distance = store_distance;
    }

    public String getStore_review1() {
        return store_review1;
    }

    public void setStore_review1(String store_review1) {
        this.store_review1 = store_review1;
    }

    public String getStore_custom() {
        return store_custom;
    }

    public void setStore_custom(String store_custom) {
        this.store_custom = store_custom;
    }

    public String getStore_guest() {
        return store_guest;
    }

    public void setStore_guest(String store_guest) {
        this.store_guest = store_guest;
    }

    public String getStore_review2() {
        return store_review2;
    }

    public void setStore_review2(String store_review2) {
        this.store_review2 = store_review2;
    }
}
