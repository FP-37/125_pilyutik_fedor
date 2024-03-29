public class Square extends Figure {
    public Square() {
        perimetr = 0;
        area = 0;
        points = new Point2D[4];
        sides = new double[4];
        type = "square";

        while (!checkSquare()) {
            inputSquare();
            calcSides();
            if (!checkSquare())
                System.err.println("Wrong points! Can't build square, try again!");
        }

        perimetr = computePerimetr();
        area = computeArea();
    }

    private static double distanceBetweenPoint(Point2D p1, Point2D p2) {
        return Math.sqrt(
                Math.pow((p1.getX() - p2.getX()), 2) +
                        Math.pow(p1.getY() - p2.getY(), 2));
    }

    private void inputSquare() {inputPoint2d();}

    private void calcSides()
    {
        for (int i = 0; i < sides.length; i++)
            sides[i] = distanceBetweenPoint(points[i], points[(i+1)%sides.length]);
    }

    private boolean checkSquare() {
        return (distanceBetweenPoint(points[0],points[2]) == distanceBetweenPoint(points[1],points[3]) && sides[0] == sides[1] && sides[0] != 0);
    }
}
