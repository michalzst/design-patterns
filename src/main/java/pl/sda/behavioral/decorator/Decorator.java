package pl.sda.behavioral.decorator;

import pl.sda.creational.singleton.SingletonLogger;

public class Decorator extends Calculator {

    private final Calculator calculator;
    private String text;
    private int result;

    public Decorator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int subtract(int a, int b) {
        result =calculator.subtract(a, b);
        text=a + " - " + b + " = " + result;
        SingletonLogger.getInstance().log(text);
        return result;
    }

    @Override
    public int multiply(int a, int b) {
        result= calculator.multiply(a, b);
        text=a + " * " + b + " = " + result;
        SingletonLogger.getInstance().log(text);
        return result;
    }

    @Override
    public double divide(double a, double b) {
        double result =calculator.divide(a,b);
        text=a + " / " + b + " = " + result;
        SingletonLogger.getInstance().log(text);
        return result;
    }

    @Override
    public boolean isEven(int number) {
        boolean result = calculator.isEven(number);
        if (result==true){
            text=number + " is Even";
        }else {
            text=number + " is Not Even";
        }
        SingletonLogger.getInstance().log(text);
        return result;
    }

    @Override
    public boolean isOdd(int number) {
        boolean result = calculator.isOdd(number);
        if (result==true){
            text=number + " is Odd";
        }else {
            text=number + " is Not Odd";
        }
        SingletonLogger.getInstance().log(text);
        return result;
    }

    @Override
    public int add(int a, int b) {
        result =calculator.add(a, b);
        text=a + " + " + b + " = " + result;
        SingletonLogger.getInstance().log(text);
        return result;
    }

}