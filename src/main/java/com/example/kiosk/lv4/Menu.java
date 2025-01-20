package com.example.kiosk.lv4;
//MenuItem 클래스를 관리하는 클래스. 예를 들어, 버거 메뉴, 음료 메뉴 등 각 카테고리 내에 여러 MenuItem을 포함합니다.
import java.util.ArrayList;
import java.util.List;

public class Menu {//Menu 클래스 생성
    private String menuCategory; //// 카테고리 필드선언
    private List<MenuItem> menuItems; //List<MenuItem> 관리하도록 변경
    private String selectedCategory;

    public Menu(String menuCategory) {
        this.menuCategory = menuCategory;
        this.menuItems = new ArrayList<>();
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;// List를 리턴하는 함수
    }

    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }



    public void showMenuItem() {
        System.out.printf("[ %s Menu ]\n", menuCategory);
        for(int i=0; i<menuItems.size(); i++) {
            MenuItem item = menuItems.get(i);
            System.out.println((i+1)+"." + menuItems.get(i)); //오브젝트 상속
        }
    }

    @Override //그냥 표시?
    public String toString() { //
        return menuCategory;
    }
}
