import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");

        var a = sc.next();
        var firstValue = transformNumbersFromArray(a.split(""));

        System.out.println("Укажите операцию (+, -, *,/)");
        char operation = sc.next().charAt(0);

        System.out.println("Введите второе число");
        var b = sc.next();
        var secondValue = transformNumbersFromArray(b.split(""));

        if (operation == '+') {
            float result = firstValue + secondValue;
            System.out.println(firstValue + " + " + secondValue + " = "+ result);
        }
        if (operation == '-') {
            float result = firstValue - secondValue;
            System.out.println(firstValue + " - " + secondValue + " = "+ result);
        }
        if (operation == '*') {
            float result = firstValue * secondValue;
            System.out.println(firstValue + " * " + b + " = "+ result);
        }
        if (operation == '/') {
            float result = (float) firstValue / secondValue;
            System.out.println(firstValue + " / " + secondValue + " = "+ result);
        }
    }


    public static int getNumberFromRoman(String roman) {
        return switch (roman) {
            case "I" -> 1;
            case "V" -> 5;
            case "X" -> 10;
            case "L" -> 50;
            case "C" -> 100;
            case "D" -> 500;
            case "M" -> 1000;
            default -> Integer.parseInt(roman);
        };
    };

    public static int transformNumbersFromArray(String[] arr){
        var res = 0;
        for(int i = 0; i < arr.length; i++){
            var converted = getNumberFromRoman(arr[i]);
            var nextValue = getNumberFromRoman(arr[i +1 < arr.length ? i +1 : i]);
            if(converted < nextValue){
                res += nextValue - converted;
                i++;
            }else{
                res += converted;
            }
        }
        return res;
    }
}
