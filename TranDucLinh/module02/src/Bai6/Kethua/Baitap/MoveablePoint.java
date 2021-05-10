package Bai6.Kethua.Baitap;

public class MoveablePoint extends Point {
    private float xSpeed, ySpeed;

    public MoveablePoint(float x, float y,float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint() {
        super();
        this.xSpeed = 0;
        this.ySpeed = 0;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed( float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public String toString(){
        return "("+ super.getX() + super.getY() + this.xSpeed + this.ySpeed+")";
    }

}
