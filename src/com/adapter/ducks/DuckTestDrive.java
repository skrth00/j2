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
  turkeyAdapter.quack(); //특징 duck의 함수를 불렀는데 turkey의 함수인 gobble이 불린다.
  turkeyAdapter.fly();
 }
}