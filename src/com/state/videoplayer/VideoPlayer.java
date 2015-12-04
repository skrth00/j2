package com.state.videoplayer;

public class VideoPlayer {
 
State displayOffState; 
State playStopState;
State playState;
 
 State state = displayOffState;
 int count = 0;
 
 public VideoPlayer(int number) {
  displayOffState = new DisplayOffState(this);
  playStopState = new PlayStopState(this);
  playState = new PlayState(this);


  this.count = number;
   if (number==3) {
  state = displayOffState;
  } 
    if (number== 2) {
  state = playStopState;
  } 
     if (number== 1) {
  state = playState;
  } 
 }
 
 public void playStop(){
   state.playStop();
 }
 public void displaySleepOn(){state.displaySleepOn();}
 public void displaySleepOff(){state.displaySleepOff();}
 public void display(){state.display();}
 

 void setState(State state) {
  this.state = state;
 }
 
// void releaseBall() {
  //System.out.println("A gumball comes rolling out the slot...");
  //if (count != 0) {
 //  count = count - 1;
 // }
// }
 
 int getCount() {
  return count;
 }
 
 //void refill(int count) {
 // this.count = count;
 // state = noQuarterState;
 //}

    public State getState() {
        return state;
    }

    public State getDisplayOffState() {
        return displayOffState;
    }

    public State getPlayStopState() {
        return playStopState;
    }

    public State getPlayState() {
        return playState;
    }

   
   
 
/* public String toString() {
  StringBuffer result = new StringBuffer();
  result.append("\nMighty Gumball, Inc.");
  result.append("\nJava-enabled Standing Gumball Model #2004");
  result.append("\nInventory: " + count + " gumball");
  if (count != 1) {
   result.append("s");
  }
  result.append("\n");
  result.append("Machine is " + state + "\n");
  return result.toString();
 }*/
}