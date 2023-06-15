import java.util.Scanner;

public class Task233 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите двухзначное число: ");
        int num = in.nextInt();

        int a = num / 10;
        int b = num % 10;

        if (a * b > a + b) {
            System.out.println("Произведение больше суммы");
        } else if (a * b < a + b) {
            System.out.println("Сумма больше произведения");
        } else {
            System.out.println("Сумма равна произведению");
        }
        in.close();
    }
}
