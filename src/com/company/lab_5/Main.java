package com.company.lab_5;


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
        cord.cordAp(1);

        System.out.println();

        //3. Створити у існуючій ієрархії наслідування класів по одному перевизначе-ному
        // та одному перевантаженому методу.
        cord.present();
        cord.present(1);

        System.out.println();



        Dispetchering dispetchering=new Dispetchering();
        dispetchering.menu(1);
        dispetchering.menu(2);

    }

}







