package chapter2;

import java.lang.*;

// Сумма чётных и нечётных чисел в массиве
// Напишите метод, который принимает массив целых чисел
// и вычисляет сумму чётных и нечётных чисел в этом массиве.

public class SumCalc {

    public static void calcSum(int[] array){

        int chet = 0;
        int nech = 0;

        for (int num: array){

            if (num % 2 == 0) chet += num;
            else nech += num;
        }
        System.out.println("Сумма чётных чисел: " + chet);
        System.out.println("Сумма нечётных чисел: " + nech);
    }

    public static void main(String[] args) {

        int[] Arr = {2, 4, 5, 6, 3, 23, 54, 223, 233, 222, 11110};
        calcSum(Arr);
    }
}