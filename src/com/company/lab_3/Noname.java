package com.company.lab_3;

public class Noname {
    static int one=10;
    static int two;
    static {
        two=2*one;
    }
    static int demoOne(){
        return one+two;
    }
    static int demoTwo(){
        return demoOne()*2;

    }
}
