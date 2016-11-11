package week3;

import java.util.Scanner;

public class week3Task3_2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            boolean[][] mat1 = MatrixUtils.genMatrix2(size);
            String res1 = MatrixUtils.toBoolean(mat1);
            System.out.println(res1);
    }
}
