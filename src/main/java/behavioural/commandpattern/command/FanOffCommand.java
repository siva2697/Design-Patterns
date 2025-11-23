package behavioural.commandpattern.command;

import behavioural.commandpattern.reciever.Fan;

public class FanOffCommand implements ICommand {

    Fan fan;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.fan.off();
    }

    @Override
    public void undo() {
        this.fan.on();
    }
}
