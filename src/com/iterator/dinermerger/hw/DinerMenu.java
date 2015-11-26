package com.iterator.dinermerger.hw;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 3;
    int numberOfItems = 0;
    MenuItem[] menuItems;
  
    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
 
        addItem("�߰���",
                "�ߴٸ���� ������ ����� ������ ��ȭ", false, 2.99);
        addItem("������",
                "���� ���� ���� ���θ���� ���� ���� �α�޴�", false, 2.99);
   
        addItem("��ġ�",
                "�ż��� ��ġ�� ���� ��ǥ �޴�", true, 3.29);
       
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