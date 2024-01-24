package CH3_ТипыДанныхПеременныеМассивы;

// Задача: Подсчёт суммы элементов массива
// Напишите прогу, которая принимает массив целых чисел
// от пользователя и вывоит сумму всех эл-в в массиве

import java.util.Scanner;

public class SumElementsArray {

    public static int Sum(int[] x) {

        int result = 0;

        for (int y: x){

            result += y;
        }
        return result;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");

        int size = scanner.nextInt();

        int[] Arr = new int[size];

        for (int i = 0; i < size; i++){

            System.out.print("Введите " + (i + 1) + " элемент массива: ");
            Arr[i] = scanner.nextInt();
        }

        System.out.println(Sum(Arr));
    }
}
