package tasks;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        // Напишите программу, которая получает на вход с клавиатуры целое число.
        // Это число представляет собой текущее суточное время как количество
        // прошедших с полуночи секунд. Затем программа должна напечатать вывод экрана электронных часов для этого времени.
        //Входное значение задается через System.in. Выходное значение должно быть напечатано в System.out
        //Гарантируется, что входное значение — неотрицательное.
        //Формат вывода: h:mm:ss (возможные значения: [0:00:00; 23:59:59]).
        int n = new Scanner(System.in).nextInt();
        int hours = n / 60 / 60;
        int minutes = n / 60 % 60;
        int seconds = n % 60;
        if (n < 0 || n > 86400) {
            System.out.print("некорректное число");
        }
        if (hours >= 24 ){
            hours = 0;
        }
        System.out.println(str(hours) + ":" + str(minutes) + ":" + str(seconds));
    }

    private static String str(int n) {
        return n < 10 ? "0" + n : "" + n;
    }

}

