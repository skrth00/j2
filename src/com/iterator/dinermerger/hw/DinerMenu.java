package com.iterator.dinermerger.hw;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 3;
    int numberOfItems = 0;
    MenuItem[] menuItems;
  
    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
 
        addItem("닭갈비",
                "닭다리살과 매콤한 양념의 적절한 조화", false, 2.99);
        addItem("감자탕",
                "살이 많이 붙은 뼈로만들어 맛이 좋은 인기메뉴", false, 2.99);
   
        addItem("김치찌개",
                "신선한 김치로 만든 대표 메뉴", true, 3.29);
       
 }
    public void addItem(String n, String d, boolean v, double p) {
        MenuItem menuItem = new MenuItem(n, d, v, p);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!  Can't add item to menu");
        } 
        else 
        {
         
          menuItems[numberOfItems] = menuItem;
          numberOfItems = numberOfItems + 1;
           
         
     
          }
        }
      

    
    public MenuItem[] getMenuItems() {
        return menuItems;
    }
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
    // other menu methods here
}