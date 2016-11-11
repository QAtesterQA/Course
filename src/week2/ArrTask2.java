package week2;

import week2.ArrayUtils;

import java.util.Scanner;
//Поменять местами наибольший и наименьший элементы в массиве

public class ArrTask2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int size = sc1.nextInt();
        int range = sc1.nextInt();
        int[] mas = ArrayUtils.generateMas(size, range);
        ArrayUtils.printArr(mas);

        System.out.println("First Mas element " + mas[0]);
        System.out.println("Last mas element " + mas[mas.length - 1]);

        int temporary = mas[0];
        mas [0] = mas [mas.length-1];
        mas [mas.length-1] = temporary;

        System.out.println("First Mas element replaced " + mas[0]);
        System.out.println("Last mas element replaced " + mas[mas.length - 1]);

    }
}
