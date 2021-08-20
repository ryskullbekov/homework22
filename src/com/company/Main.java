package com.company;

public class Main {

    public static void main(String[] args) {

        String myinfo = addition("Баястан",18);
        System.out.println(myinfo);

        // Домашняя работа
//        int batar = 25;
//
//        if (batar <=20){
//            System.out.println("Зарядите телефон");
//        }
//        else if (batar == 100){
//            System.out.println("Телефон заряжен");
//        }
//        else{
//            System.out.println("Телефон в норме");
//        }


       final int age = 30;
       final int temp = 15;
        if (age > 10 && temp < 30 && temp > -20) {
            System.out.println("Можно гулять");
        }
        else if (age < 10 && temp > 0 && temp < 8){
            System.out.println("Можно гулять но не долго");
        }
        else if (age > 65 && temp < -10 && temp > 25){
            System.out.println("Лучше остаться дома");
        }
        else{
            System.out.println("Сидеть дома");
        }




       final String name = "Баястан";
        switch (name){
            case "Руслан":
                System.out.println("Это Руслан");
                break;
            case "Адыл":
                System.out.println("Это Адыл");
                break;
            case "Саня":
                System.out.println("Это Саня");
                break;
            default:
                System.out.println("Нету такого пользователя");
                break;
        }

    }
    public static String addition (String name,int age ) {
        final   String result = ("Меня зовут : " + name + " " + "Мне : " + age);
        return result;
    }

}
