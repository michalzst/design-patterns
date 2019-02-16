package pl.sda.behavioral.decorator;

import pl.sda.creational.singleton.SingletonLogger;

public class StartStopDecorator extends Calculator {
    private Calculator calculator;
    public StartStopDecorator(Calculator calculator){
        this.calculator=calculator;
    }

    @Override
    public int add(int a, int b) {
        SingletonLogger.getInstance().log("START");
        int result = calculator.add(a,b);
        SingletonLogger.getInstance().log("STOP");
        return result;
    }

    @Override
    public int subtract(int a, int b) {
        SingletonLogger.getInstance().log("START");
        int result = calculator.subtract(a, b);
        SingletonLogger.getInstance().log("STOP");
        return result;
    }

    @Override
    public int multiply(int a, int b) {
        SingletonLogger.getInstance().log("START");
        int result = calculator.multiply(a, b);
        SingletonLogger.getInstance().log("STOP");
        return result;
    }

    @Override
    public double divide(double a, double b) {
        SingletonLogger.getInstance().log("START");
        double result = calculator.divide(a, b);
        SingletonLogger.getInstance().log("STOP");
        return result;
    }

    @Override
    public boolean isEven(int number) {
        SingletonLogger.getInstance().log("START");
        boolean result = calculator.isEven(number);
        SingletonLogger.getInstance().log("STOP");
        return result;
    }

    @Override
    public boolean isOdd(int number) {
        SingletonLogger.getInstance().log("START");
        boolean result = calculator.isOdd(number);
        SingletonLogger.getInstance().log("STOP");
        return result;
    }
}
