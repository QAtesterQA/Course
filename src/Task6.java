import java.util.Scanner;
//������ ��� �����, ������� �� ����, ���� ��� � ��������� �� 11 �� 19.
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any integer");
        int first = sc.nextInt();
        System.out.println("Enter one more integer");
        int second = sc.nextInt();

        if ((first + second) > 11 && (first + second)< 17 )
            System.out.println("Sum of numbers is " + (first + second));
        else
            System.out.println("Incorrect value");
    }
}
