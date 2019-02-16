package pl.sda.behavioral.decorator;

import pl.sda.creational.singleton.SingletonLogger;

public class Calculator2 extends Calculator {
    public static void main(String[] args) {
        Calculator2 calculator2 = new Calculator2();

        calculator2.add(2,2);
        SingletonLogger.getInstance().log(calculator2.add(2,2));

    }

}
