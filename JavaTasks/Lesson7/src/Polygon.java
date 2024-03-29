import java.util.Scanner;

public class Polygon extends Figure{
    public Polygon() {
        perimetr = 0;
        area = 0;
        Scanner typed = new Scanner(System.in);
        System.out.println("Input the number of sides:");
        int numbOfSides = typed.nextInt();
        points = new Point2D[numbOfSides];
        sides = new double[numbOfSides];
        type = "mnogo";

        while (!checkPolygon()) {
            inputPolygon();
            calcSides();
            if (!checkPolygon())
                System.err.println("Wrong points! Can't build polygon, try again!");
        }

        perimetr = computePerimetr();
        area = computeArea();
    }

    private static double distanceBetweenPoint(Point2D p1, Point2D p2) {
        return Math.sqrt(
                Math.pow((p1.getX() - p2.getX()), 2) +
                        Math.pow(p1.getY() - p2.getY(), 2));
    }

    private void inputPolygon() {inputPoint2d();}

    private void calcSides()
    {
        for (int i = 0; i < sides.length; i++)
            sides[i] = distanceBetweenPoint(points[i], points[(i+1)%sides.length]);
    }

    private boolean checkPolygon() {
        for (int counter = 0;counter < sides.length;counter++) {
            if (sides[counter] != sides[counter+1]) {
                return false;
            }
        }
        return true;
    }
}
