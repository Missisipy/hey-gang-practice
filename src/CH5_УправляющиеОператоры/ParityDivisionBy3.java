package CH5_УправляющиеОператоры;

// напишите прогу проверяющую чётность числа и делится лли оно на 3

import java.util.Scanner;

public class ParityDivisionBy3 {

    public static void Parity(int x){

        if (x % 2 == 0) System.out.println("Число чётное");
        else System.out.println("Число нечётное");
    }

    public static void DivisionBy3(int x){

        if (x % 3 == 0) System.out.println("Число делится на 3");
        else System.out.println("Число не делится на 3");
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int Number = scanner.nextInt();

        Parity(Number);

        DivisionBy3(Number);
    }
}
