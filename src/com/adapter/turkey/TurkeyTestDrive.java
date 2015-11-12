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
  duckAdapter.gobble(); //특징 turkey의 함수를 불렀는데 duck의 함수인 quack이 불린다.
  duckAdapter.fly();
 }
}