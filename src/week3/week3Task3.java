package week3;
import java.util.Scanner;
/**
 * 3. ������� ������������ ���������� ������� � ������ ������� ������ ����.
 * 3.1. �������� ��� �����, ������� ������� �� 5 ��� ������ � ���������� ������� �� 8
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
