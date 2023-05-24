package JaPy;

import java.util.List;

public class Print {

    // Prints a welcome message.
    public static void printHello() {
        System.out.println("Hello, please enjoy easy Print!");
    }

    // Prints a space-separated string of values.
    // This method handles int[], char[], String[], List<?> and Object[] specially, calling appropriate methods to print those types.
    public static void print(Object... values) {
        for (Object value : values) {
            if (value instanceof int[]) {
                printIntArray((int[]) value);
            } else if (value instanceof char[]) {
                printCharArray((char[]) value);
            } else if (value instanceof String[]) {
                printStringArray((String[]) value);
            } else if (value instanceof List) {
                printList((List<?>) value);
            } else if (value instanceof Object[]) {
                printObjectArray((Object[]) value);
            } else {
                System.out.print(value + " ");
            }
        }
        System.out.println();
    }

    // Prints a space-separated string of chars.
    public static void printCharArray(char[] values) {
        for (char value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Prints a space-separated string of integers.
    public static void printIntArray(int[] values) {
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Prints a space-separated string of Strings.
    public static void printStringArray(String[] values) {
        for (String value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Prints a space-separated string of list values. The list can contain any type of objects.
    public static void printList(List<?> values) {
        for (Object value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Prints a space-separated string of Object array values.
    // This function handles nested arrays and lists.
    public static void printObjectArray(Object[] values) {
        for (Object value : values) {
            print(value);
        }
    }
}
