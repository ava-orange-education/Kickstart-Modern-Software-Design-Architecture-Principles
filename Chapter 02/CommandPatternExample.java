class RobotOnCommand implements CommandPatternExample
 {
    private Robot robot;

    public RobotOnCommand(Robot robot) {
        this.robot = robot;
    }

    public void execute() {
        robot.turnOn();
    }
}


class Robot {
    void turnOn() {
        System.out.println("Robot is on.");
    }
}


class RemoteControl {
    private CommandPatternExample command;

    public void setCommand(CommandPatternExample command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}


public class CommandPatternExample {
    public static void main(String[] args) {
        Robot robot = new Robot();
        CommandPatternExample robotOn = new RobotOnCommand(robot);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(robotOn);
        remote.pressButton();
    }
}
