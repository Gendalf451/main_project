import java.util.Scanner;

public class Task234 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите a: ");
        int a = in.nextInt();
        System.out.print("Введите b: ");
        int b = in.nextInt();
        System.out.print("Введите c: ");
        int c = in.nextInt();

        if ((b * b - 4 * a * c) < 0) {
            System.out.println("Уравнение не имеет корней");
        } else {
            System.out.println("Уравненение имеет хотя-бы один корень");
        }

        in.close();
    }
}
