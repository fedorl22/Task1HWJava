// *(ДОПОЛНИТЕЛЬНАЯ) +Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.
// Ввод: 2? + ?5 = 69 Вывод: 24 + 45 = 69
//       9? + ?9 = 11 Вывод: Решений нет

// Описание решения. Если ? больше 2х то решений много и мы не будем их рассматривать. Выражения вида ??+35 = 69  для устного счета. Если ? один то задача тоже тривиальная.  
// Поэтому в решении рассмотрим все ситуации с 2мя ? . Выражения вида a?+?b ?a+b? по структуре фактически одинаковы с заменой a->b. Количество символов в строке 12.
// 2? + ?5 = 69
// 01234567891011 индексы в строке.

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.printf("Введите выражение: ");
            String s = input.nextLine();
            System.out.println(s.length());
            if (s.length() != 12) {
                System.out.println("Вы ввели некорректные данные");
            } else {
                char[] arr = s.toCharArray();
                int x = 0;
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        if (arr[0] * 10 + i + j * 10 + arr[6] == arr[10] * 10 + arr[11]) {
                            x += 1;
                            System.out.println(
                                    "(" + x + ") " + arr[0] + i + " + " + j + arr[6] + " =" + arr[10] + arr[11]);
                        }
                    }
                }
                System.out.println("\n");
                if (x == 0) {
                    System.out.println("Решений нет\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
