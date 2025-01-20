package com.example.kiosk.lv3;


public class MenuItem {
    private String name;
    private Double price;
    private String description;
    // 이름 가격 설명 필드
    //생성자
    public MenuItem(String name, Double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override //그냥 표시?
    public String toString() { //
        return name + " | 가격: " + price + " | 설명: " + description;
    }
}
