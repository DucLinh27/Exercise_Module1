package Bai5.Access_Modifile.Baitap;

import java.awt.geom.Area;

public class Circle {
    private double radius;
    private String color;

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {

        return radius + 1.0;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }

    public String getColor() {

        return color + "red";
    }

    public void setColor(String color) {

        this.color = color;
    }
}
