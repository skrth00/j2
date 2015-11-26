package com.iterator.dinermerger.hw;

import java.util.ArrayList;

public class ArrayListDinerMenu implements Menu {
    ArrayList menuItems;
 
    public ArrayListDinerMenu() {
        menuItems = new ArrayList();
    
        addItem("ȭä",
                "�����ϰ� �ÿ��� �α� �޴�", true, 2.99);
        addItem("������",
                "������� ���� ���� ���� ���θ���� ���� ���� �α�޴�", false, 2.99);
        addItem("��ġ�",
                "�ż��� ��ġ�� ���� ��ǥ �޴�", true, 3.29);
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