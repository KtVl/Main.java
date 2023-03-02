package tasks;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        // Напишите программу, которая считывает последовательность целочисленных значений
        // из стандартного ввода и выводит максимальное из них
        //Подробности:
        //Вы должны считывать значения последовательности, пока следующее не станет 0.
        // Нулевое значение означает конец входной последовательности и не является ее элементом.
        //Последовательность гарантированно содержит хотя бы одно значение.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int maxNum = num;
        while (true) {
            num = sc.nextInt();
            if (num == 0) break;
            if (num >= maxNum) {
                maxNum = num;
            }
        }
        System.out.println(maxNum);
    }
}

