package week2;

import week2.ArrayUtils;

import java.util.Scanner;
//Найти минимальное и максимальное значения в массиве и вывести их на консоль
public class ArrTask1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int size = sc1.nextInt();
        int range = sc1.nextInt();
        int [] mas = ArrayUtils.generateMas(size, range);
        ArrayUtils.printArr(mas);
        int min = 0; 
        int max = 0;
        for (int i = 0; i < mas.length ; i++) {
                if(max<mas[i])
                    max = mas[i];
                if(min>mas[i])
                    min = mas[i];

        }
        System.out.println("Min " + min);
        System.out.println("Max " + max);

    }
}
