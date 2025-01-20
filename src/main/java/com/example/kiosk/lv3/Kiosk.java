package com.example.kiosk.lv3;
//**`Kiosk` 클래스 생성하기**
// **설명**: 키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리하는 클래스입니다.
import java.util.*;
public class Kiosk {
    private List menuItems;
     public Kiosk (List<MenuItem> menuItems) { //`List<MenuItem> menuItems` 는 `Kiosk` 클래스 생성자를 통해 값을 할당합니다.
        this.menuItems = menuItems;
    }// `MenuItem`을 관리하는 리스트가 필드로 존재합니다.
    public void start () {
        Scanner scanner = new Scanner(System.in);
        //입력과 반복문 로직
        while (true) {
            System.out.println("번호를 입력하여 주문을 해주세요.\n" +
                    "[ SHAKESHACK MENU ]\n");
            for(int i=0; i<menuItems.size(); i++) {
                System.out.println((i+1)+"." + menuItems.get(i)); //오브젝트 상속
            }
            System.out.println("0. 종료 | 종료합니다.");

            System.out.println("번호를 입력하세요: ");// 사용자의 입력을 받아 메뉴를 선택하거나 프로그램을 종료합니다.

            String input = scanner.nextLine();// 숫자를 입력 받기

            if ("0".equals(input) ) {
                System.out.println("키오스크를 종료합니다.");
                break;
            }// `0`을 입력하면 프로그램이 ‘뒤로가기’되거나 ‘종료’됩니다.

            try{
                int number = Integer.parseInt(input);
                if (number > 0 && number <= menuItems.size()) {
                    System.out.println("선택한 메뉴 : "+ menuItems.get(number - 1));//콘솔에 햄버거 메뉴를 출력합니다.
                    break;
                } else {
                    System.out.println("다시 입력해주세요.");
                    continue;// 숫자 이외의 입력을 받았을 때 나오는 문구
                }
            } catch (NumberFormatException nfe) {
                System.out.println("숫자를 입력해주세요.");
                continue; // 유효하지 않은 입력에 대해 오류 메시지를 출력합니다.
            } finally {
                // 3. 예외의 발생 여부와 상관없이, 실행시켜야 하는 코드가 들어갑니다.
                // 무조건 실행되는 코드가 들어가는 블럭입니다.
                System.out.println("입력하신 숫자는 : " + input + "입니다. ");
            }
        }
        // 프로그램을 종료
        // 선택한 메뉴 : 이름, 가격, 설명
        scanner.close();
    }
}

/// `main` 함수에서 관리하던 입력과 반복문 로직은 이제 `start` 함수를 만들어 관리합니다.

//`Kiosk` 객체를 생성하고 사용하는 `main` 함수에서 객체를 생성할 때 값을 넘겨줍니다.

//키오스크 프로그램을 시작하는 메서드가 구현되어야 합니다.



