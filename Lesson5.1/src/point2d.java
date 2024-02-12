// Двумерный класс точки
public class point2d {
    // координата x
    private double xCoord;
    // координата y
    private double yCoord;

    // конструктор инициализации
    public point2d(double x, double y) {
        xCoord = x;
        yCoord = y;
    }

    // конструктор по умолчанию
    public point2d() {
        // вызовите конструктор с двумя параметрами и определите источник
        this(0, 0);
    }

    // возвращение координаты x
    public double getX() {
        return xCoord;
    }

    // возвращение координаты y
    public double getY() {
        return yCoord;
    }

    // установка значения координаты x
    public void setX(double val) {
        xCoord = val;
    }

    // установка значения координаты y
    public void setY(double val) {
        yCoord = val;
    }
}
