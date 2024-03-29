import javax.lang.model.type.ErrorType;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception{
        /*
        Point2D[] mass = new Point2D[4];
        for(int i = 0; i < mass.length; i++)
            mass[i] = inputPoint3d();
        for (Point2D point: mass)
            System.out.println(point);
        System.out.println(computeArea(mass[0],mass[1],mass[2]));
        System.out.println(computeArea(mass[0],mass[1],mass[2],mass[3]));

        Point2D test = new Point2D();
        System.out.println(computeArea(10,2,"1"));
         */

        Triangle testTr = new Triangle();
        System.out.println(testTr.computeArea());
        System.out.println(testTr.computeArea());
        System.out.println(testTr.getPerimetr());

        Square testSq = new Square();
        System.out.println(testSq.computeArea());
        System.out.println(testSq.computeArea());
        System.out.println(testSq.getPerimetr());

        Rhombus testRh = new Rhombus();
        System.out.println(testRh.computeArea());
        System.out.println(testRh.computeArea());
        System.out.println(testRh.getPerimetr());

        Parallelogram testPr = new Parallelogram();
        System.out.println(testPr.computeArea());
        System.out.println(testPr.computeArea());
        System.out.println(testPr.getPerimetr());

        Polygon testPl = new Polygon();
        System.out.println(testPl.computeArea());
        System.out.println(testPl.computeArea());
        System.out.println(testPl.getPerimetr());
    }



    private static double distanceBetweenPoint(Point2D p1, Point2D p2)
    {
        return Math.sqrt(
                Math.pow((p1.getX() - p2.getX()), 2) +
                        Math.pow(p1.getY() - p2.getY(), 2));
    }

    public static double computeArea(Point2D p1, Point2D p2, Point2D p3)
    {
        double sideA = distanceBetweenPoint(p1, p2);
        double sideB = distanceBetweenPoint(p2, p3);
        double sideC = distanceBetweenPoint(p3, p1);
        return computeArea(sideA, sideB, sideC);
    }

    public static double computeArea(Point2D p1, Point2D p2, Point2D p3, Point2D p4)
    {
        double sideA = distanceBetweenPoint(p1, p2);
        double sideB = distanceBetweenPoint(p2, p3);
        double sideC = distanceBetweenPoint(p3, p4);
        double sideD = distanceBetweenPoint(p4, p1);
        return computeArea(sideA,sideB,sideC,sideD);
    }

    public static double computeArea(double sideA, double sideB, double sideC)
    {
        double s = ((sideA) + (sideB) + (sideC))/2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    public static double computeArea(double sideA, double sideB, double sideC, double sideD)
    {
        double s = (sideA + sideB + sideC + sideD) / 2;
        return Math.sqrt((s - sideA) * (s - sideB) * (s - sideC) * (s - sideD));
    }

    public static double computeArea(double side, double height, String type) throws Exception {
        if (type.equals("triangle"))
            return side * height/2;
        else if (type.equals("quadro"))
            return  side * height;
        else throw new Exception("Wrong type");
    }

    public static void figureInfo(Triangle A) {
        System.out.println("Тип фигуры: "+A.getType());
        System.out.println("Площадь фигуры: "+A.getArea());
        System.out.println("Периметр фигуры: "+A.getPerimetr());
    }

    public static void figureInfo(Square A) {
        System.out.println("Тип фигуры: "+A.getType());
        System.out.println("Площадь фигуры: "+A.getArea());
        System.out.println("Периметр фигуры: "+A.getPerimetr());
    }

    public static void figureInfo(Rhombus A) {
        System.out.println("Тип фигуры: "+A.getType());
        System.out.println("Площадь фигуры: "+A.getArea());
        System.out.println("Периметр фигуры: "+A.getPerimetr());
    }

    public static void figureInfo(Parallelogram A) {
        System.out.println("Тип фигуры: "+A.getType());
        System.out.println("Площадь фигуры: "+A.getArea());
        System.out.println("Периметр фигуры: "+A.getPerimetr());
    }

    public static void figureInfo(Polygon A) {
        System.out.println("Тип фигуры: "+A.getType());
        System.out.println("Площадь фигуры: "+A.getArea());
        System.out.println("Периметр фигуры: "+A.getPerimetr());
    }
}