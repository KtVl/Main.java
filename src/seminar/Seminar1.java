package seminar;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Seminar1 {
    public static void main(String[] args) {
//        task1();
//        task2();
        task3();
    }

    /*
    запросить имя пользователя. в зависимоти от времени вывести соответсвующее приветсвие
     */

    static void task1() {
        System.out.println("Как тебя зовут?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        LocalTime localTime = LocalTime.now(); // узнаем текущее время
        int hour = localTime.getHour();
        if (hour >= 5 && hour < 12) {
            System.out.println("Доброе утро, " + name);
        } else if (hour >= 12 && hour < 17) {
            System.out.println("Добрый день, " + name);
        } else if (hour >= 18 && hour < 23) {
            System.out.println("Добрый вечер, " + name);
        } else {
            System.out.println("Доброй ночи, " + name);
        }
    }

    /*
    дан массив двоичных чисел [1,1,1,0,1,0,1] вывести макс кол-во подряд идущих 1
     */
    static void task2() {
        int[] arr = new int[10]; // заполняем массив случайными числами.
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2);
        }
        System.out.println(Arrays.toString(arr));
        int res = task2_1(arr, 1); // вызываем метод и сохраняем результат
        System.out.println("максимальное количество подряд идущих 1: " + res);
    }

    static int task2_1(int[] arr, int num) {
        int maxCount = 0; //записываем итоговый результат
        int count = 0; // текущий каунт считает сколько единиц
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            } else {
                if (maxCount < count) { //проверяем было ли большее количество едениц уже
                    maxCount = count; //если не было, то перезаписываем
                }
                count = 0; // начинаем считать заново
            }
        }
        if (maxCount < count) { //еще раз проверяем нет ли больше едениц подряд
            maxCount = count;
        }
        return maxCount;

    }

    // дан массив nums = [3,2,5,3] и число val = 3
    // если в массиве есть числа, равные заданному, нужно
    // перенести эти элементы в конец массива

    static int task3() {
        int[] arr = new int[]{3, 2, 5, 3};
        System.out.println(" дан массив: " + (Arrays.toString(arr)));
        int[] res = new int[arr.length]; // создаем второй массив, указывая его размерность
        int val = 3;
        Arrays.fill(res, val); //заполняем второй массив тройками
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                res[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(res));
        return val;
    }
}
