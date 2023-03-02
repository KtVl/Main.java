package tasks;

import java.util.Scanner;

public class ThirdNumber {
    public static void main(String[] args) {
        // Напишите программу,
// которая выводит третью цифру заданного числа
//  или сообщает, что третьей цифры нет.
// 645 -> 5
// 78 -> третьей цифры нет
// 32679 -> 6
        System.out.println("введите трехзначное число: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String number = String.valueOf(num);
        if (num > 100) {
            char c = number.charAt(2);
            System.out.println(c);
        } else {
            System.out.println("третьей цифры нет");
        }
    }
}

