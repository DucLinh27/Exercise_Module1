package Bai6.Kethua.Baitap;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        return "("+( (this.radius * this.radius) * Math.PI)+") ";
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setChieucao(5);
        cylinder.setRadius(3);
        cylinder.setColor("red");
        System.out.println(cylinder.toString() +" "+cylinder.getColor());
        Circle circle = new Circle();
        circle.setColor("blue");
        circle.setRadius(6);
        System.out.println(circle.toString() +" "+ circle.getColor());

    }
}
