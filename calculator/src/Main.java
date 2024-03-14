import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        float a = sc.nextFloat();

        System.out.println("Укажите операцию (+, -, *,/)");
        char operation = sc.next().charAt(0);

        System.out.println("Введите второе число");
        float b = sc.nextFloat();

        if (operation == '+') {
            float result = a+b;
            System.out.println(a + " + " + b + " = "+ result);
        }
        if (operation == '-') {
            float result = a - b;
            System.out.println(a + " - " + b + " = "+ result);
        }
        if (operation == '*') {
            float result = a * b;
            System.out.println(a + " * " + b + " = "+ result);
        }
        if (operation == '/') {
            float result = a / b;
            System.out.println(a + " / " + b + " = "+ result);
        }
    }
}
