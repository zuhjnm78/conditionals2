public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();


    }

    public static void task1() {

        System.out.println("Задача 1");

        // Пишем код для задачи 1

        char clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");


        }
    }
    public static void task2() {

        System.out.println("Задача 2");

        // Пишем код для задачи 2

        char clientOS1 = 1;
        int clientDeviceYear = 2015;
        if (clientOS1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS1 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS1 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        else if (clientOS1 == 1 && clientDeviceYear < 2015)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
    }

    public static void task3() {

        System.out.println("Задача 3");

        // Пишем код для задачи 3

        int year = 2024;
        int d = year % 4;
        if (d != 0) {
            System.out.println(year + " год не является високосным.");
        }
        else
            System.out.println(year + " год является високосным.");

    }

    public static void task4() {

        System.out.println("Задача 4");

        // Пишем код для задачи 4


    }


    public static void task5() {

        System.out.println("Задача 5");

        // Пишем код для задачи 5



    }
}