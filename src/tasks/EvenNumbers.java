package tasks;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        // Напишите программу, которая на вход принимает число (N),
        //  а на выходе показывает все чётные числа от 1 до N.
        System.out.println("введите число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n){
            if(i % 2 == 0) {
            System.out.println(i);
            }
        i++;
        }
    }
}
