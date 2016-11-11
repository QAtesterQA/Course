package week2;

import week2.ArrayUtils;

//Найти среднее арифметическое массива
public class ArrTask6 {
    public static void main(String[] args) {
        int size = 10;
        int range = 10;
        int sum = 0;
        int average1;
        int average2;
        int[] mas1 = ArrayUtils.generateMas(size, range);
        ArrayUtils.printArr(mas1);

        for (int i = 0; i < mas1.length; i++) {
            sum = sum + mas1[i];
        }
        average1 = sum / mas1.length;
        average2 = sum % mas1.length;
        System.out.println("Average = " + average1 + "." + average2);

    }
}
