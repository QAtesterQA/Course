package week2;

import week2.ArrayUtils;

//«адать два массива случайными числами от 25 до 75. ќпределить у какого из массивов больше парных елементов.
public class ArrTask9 {
    public static void main(String[] args) {
        int size = 10;
        int[] mas1 = ArrayUtils.generateMasTask9(size);
        int[] mas2 = ArrayUtils.generateMasTask9(size);
        System.out.println("Elements of mas1: ");
        ArrayUtils.printArr(mas1);
        System.out.println("Elements of mas2: ");
        ArrayUtils.printArr(mas2);

        int countMas1 = 0;
        int countMas2 = 0;

        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] % 2 == 0) {
                countMas1 = countMas1 + 1;
            }
        }

        for (int i = 0; i < mas2.length; i++) {
            if (mas2[i] % 2 == 0) {
                countMas2 = countMas2 + 1;
            }
        }
        if (countMas1 > countMas2) {
            System.out.println(countMas1 + " Even elements in mas1");
        } else if (countMas1 < countMas2) {
            System.out.println(countMas2 + " Even elements in mas2");
        } else {
            System.out.println("Same number of even elements (" + countMas1 + ") in both arrays ");

        }

    }
}



