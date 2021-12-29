package com.company;
public class Main {
    public static void main(String[] args) {
        int clientDeviceYear = 2012;
        {
            if (clientDeviceYear >= 2015) {
                System.out.println("Приложение будет работать корректно для Android");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        {
            byte IOS = 0;
            {
                if (IOS == 1) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для IOS по ссылке");
                    {
                        int year = 2021;
                        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) ;
                        {
                            System.out.println(" 2021 год не является високосным");
                        }
                        {
                            int deliveryDistance = 20;
                            if (deliveryDistance < 20) {
                                System.out.println("Доставка занимает сутки");
                            } else {
                                if (deliveryDistance <= 60) {
                                    System.out.println("Доставка займет на сутки больше");
                                } else {
                                    if (deliveryDistance > 20 && deliveryDistance > 60 && deliveryDistance >= 100) ;
                                    System.out.println("Доставка еще на одни сутки больше");
                                }
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
                    }
                }
            }
        }
    }
}

