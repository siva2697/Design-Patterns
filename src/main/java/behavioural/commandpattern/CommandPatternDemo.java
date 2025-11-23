package behavioural.commandpattern;

import behavioural.commandpattern.command.*;
import behavioural.commandpattern.invoker.SmartRemote;
import behavioural.commandpattern.reciever.AC;
import behavioural.commandpattern.reciever.Fan;
import behavioural.commandpattern.reciever.Light;

public class CommandPatternDemo {

    public static void main(String[] args) {

        SmartRemote smartRemote = new SmartRemote(3);

        Light light = new Light();
        Fan fan = new Fan();
        AC ac = new AC();

        smartRemote.setCommand(0, new LightOnCommand(light), new LightOffCommand(light));
        smartRemote.setCommand(1, new FanOnCommand(fan), new FanOffCommand(fan));
        smartRemote.setCommand(2, new ACOnCommand(ac), new ACOffCommand(ac));


        System.out.println("Performing Execute Operations:");

        // Execute operations
        smartRemote.pressOn(0);
        smartRemote.pressOn(1);
        smartRemote.pressOff(1);
        smartRemote.pressOn(2);
        smartRemote.pressOff(2);
        smartRemote.pressOff(0);

        System.out.println("\nPerforming Undo Operations:");

        // Undo operations
        smartRemote.pressUndo();
        smartRemote.pressUndo();
        smartRemote.pressUndo();


    }

}
