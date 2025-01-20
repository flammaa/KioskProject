package com.example.kiosk.lv4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Menu 객체 생성을 통해 이름 설정
        Menu burgers = new Menu("Burgers");
        burgers.addMenuItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Menu drinks = new Menu("Drinks");
        drinks.addMenuItem(new MenuItem("Coca Cola", 2.9, "코카콜라"));
        drinks.addMenuItem(new MenuItem("Coca Zero", 3.9, "코카콜라 제로"));
        drinks.addMenuItem(new MenuItem("Sprite", 2.9, "스프라이트"));
        drinks.addMenuItem(new MenuItem("MilkShake", 4.4, "밀크쉐이크"));

        Menu desserts = new Menu("Desserts");
        desserts.addMenuItem(new MenuItem("VanillaIceCream", 1.9, "바닐라 아이스크림"));
        desserts.addMenuItem(new MenuItem("ChocolateIceCream", 1.9, "초콜릿 아이스크림"));
        desserts.addMenuItem(new MenuItem("ApplePie", 2.0, "애플파이"));
        desserts.addMenuItem(new MenuItem("Brownie", 2.4, "브라우니"));

        List<Menu> menuCategory = new ArrayList<>();// Menu 클래스 내 있는 List<MenuItem> 에 MenuItem 객체 생성하면서 삽입
        menuCategory.add(burgers);
        menuCategory.add(drinks);
        menuCategory.add(desserts);


// 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력

        Kiosk kiosk = new Kiosk(menuCategory);
        kiosk.start();
    }
}
