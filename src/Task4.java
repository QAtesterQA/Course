import java.util.Scanner;
//Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Number = sc.nextDouble();

        if (Number >= 0 && Number <= 1)
            System.out.println("Value is in range between 0 and 1");
        else
            System.out.println("Value is out of range between 0 and 1");

    }
}
