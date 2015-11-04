package com.command.undo;

 public class LightOffCommand implements Command {

  private Light light;//<---receiver�������̵���
  int level;
  
  public LightOffCommand(Light light)
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