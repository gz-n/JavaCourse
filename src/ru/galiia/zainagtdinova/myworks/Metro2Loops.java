package ru.galiia.zainagtdinova.myworks;

import java.util.Scanner;

public class Metro2Loops {

    final static int PRICE = 30;

    public static void main(String[] args) {
        System.out.println("Введите монетки: ");
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();

        System.out.println("Введите количество жетонов (1 жетон = 30 руб): ");
        int number = scanner.nextInt();

        if(money >= PRICE){
            if(number == 1) {
                System.out.println("Получите 1 жетон");
            } else if(money >= number * PRICE){
                System.out.println("Получите " + number + " жетонов");
            } else {
                System.out.println("Недостаточно средств на " + number + " жетонов");
                // выяснить на сколько жетонов хватает покупателю
                // через ЦИКЛ
                boolean isNotCalculated = true;
                int n = number - 1;
                while (isNotCalculated) {
                    if(money >= n * PRICE) {
                        isNotCalculated = false;
                    } else n--;
                }
                System.out.println("Вы можете купить " + n + " жетонов");
                // написать сколько сдачи выдает
                System.out.println("Ваша сдача: " + (money - n * PRICE));
            }
        } else {
            System.out.println("Недостаточно монет");
        }
    }
}
