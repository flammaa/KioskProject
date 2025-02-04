package com.example.kiosk.lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("번호를 입력하여 주문을 해주세요.\n" +
                    "[ SHAKESHACK MENU ]\n" +
                    "1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거\n" +
                    "2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거\n" +
                    "3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거\n" +
                    "4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거\n" +
                    "0. 종료                   | 종료");

            int firstFunc = sc.nextInt();

            if (firstFunc == 0 ) {
                System.out.println("프로그램을 종료합니다.");
                 return;
            } else if (firstFunc ==1 ) {
                System.out.println("ShackBurger(을)를 선택하였습니다.");
            } else if (firstFunc ==2 ) {
                System.out.println("SmokeShack(을)를 선택하였습니다.");
            } else if (firstFunc ==3 ) {
                System.out.println("Cheeseburger(을)를 선택하였습니다.");
            } else if (firstFunc == 4 ) {
                System.out.println("Hamburger (을)를 선택하였습니다.");
            } else {
                System.out.println("다시 입력해주세요.");
                continue;
            }
        }
    }
}