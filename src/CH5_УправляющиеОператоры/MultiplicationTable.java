package CH5_УправляющиеОператоры;

// напишите прогу выводящую табл умножения для введённого числа

import java.util.Scanner;

public class MultiplicationTable {

    public static void Table(int x){

        System.out.println("Вот таблица умножения для числа " + x + ":");

        for (int i = 1; i <=10; i++){

            System.out.println(x + " * " + i + " = " + (x * i));
        }
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int Number = scanner.nextInt();

        Table(Number);
    }
}
