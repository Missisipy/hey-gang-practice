package CH3_ТипыДанныхПеременныеМассивы;

// Задача: Работа с температурой
// Напишите прогу, кот принимает три значения температур
// в гр Цельсия и выч ср температуру
// Выведите темпу в гр Цельсия и преобр в гр Фаренгейта

import java.util.Scanner;

public class WorkWithTemp {

    public static double TempF(double x){
        return (x * (9 / 5)) + 32;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Температуру необходимо вводить в градусах Цельсия!");
        System.out.println("Доли градуса указываются через запятую!");

        System.out.print("Введите температуру 1: ");
        double temperature1 = scanner.nextDouble();

        System.out.print("Введите температуру 2: ");
        double temperature2 = scanner.nextDouble();

        System.out.print("Введите температуру 3: ");
        double temperature3 = scanner.nextDouble();

        double TempC = (temperature1 + temperature2 + temperature3) / 3;

        System.out.println("Средняя температура в градусах Цельсия: " + TempC);
        System.out.println("Средняя температура в градусах Фаренгейта: " + TempF(TempC));
    }
}
