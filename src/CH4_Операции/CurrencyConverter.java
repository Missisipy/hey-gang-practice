package CH4_Операции;

// напишите прогу простого конвертера валют

import java.util.Scanner;

public class CurrencyConverter {

    public static double Converter(double Sum, double ExRate){

        return Sum * ExRate;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму для конвертации: ");
        double count = scanner.nextDouble();

        System.out.print("Введите валюту для конвертации (USD, RUB, EUR, UAN): ");
        String SourceCurr = scanner.next();

        System.out.print("Введите в какую валюту конвертировать (USD, RUB, EUR, UAN): ");
        String RequiredCurr = scanner.next();

        System.out.print("Введите текущий курс (" + SourceCurr + " к " + RequiredCurr + "): ");
        double Rate = scanner.nextDouble();

        System.out.println("По текущему курсу " + count + " " + SourceCurr + " состовляет " + Converter(count, Rate) + " " + RequiredCurr);
    }
}
