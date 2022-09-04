package ru.galiia.zainagtdinova.lesson3;

public class LoopsExtraExamples {

    final static String [] COLORS = {"Красный", "Желтый", "Зеленый"};
    final static int [] timers = {20, 3, 20};

    public static void main(String[] args) throws InterruptedException {
        System.out.println("1");
        // Задержка программы на 5 секунд
        Thread.sleep(5000);
        System.out.println("2");

        //Светофор

        int i = 0;
        for(int j = 0; j < 10; j++) {
            for (String color : COLORS) {
                System.out.println(color);
                Thread.sleep(timers[i] * 1000L);
                i++;
            }
        }
    }
}
