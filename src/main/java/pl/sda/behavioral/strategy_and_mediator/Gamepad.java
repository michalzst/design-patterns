package pl.sda.behavioral.strategy_and_mediator;

import java.util.Random;

public class Gamepad implements IController {
    Random randomX = new Random();
    Random randomY = new Random();
    private String name = Gamepad.class.getSimpleName();

    @Override
    public ControllerData readControllerData() {
        int x =randomX.nextInt(100);
        int y =randomY.nextInt(100);
        System.out.printf("Steering %s, x=%d, y=%d\n",name,x,y);        return new ControllerData(x, y);
    }
}
