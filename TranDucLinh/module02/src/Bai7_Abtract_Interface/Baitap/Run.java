package Bai7_Abtract_Interface.Baitap;

public class Run {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random()* 10);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(x, "yellow", false);
        shapes[1] = new Rectangle(x, x, "infinity", true);
        shapes[2] = new Square("melinda", true, x);
        for (Shape a : shapes){
            System.out.println(a);
        }

        for (Shape a : shapes) {
            a.resize(Math.random() * 1000);
        }
        System.out.println("\n");
        Shape.printShape(shapes);
    }
}

