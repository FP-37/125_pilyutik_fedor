public class Parallelogram extends Figure {
    public Parallelogram() {
        perimetr = 0;
        area = 0;
        points = new Point2D[4];
        sides = new double[4];
        type = "parallelogram";

        while (!checkParallelogram()) {
            inputParallelogram();
            calcSides();
            if (!checkParallelogram())
                System.err.println("Wrong points! Can't build parallelogram, try again!");
        }

        perimetr = computePerimetr();
        area = computeArea();
    }

    private static double distanceBetweenPoint(Point2D p1, Point2D p2) {
        return Math.sqrt(
                Math.pow((p1.getX() - p2.getX()), 2) +
                        Math.pow(p1.getY() - p2.getY(), 2));
    }

    private void inputParallelogram() {inputPoint2d();}

    private void calcSides()
    {
        for (int i = 0; i < sides.length; i++)
            sides[i] = distanceBetweenPoint(points[i], points[(i+1)%sides.length]);
    }

    private boolean checkParallelogram() {
        return (sides[0] == sides[2] && sides[1] == sides[3] && sides[0] != 0 && sides[1] != 0);
    }
}
}
