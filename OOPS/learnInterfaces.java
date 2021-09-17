package com.prathviraj;

public class learnInterfaces implements Car{
    boolean lightSwitch = false;

    @Override
    public void start() {
        System.out.println("New car is Starting!");

    }

    @Override
    public void switchLights() {
        if(!lightSwitch){
            lightSwitch = true;
            System.out.println("Lights Turning on!");
        }else{
            System.out.println("Lights Turning off!");
        }
    }

    @Override
    public void stop() {
        System.out.println("New car is Stopped!");
    }
}

interface Car {
    void start();
    void switchLights();
    void stop();
}
