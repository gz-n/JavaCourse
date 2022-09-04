package ru.galiia.zainagtdinova.lesson2;

import java.util.Scanner;

public class Metro {

    final static int PRICE = 30;

    public static void main(String[] args) {
        System.out.println("Введите монетки: ");
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();

        if(money >= PRICE){
            System.out.println("Получите жетон");
        } else {
            System.out.println("Недостаточно монет");
        }

    }
}
