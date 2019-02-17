package pl.sda.solid;

public class Square implements IShape {
    private final double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double area() {
        return a*a;
    }
}
