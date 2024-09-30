import java.util.Scanner;

public class PrimitiveInfo {
    public static void main(String[] args) {
        // Виводимо інформацію про примітивні типи даних
        System.out.println("Примітивні типи даних у Java:");

        // byte
        System.out.println("byte:");
        System.out.println("Розмір: " + Byte.BYTES + " байт");
        System.out.println("Мінімальне значення: " + Byte.MIN_VALUE);
        System.out.println("Максимальне значення: " + Byte.MAX_VALUE);
        System.out.println();

        // short
        System.out.println("short:");
        System.out.println("Розмір: " + Short.BYTES + " байт");
        System.out.println("Мінімальне значення: " + Short.MIN_VALUE);
        System.out.println("Максимальне значення: " + Short.MAX_VALUE);
        System.out.println();

        // int
        System.out.println("int:");
        System.out.println("Розмір: " + Integer.BYTES + " байт");
        System.out.println("Мінімальне значення: " + Integer.MIN_VALUE);
        System.out.println("Максимальне значення: " + Integer.MAX_VALUE);
        System.out.println();

        // long
        System.out.println("long:");
        System.out.println("Розмір: " + Long.BYTES + " байт");
        System.out.println("Мінімальне значення: " + Long.MIN_VALUE);
        System.out.println("Максимальне значення: " + Long.MAX_VALUE);
        System.out.println();

        // float
        System.out.println("float:");
        System.out.println("Розмір: " + Float.BYTES + " байт");
        System.out.println("Мінімальне значення: " + Float.MIN_VALUE);
        System.out.println("Максимальне значення: " + Float.MAX_VALUE);
        System.out.println();

        // double
        System.out.println("double:");
        System.out.println("Розмір: " + Double.BYTES + " байт");
        System.out.println("Мінімальне значення: " + Double.MIN_VALUE);
        System.out.println("Максимальне значення: " + Double.MAX_VALUE);
        System.out.println();

        // boolean (не має розміру і мін/макс значень, тому лише виводимо його)
        System.out.println("boolean:");
        System.out.println("Можливі значення: true або false");
        System.out.println();

        // char
        System.out.println("char:");
        System.out.println("Розмір: " + Character.BYTES + " байт");
        System.out.println("Мінімальне значення: " + (int) Character.MIN_VALUE);
        System.out.println("Максимальне значення: " + (int) Character.MAX_VALUE);
        System.out.println();

        // Зчитуємо і перетворюємо введені дані користувача
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть byte:");
        byte byteValue = Byte.parseByte(scanner.nextLine());
        System.out.println("Ви ввели byte: " + byteValue);

        System.out.println("Введіть short:");
        short shortValue = Short.parseShort(scanner.nextLine());
        System.out.println("Ви ввели short: " + shortValue);

        System.out.println("Введіть int:");
        int intValue = Integer.parseInt(scanner.nextLine());
        System.out.println("Ви ввели int: " + intValue);

        System.out.println("Введіть long:");
        long longValue = Long.parseLong(scanner.nextLine());
        System.out.println("Ви ввели long: " + longValue);

        System.out.println("Введіть float:");
        float floatValue = Float.parseFloat(scanner.nextLine());
        System.out.println("Ви ввели float: " + floatValue);

        System.out.println("Введіть double:");
        double doubleValue = Double.parseDouble(scanner.nextLine());
        System.out.println("Ви ввели double: " + doubleValue);

        System.out.println("Введіть boolean:");
        boolean booleanValue = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Ви ввели boolean: " + booleanValue);

        System.out.println("Введіть char:");
        char charValue = scanner.nextLine().charAt(0);
        System.out.println("Ви ввели char: " + charValue);

        scanner.close();
    }
}