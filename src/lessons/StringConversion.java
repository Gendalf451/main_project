package lessons;

import java.util.Scanner;

/**
*  Домашнее задание по теме Основы.Java. Строки.
 */
public class StringConversion {

    private static final String SPACE = " ";
    private static final String DOUBLE_SPACE = "  ";

    public static void main(String[] args) {
        String str;
        do {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите исходную строку: ");
            str = in.nextLine();
        } while (!isValidInputString(str));
        String referenceString = str;
        str = removeDoubleSpace(str);
        String searchParam;

        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите искомый символ: ");
            searchParam = in.nextLine();
        } while (!isValidISearchParam(searchParam));
        str = str.replace(searchParam, SPACE);
        str = removeDoubleSpace(str);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Результат: ")
                .append("\n")
                .append(referenceString)
                .append("\n")
                .append(str);
        if (referenceString.equals(str)) {
            System.out.println("Исходная строка равна преобразуемой");
            return;
        }
        System.out.println(stringBuilder.toString().trim());
    }

    private static boolean isValidInputString(String string) {
        if (string.trim().length() < 2) {
            System.out.println("Неверная строка, введите заново: ");
            return false;
        }
        return true;
    }

    private static boolean isValidISearchParam(String string) {
        if (string.length() != 1 || SPACE.equals(string)) {
            System.out.println("Неверный символ, введите заново: ");
            return false;
        }
        return true;
    }

    private static String removeDoubleSpace(String string) {
        while (string.contains(DOUBLE_SPACE)) {
            string = string.replace(DOUBLE_SPACE, SPACE);
        }
        return string;
    }
}

