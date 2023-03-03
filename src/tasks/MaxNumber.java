package tasks;

import java.util.Arrays;

public class MaxNumber {
    public static void main(String[] args) {
        //Напишите программу, которая находит наибольшее и наименьшее число из списка значений
        int array[] = new int[]{10, 11, 88, 2, 12, 120};
        System.out.println(Arrays.toString(array)); //напечатать в консоль

        // Вызов метода getMax () для получения максимального значения
        int max = getMax(array);
        System.out.println("максимальное значение: "+max);

        // Вызов метода getMin () для получения минимального значения
        int min = getMin(array);
        System.out.println("минимальное значение: "+min);
    }

    //здесь находим максимум
    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i = 1; i < inputArray.length; i++) {
            if(inputArray[i] > maxValue)
            {
            maxValue = inputArray[i];
        }
        }
        return maxValue;
    }

    // здесь находим минимум
    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i = 1; i < inputArray.length; i++) {
            if(inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}
