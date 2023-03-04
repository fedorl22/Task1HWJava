// public class task3 {
// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.printf("Введите число: ");
            double a = input.nextDouble();
            System.out.print("Введите арифметическое действие (+, -, *, /): ");
            char b = input.next().charAt(0);
            System.out.printf("Введите число: ");
            double c = input.nextDouble();
            double res;
            switch (b) {
                case '+':
                    res = a + c;
                    break;
                case '-':
                    res = a - c;
                    break;
                case '*':
                    res = a * c;
                    break;
                case '/':
                    res = a / c;
                    break;
                default:
                    System.out.printf("Ошибка, введите +, -, * или / ");
                    return;
            }
            System.out.print("Результат:\n");
            System.out.printf(a + " " + b + " " + c + " = " + res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}