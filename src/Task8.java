import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**
         ¬водим два числа, сравнить последнии цифры этих чисел (пользоватьс€ оператором %)
         124    4    -   true
         1456   567  -   false
         1      2    -   false
         18     98   -   true
         **/

        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();

        if (int1 % 10 == int2 % 10) {
            System.out.println(true);
        }
            else {
            System.out.println(false);
        }
    }
}
