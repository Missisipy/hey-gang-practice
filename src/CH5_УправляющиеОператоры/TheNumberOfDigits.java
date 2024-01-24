package CH5_УправляющиеОператоры;

// напишите прогу вычисляющую количество цифр в числе

import java.util.Scanner;

public class TheNumberOfDigits {

    public static void NumberOfDigits(long x){

        if (x == 0) {

            System.out.println("Количество цифр: 1");
            return;
        }

        int result = 0;

        while (x != 0){

            result++;
            x /= 10;
        }
        System.out.println("Количество цифр: " + result);
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        long Number = scanner.nextLong();

        NumberOfDigits(Number);
    }
}
