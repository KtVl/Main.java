package tasks;

import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        /* Напишите программу, которая должна прочитать два значения из System.in:
количество людей
количество кусочков в одной пицце.
Гарантируется, что входные параметры — целые положительные числа.
Программа должна напечатать минимальное количество пицц (не ноль),
которое надо заказать, чтобы у всех было одинаковое количество ломтиков и не осталось ни одного лишнего.
 */
        
        int pizza = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("введите количество людей: ");
        int people = sc.nextInt();
        System.out.println("введите количество кусочков в одной пицце: ");
        int pieces = sc.nextInt();

        while((pieces * pizza) % people != 0)
        {
            pizza ++;
        }
        System.out.println(pizza);
    }
}
