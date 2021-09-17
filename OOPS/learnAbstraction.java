package com.prathviraj;

public class learnAbstraction extends abstClass {

    @Override
    void fun() {
        System.out.println("Have to implement fun() in learnAbstraction Class because it is declared in abstract Class;");
    }
}

abstract class abstClass{
    abstract void fun();
    void unCleanFunction(){
        System.out.println("Function 'Defined' inside abstract class is called unclean function;");
    }
}
