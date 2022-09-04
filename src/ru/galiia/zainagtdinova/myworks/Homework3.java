package ru.galiia.zainagtdinova.myworks;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        // Симуляция автомата с едой и напитками


        String [] items = {"Пепси", "Сендвич с курицей", "Шоколад"};

        int [] numbers = {3,2,5};
        int [] prices = {69, 150, 50};

        int balance = 0;

        // клиент вводит сумму денег
        // вводит номер товара

        // Автомат работает бесконечно пока не введут команду end
        // выход из бесконечного цикла

        Scanner scanner = new Scanner(System.in);
        boolean isWorking = true;

        while (isWorking) {

            System.out.println("Добро пожаловать! Что желаете? ");
            for (int i = 0; i < items.length; i++) {
                System.out.println(items[i] + " - кнопка " + (i + 1) + " (в наличии " + numbers[i] + " шт)");
            }
            System.out.println("Ваш баланс: " + balance);
            System.out.println();
            System.out.println("Доступные команды: ");
            System.out.println("buy - купить");
            System.out.println("add - пополнить баланс");
            System.out.println("cash - получить сдачу");
            System.out.println("end - выход");

            String command;

            System.out.print("Введите команду: ");

            command = scanner.next();
            System.out.println();
            switch (command) {
                case "buy":
                    System.out.print("Номер товара: ");
                    int num = scanner.nextInt();
                    System.out.println();
                    System.out.println("Вы выбрали: " + items[num - 1]);
                    System.out.print("Сколько? (введите количество товара):");
                    int count = scanner.nextInt();
                    System.out.println();
                    System.out.println("Проверка количества товара...");
                    if (count <= numbers[num - 1]) {
                        System.out.println("Доступно желаемое количество продукции. Подтвердить покупку?");
                        command = scanner.next();
                        if (command.equals("да")) {
                            int sum = count * prices[num - 1];
                            if (balance >= sum) {
                                balance -= sum;
                                System.out.println("Вы успешно купили: " + items[num - 1] + " " + numbers[num - 1] + " шт");
                                numbers[num-1] -=count;
                            } else {
                                int addMore = sum - balance;
                                   System.out.println("Недостаточно средств, внесите еще: " + addMore + " рублей");
                            }

                        }
                    }
                    break;
                case "add":
                    System.out.print("Сколько желаете внести? ");
                    int money = scanner.nextInt();
                    System.out.println();
                    balance += money;
                    System.out.println("Успешное пополнение");
                    break;
                case "cash":
                    System.out.print("Ваша сдача: " + balance+"\n");
                    balance = 0;
                    break;
                case "end":
                    isWorking = false;
                    System.out.print("Завершение покупок. Приходите еще!");
                    break;
                default:
                    System.out.println("Недопустимая команда\n");
                }
            System.out.println();

        }

        // клиент может: пополнять баланс - команда "add money" - 1
        // получить сдачу - команду "get cash" - 2
        // заказать товар - "buy" - 3

    }
}
