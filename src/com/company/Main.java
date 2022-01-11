package com.company;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        byte IOS = 0;
        byte Android = 1;
        if (IOS == 1) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
        // Задание 2
        int clientDeviceYearAndroid = 2012;
        int clientDeviceYearIOS = 2013;
        int clientIOS = 0;
        int clientAndroid = 1;
        if (clientDeviceYearAndroid <= 2015 && clientAndroid == 0) {
            System.out.println("Приложение будет работать корректно для Android");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientDeviceYearIOS <= 2015 && clientIOS == 1) {
            System.out.println("Приложение будет работать корректно для IOS");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        // Задание 3
        int year = 2021;
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }

        // Задание 4
        int deliveryDistance = 20;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется 1 день доставки");
        }
        if (deliveryDistance <= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется 2 дня доставки");
        }
        if (deliveryDistance > 20 && deliveryDistance < 60 && deliveryDistance <= 100) ;
        System.out.println("Потребуется 3 дня доставки");

        // Задание 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}















