package lesson3;

import java.util.Scanner;

public class FromScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = sc.nextInt();
        a *= 2;
        System.out.println("Ваше число умноженное на 2: " + a);
        sc.close();
    }
}
