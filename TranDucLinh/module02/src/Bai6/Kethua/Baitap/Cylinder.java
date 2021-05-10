package Bai6.Kethua.Baitap;

public class Cylinder extends Circle {
    private double chieucao;

    public Cylinder(double radius, String color ,double chieucao) {
        super();
        this.chieucao = chieucao;
    }

    public Cylinder() {
        super();
        this.chieucao = 0;
    }

    public double getChieucao() {
        return chieucao;
    }

    public void setChieucao(double chieucao) {
        this.chieucao = chieucao;
    }
    public String toString(){
        return "("+super.getRadius() * super.getRadius() +  this.getChieucao() + Math.PI +")";
    }
}