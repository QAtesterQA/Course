package week2;

import week2.ArrayUtils;

import java.util.Random;
//«аполнить массив случайными значени€ми. Ќа четных индексах парные значени€, на нечетных непарные
public class ArrTask5 {
    public static void main(String[] args) {
        int size = 10;
        int range = 100;
        int[] mas1 = ArrayUtils.generateMas(size, range);

        int newRandom = 0;
        for (int i = 0; i < mas1.length; i += 2) {
            Random random = new Random();
            for (int a = 0; a < 1; a++) {
                newRandom = random.nextInt(100);
            }
            if (newRandom % 2 == 0) {
                mas1[i] = newRandom;
            } else {
                mas1[i] = newRandom + 1;
            }
        }
        for (int i = 1; i < mas1.length; i += 2) {
            Random random = new Random();
            for (int a = 0; a < 1; a++) {
                newRandom = random.nextInt(100);
            }
            if (newRandom % 2 == 0) {
                mas1[i] = newRandom + 1;
            } else {
                mas1[i] = newRandom;
            }
        }
        ArrayUtils.printArr(mas1);

    }
}