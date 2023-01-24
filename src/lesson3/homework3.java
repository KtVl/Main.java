package lesson3;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
public class homework3 {
    public static void main(String[] args) {
//        swap0By1();
//        fillArray();
        changeArray();



    }

    // Задать целочисленный массив,
// состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void swap0By1() {
        System.out.println("задан массив {0, 1, 1, 1, 0, 0}");
        int[] arr = {0, 1, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.print(arr[i] = 1);
            } else {
                System.out.print(arr[i] = 0);
            }
        }
        System.out.println("\n");
    }

    // Задать пустой целочисленный массив длиной 100.
// С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static void fillArray() {
        System.out.println("Задать пустой целочисленный массив длиной 100");
        int[] arr = new int[101];
        for (int i = 1; i < arr.length; i++) {
            System.out.print(i + " ");
        }
    }

    //    Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
//    пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void changeArray() {
        System.out.println();
        int[] arr = {1, 5, 6, 2, 11,};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                System.out.println(arr[i] * 2);
            } else {
                System.out.println(arr[i]);
            }
        }
    }
//    задать одномерный массив и напечатать его в консоль


}
