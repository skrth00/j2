package com.command.undo;

 public class Light{
  int level;
  String location;
  
  public Light(String location){
  this.location=location;
  }//»ý¼ºÀÚ
  
  
  public void on()
  {
    level=100;
    System.out.println("Light is On");
  }
  public void off()
  {
    level=0;
    System.out.println("Light is Off");
  }
  public void dim(int level)
  {
    this.level=level;
    if(level==0)
    {
      off();
    }
    else
    {
      System.out.println("Light is dimmed to"+level);
    }
  }
  public int getLevel()
  {
  return level;
  }
}