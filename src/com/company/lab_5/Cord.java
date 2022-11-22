package com.company.lab_5;

class Cord extends Vector {

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

//    void hello(){
//        System.out.println("hello");
//    }

    void present() {//статине імя динамічна логіка
        System.out.println("Привіт я точка з кординатами:(" + getX() + ";" + getY() + ";" + getZ() + ")");
    }

    void present(int q) {//статине імя динамічна логіка
        System.out.println("Привіт я точка з кординатами:(" + (q+getX()) + ";" + getY() + ";" + getZ() + ")");
    }

    void cordAp(double n) {
        super.vectorAp(n);
    }

//    void hello(){
//
//    }




//    double distanceFoPoint(Cord point1) {//відстань до точки
//        return Math.sqrt(Math.pow(getX() - point1.getX(), 2) + Math.pow(getY() - point1.getY(), 2) + Math.pow(getZ() - point1.getZ(), 2));
//    }





}
