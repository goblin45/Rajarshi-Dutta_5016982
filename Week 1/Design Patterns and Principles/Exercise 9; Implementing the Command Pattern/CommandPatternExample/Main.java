interface Command {
    void execute();
}

class LightOnCommand implements Command {
    public void execute() {
        System.out.println("Light turned on");
    }
}

class LightOffCommand implements Command {  
    public void execute() {
        System.out.println("Light turned off");
    }
}

class RemoteControl {
    protected Command command;

    public void execute() {
        command.execute();
    }
}

public class Main {
    public static void main(String[] args) {
        Command lightOnCommand = new LightOnCommand();
        Command lightOffCommand = new LightOffCommand();
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.command = lightOnCommand;
        remoteControl.execute();
        
        remoteControl.command = lightOffCommand;
        remoteControl.execute();
    }
}


/*

Output:

Light turned on
Light turned off

*/