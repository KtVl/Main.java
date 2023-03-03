package tasks;

import java.util.Scanner;

public class InputToZero {
    public static void main(String[] args) {
        //Организуйте последовательный ввод чисел до тех
        // пор, пока не будет введён 0. Подсчитайте среди введённых чисел те, которые кратны трём.
        System.out.println("введите числа: ");
        Scanner sc = new Scanner(System.in);
        int sum = 0; // Сумма
        int input; // Ввод пользователя
        while (true) {
            input = sc.nextInt();
            if (input == 0) {
                break;
            }
            sum = sum + input;
        }
        System.out.println("Сумма введённых чисел: " + sum);
    }
}

