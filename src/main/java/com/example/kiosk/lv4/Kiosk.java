package com.example.kiosk.lv4;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<Menu> menuCategory;
    private List<Menu> selectedCategory;
    private Scanner scanner;

    public Kiosk (List<Menu> menuCategory) {
        this.menuCategory = menuCategory;
    }
    public void start () {
        Scanner scanner = new Scanner(System.in); // 스캐너 선언
        // 반복문 시작
        mainloop:
        while (true) {
            System.out.println("번호를 입력하여 주문을 해주세요.\n" +
                    "[ MAIN MENU ]");
            for(int i=0; i<menuCategory.size(); i++) {
                System.out.println((i+1)+"." + menuCategory.get(i)); //오브젝트 상속
            }
            System.out.println("0. 종료 | 종료합니다.");
// 입력된 숫자에 따른 처리 | 정상 숫자 입력 - 출력, 종료, | 잘못된 입력 - 되돌아가기
            System.out.println("번호를 입력하세요: ");
            String input = scanner.nextLine();// 숫자를 입력 받기

            if ("0".equals(input)) {
                System.out.println("키오스크를 종료합니다.");
                break;
            }

            try{
                int number = Integer.parseInt(input);
                if (number > 0 && number <= menuCategory.size()) {
                    Menu selectedCategory = menuCategory.get(number - 1);
                    nextMenuSelect(scanner, selectedCategory);
                    break;
                } else {
                    System.out.println("다시 입력해주세요.");
                    continue;// 숫자 이외의 입력을 받았을 때 나오는 문구
                }
            } catch (NumberFormatException nfe) {
                System.out.println("숫자를 입력해주세요.");
                continue;
            }
        }

        scanner.close();// 프로그램을 종료
    }
    private void nextMenuSelect(Scanner scanner, Menu selectedCategory) {
        while(true) {
            selectedCategory.showMenuItem();
            System.out.println("0. 뒤로가기 | 메인 메뉴로 돌아가기.");
            System.out.println("번호를 입력하여 주문을 해주세요: ");
            String input = scanner.nextLine();// 숫자를 입력 받기

            if ("0".equals(input)) {
                System.out.println("메인 메뉴로 돌아갑니다.");
                break;
            }

            try{
                int number = Integer.parseInt(input); // 입력값 정수 변환
                List<MenuItem> items = selectedCategory.getMenuItems(); //Menu가 가진 List<MenuItem>을 반복문을 활용하여 햄버거 메뉴 출력
                if (number > 0 && number <= items.size()) {
                    MenuItem selectedItem = items.get(number - 1);
                    System.out.println("선택한 메뉴 : "+ items.get(number - 1));//콘솔에 햄버거 메뉴를 출력합니다.
                    return;
                } else {
                    System.out.println("다시 입력해주세요.");
                    continue;// 숫자 이외의 입력을 받았을 때 나오는 문구
                }
            } catch (NumberFormatException nfe) {
                System.out.println("숫자를 입력해주세요."); // 유효하지 않은 입력에 대해 오류 메시지를 출력합니다.
            }
        }
    }
}
