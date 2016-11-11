package week2;

public class ArrayUtils {

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] generateMas(int size, int range) {
        int[] mas = new int[size];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * range);
        }
        return mas;
    }


    public static int[] generateMasTask9(int size) {
        int[] mas1 = new int[size];
        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = (int) ((Math.random() * (75 - 25) + 25));
        }
        return mas1;
    }

    public static int getRandomNumber(int range) {
        return (int) (Math.random() * range);
    }

}
