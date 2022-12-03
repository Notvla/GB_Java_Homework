//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!(произведение чисел от 1 до n)
package Homework_1;

import java.util.Scanner;

public class Homework1_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        int num = scan.nextInt();

        System.out.println("Треугольное число = " + (num * (num + 1)) / 2);

        int res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }

        System.out.printf("Факториал " + num + " = " + res);
    }
}