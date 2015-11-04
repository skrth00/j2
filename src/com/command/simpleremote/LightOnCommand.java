package com.command.simpleremote;
  
public class LightOnCommand implements Command {

  private Light light;//<---receiver�������̵���
  public LightOnCommand(Light light)
  {
    this.light=light;
  }
  public void execute(){
  
    light.on();
    light.off();
  }
  
}