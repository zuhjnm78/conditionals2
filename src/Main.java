import java.time.LocalDate;

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

        int clientOS = 0;
        int clientDeviceYear = 2015;
        int currentYear = 2023;
        if (clientDeviceYear < currentYear) {
            if (clientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS.");
            } else if (clientOS == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            } else if (clientOS == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android.");
            } else if (clientOS == 1 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            } else if (clientOS != 0 && clientOS != 1) {
                System.out.println("Ошибка: неверный тип операционной системы.");
            } else {
                System.out.println("Устройство не нуждается в обновлении.");
            }
        }
    }

    public static void task3() {

        System.out.println("Задача 3");

        // Пишем код для задачи 3

        int year = 2021;
        int d = year % 4;
        if (d != 0 || year % 400 != 0 && year % 100 == 0) {
            System.out.println(year + " год не является високосным.");
        }
        else
            System.out.println(year + " год является високосным.");

    }

    public static void task4() {

        System.out.println("Задача 4");

        // Пишем код для задачи 4.

int diliveryDistance = 95;
if (diliveryDistance <= 20){
    System.out.println("Потребуется дней:  1 день.");
}
else if (diliveryDistance <=60){
    System.out.println("Потребуется дней:  2 дня.");
}
else if (diliveryDistance <= 100) {
    System.out.println("Потребуется дней:  3 дня.");
}
else
    System.out.println("Свыше 100 км доставки нет.");
    }


    public static void task5() {

        System.out.println("Задача 5");

        // Пишем код для задачи 5.

        int monthNumber = 12;
        switch (monthNumber){
            case 1:
            case 2:
                System.out.println("Месяц принадлежит к сезону зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц принадлежит к сезону весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц принадлежит к сезону лета.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц принадлежит к сезону осени.");
                break;
            case 12:
                System.out.println("Месяц принадлежит к сезону зимы.");
                break;
            default:
                break;




        }



    }
}