import java.util.Scanner;
//������������ ������ �����. ������� �� ����� ��� ��������� ��������, ���� ����� ������� �� 7 ������.
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if (i % 7 == 0)
            System.out.println(i * 2 + " Correct Number");
            else
            System.out.println("Incorrect Number");
        
    }
}
