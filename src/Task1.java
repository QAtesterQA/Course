import java.util.Scanner;
//������������ ������ �������� � ������� (������� ��� �� 0 �� 24)
//���� ����� �� 9 �� 18, �� ������� "� �� ������", � ������ ������ "� �������")
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();

        System.out.println("Print time from 0 to 24");
        if (hour==9)
        System.out.println("I am at work");
        else if(hour==10)
            System.out.println("I am at work");
        else if(hour==11)
            System.out.println("I am at work");
        else if(hour==12)
            System.out.println("I am at work");
        else if(hour==13)
            System.out.println("I am at work");
        else if(hour==14)
            System.out.println("I am at work");
        else if(hour==15)
            System.out.println("I am at work");
        else if(hour==16)
            System.out.println("I am at work");
        else if(hour==17)
            System.out.println("I am at work");
        else if(hour==18)
            System.out.println("I am at work");
        else
            System.out.println("I am having a rest");

    }

}
