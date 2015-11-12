package com.adapter.turkey;

public class TurkeyTestDrive {
 public static void main(String[] args) {
   MallardDuck duck = new MallardDuck();
   WildTurkey turkey = new WildTurkey();
   DuckAdapter duckAdapter=new DuckAdapter(duck);

   System.out.println("The Duck says...");
  duck.quack();
  duck.fly();
    System.out.println("The Duck Adapter says...");
  duckAdapter.gobble(); //Ư¡ turkey�� �Լ��� �ҷ��µ� duck�� �Լ��� quack�� �Ҹ���.
  duckAdapter.fly();
 }
}