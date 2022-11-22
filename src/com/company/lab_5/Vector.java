package com.company.lab_5;

import java.util.Random;
 class Vector extends Demo{
     private double x;
     private double y;
     private double z;



     Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
     Vector(double lend){
         this.x=this.y=this.z=lend;
     }
     Vector(Vector vector){
         this.x=vector.x;
         this.y=vector.y;
         this.z=vector.z;
     }
     Vector(){}






    //перевизначиний
    void vectorAp(int n){//просто шось робе
        System.out.println("Vector("+(x+n)+";"+(y+n)+";"+(z+n)+")");
    }
    void vectorAp(double n){//просто шось робе 2
        System.out.println("Vector("+(x+n)+";"+(y+n)+";"+(z+n)+")");
    }

    final void hello(){
        System.out.println("hello");
    }

    void present(){//статине імя динамічна логіка
        System.out.println("Привіт я вектор з кординатами:("+x+";"+y+";"+z+")");
    }


     public double getX() {
         return x;
     }

     public double getY() {
         return y;
     }

     public double getZ() {
         return z;
     }

     public void setX(double x) {
         this.x = x;
     }

     public void setY(double y) {
         this.y = y;
     }

     public void setZ(double z) {
         this.z = z;
     }
 }
