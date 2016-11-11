package week2;

import week2.ArrayUtils;

import java.util.Random;
import java.util.Scanner;
//Посчитать сколько цифр(цифра задается пользователем) в массиве
public class ArrTask4 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int size = sc1.nextInt();
        int range = sc1.nextInt();
        int[] mas1 = ArrayUtils.generateMas(size, range);
        ArrayUtils.printArr(mas1);
        int userNum = 0;
        Random random = new Random();
        for (int i = 0; i < 1; i++) {
            userNum = random.nextInt(10);
        }
        System.out.println("User num " + userNum);

        int numeralCount = 0;
        for (int i = 0; i <= mas1.length-1; i++) {
            if (mas1[i] == userNum) {
                numeralCount++;
            }
        }
        System.out.println(numeralCount);
    }
}