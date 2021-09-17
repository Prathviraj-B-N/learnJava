package com.prathviraj;

public class Main {

    public static void main(String[] args) {

        //Abstraction
        learnAbstraction abs = new learnAbstraction();
        abs.fun();
        abs.unCleanFunction();

        //Interface - Pure abstraction
        //Interface has no option for unclean Function
        //Java dosent allow multiple inheritance , so interfaces is used
        learnInterfaces inf = new learnInterfaces();
        inf.start();
        inf.switchLights();
        inf.switchLights();
        inf.stop();
    }
}
