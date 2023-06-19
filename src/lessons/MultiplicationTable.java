package lessons;

import java.util.Scanner;

/**
 * Домашнее задание по теме Основы Java.управляющие операторы
 */
public class MultiplicationTable {

    private static final String FORMAT_ERROR = "Это не число. Попробуйте снова!";
    private static final String EMPTY = "";

    public static void main(String[] args) {
        int a;
        int b;
        int step;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число: ");
            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
                break;
            }
            System.out.println(FORMAT_ERROR);
        }

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите второе число: ");
            if (scanner.hasNextInt()) {
                b = scanner.nextInt();
                if (b <= a) {
                    System.out.println("Второе число меньше или равно первому. Попробуйте еще раз");
                    continue;
                }
                break;
            }
            System.out.println(FORMAT_ERROR);
        }

        int difference = b - a;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите шаг: ");
            if (scanner.hasNextInt()) {
                step = scanner.nextInt();
                if (step > difference) {
                    System.out.println("Шаг меньше или равен разности введенных чисел. Попробуйте еще раз");
                    continue;
                }
                break;
            }
            System.out.println(FORMAT_ERROR);
        }
        printMultiplicationTable(a, b, step);
    }

    private static void printMultiplicationTable(int a, int b, int step) {
        int difference = b - a;
        int remainder = difference % step;
        boolean sizeNotMultipleStep = 0 != remainder;

        int maxSize = getCellWidth((int) Math.pow(difference, 2)) + 1;

        System.out.println("Таблица умножения введенных чисел: ");

        //печатаем заголовок (шапку таблицы) = отдельный цикл, с отступом на значение ширины числа
        System.out.printf("%" + maxSize + "s", EMPTY);
        for (int j = a; j <= b; j += step) {
            System.out.printf("%" + maxSize + "s", j);
            //дописываем последнее значение в строку, при условии что разница введенных чисел не кратна шагу
            if (sizeNotMultipleStep && ((remainder + j) == b)) {
                System.out.printf("%" + maxSize + "s", b);
            }
        }
        System.out.println();

        //печать таблицы с названием строк
        for (int i = a; i <= b; i += step) {
            //печатаем название строки
            System.out.printf("%" + maxSize + "s", i);
            //печатаем строку
            for (int j = a; j <= b; j += step) {
                System.out.printf("%" + maxSize + "s", i * j);
                //дописываем последнее значение в строку (если размер не кратен шагу)
                if (sizeNotMultipleStep && ((remainder + j) == b)) {
                    System.out.printf("%" + maxSize + "s", i * b);
                }
            }
            System.out.println();
            //печатаем последнюю строку, при условии что разница введенных чисел не кратна шагу
            if (sizeNotMultipleStep && ((remainder + i) == b)) {
                //печать названия последней строки
                System.out.printf("%" + maxSize + "s", b);
                for (int j = a; j <= b; j += step) {
                    //печать последней строки
                    System.out.printf("%" + maxSize + "s", b * j);
                    //печать последнего элемента в строке
                    if (sizeNotMultipleStep && ((remainder + j) == b)) {
                        System.out.printf("%" + maxSize + "s", b * b);
                    }
                }
            }
        }
    }

    public static int getCellWidth(int number) {
        String data = String.valueOf(number);
        return data.length();
    }
}
