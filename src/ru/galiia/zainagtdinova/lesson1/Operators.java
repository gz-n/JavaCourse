package ru.galiia.zainagtdinova.lesson1;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        int a; // объявление переменной
        a = 5; // присваивание значения

        // Операторы: Сложение +, Вычитание - , Умножение *, Деление /

        a = 433543;
        int b = a + 545;
        int c = b - a;
        int a1 = a / c;
        double f1 = (double) a / c;

        int a2 = 9 % 2; // остаток от деления
        System.out.println(a2);

        a = 1;
        a = ++a + a;
        a++; // a = a + 1; a += 1; a += 5;

        System.out.println(a);

        // инкремент ++a a++
        // декремент --a a--

        // комбо операторы - оператор + присваивание
        a += 434; // a = a + 434;
        b -= 33;
        a /= 5;

        System.out.print("Введите число:");

        // Ввод и вывод

        // Ввод с помощью сканера
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();


        // Вывод в консоль
        System.out.println(q);

        // Логический оператор ==, присваивание =
        if(q == 5) {
            System.out.println("Да, это пять!");
        } else if(q == 7) {
            System.out.println("Да, это семь!");
        } else {
            System.out.println("Нет, это не пять и не семь!");
        }

        a = 1; // в двоичном виде 01
        b = a<<1; // 2 в двоичном виде 010

        a = 7; // 7 в двоичном виде 111
        System.out.println(a>>2); // 111 -> 1


        // Для вывода нескольких значений в println
        System.out.println(a + " " + b);

        boolean b2 = false;
        if (b2 = true){
            System.out.println(b2);
        }

        System.out.println("Введите текст: ");
        String text = scanner.next(); // одно слово
        System.out.println(text);

    }
}
