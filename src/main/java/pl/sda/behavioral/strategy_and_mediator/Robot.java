package pl.sda.behavioral.strategy_and_mediator;

public class Robot {
    private Position currentPosition;
    private IController controller;

    public Robot(IController controller) {
        this.controller = controller;
    }

    public void updatePosition(Position position) {
        currentPosition = position;
    }

    public void move() {
         controller.readControllerData();
    }

    public void chengeController(IController newController){
        controller=newController;
    }

}
