package com.facade.hometheater.simple;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
      
        Amplifier amp ;
        amp=new Amplifier();
        Tuner tuner = new Tuner("My AM/FM Tuner", amp);
        DvdPlayer dvd = new DvdPlayer("My DVD Player", amp);
        Projector projector = new Projector("My Projector", dvd);
 
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, projector);
        homeTheater.watchMovie("My Movie Watching...");
        homeTheater.endMovie();
    }
}