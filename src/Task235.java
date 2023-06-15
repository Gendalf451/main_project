import java.util.Scanner;

public class Task235 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();

        for (int i = num+1; i <= num + 10; i++) {
            System.out.print(i + " ");
        }
        in.close();
    }
}
