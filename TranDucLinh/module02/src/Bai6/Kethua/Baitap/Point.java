package Bai6.Kethua.Baitap;

public class Point {
    private float x,y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;

    }
    public String toString(){
        return "("+ this.x + this.y + ")";
    }

    public static void main(String[] args) {
        Point p = new Point(1,2);
        System.out.println("x is:" + p.getX());
        System.out.println("Y is:" + p.getY());
        MoveablePoint m = new MoveablePoint(10,20,30,40);
        System.out.println("x is:" + p.getX());
        System.out.println("Y is:" + p.getY());
        System.out.println("xspeed is:" + m.getxSpeed());
        System.out.println("Yspeed is:" + m.getySpeed());
    }
}
