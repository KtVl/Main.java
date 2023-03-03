package tasks;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        // Напишите программу, которая на вход принимает два числа
        // и проверяет, является ли одно число квадратом другого
        System.out.println("введите первое число: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("введите второе число: ");
        int y = sc.nextInt();
        if (x % y == 0 || y % x == 0) {
            System.out.println("одно число квадрат другого");
        } else {
            System.out.println("одно число не квадрат другого");
        }
    }
}

