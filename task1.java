// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

import java.util.Scanner;
public class task1 {
    static int treyg(int n) {
        if (n == 0)
            return 0;
        return n + treyg(n - 1);
    }

    static int factor(int n) {
        if (n == 1)
            return 1;
        return n * factor(n - 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int n = input.nextInt();
        System.out.printf("Треугольное число: = %d \n", treyg(n));
        System.out.printf("Факториал числа: = %d \n", factor(n));
    }
}
