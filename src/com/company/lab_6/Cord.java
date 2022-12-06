package com.company.lab_6;

class Cord extends Vector implements DemoTwo {

    public Cord(double x, double y, double z) {
        super(x, y, z);
    }


    Cord(double x, double y) {
        super(x, y, (x + y) / 2);
    }

    public Cord(double lend) {
        super(lend);
    }

    public Cord(Cord cord) {
        super(cord);
    }

    public Cord() {
    }


    public void present() {//статине імя динамічна логіка
        System.out.println("Привіт я точка з кординатами:(" + getX() + ";" + getY() + ";" + getZ() + ")");
    }

    void present(int q) {//статине імя динамічна логіка
        System.out.println("Привіт я точка з кординатами:(" + (q+getX()) + ";" + getY() + ";" + getZ() + ")");
    }

    void cordAp(double n) {
        super.vectorAp(n);
    }

    public void hi(){

    }








}
