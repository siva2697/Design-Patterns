package behavioural.commandpattern.invoker;

import behavioural.commandpattern.command.ICommand;

import java.util.ArrayDeque;
import java.util.Deque;

public class SmartRemote {

    private int numOfslots;
    private final ICommand[] onCmds;
    private final ICommand[] offCmds;
    private final Deque<ICommand> history = new ArrayDeque<>();

    public SmartRemote(int numOfslots) {
        onCmds = new ICommand[numOfslots];
        offCmds = new ICommand[numOfslots];
    }

    public void setCommand(int slotNo, ICommand onCmd, ICommand offCmd) {
        onCmds[slotNo] = onCmd;
        offCmds[slotNo] = offCmd;
    }

    public void pressOn(int slot) {
        ICommand cmd = onCmds[slot];
        cmd.execute();
        history.push(cmd);
    }

    public void pressOff(int slot) {
        ICommand cmd = offCmds[slot];
        cmd.execute();
        history.push(cmd);
    }

    public void pressUndo() {
        if(!history.isEmpty()) {
            ICommand last = history.pop();
            last.undo();
        }
    }





}
