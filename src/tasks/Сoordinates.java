package tasks;

import java.util.Scanner;

public class Сoordinates {
    public static void main(String[] args) {
        // Напишите программу, которая принимает на вход
// координаты точки (X и Y), причём X ≠ 0 и Y ≠ 0 и выдаёт
// номер четверти плоскости, в которой находится эта
// точка.
        System.out.println("введите координаты х: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("введите координаты y: ");
        int y = sc.nextInt();
        quarterStr(x,y);
        System.out.println(quarterStr(x,y));

    }
    static String quarterStr(int x, int y)
    {

        if (x > 0 && y > 0) return "первая четверть";
        if (x < 0 && y > 0) return "вторая четверть";
        if (x < 0 && y < 0) return "третья четверть";
        if (x > 0 && y < 0) return "четвертая четверть";
        return "введены некорректные координаты";
    }
}
