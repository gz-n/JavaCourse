package ru.galiia.zainagtdinova.lesson2;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // 0 1 3    4 5
        // 1 2 5453 5 55

        // ТИП [] НАЗВАНИЕ МАССИВА
        int [] array;
        array = new int[6];
        System.out.println(array.length);

        array[0] = 1;
        array[1] = 2;
        array[2] = 5453;

        /*
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }*/

        //Цикл со счетчиком
        for(int i = 0; i < array.length; i++) {
            try {
                System.out.print(array[i] + " ");
            } catch (ArrayIndexOutOfBoundsException e) {

            }
        }

        System.out.println();

        // ТИП  НАЗВАНИЕ МАССИВА []
        int arr2 [] = {1,3,4};
        int i = 0;
        while (i < arr2.length){
            System.out.print(arr2[i] + " ");
            i++;
        }

        System.out.println();

        for(int j = 10; j >= 0; j--){
            if(j == 0) {
                System.out.println("Пуск!");
            } else System.out.println(j);
        }

        System.out.println();

        for (int j = arr2.length - 1; j >= 0; j--){
            System.out.println(arr2[j]);
        }

        System.out.println();

        for (int j = arr2.length - 1; j >= 0; j--){
            if(arr2[j] % 2 == 0)
                System.out.println(arr2[j]);
        }

    }
}
