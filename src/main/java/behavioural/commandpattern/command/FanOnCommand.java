package behavioural.commandpattern.command;

import behavioural.commandpattern.reciever.Fan;

public class FanOnCommand implements ICommand {

    Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() { this.fan.on(); }

    @Override
    public void undo() { this.fan.off(); }

}
