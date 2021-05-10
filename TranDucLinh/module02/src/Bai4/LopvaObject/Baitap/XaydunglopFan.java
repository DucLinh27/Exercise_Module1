package Bai4.LopvaObject.Baitap;

import java.util.Scanner;

public class XaydunglopFan {
     private final int slow = 1;
     private final int medium = 2;
     private final int fast = 3;
     private int speed = slow;
     private boolean on = false;
     private double radius = 5;
     private String color = "blue";

    public XaydunglopFan() {
    }

    public XaydunglopFan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSlow() {
        return slow;
    }

    public int getMedium() {
        return medium;
    }

    public int getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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
        if(on){
            return speed + " " + color  + " " + radius + " fan is on";
        } else {
            return speed + " " + color  + " " + radius + " fan is off";
        }
    }
    public static void main(String[] args) {
        XaydunglopFan fan1 = new XaydunglopFan();
       fan1.setColor("red");
        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setSpeed(3);
        System.out.println(fan1.toString());
        XaydunglopFan fan2 = new XaydunglopFan();
        fan2.setColor("blue");
        fan2.setOn(false);
        fan2.setRadius(5);
        fan2.setSpeed(2);
        System.out.println(fan2.toString());





    }

}
