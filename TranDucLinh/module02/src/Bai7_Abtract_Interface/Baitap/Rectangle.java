package Bai7_Abtract_Interface.Baitap;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length,String color, boolean filled) {
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void resize(double persent) {
        this.length *= (persent/200);
        this.width += (persent/200);
    }
}
