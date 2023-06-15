import java.util.Scanner;

public class Task231 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
        int num = in.nextInt();

        int a = num / 100;
        int b = num / 10 % 10;
        int c = num % 100 % 10;

        System.out.println(c + " " + b + " " + a);
        in.close();
    }
}
