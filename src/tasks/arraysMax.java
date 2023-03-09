package tasks;
import java.util.Scanner;
import java.util.Arrays;
public class arraysMax {
    public static void main(String[] args) {
        /*Напишите программу, которая получает из стандартного ввода
        размерность массива и все его элементы,
        после чего ищет в нем максимум и выводит на печать.
        Входной массив должен иметь не нулевой размер.
        Если указан нулевой размер сразу вывести "Массив нулевого размера".
         Входной массив может содержать любое значение типа int.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("введите размер массива: ");
        int size = sc.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        if (size == 0) {
            System.out.println("Массив нулевого размера");
        }
        int array[] = new int[size];

        System.out.println("введите массив чисел: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        Arrays.sort(array); // метод упорядочивания элементов массива
        int lastItem = array[array.length - 1];
        System.out.print("максимальное число в массиве: " + lastItem);
    }
}

