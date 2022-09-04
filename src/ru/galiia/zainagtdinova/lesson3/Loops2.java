package ru.galiia.zainagtdinova.lesson3;

import java.util.Random;

public class Loops2 {

    static Random random = new Random();

    // Описание метода
    // МОДИФИКАТОР_ДОСТУПА(public/private/protected/default) ВИД_МЕТОДА(static/non-static) ТИП_ВОЗВРАЩАЕМОГО_ЗНАЧЕНИЯ ИМЯ_МЕТОДА
    // void - метод ничего не возвращает

    // 1 участник - несколько призов
    public static void findHappyWinners(String [] members, String [] prises) {

        for(String prise : prises) {
            int n = random.nextInt(4);
            System.out.println(prise + " получает " + members[n]);
        }
    }

    // 1 участник - только 1 приз
    public static void findWinners(String [] members, String [] prises) {
        String [] prises2 = {"макбук", "айфон", "бесплатная лотерея"};

        int [] winnerNumbers = new int[prises.length];
        for(int i = 0; i < winnerNumbers.length; i++){
            winnerNumbers[i] = winnerNumbers.length;
        }

        int priseNumber = 0;

        for(String prise : prises2) {
            int n = 0;
            boolean isWinnerNotFounded = true;
            while (isWinnerNotFounded) {
                n = random.nextInt(4);
                boolean isPreviousWinner = false;
                for (int i = 0; i < winnerNumbers.length; i++) {
                    if(n == winnerNumbers[i]){
                        isPreviousWinner = true;
                        break;
                    }
                }
                if(!isPreviousWinner) {
                    winnerNumbers[priseNumber] = n;
                    isWinnerNotFounded = false;
                    priseNumber++;
                }
            }

            System.out.println(prise + " получает " + members[n]);
        }
    }

    public static void main(String[] args) {

        String [] members = {"Галия", "Анелия", "Булат", "Ксюша"};
        String [] prises = {"1 млн руб", "$500 000 ", "бесплатная лотерея"};

        /* Бесконечный цикл

        Random random = new Random();
        while (true) {
            System.out.println(random.nextInt(4));
        }
        */

        findHappyWinners(members, prises);
        findHappyWinners(members, prises);
        findHappyWinners(members, prises);

        System.out.println();
        for(int i = 0; i < 3; i++) {
            findWinners(members, prises);
        }


    }
}
