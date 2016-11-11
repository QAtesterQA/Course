import java.util.Scanner;
//Пользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело.
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
