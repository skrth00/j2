package com.command.undo;

 public class LightOnCommand implements Command {

  private Light light;//<---receiver랑연결이되죠
  int level;
  
  public LightOnCommand(Light light)
  {
    this.light=light;
  }
  public void execute(){
    level=light.getLevel();
    light.on();
    
  }
  public void undo()
  {
    
    light.dim(level);
  
  }
  
}