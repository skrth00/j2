package com.command.simpleremote;
  
public class LightOnCommand implements Command {

  private Light light;//<---receiver랑연결이되죠
  public LightOnCommand(Light light)
  {
    this.light=light;
  }
  public void execute(){
  
    light.on();
    light.off();
  }
  
}