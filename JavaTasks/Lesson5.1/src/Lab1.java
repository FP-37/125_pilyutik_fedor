import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        System.out.println("Задайте координаты первой точки:");
        point3d firstP = addPoint3d();
        System.out.println("Задайте координаты второй точки:");
        point3d secondP = addPoint3d();
        System.out.println("Задайте координаты третьей точки:");
        point3d thirdP = addPoint3d();
        computeArea(firstP,secondP,thirdP);
    }

    public static point3d addPoint3d() {
        Scanner typed = new Scanner(System.in);
        System.out.println("Координата X:");
        double x = typed.nextDouble();
        System.out.println("Координата Y:");
        double y = typed.nextDouble();
        System.out.println("Координата Z:");
        double z = typed.nextDouble();
        point3d newDot = new point3d(x,y,z);
        System.out.println("Точка добавлена!");
        return newDot;
    }

    public static void computeArea(point3d A, point3d B, point3d C) {
        if (point3d.equality(A,B) || point3d.equality(B,C) || point3d.equality(C,A)) {
            System.out.println("Треугольник не существует!");
        }
        else {
            double sideA = Math.round(Math.sqrt(Math.pow(B.getX() - A.getX(), 2) + Math.pow(B.getY() - A.getY(), 2) + Math.pow(B.getZ() - A.getZ(), 2)) * 100) / 100;
            double sideB = Math.round(Math.sqrt(Math.pow(B.getX() - C.getX(), 2) + Math.pow(B.getY() - C.getY(), 2) + Math.pow(B.getZ() - C.getZ(), 2)) * 100) / 100;
            double sideC = Math.round(Math.sqrt(Math.pow(C.getX() - A.getX(), 2) + Math.pow(C.getY() - A.getY(), 2) + Math.pow(C.getZ() - A.getZ(), 2)) * 100) / 100;
            double halfOfP = (sideA + sideB + sideC) / 2;
            System.out.println("Площадь треугольника равна:");
            System.out.println(Math.sqrt(halfOfP * (halfOfP - sideA) * (halfOfP - sideB) * (halfOfP - sideC)));
        }
    }
}