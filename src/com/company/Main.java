package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("1. Создать и проинициализировать массив из 10 любых чисел. ");
        System.out.println("Вывести все элементы массива на экран с помощью цикла while.");
        System.out.println();
        int b = 0;

        int[] a = {15, 453, 3, 4, 5, 6, 7, 8, 9, 10};
        while (b < a.length) {
            System.out.print(b + " ");
            b++;
        }
        System.out.println();
        System.out.println();
        System.out.println("2. Создать 2-мерный массив размерностью 2 на 4 элементов. Заполнить его");
        System.out.println("любыми числами и вывести в консоль. Транспонировать массив (т. е. как бы");
        System.out.println("повернуть его на 90 градусов - массив уже будет размерностью 4 на 2) и");
        System.out.println("вывести на экран.");
        System.out.println();
        int[][] a1 = {{0, 1, 2, 3},
                      {4, 5, 6, 7}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a1[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a1[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("3. В проекте с коробками рассчитайте полную площадь поверхности коробки.");
    }
}
