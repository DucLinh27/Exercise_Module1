package Bai7_Abtract_Interface.Baitap;

public class Square extends Shape implements Colorable{
    private double size;
    public Square(){

    }
    public Square(double size) {
        this.size = size;
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSize()
                + ", which is a subclass of "
                + super.toString()
                + ", Area=" +
                + getArea();
    }
    public double getArea(){
        return size*size;
    }

    @Override
    public void resize(double persent) {

    }

    @Override
    public void howToColor(String color) {
        System.out.println(this.getColor());
    }
}
