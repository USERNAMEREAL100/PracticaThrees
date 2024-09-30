import java.util.Scanner;

public class FormatOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення даних користувачем
        System.out.print("Введіть ціле число: ");
        int intValue = scanner.nextInt();

        System.out.print("Введіть число з плаваючою точкою(наприклад, 2,13): ");
        double doubleValue = scanner.nextDouble();
        
        // Щоб прочитати строку після числа, потрібно додати наступний рядок
        scanner.nextLine();

        System.out.print("Введіть строку: ");
        String stringValue = scanner.nextLine();

        System.out.print("Введіть логічне значення (true/false): ");
        boolean booleanValue = scanner.nextBoolean();

        // 1. Конкатенація рядків
        System.out.println("\n1. Склеювання рядків:");
        System.out.println("Ціле число: " + intValue);
        System.out.println("Число з плаваючою точкою: " + doubleValue);
        System.out.println("Строка: " + stringValue);
        System.out.println("Логічне значення: " + booleanValue);

        // 2. Використання System.out.printf
        System.out.println("\n2. Форматований вивід:");
        System.out.printf("Ціле число: %d%n", intValue);
        System.out.printf("Число з плаваючою точкою: %.2f%n", doubleValue);
        System.out.printf("Строка: %.10s%n", stringValue);
        System.out.printf("Логічне значення: %b%n", booleanValue);

        // 3. Використання String.format
        System.out.println("\n3. Форматований вивід:");
        String formattedOutput = String.format("Ціле число: %d%n", intValue);
        System.out.print(formattedOutput);

        formattedOutput = String.format("Число з плаваючою точкою: %.3f%n", doubleValue);
        System.out.print(formattedOutput);

        formattedOutput = String.format("Строка: %-15.15s%n", stringValue);
        System.out.print(formattedOutput);

        formattedOutput = String.format("Логічне значення: %b%n", booleanValue);
        System.out.print(formattedOutput);

        // 4. Шістнадцяткова, вісімкова системи
        System.out.println("\n4. Додаткові формати:");
        System.out.printf("Ціле число (шістнадцятковий формат): %x%n", intValue);
        System.out.printf("Ціле число (вісімковий формат): %o%n", intValue);
        System.out.printf("е буква: %e%n", doubleValue);
    }
}
