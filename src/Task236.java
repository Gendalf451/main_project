import java.util.Scanner;

public class Task236 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int countPositiveNumber = 0;

        for (int i = 1; i < 11; i++) {
            System.out.print("Введите число № " + i + " : ");
            int num = in.nextInt();
            if (num > 0) {
                countPositiveNumber++;
            }
        }

        System.out.print("Было введено положительных чисел: " + countPositiveNumber);
        in.close();
    }
}
