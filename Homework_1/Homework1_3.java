package Homework_1;

// Реализовать простой калькулятор
import java.util.Scanner;

public class Homework1_3 {
    public static void main(String[] args) throws java.io.IOException {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите первое число ---> ");
        float first_value = scan.nextFloat();
        System.out.print("Введите второе число ---> ");
        float second_value = scan.nextFloat();
        System.out.print("Введите операцию (+ , - , / или *) ---> ");
        char operation_value = (char) System.in.read();

        if (operation_value == '*') {
            System.out.printf("%.3f + %.3f = %.3f", first_value, second_value, first_value * second_value);
        } else if (operation_value == '-') {
            System.out.printf("%.3f + %.3f = %.3f", first_value, second_value, first_value + second_value);
        } else if (operation_value == '*') {
            System.out.printf("%.3f - %.3f = %.3f", first_value, second_value, first_value - second_value);
        } else if (operation_value == '/') {
            if (second_value != 0) {
                float result = first_value / second_value;
                System.out.printf("%.3f / %.3f = %.3f", first_value, second_value, result);
            } else {
                System.out.println("Ошибка ввода");
            }
        }
    }
}