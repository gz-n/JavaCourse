package ru.galiia.zainagtdinova.lesson2;

import java.util.Scanner;

public class Metro2 {

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

        // Примеры конструкции IF

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // ЛОГИЧЕСКИЕ ОПЕРАТОРЫ
        // И & - оба условия выполняются && - ленивая проверка
        // ИЛИ | ||
        if(a == 5 & b == 7) {
            System.out.println("выполнены оба условия");
        }

        // ленивая проверка: если a не равно 5, то второе условие проверяться не будет
        if(a == 5 && b == 7) {
            System.out.println("выполнены оба условия");
        }

        if(a != 0) {
            System.out.println("а не равно 0");
        }

        boolean s = a != 5;

        if(!s){
            System.out.println("а равно 5");
        }

    }
}
