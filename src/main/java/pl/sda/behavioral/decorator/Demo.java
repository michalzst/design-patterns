package pl.sda.behavioral.decorator;

public class Demo {
    public static void main(String[] args) {
        Calculator cal = new StartStopDecorator(new Decorator(new Calculator()));

        int a =2;
        int b= 3;

        System.out.println(cal.add(a,b));
        System.out.println(cal.isOdd(b));
        System.out.println(cal.isEven(a));
        System.out.println(cal.divide(a,b));
        System.out.println(cal.multiply(a,b));
        System.out.println(cal.subtract(a,b));

    }
}
