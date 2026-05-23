import java.util.Random;
import java.util.Scanner;

public class laba2 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int number = 100 + random.nextInt(900);

        String numberStr = Integer.toString(number);

        System.out.println("Випадкове число: " + numberStr);
        char first = numberStr.charAt(0);
        char second = numberStr.charAt(1);
        char third = numberStr.charAt(2);

        if (first == second || first == third || second == third) {
            System.out.println("У числі є дві однакові цифри.");
        } else {
            System.out.println("Однакових цифр немає.");
        }

        scanner.nextLine();

        System.out.println("Введіть текст:");
        String text = scanner.nextLine();

        System.out.println("Введіть символ:");
        char symbol = scanner.next().charAt(0);

        System.out.println("Введіть ознаку (0 - видалити, 1 - вставити):");
        int flag = scanner.nextInt();

        String result;

        if (flag == 0) {
            result = text.replace(Character.toString(symbol), "");
        }
        else {
            System.out.println("Введіть позицію k:");
            int k = scanner.nextInt();

            if (k >= 0 && k < text.length()) {
                result = text.substring(0, k + 1)
                        + symbol
                        + text.substring(k + 1);
            } else {
                result = "Помилка: неправильне значення k.";
            }
        }

        System.out.println("Результат: " + result);

        scanner.close();
    }
}