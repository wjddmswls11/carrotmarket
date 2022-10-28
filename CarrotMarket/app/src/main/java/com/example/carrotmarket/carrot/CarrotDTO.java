package com.example.carrotmarket.carrot;

public class CarrotDTO {
    private int carrot_img_profile, carrot_favor;

    public CarrotDTO(int carrot_img_profile, int carrot_favor) {
        this.carrot_img_profile = carrot_img_profile;
        this.carrot_favor = carrot_favor;
    }


    public int getCarrot_img_profile() {
        return carrot_img_profile;
    }

    public void setCarrot_img_profile(int carrot_img_profile) {
        this.carrot_img_profile = carrot_img_profile;
    }

    public int getCarrot_favor() {
        return carrot_favor;
    }

    public void setCarrot_favor(int carrot_favor) {
        this.carrot_favor = carrot_favor;
    }
}
