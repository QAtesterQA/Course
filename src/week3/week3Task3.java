package week3;
import java.util.Scanner;
/**
 * 3. Матрицы генерировать случайными числами и размер матрицы вводит юзер.
 * 3.1. Заменить все числа, которые делятся на 5 без остачи в двухмерной матрице на 8
 */
public class week3Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] mat1 = MatrixUtils.genMatrix1(size);
        String res1 = MatrixUtils.toString(mat1);
        System.out.println(res1);
    }

}
