package com.company.lab_5;

public class Dispetchering {
    Vector ve = new Vector(10,20,30);
    Cord co = new Cord(ve.getX(),ve.getY(),ve.getZ());

    Vector vector;

    void menu(int i){
        if(i==1){
            vector=ve;
            vector.present();
        }else {
            vector=co;
            vector.present();
        }
    }



}
