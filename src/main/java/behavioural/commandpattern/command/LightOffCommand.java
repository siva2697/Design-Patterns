package behavioural.commandpattern.command;

import behavioural.commandpattern.reciever.Light;

public class LightOffCommand implements ICommand {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
    }

    @Override
    public void undo() {
        this.light.on();
    }
}
