package pl.sda.solid;

public class Rectangle implements IShape {
    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public double area() {
        return a*b;
    }
}
