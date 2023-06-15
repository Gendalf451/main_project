import java.util.Scanner;

public class Test {
    final public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1, 15, 6, 10);
        rectangle.rectPrint();
        System.out.println("Длина = " + rectangle.getL() + "; Высота = " + rectangle.getH() + "; Периметр = " + rectangle.getP() + "; Площадь = " + rectangle.getS() + (rectangle.isSquare() ? "; Это квадрат" : "; Это не квадрат"));
        System.out.println();

        Rectangle rectangle1 = new Rectangle();
        rectangle1.rectPrint();
        System.out.println("Длина = " + rectangle1.getL() + "; Высота = " + rectangle1.getH() + "; Периметр = " + rectangle1.getP() + "; Площадь = " + rectangle1.getS() + (rectangle1.isSquare() ? "; Это квадрат" : "; Это не квадрат"));
        System.out.println();

        Rectangle rectangle2 = new Rectangle(5, 18);
        rectangle2.rectPrint();
        System.out.println("Длина = " + rectangle2.getL() + "; Высота = " + rectangle2.getH() + "; Периметр = " + rectangle2.getP() + "; Площадь = " + rectangle2.getS() + (rectangle2.isSquare() ? "; Это квадрат" : "; Это не квадрат"));
        System.out.println();

        //Выполним перемещение по координатной плоскости последнего прямоугольника
        Scanner in = new Scanner(System.in);
        System.out.print("Введите смещение по x: ");
        int dx = in.nextInt();
        System.out.print("Введите смещение по y: ");
        int dy = in.nextInt();
        System.out.println("Координаты после смещения:");
        rectangle2.move(dx, dy);
        in.close();
        rectangle2.rectPrint();
    }
}
