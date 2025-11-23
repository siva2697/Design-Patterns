package behavioural.commandpattern.command;

import behavioural.commandpattern.reciever.AC;

public class ACOnCommand implements ICommand{

    AC ac;

    public ACOnCommand(AC ac) {
        this.ac = ac;
    }

    public void execute() {
        ac.on();
    }

    public void undo() {
        ac.off();
    }

}
