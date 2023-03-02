package tasks;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
//  Напишите программу,
// которая принимает на вход цифру,
// обозначающую день недели,
// и проверяет,
// является ли этот день выходным.

// 6 -> да
// 7 -> да
// 1 -> нет
        System.out.println("введите цифру, обозначающую день недели: ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        if (day <= 5) {
            System.out.println("сегодня не выходной!");
        } else if (day > 5 && day <= 7) {
            System.out.println("сегодня выходной!");
        } else {
            System.out.println("такого дня недели не существует!");
        }
    }
}
