package com.company.lab_6;


class Mathematics extends Teachers implements Demo.DemoThere {

    public Mathematics(int levelSkill, String name, int age, double weight) {
        super(levelSkill, name, age, weight);
        setProfession("Матиматик(чка)");
    }


    @Override
    public void hello() {

    }

}




