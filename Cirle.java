package Shape;

public class Cirle {
    private double radius;

    public Cirle() {
    }

    public Cirle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI*Math.pow(this.radius,2);
    }
}
