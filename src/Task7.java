import java.util.Scanner;
//������ ��� �����, ���� ���� �� ��� �������� �� ������ ��� �������, �� ������� ��� � ���������� ��������� ������� (����� ����� �� �������  � ������)
//� ������ ������ ������� false � ���������� ��������� ������� (����� ����� �� �������  � ������)
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any int");
        int int1 = scanner.nextInt();
        System.out.println("Enter any int");
        int int2 = scanner.nextInt();

        if (int1 > int2) {
            if (int1 % int2 == 0 || int2 % int1 == 0)
                System.out.println("TRUE " + int1 / int2 + "/" + int1 % int2);
        } else {
            System.out.println("FALSE " + int1 / int2 + "/" + int1 % int2);
        }
        if (int2 > int1) {
            if (int2 % int1 == 0 || int1 % int2 == 0)
                System.out.println("TRUE " + int2 / int1 + "/" + int2 % int1);
        } else {
            System.out.println("FALSE " + int2 / int1 + "/" + int2 % int1);
        }

    }
}
