package CH4_Операции;

// напишите калькулятор принимающий два значения и математический оператор

import java.util.Scanner;

public class CalculatorBaseOperations {

    public static double ResultCalculation(String oper, double num1, double num2){

        switch (oper){
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num1 == 0 && num2 == 0) {
                    return 0;
                } else if (num1 == 0 && num2 != 0) {
                    System.out.println("Бесконечно малое число");
                    return Double.NaN;
                } else if (num1 != 0 && num2 == 0) {
                    System.out.println("Бесконечно большое число");
                    return Double.NaN;
                } else {
                    return num1 / num2;
                }
            default:
                System.out.println("Неверный оператор");
                return Double.NaN;
        }
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Дробная часть вводится через запятую!");
        System.out.print("Введите первое значение: ");
        double count1 = scanner.nextDouble();

        System.out.print("Введите оператор: ");
        String operator = scanner.next();

        System.out.print("Введите второе значение: ");
        double count2 = scanner.nextDouble();

        System.out.println("Результат выполнения операции: " + ResultCalculation(operator, count1, count2));
    }
}
