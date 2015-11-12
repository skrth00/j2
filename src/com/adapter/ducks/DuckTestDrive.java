package com.adapter.ducks;

public class DuckTestDrive {
 public static void main(String[] args) {
   MallardDuck duck = new MallardDuck();
   WildTurkey turkey = new WildTurkey();
   TurkeyAdapter turkeyAdapter=new TurkeyAdapter(turkey);

   System.out.println("The Turkey says...");
  turkey.gobble();
  turkey.fly();
    System.out.println("The Turkey Adapter says...");
  turkeyAdapter.quack(); //Ư¡ duck�� �Լ��� �ҷ��µ� turkey�� �Լ��� gobble�� �Ҹ���.
  turkeyAdapter.fly();
 }
}