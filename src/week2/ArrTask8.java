package week2;

import week2.ArrayUtils;

import java.util.Scanner;
//Eсть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива, который получается в результате суммы arr1[i] + arr2[i]
public class ArrTask8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int range = input.nextInt();
        int index;
        int[] mas1 = ArrayUtils.generateMas(size, range);
        int[] mas2 = ArrayUtils.generateMas(size, range);
        int[] mas3 = new int[mas1.length];
        for (int i = 0; i < mas1.length; i++) {
            System.out.println(mas1[i]);
        }
        System.out.println("_________________");
        for (int i = 0; i < mas2.length; i++) {
            System.out.println(mas2[i]);
        }
        System.out.println("_________________");

        for (int i = 0; i < mas1.length; i++) {
            index = mas1[i] + mas2[i];
            mas3[i] = index;
        }
        System.out.println("Sum of two arrays in each cell");
        for (int i = 0; i < mas3.length; i++) {
            System.out.println(mas3[i]);
        }
    }
}
