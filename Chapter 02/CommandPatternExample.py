class CommandPattern:
    def execute(self):
        pass
class RobotOnCommand(CommandPattern):
    def __init__(self, robot):
        self.robot = robot
    def execute(self):
        self.robot.turn_on()
class Robot:
    def turn_on(self):
        print("Robot is on.")
class RemoteControl:
    def __init__(self):
        self.command = None
    def set_command(self, command):
        self.command = command
    def press_button(self):
        self.command.execute()
if __name__ == "__main__":
    robot = Robot()
    robot_on = RobotOnCommand(robot)
    remote = RemoteControl()
    remote.set_command(robot_on)
    remote.press_button() 
