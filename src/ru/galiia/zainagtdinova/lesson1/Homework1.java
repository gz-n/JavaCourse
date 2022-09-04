package ru.galiia.zainagtdinova.lesson1;

import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ввод 2-х чисел
        System.out.print("Введите a: ");
        int a = scanner.nextInt();
        System.out.print("Введите b: ");
        int b = scanner.nextInt();
        // Ввод какой знак-оператор + - . *?
        System.out.print("Введите знак оператора (+ - * /): ");
        String oper = scanner.next();

        // Условие через if-else

        if(oper.equals("+")){
            System.out.println(a + b);
        }
        // Вывод результат операции
    }
}
