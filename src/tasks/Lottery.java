package tasks;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        /*
        Напишите лотерею. Человек не знает, какие несколько конкретных чисел выигрышные,
        и пробует ввести их наугад от 0 до 100.
         Мы сообщаем о выигрыше, если введенное число равно 4, 10, 40 или 89.

 Вывод программы
Поучаствуйте в лотерее!
Введите целое число от 0 до 100
4
Да, ДЖЭКПОТ, 1000000 долларов!..
49
Попробуйте ещё в следующий раз!

        */
        System.out.println("Поучаствуйте в лотерее!\n" +
                "Введите целое число от 0 до 100");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >0 && num <= 100) {
            if (num == 4 || num == 10 || num == 40 || num == 89) {
                System.out.println("Да, ДЖЭКПОТ, 1000000 долларов!");
            } else {
                System.out.println("Попробуйте ещё в следующий раз!");
            }
        } else {
            System.out.println("от нуля до 100!");
        }

    }
}
