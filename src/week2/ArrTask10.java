package week2;

/**
 * public static int[] splitArray(int[] arr, int start, int end) { // обрезать массив по границам start и end
 * }
 */
public class ArrTask10 {
    public static int[] splitArray(int[] arr, int start, int end) {

        int [] arr2 = new int [(arr.length - start)-(arr.length-end)];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[start+i];
        }
        return arr2;
    }
    public static void main(String[] args) {
        int size = 10;
        int range = 10;
        int[] mas1 = ArrayUtils.generateMas(size, range);
        ArrayUtils.printArr(mas1);
        int [] mas2 = splitArray(mas1, 2, 8);
        ArrayUtils.printArr(mas2);
    }
}

