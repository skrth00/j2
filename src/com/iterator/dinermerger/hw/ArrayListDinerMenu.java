package com.iterator.dinermerger.hw;

import java.util.ArrayList;

public class ArrayListDinerMenu implements Menu {
    ArrayList menuItems;
 
    public ArrayListDinerMenu() {
        menuItems = new ArrayList();
    
        addItem("화채",
                "달콤하고 시원한 인기 메뉴", true, 2.99);
        addItem("감자탕",
                "돼지고기 살이 많이 붙은 뼈로만들어 맛이 좋은 인기메뉴", false, 2.99);
        addItem("김치찌개",
                "신선한 김치로 만든 대표 메뉴", true, 3.29);
    }
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if(menuItem.getVeget()){
          menuItems.add(menuItem);}
    }
    public ArrayList getMenuItems() {
        return menuItems;
    }
    public Iterator createIterator() {
        return new ArrayListDinerMenuIterator(menuItems);
    }
    public String toString() {
        return "Objectville Pancake House Menu";
    }
}