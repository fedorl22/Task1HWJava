// Вывести все простые числа от 1 до 1000 
public class task2 {
    public static void main(String[] args) {
        simpleout(1001);
    }

    public static void simpleout(int x) {
        int i = 0;
        while (i < x) {
            if (simple(i)) {
                System.out.println("i = " + i);
            }
            i++;
        }
    }

    public static boolean simple(int n) {
        for (int i = 2; i < n / 2 + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}