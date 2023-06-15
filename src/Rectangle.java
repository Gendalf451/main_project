public class Rectangle {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    Rectangle() {
        setDefaultValues();
    }

    Rectangle(int x1, int y1, int x2, int y2) {
        if (x1 > x2 || y2 > y1) {
            System.out.println("Нарушена геометрия, исправте неправльные значения. По умолчанию был задан вырожденный прямоугольник с координатами углов (0,0) и (0,0)");

        } else if (!isValidValue(x1, "x1") || !isValidValue(y1, "y1") || !isValidValue(x2, "x2") || !isValidValue(y2, "y2")) {
            System.out.println("Нарушены габариты, исправте неправльные значения. По умолчанию был задан вырожденный прямоугольник с координатами углов (0,0) и (0,0)");
            setDefaultValues();
        } else {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }

    //Помещаем 4-угольник в 1-й квадрант, как это определено первоначальным условием
    //Левый нижний угол в точке (0,0)
    Rectangle(int l, int h) {
        if (l > 20 || h > 20) {
            setDefaultValues();
            System.out.println("Нарушены габариты, исправте неправльные значения. По умолчанию был задан вырожденный прямоугольник с координатами углов (0,0) и (0,0)");
        } else {
            this.x1 = 0;
            this.y1 = h;
            this.x2 = l;
            this.y2 = 0;
        }
    }

    //Проверяем, что переданные координаты находятся в 1-м квадранте
    private boolean isValidValue(int value, String nameField) {
        if (value > 20) {
            System.out.println(nameField + " больше максимально допустимого значения");
            return false;
        }
        if (value < 0) {
            System.out.println(nameField + " меньше минимального допустимого значения");
            return false;
        }
        return true;
    }

    private void setDefaultValues() {
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = 0;
        this.y2 = 0;
    }

    void rectPrint() {
        System.out.println("x1 = " + this.x1 + " y1 = " + this.y1 + "; x2 = " + this.x2 + " y2 = " + this.y2);
    }

    void move(int dx, int dy) {
        this.x1 = this.x1 + dx;
        this.y1 = this.y1 + dy;
        this.x2 = this.x2 + dx;
        this.y2 = this.y2 + dy;
    }

    int getL() {
        return this.x2 - this.x1;
    }

    int getH() {
        return this.y1 - this.y2;
    }

    int getP() {
        return 2 * (getH() + getL());
    }

    int getS() {
        return getH() * getL();
    }

    boolean isSquare() {
        return getL() == getH();
    }
}
