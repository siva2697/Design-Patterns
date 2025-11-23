package behavioural.commandpattern.command;

import behavioural.commandpattern.reciever.AC;

public class ACOffCommand implements ICommand {

    AC ac;
    public ACOffCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.off();
    }

    @Override
    public void undo() {
        ac.on();
    }
}
