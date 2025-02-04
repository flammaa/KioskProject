package com.example.kiosk.lv2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<MenuItem> menuItems = new ArrayList<>();

        // List 선언 및 초기화
        // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
// 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력

        while (true) {
            System.out.println("번호를 입력하여 주문을 해주세요.\n" +
                    "[ SHAKESHACK MENU ]\n");
            for(int i=0; i<menuItems.size(); i++) {
                System.out.println((i+1)+"." + menuItems.get(i)); //오브젝트 상속
            }
            System.out.println("0. 종료                   | 종료");
// 입력된 숫자에 따른 처리 | 정상 숫자 입력 - 출력, 종료, | 잘못된 입력 - 되돌아가기

            try {
                System.out.println("번호를 입력하세요: ");
                int input = scanner.nextInt();// 숫자를 입력 받기

                if (input == 0 ) {
                    System.out.println("키오스크를 종료합니다.");
                    break;
                } else if (input <= menuItems.size()) {
                    System.out.println("선택한 메뉴 : "+ menuItems.get(input - 1));
                    break;
                }  else {
                    System.out.println("다시 입력해주세요.");
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주세요.");
                scanner.nextLine();
            }
        }
       // 프로그램을 종료
        // 선택한 메뉴 : 이름, 가격, 설명
        scanner.close();
    }
}
