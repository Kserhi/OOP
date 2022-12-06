package com.company.lab_6;


//Ctrl + Alt + L # formating text
public class Main {
    public static void main(String[] args) {
        Cord cord = new Cord(1, 2, 3);

        /////////////////////////////////////////
        Vector vector = new Vector(1, 2, 3);

        ////////////////////////////////////////
        Teachers teachers = new Teachers(14, "Програміст", "petor", 14, 75);

        ////////////////////////////////////////

        //Mathematics mathematics = new Mathematics(12, "andriu", 33, 242);

        //2. Проаналізувати код існуючої програми. Знайти місця викликів методів або змінних з інших класів через
        // створений екземпляр класу (крім вкладених класів) та переписати ці виклики із використання
        // ключового слова «super».

        cord.present();


        System.out.println();

        //3. Створити у існуючій ієрархії наслідування класів по одному перевизначе-ному
        // та одному перевантаженому методу.
        cord.present();


        System.out.println();



//        Dispetchering dispetchering=new Dispetchering();
//        dispetchering.menu(1);
//        dispetchering.menu(2);

    }

}







