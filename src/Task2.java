import java.util.Scanner;
//ѕользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 number");
        int One = sc.nextInt();
        System.out.println("Enter 2 number");
        int Two = sc.nextInt();
        System.out.println("Enter 3 number");
        int Three = sc.nextInt();
        if (One > Two && One > Three)
            System.out.println("One is the biggest number");
        else if (Two > One && Two > Three)
            System.out.println("Two is the biggest number");
        else if (Three > One && Three > Two)
            System.out.println("Three is the biggest number");
        if (One < Two && One < Three)
            System.out.println("One is the lowest number");
        else if (Two < One && Two < Three)
            System.out.println("Two is the lowest number");
        else if (Three < One && Three < Two)
            System.out.println("Three is the lowest number");
        else
            System.out.println("Numbers are incorrect for this task");
    }
}
