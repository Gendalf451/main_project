import java.util.ArrayList;
import java.util.Scanner;

public class Task232 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int num = in.nextInt();
//
//        if(num > 0){
//            System.out.println("Положительное число");
//        }else {
//            System.out.println("Отрицательное число");
//        }
//        in.close();


        ArrayList<Integer>
                list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(1);
        System.out.println(list);
    }
}
