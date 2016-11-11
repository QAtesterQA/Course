package week2;

import week2.ArrayUtils;

import java.util.Arrays;
import java.util.Scanner;
//Заданы два массива одинаковой длинны с любыми значениями скопировать данные из первого массива во второй
public class ArrTask3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int size = sc1.nextInt();
        int range = sc1.nextInt();
        int[] mas1 = ArrayUtils.generateMas(size, range);
        ArrayUtils.printArr(mas1);

        int[] mas2 = ArrayUtils.generateMas(size, range);
        ArrayUtils.printArr(mas2);
        mas2 = Arrays.copyOf(mas1, mas1.length);
        ArrayUtils.printArr(mas2);

//        for (int i = 0; i <=mas1.length-1 ; i++) {
//            mas2[i]=mas1[i];
//        }

    }
}
