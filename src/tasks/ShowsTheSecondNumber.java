package tasks;

import java.util.Scanner;

public class ShowsTheSecondNumber {
    public static void main(String[] args) {
        // Напишите программу, которая принимает на вход трёхзначное число
// и на выходе показывает вторую цифру этого числа.
// 456 -> 5
// 782 -> 8
// 918 -> 1
        System.out.println("введите трехзначное число: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= 100 & num < 1000) {
            int res = num / 10;
            int res1 = res % 10;
            System.out.println(res1);
        } else {
            System.out.println("число должно быть трехзначным!");
        }
    }
}
