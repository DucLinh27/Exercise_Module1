package Bai5.Access_Modifile.Baitap;

public class TestCircle extends Circle{
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.getRadius();
        circle.getColor();
        circle.getArea();
        System.out.println("Radius :"+ circle.getRadius());
        System.out.println("Color : " + circle.getColor());
        System.out.println("Area :" + circle.getArea());
    }
}
