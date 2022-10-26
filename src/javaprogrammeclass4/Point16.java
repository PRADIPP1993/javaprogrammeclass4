package javaprogrammeclass4;

public class Point16 {
    public int x;
    public int y;

    public Point16() {
    }

    public Point16(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public double distance(int x1, int y1) {
        return Math.sqrt(Math.pow(x1-x, 2) + Math.pow(y1-y, 2));
    }

    public double distance(Point16 p) {
        return Math.sqrt(Math.pow(p.x-x, 2) + Math.pow(p.y-y, 2));
    }

    public static void main(String[] args) {
        Point16 first = new Point16(6, 5);
        Point16 second = new Point16(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point16 point = new Point16();
        System.out.println("distance()= " + point.distance());
    }
}