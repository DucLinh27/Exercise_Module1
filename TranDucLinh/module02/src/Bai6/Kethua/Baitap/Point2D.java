package Bai6.Kethua.Baitap;

public class Point2D {
    private float x,y;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public String toString(){
        return "("+ this.x + ", "+ this.y + ")";
    }

    public static void main(String[] args) {
        Point2D p2 = new Point2D(1,2);
        System.out.println("x is :"+ p2.getX());
        System.out.println("y is :"+ p2.getY());
        Point3D p3 = new Point3D(10,11,12);
        System.out.println(p3);
        Point2D p3b = new Point3D();
        System.out.println(p3b);
        p3b.setX(21);
        p3b.setY(22);
       /* p3b.setZ(23);*/


    }
}
