package Bai7_Abtract_Interface.Thuchanh;

public class ComparableCircle extends Circle implements Comparaable<ComparableCircle> {
    private double radius;
    public ComparableCircle(double v, String indigo, boolean b) {
        super();
    }

    public ComparableCircle(double radius, String color, String filled) {
        super(radius, color, filled);
    }


    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }

    @Override
    public String comparaTo() {
        return null;
    }
}
