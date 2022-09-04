package ru.galiia.zainagtdinova.lesson2;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String key = scanner.next();

        switch (key){
            case "1":
                System.out.println("Кнопка 1");
                break;
            case "2":
                System.out.println("Кнопка 2");
                break;
            default:
                System.out.println("Нет такой кнопки");

        }

        if(key.equals("1")){
            System.out.println("Кнопка 1");
        } else if(key.equals("2")) {
            System.out.println("Кнопка 2");
        } else {
            System.out.println("Нет такой кнопки");
        }



    }
}
