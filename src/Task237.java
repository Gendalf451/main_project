import java.util.Scanner;

public class Task237 {

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите положительное число: ");
//        int num = in.nextInt();
//
//        if (num < 0) {
//            System.out.print("Число не положительное");
//        } else {
//            int sum = 0;
//            int i = num;
//
//            while (num * num > sum) {
//                sum = sum + i;
//                if (sum < num * num) {
//                    System.out.print(++i + "; ");
//                }
//                in.close();
//            }
//        }
//    }



    public static void main(String[] args) {

        int sum = 0;

        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};

        for (int number: numbers) {

            sum += number;

        }

        int arrayLength = numbers.length;

        double a =  ((double)sum / (double)arrayLength);

        System.out.println(a);
    }


}