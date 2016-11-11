import java.util.Scanner;
//Вводим 2 числа. Если первое число больше второго, то вывести на экран разницу чисел. Если второе больше, то выводим сумму.
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any integer");
        int first = sc.nextInt();
        System.out.println("Enter one more integer");
        int second = sc.nextInt();
        if (first > second)
            System.out.println(first - second);
        else if (first < second)
            System.out.println(first + second);
        else
            System.out.println("Numbers are out of scope");
    }
}
