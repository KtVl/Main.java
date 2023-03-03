package tasks;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // Напишите программу, которая принимает на вход пятизначное число
// и проверяет,
// является ли оно палиндромом.
// 14212 -> нет
// 12821 -> да
// 23432 -> да
        System.out.println("введите пятизначное число: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = String.valueOf(num);
        if (str.length() < 5 || str.length() > 5) {
            System.out.println("число должно быть пятизначным!");
        } else if(isPalindrome(str)) {
            System.out.println("число является палиндромом");
        } else {
            System.out.println("это не палиндром");
        }

    }
        public static boolean isPalindrome(String num) {
            return num.equals(new StringBuilder(num).reverse().toString());
        }
}
