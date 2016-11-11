package week2;

import week2.ArrayUtils;

//Вывести в консоль элементы той половины одномерного массива у которой среднее арифметическое максимальное
public class ArrTask7 {
    public static void main(String[] args) {
        int size = 10;
        int range = 10;
        int sum1 = 0;
        int sum2 = 0;
        int average1;
        int average2;
        int[] mas1 = ArrayUtils.generateMas(size, range);
        ArrayUtils.printArr(mas1);

        for (int i = 0; i < mas1.length / 2; i++) {
            sum1 = sum1 + mas1[i];
        }
        average1 = sum1 / (mas1.length / 2);

        for (int i = (mas1.length / 2); i < mas1.length; i++) {
            sum2 = sum2 + mas1[i];
        }
        average2 = sum2 / (mas1.length / 2);

        if (average1 > average2) {
            System.out.println("Average 1 = " + average1);
        } else if (average2 > average1){
            System.out.println("Average 2 = " + average2);
        } else {
            System.out.println("They are equal = " + average1);
        }
    }
}
