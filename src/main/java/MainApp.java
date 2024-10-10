import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = sc.nextInt();
        System.out.println("Введите второе число");
        int b = sc.nextInt();
        System.out.println("Введитe операцию (+, -, *, /)");
        char aperation = sc.next().charAt(0);

        if (aperation == '+') {
        int result = a + b;
        System.out.println (a + " + " + b + " = " + result);
        }
        if (aperation == '-') {
            int result = a - b;
            System.out.println(a + " - " + b + " = " + result);
        }
        if (aperation == '*') {
            int result = a * b;
            System.out.println(a + " * " + b + " = " + result);
        }if (aperation == '/') {
            int result = a / b;
            System.out.println(a + " / " + b + " = " + result);
        }
    }
}
