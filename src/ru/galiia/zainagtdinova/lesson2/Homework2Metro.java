package ru.galiia.zainagtdinova.lesson2;

import java.util.Scanner;

public class Homework2Metro {

    final static int PRICE = 30;

    public static void main(String[] args) {
        System.out.println("Введите монетки: ");
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();

        System.out.println("Введите количество жетонов: ");
        int number = scanner.nextInt();

        if(money >= PRICE){
            if(number == 1) {
                System.out.println("Получите 1 жетон");
            } else if(money >= number * PRICE){
                System.out.println("Получите " + number + " жетонов");
            } else {
                // выяснить на сколько жетонов хватает покупателю
                // через ЦИКЛ

                // написать сколько сдачи выдает
            }
        } else {
            System.out.println("Недостаточно монет");
        }
    }
}
