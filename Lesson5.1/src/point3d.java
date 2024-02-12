public class point3d {
    private double xCoord;
    private double yCoord;
    private double zCoord;

    public point3d(double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    public point3d() {
        this(0,0,0);
    }

    public double getX() {
        return xCoord;
    }

    public double getY(){
        return yCoord;
    }

    public double getZ() {
        return zCoord;
    }

    public void setX(double val) {
        xCoord = val;
    }

    public void setY(double val) {
        yCoord = val;
    }

    public void setZ(double val) {
        zCoord = val;
    }

    public static boolean equality(point3d A, point3d B) {
        double xBYa = A.getX();
        double yBYa = A.getY();
        double zBYa = A.getZ();
        double xBYb = B.getX();
        double yBYb = B.getY();
        double zBYb = B.getZ();
        if ((xBYa == xBYb) && (yBYa == yBYb) && (zBYa == zBYb)) {
            return true;
        }
        else {
            return false;
        }
    }

    public double distanceTo (point3d A, point3d B) {
        return Math.round(Math.sqrt(Math.pow(B.getX()-A.getX(),2)+Math.pow(B.getY()-A.getY(),2)+Math.pow(B.getZ()-A.getZ(),2))*100)/100;
    }
}