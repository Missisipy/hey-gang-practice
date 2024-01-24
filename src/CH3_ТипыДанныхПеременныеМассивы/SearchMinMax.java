package CH3_ТипыДанныхПеременныеМассивы;

// Поиск мин и макс значения в массиве

import java.util.Scanner;

public class SearchMinMax {

    public static void SearchMinMax(int[] array){

        int min = array[0];
        int max = array[0];

        for (int x: array){

            min = min > x ? x : min;
            max = max < x ? x : max;
        }

        System.out.println("Минимальное значение массива: " + min);
        System.out.println("Максимальное значение массива: " + max);
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
        SearchMinMax(Arr);
    }
}